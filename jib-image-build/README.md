#### Jib mainly helps out to build and publish (optimized) docker images without touching a Dockerfile - but using Maven or Gradle for it.
> Normally java apps are built as a single image layer. Jib builds it into multiple layers, so when you change code only changes are rebuilt, not entire application. 

Some tasks to test:

- ``./gradlew jibBuildTar``: creates a docker image .tar file on build/jib-image.tar

- ``./gradlew jibDockerBuild --image=my-springboot-app``: builds a local image (run ``docker images``)

- ``docker run -p 8080:8080 my-springboot-app``: starts container (``http://localhost:8080/``)

Docs: https://github.com/GoogleContainerTools/jib


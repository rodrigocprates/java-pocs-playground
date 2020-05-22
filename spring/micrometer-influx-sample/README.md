### Monitoring request time with Actuator + Micrometer + InfluxDB and Grafana

### Setup

- Start influxdb + grafana: ``docker run -d \
                                             --name docker-influxdb-grafana \
                                             -p 3003:3003 \
                                             -p 3004:8083 \
                                             -p 8086:8086 \
                                             -v /path/for/influxdb:/var/lib/influxdb \
                                             -v /path/for/grafana:/var/lib/grafana \
                                             philhawthorne/docker-influxdb-grafana:latest`` (see https://hub.docker.com/r/philhawthorne/docker-influxdb-grafana/)


- Import panel into Grafana: file at ``resources/grafana_dashboard/Country-request-grafana-dashboard.json``

### Step to run and test

- Call *a bunch of times* ``http://localhost:8080`` endpoint (it will randomly sleep between 0-3 secs)
- Data will be exposed in actuator metrics endpoint: ``http://localhost:8080/actuator/metrics/request.country.timed``
- This data will be sent to InfluxDB
- Access the Grafana dashboard that you imported at: ``http://localhost:3003/dashboards``

### Video presentation

- Explanations at https://www.youtube.com/watch?v=sbXPma2XY_g

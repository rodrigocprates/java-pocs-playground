// sandbox main file

public class App {

    public static void main(String[] args) {
        System.out.println(camelcase("is"));
        System.out.println(camelcase("isTwo"));
        System.out.println(camelcase("thatsACamelCaseSample"));
        System.out.println(camelcase("wellItsDoneLetsTestItNow"));
    }

    static int camelcase(String s) {
        int count = 1;
        for (int i=0;i<s.length();i++) {
            if ( (""+s.charAt(i)).equals( (""+s.charAt(i)).toUpperCase()))
                count++;
        }

        return count;

    }


}

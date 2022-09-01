package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {

        boolean b = false;

        int a = 2;
        int i = 3;

        int j = 4;

        int k = i;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        String s = "hello world";
        System.out.println(s);

        String t = s;
        System.out.println(t);

        {
            int x = 0;
            System.out.println(k);
        }

    }
}

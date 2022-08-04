package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        boolean b = "Hello John Doe".equals(message);
        boolean c = "Hello John Doe444".equals(message);
        System.out.println(prefix);
        System.out.println(name);
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        String concatEmptyStrings = "" + "";
        System.out.println(concatEmptyStrings);
        System.out.println(concatEmptyStrings.length());
        System.out.println("Abcde".length());
        System.out.println("Abcde".substring(0,1));
        System.out.println("Abcde".substring(0,3));
    }
}

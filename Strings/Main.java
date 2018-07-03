public class Main {
    public static void main (String[] args) {
        //String literal 
        String str1 = "Hello World";
        String str2 = "Hello World";
        //all strings are imutible

        //System.out.println(str1.compareTo(str2));
        //System.out.println(str1.equals(str2));

        //char array
        char[] helloArray = {'h','e','l','l','o'};
        String helloString = new String(helloArray);

        str1 = "hello";
        //str2 = "hello";
        str2 = new String("hello");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        
        //StringBuilder - Mutable string, not threadsafe
        //StringBuffer - is threadsafe (must slower)

        //solves problems making string that will change a lot
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        sb.toString();

        
    }
}
public class StringBuilderExample {
    public static void main(String[] args) {
        //StringBuilder doesn't not have/override the Object .equals methods, so its only true if it points to the same object
        //need to use toString()
        char c = '5';
        String a = "123";
        a = a+ c;
        System.out.println(Double.parseDouble(a));

        System.out.println('z'- 'a');

        System.out.println(Integer.MIN_VALUE);
    }
}

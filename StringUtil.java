public class StringUtil {
    public static  String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        StringBuilder sb = new StringBuilder(str);
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(reverse(s1));
    }
}
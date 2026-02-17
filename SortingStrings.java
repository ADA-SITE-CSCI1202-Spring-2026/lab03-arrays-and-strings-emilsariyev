import java.util.Arrays;

public class SortingStrings {

    public static String sortString(String input) {
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "programmingprinciples";
        System.out.println(sortString(str));
    }
}

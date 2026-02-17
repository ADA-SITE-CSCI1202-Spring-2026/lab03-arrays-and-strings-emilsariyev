public class ExplodeString {

    public static String explode(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                result.append(str.charAt(j));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String word = "Baku";
        System.out.println(explode(word));
    }
}

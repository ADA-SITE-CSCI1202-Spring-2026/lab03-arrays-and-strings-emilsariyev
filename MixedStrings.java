public class MixedStrings {

    public static String swapFirstLast(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                word = last + middle + first;
            }
            result.append(word).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "This is PP2 Fall 2021";
        System.out.println(swapFirstLast(input));
    }
}

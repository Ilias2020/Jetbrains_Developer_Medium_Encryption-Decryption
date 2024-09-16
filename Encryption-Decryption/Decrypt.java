public class Decrypt {
    public static String decrypt(String input, int num) {
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            output.append((char) (c - num));
        }
        return output.toString();
    }
}

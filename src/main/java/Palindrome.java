public class Palindrome {
    public String reverse(String string) {

        int length = string.length();

        String reverse = "";

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + string.charAt(i);

        if (string.equals(reverse))
           return "Palindrome";
        else
            return "Not Palindrome";

    }
}

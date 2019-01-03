public class Palindrome {
    public String reverse(String string) {

        int length = string.length();

        String reverse = "";
        //logic for reversing the string
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + string.charAt(i);
        //checking for palindrome
        if (string.equals(reverse))
           return "Palindrome";
        else
            return "Not Palindrome";

    }
}

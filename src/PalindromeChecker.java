public class PalindromeChecker {
    public static void main(String[] args) {
        /** Use case 2 : Hardcoded Palindrome checker*/
        String input ="madam";
        boolean palindrome=true;
        input =input.toLowerCase();
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }
}

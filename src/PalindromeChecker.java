public class PalindromeChecker {
/** Use case 1 : Application entry and Welcome Message **/
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version: 1.0 ");
        System.out.println("System Initialised Successfully");
        //test case 1
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

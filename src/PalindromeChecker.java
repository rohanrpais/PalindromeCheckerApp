public class PalindromeChecker {
    public static void main(String[] args) {
/** Use case 4 : Char Array Based Palindrome **/
        String input = "radar";
        input = input.toLowerCase();
        char[] chars = input.toCharArray();
        boolean isPalindrome = true;
        int start =0;
        int end = chars.length - 1;
        while(start<end){
            if(chars[start]!=chars[end]){
                isPalindrome=false;
                break;
            }
            else{
            start++;
            end--;
        }}
        if(isPalindrome){
            System.out.println("it is a palindrome");}
            else{
                System.out.println("it is not a palindrome");
            }
    }}
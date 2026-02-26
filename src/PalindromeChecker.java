import java.util.Stack;
public class PalindromeChecker {
    public static void main(String[] args) {
/** Use case 5: Stack Based Palindrome **/
        String input = "noon";
        input = input.toLowerCase();
        boolean isPalindrome = true;
        Stack<Character> stack=new Stack<Character>();
        for( char c : input.toCharArray()){
            stack.push(c);
        }
            for(char c : input.toCharArray()){
                if(!stack.isEmpty()){
                    if(stack.pop()!= c){
                        isPalindrome=false;
                        break;
            }
        }}
        if(isPalindrome){
            System.out.println("it is a palindrome");}
            else{
                System.out.println("it is not a palindrome");
            }
    }}
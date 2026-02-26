import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
/** Use case 6: Queue and Stack Based Palindrome **/
        String input = "keshav";
        input = input.toLowerCase();
        boolean isPalindrome = true;
        Queue<Character> queue= new LinkedList<>();
        Stack<Character> stack=new Stack<>();
        for( char c : input.toCharArray()){
            queue.add(c);
            stack.push(c);
        }
            while(!queue.isEmpty()&& !stack.isEmpty()){
                if(stack.pop()!=queue.remove()){
                    isPalindrome=false;
                    break;
          }
            }
        if(isPalindrome){
            System.out.println("it is a palindrome");}
            else{
                System.out.println("it is not a palindrome");
            }
    }}

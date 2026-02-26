import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
/** Use case 7: Deque Based Palindrome **/
        String input = "refer";
        input = input.toLowerCase();
        char[] arr = input.toCharArray();
        boolean isPalindrome = true;
        Deque<Character> deque =new ArrayDeque<>();
        for( char c : arr){
            deque.add(c);
        }
            while(deque.size()>1){
                if(deque.removeLast()!=deque.removeFirst()){
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
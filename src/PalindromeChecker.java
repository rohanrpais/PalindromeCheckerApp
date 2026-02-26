import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
/** Use case 8: Linked List Based Palindrome **/
        String input = "level";
        input = input.toLowerCase();
        char[] arr = input.toCharArray();
        boolean isPalindrome = true;
        LinkedList<Character> linkedlist =new LinkedList<>();
        for( char c : arr){
            linkedlist.add(c);
        }
            while(linkedlist.size()>1){
                if(linkedlist.removeLast()!=linkedlist.removeFirst()){
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

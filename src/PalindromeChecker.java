import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
/** Use case 8: Linked List Based Palindrome **/
        String input = "nigga";
        input = input.toLowerCase();
        char[] arr = input.toCharArray();
        boolean isPalindrome = true;
        LinkedList<Character> linkedlist =new LinkedList<>();
        for( char c : arr){
            linkedlist.add(c);
        }
        System.out.println(linkedlist);
        LinkedList<Character> reverselinkedlist =new LinkedList<>();
        if(arr.length%2 ==0){
            for (int i=0;i<=linkedlist.size()/2; i++){
                if (linkedlist.get(i) != linkedlist.get(linkedlist.size() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
        }
        else {
            for (int i=0;i < linkedlist.size() / 2; i++){
                if (linkedlist.get(i) != linkedlist.get(linkedlist.size() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
        }
        if(isPalindrome){
            System.out.println("it is a palindrome");}
            else{
                System.out.println("it is not a palindrome");
            }
    }}
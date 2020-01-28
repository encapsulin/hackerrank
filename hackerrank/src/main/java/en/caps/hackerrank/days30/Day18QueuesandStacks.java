package en.caps.hackerrank.days30;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Day18QueuesandStacks {

	// Write your code here.
    static LinkedList<Character> mQueue = new LinkedList<>();
//    static Stack<Character> mStack = new Stack<>();
    static LinkedList<Character> mStack = new LinkedList<>();
    
    //pushes a character onto a stack.
    public static void pushCharacter(char c) {
    	mStack.add(c);
    }

    // pops and returns the character at the top of the stack instance variable.
    public static char popCharacter() {
//    	return mStack.pop();
    	return mStack.removeLast();
    }

    //enqueues a character in the queue instance variable.
    public static void enqueueCharacter(char c) {
    	//mQueue.push(c);
    	mQueue.add(c);
    }
    
    //dequeues and returns the first character in the queue instance variable
    public static char dequeueCharacter() {
    	//return mQueue.pop();
    	//return mQueue.removeLast();
    	return mQueue.removeFirst();
    }  
  
    //

    public static void main1(String[] args) {
//    	enqueueCharacter('a');
//    	enqueueCharacter('b');
//    	enqueueCharacter('c');
//    	System.out.println(dequeueCharacter());
//    	System.out.println(dequeueCharacter());
//    	System.out.println(dequeueCharacter());
    	
    	pushCharacter('a');
    	pushCharacter('b');
    	pushCharacter('c');
    	System.out.println(popCharacter());
    	System.out.println(popCharacter());
    	System.out.println(popCharacter());
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18QueuesandStacks p = new Day18QueuesandStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
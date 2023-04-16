package com.bridgelabz;

import java.util.Stack;
import java.util.EmptyStackException;

public class StacksAndQueues {
	static void pushData(Stack stack, int a) {
		stack.push(new Integer(a));
		System.out.println("Push(" + a + ")");
		System.out.println("Stack :" + stack);
	}

	static void popData(Stack stack) {

		System.out.println("pop ->");
		Integer a = (Integer) stack.pop();
		System.out.println(a);
		System.out.println("Stack : " + stack);
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println("Stack :" + stack);

		stack.push(56);
		stack.push(30);
		stack.push(70);
		System.out.println("Element Of " + stack);
		popData(stack);
		popData(stack);
		popData(stack);

		System.out.println("Pop->" + stack.pop());
		System.out.println("Peek ->" + stack.peek());
		System.out.println("Check the stack is or not ?" + stack.empty());

		
		 

	}

}

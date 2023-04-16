package com.bridgelabz;

import java.util.Stack;

public class StacksAndQueues {
	static void pushData(Stack stack, int a) {
		stack.push(new Integer(a));
		System.out.println("Push(" + a + ")");

	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println("Stack :" + stack);

		stack.push(70);
		stack.push(30);
		stack.push(56);

		System.out.println("Element Is The : " + stack);
		System.out.println("Top Element : " + stack.peek());
	}
}

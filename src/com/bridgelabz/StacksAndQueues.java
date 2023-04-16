package com.bridgelabz;

import java.util.LinkedList;
import java.util.Queue;

public class StacksAndQueues {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		queue.add(56);
		queue.add(30);
		queue.add(70);

		System.out.println("The Queue elements are : " + queue);
		System.out.println("The Peek Of The Element :" + queue.peek());
	}
}
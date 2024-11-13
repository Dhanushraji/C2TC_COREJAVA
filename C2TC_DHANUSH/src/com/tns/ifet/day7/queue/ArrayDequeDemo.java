package com.tns.ifet.day7.queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		Deque<String> arrayDeque = new ArrayDeque<String>();
		arrayDeque.add("A");
		arrayDeque.add("B");
		arrayDeque.add("C");
		arrayDeque.offer("F");
		arrayDeque.offerFirst("D");
		arrayDeque.offerLast("E");
		Iterator<String> itr = arrayDeque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("After poll");
		String s = arrayDeque.poll();
		System.out.println("Poll Item is:" + s);
		for (String item : arrayDeque) {
			System.out.println(item);
		}
	}
}
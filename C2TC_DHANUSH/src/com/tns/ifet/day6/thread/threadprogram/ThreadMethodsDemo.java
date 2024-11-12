//Program to demonstrate Thread class methods
package com.tns.ifet.day6.thread.threadprogram;

public class ThreadMethodsDemo {

	public static void main(String[] args) {
		ChildThread threadOne = new ChildThread(5, "First"); 
		ChildThread threadTwo = new ChildThread(10, "Second"); 
		System.out.println("Current Thread: " + Thread.currentThread());
		threadOne.start();
		threadTwo.start();
		Thread.currentThread().setName("Parent Thread");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); 
		System.out.println("Current Thread: " + Thread.currentThread());
		try {
			threadOne.join();
			threadTwo.join(300);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt(); 
			System.err.println("Thread interrupted: " + e.getMessage());
		}
		System.out.println("-----------------------End of Main--------------------------");
	}
}
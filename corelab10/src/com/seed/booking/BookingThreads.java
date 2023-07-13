package com.seed.booking;

import java.util.List;
import java.util.Random;

import com.seed.employee.permanent.ProjectManager;

public class BookingThreads extends Thread{
	private Thread thread;
	private ConferenceRoomBookingJob Book;
	private ProjectManager pm;
	private String threadID;
	private int room;
	
	public int getRoom() {
		Random random = new Random();
		int max = 10;
		int min = 1;
		int ret = random.nextInt(max+min)+min;
		System.out.println(ret);
		this.room = ret;
		return ret;
	}
	
	public BookingThreads(String threadID, ConferenceRoomBookingJob Book) {
		super();
		this.threadID = threadID;
		this.Book = Book;
	}
	public void start(ProjectManager pm) {
		this.pm = pm;
		if(thread == null) {
			thread = new Thread(this, threadID);
			thread.start();
		}
	}
	public void run() {
		synchronized(Book) {
			int val = getRoom();
			Book.bookRoom(pm, val);
		}
		System.out.println("Thread "+threadID+" finish booking");
	}
	
}

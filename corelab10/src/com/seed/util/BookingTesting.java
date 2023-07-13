package com.seed.util;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;

import com.seed.booking.BookingThreads;
import com.seed.booking.ConferenceRoomBookingJob;
import com.seed.booking.RoomService;
import com.seed.employee.permanent.ProjectManager;
import com.seed.exception.EmployeeNotFoundException;

public class BookingTesting {
	@Test
	public void test() throws ParseException, EmployeeNotFoundException {
		List<RoomService> rooms = new ArrayList<RoomService>();
		rooms.add(new RoomService(1, true));
		rooms.add(new RoomService(2, true));
		rooms.add(new RoomService(3, true));
		rooms.add(new RoomService(4, true));
		rooms.add(new RoomService(5, true));
		ConferenceRoomBookingJob book = new ConferenceRoomBookingJob(rooms);
		
		BookingThreads T1 = new BookingThreads("Thread1", book);
		BookingThreads T2 = new BookingThreads("Thread2", book);
		ProjectManager pm1 = new ProjectManager("Wendy", "Simmons", "1", 
        		new GregorianCalendar(2018,12,31), 10, new String[]{"PMI"});
		ProjectManager pm2 = new ProjectManager("James", "Brown", "1", 
        		new GregorianCalendar(2018,12,31), 8, 
        		new String[]{"PMI"});
        
        T1.start(pm1);
        T2.start(pm2);
        
        try {
        	T1.join();
        	T2.join();
        } catch (Exception e) {
        	System.out.println("Interrupted");
        }
	}
}

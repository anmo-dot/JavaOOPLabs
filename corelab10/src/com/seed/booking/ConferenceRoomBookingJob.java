package com.seed.booking;

import java.util.List;

import com.seed.employee.permanent.ProjectManager;

public class ConferenceRoomBookingJob {
	/*
	 * check availability of the conference room
	 * book room
	 * used by project managers
	 * create 2 threads representing project managers and CRBJ
	 * 
	 * */
	private int room;
	private int totalRooms;
	private List<RoomService> allRooms;
	private ProjectManager pm;
	public ConferenceRoomBookingJob(List<RoomService> allRooms) {
		super();
		this.totalRooms = allRooms.size();
		this.allRooms = allRooms;
		this.room = 0;
	}
	public boolean bookRoom(ProjectManager pm, int roomNumber) {
		System.out.println("Project Manger "+pm.getEmployeeId()+" wants to request room "+roomNumber);
		for(RoomService r : allRooms) {
			if((r.getRoomNumer() == roomNumber) && (r.isAvailable())) {
				this.pm = pm;
				r.setAvailable(false);
				System.out.println("Room #"+roomNumber+" sucessfully booked by "+pm.getEmployeeId());
				return true;
			}
		}
		System.out.println("Room #"+roomNumber+" is unavailable");
		return false;
	}
	
}

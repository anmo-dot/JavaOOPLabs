package com.seed.booking;

public class RoomService {
	private int roomNumer;
	private boolean available;
	public RoomService(int roomNumber, boolean available) {
		this.roomNumer = roomNumber;
		this.available = available;
	}
	public int getRoomNumer() {
		return roomNumer;
	}
	public void setRoomNumer(int roomNumer) {
		this.roomNumer = roomNumer;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
}

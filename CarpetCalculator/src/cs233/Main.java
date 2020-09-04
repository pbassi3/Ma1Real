package cs233;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	    final double CarpetPrice = 8.0;
	
	    Scanner keyboard = new Scanner(System.in);

	    System.out.println("This program will show the carpet cost of a room." + "\n\nPlease enter the room's "
	            + "dimension in feet.");

	    System.out.print("Please enter the length of room: ");
	    double length = keyboard.nextDouble();

	    System.out.println("Please enter the width of room: ");
	    double width = keyboard.nextDouble();
	    
	    keyboard.close();

	    RoomDimension dimensions = new RoomDimension(length,
	            width);
	    
	    RoomCarpet roomCarpet = new RoomCarpet(dimensions,
	            CarpetPrice);

	    
	    System.out.println(roomCarpet);
}}

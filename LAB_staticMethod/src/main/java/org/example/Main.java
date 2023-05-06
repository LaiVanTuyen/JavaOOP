package org.example;
import java.util.Scanner;



class FlightBooking {
    private String flightId;
    private int userId;
    private static int seatAvailable;

    public FlightBooking(int userId) {
        this.flightId = "OOP23";
        this.userId = userId;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public static int getSeatAvailable() {
        return seatAvailable;
    }

    public static void setSeatAvailable(int seatAvailable) {
        FlightBooking.seatAvailable = seatAvailable;
    }
}

public class Main {
    //public class LAB_StaticMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();

        while(t-->0){
            String[] s=sc.nextLine().trim().replaceAll("\\s+", " ").split(" ");
            int n=s.length;
            FlightBooking[] o=new FlightBooking[4];
            FlightBooking.setSeatAvailable(180);

            for(int i=0;i<n-1;i+=2){
                int uid=Integer.valueOf(s[i]);
                String act=s[i+1];
                o[uid]=new FlightBooking(uid);

                if(act.equalsIgnoreCase("Booking")){
                    FlightBooking.setSeatAvailable(FlightBooking.getSeatAvailable()-1);
                    System.out.printf("[Seat Available: %d]",FlightBooking.getSeatAvailable());
                }
                else if(act.equalsIgnoreCase("Confirmed")){
                    System.out.printf("--User %d Confirmed--[Seat Available: %d]",uid,FlightBooking.getSeatAvailable());
                }
                else{
                    FlightBooking.setSeatAvailable(FlightBooking.getSeatAvailable()+1);
                    System.out.printf("[Seat Available: %d]",FlightBooking.getSeatAvailable());
                }
            }

            System.out.println();
        }
    }
}
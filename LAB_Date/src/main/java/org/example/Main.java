package org.example;

import java.util.Scanner;


class Date{
    private short day,month,year;
    public static int number_of_date=0;

    public Date(){
        this.day=1;
        this.month=1;
        this.year=2023;
    }

    public Date(short day, short month, short year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return String.format("%02d", this.day);
    }

    public void setDay(short day) {
        this.day = day;
    }

    public String getMonth() {
        return String.format("%02d", this.month);
    }

    public void setMonth(short month) {
        this.month = month;
    }

    public String getYear() {
        return String.format("%04d", this.year);
    }

    public void setYear(short year) {
        this.year = year;
    }
}

public class Main {
    //public class LAB_Date {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        Date date;

        while(test-->0){
            String[] s=sc.nextLine().trim().replaceAll("\\s+", " ").split(" ");

            if(s[0].equalsIgnoreCase("C")){
                date=new Date();
                System.out.println(date.getDay()+"/"+date.getMonth()+"/"+date.getYear()+" "+Date.number_of_date);
            }
            else{
                short day=Short.valueOf(s[0]);
                short month=Short.valueOf(s[1]);
                short year=Short.valueOf(s[2]);
                date=new Date(day,month,year);

                if(day==5 || day==20)
                    Date.number_of_date++;

                System.out.println(date.getDay()+"/"+date.getMonth()+"/"+date.getYear()+" "+Date.number_of_date);
            }
        }
    }
}
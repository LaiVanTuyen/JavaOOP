package org.example;

import java.util.Scanner;

public class Main {

    public static class Date {
        private  Short day;
        private  Short month;
        private  Short year;

        public Date(Short day, Short month, Short year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public Date() {
            this.day = 1;
            this.month = 1;
            this.year = 2023;
        }

        public Short getDay() {
            return day;
        }

        public void setDay(Short day) {
            this.day = day;
        }

        public Short getMonth() {
            return month;
        }

        public void setMonth(Short month) {
            this.month = month;
        }

        public Short getYear() {
            return year;
        }

        public void setYear(Short year) {
            this.year = year;
        }
    }
    static int cnt = 0;

    public static void main(String[] args) {
        int testCases = new Scanner(System.in).nextInt();
        for (int i = 0; i < testCases; i++) {
            Date date;
            String input = new Scanner(System.in).nextLine().trim();
            String[] inputs = input.split(" ");
            if (input.equals("C")) {
                date = new Date();
                if (date.day < 10 && date.month < 10)
                    System.out.println("0" + date.day + "/" + "0" + date.month + "/" + date.year+" "+cnt);
                else if (date.day < 10)
                    System.out.println("0" + date.day + "/" + date.month + "/" + date.year+" "+cnt);
                else if (date.month < 10)
                    System.out.println(date.day + "/" + "0" + date.month + "/" + date.year+" "+cnt);
                else
                    System.out.println(date.day + "/" + date.month + "/" + date.year+" "+cnt);
            }else {
                int day = Integer.parseInt(inputs[0]);
                int month = Integer.parseInt(inputs[1]);
                int year = Integer.parseInt(inputs[2]);
                date = new Date((short) day, (short) month, (short) year);
               if (inputs[0].equals("05")||inputs[0].equals("20")){
                   cnt++;
                   if (date.day < 10 && date.month < 10)
                       System.out.println("0" + date.day + "/" + "0" + date.month + "/" + date.year+" "+cnt);
                   else if (date.day < 10)
                       System.out.println("0" + date.day + "/" + date.month + "/" + date.year+" "+cnt);
                   else if (date.month < 10)
                       System.out.println(date.day + "/" + "0" + date.month + "/" + date.year+" "+cnt);
                   else
                       System.out.println(date.day + "/" + date.month + "/" + date.year+" "+cnt);
               }else {
                   if (date.day < 10 && date.month < 10)
                       System.out.println("0" + date.day + "/" + "0" + date.month + "/" + date.year+" "+cnt);
                   else if (date.day < 10)
                       System.out.println("0" + date.day + "/" + date.month + "/" + date.year+" "+cnt);
                   else if (date.month < 10)
                       System.out.println(date.day + "/" + "0" + date.month + "/" + date.year+" "+cnt);
                   else
                       System.out.println(date.day + "/" + date.month + "/" + date.year+" "+cnt);
               }
            }
        }
    }
}

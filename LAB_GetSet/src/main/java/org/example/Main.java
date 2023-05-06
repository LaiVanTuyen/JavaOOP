package org.example;

import java.util.Scanner;

class User{
    private int id;
    private String email;

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%06d",id)+" "+email;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        User[] u=new User[test+1];
        int idx=1;

        while(test-->0){
            String[] s=sc.nextLine().trim().replaceAll("\\s+", " ").split(" ");
            if(s[0].equalsIgnoreCase("C")){
                u[idx]=new User(idx);
                System.out.println(u[idx]);
                idx++;
            }
            else if(s[0].equalsIgnoreCase("Set")){
                int id1=Integer.valueOf(s[1]);
                u[id1].setEmail(s[2]);
                System.out.println(u[id1]);
            }
            else{
                int id1=Integer.valueOf(s[0]);
                System.out.println(u[id1]);
            }
        }
    }
}
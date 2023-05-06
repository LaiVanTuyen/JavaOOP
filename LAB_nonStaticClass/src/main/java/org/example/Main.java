package org.example;


public class Main{
    //public class LAB_NonstaticClass {
    class SinhVien{
        public String id="DCVT099";
        public String name="Nguyen Nam";
    }

    public static void main(String[] args) {
        SinhVien o=new Main().new SinhVien();
        System.out.println(o.id+" "+o.name);
    }
}
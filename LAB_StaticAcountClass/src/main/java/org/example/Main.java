package org.example;
import java.util.Scanner;
public class Main {
    static class Account{
        private int id;
        private long soDu;
        private String ten;

        public Account(int id, long soDu, String ten) {
            this.id = id;
            this.soDu = soDu;
            this.ten = ten;
        }

        public void setId(int id) {
            this.id = id;
        }

        public long getSoDu() {
            return soDu;
        }

        public void setSoDu(long soDu) {
            this.soDu = soDu;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        @Override
        public String toString() {
            return "[" + String.format("%03d",id) + ", " + ten + ", " + soDu + "]";
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            Account[] a=new Account[n+1];
            int idx=1;

            while(idx<=n){
                String tmp="";

                while(sc.hasNext()){
                    if(sc.hasNextLong()){
                        a[idx]=new Account(idx, sc.nextLong(), tmp.trim());
                        ++idx;
                        break;
                    }
                    else
                        tmp=tmp.concat(sc.next()).concat(" ");
                }
            }

            int m=sc.nextInt();

            for(int i=0;i<m;++i){
                String act=sc.next();

                if(act.equalsIgnoreCase("nap")){
                    int id=sc.nextInt();
                    long am=sc.nextLong();

                    //LUU Y PHAI CO DIEU KIEN KIEM TRA ID<=N VA SO DU HIEN TAI>=SO DU RUT
                    if(id<=n)
                        a[id].setSoDu(a[id].getSoDu()+am);
                }
                else if(act.equalsIgnoreCase("rut")){
                    int id=sc.nextInt();
                    long am=sc.nextLong();

                    //LUU Y PHAI CO DIEU KIEN KIEM TRA ID<=N VA SO DU HIEN TAI>=SO DU RUT
                    if(id<=n && a[id].getSoDu()>=am)
                        a[id].setSoDu(a[id].getSoDu()-am);
                }
                else if(act.equalsIgnoreCase("chuyen")){
                    int ids=sc.nextInt();
                    int idr=sc.nextInt();
                    long am=sc.nextLong();

                    //LUU Y PHAI CO DIEU KIEN KIEM TRA ID<=N VA SO DU HIEN TAI>=SO DU RUT
                    if(ids<=n && idr<=n && a[ids].getSoDu()>=am){
                        a[ids].setSoDu(a[ids].getSoDu()-am);
                        a[idr].setSoDu(a[idr].getSoDu()+am);
                    }
                }
            }

            for(int i=1;i<=n;++i)
                System.out.print(a[i]);
            System.out.println();
        }

        sc.close();
    }
}
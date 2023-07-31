
package com.actvn.java06.bai_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        for(int t=1;t<=T;t++)
        {
            int M=sc.nextInt();
            int N= sc.nextInt();
            int P= sc.nextInt();
            int Q =sc.nextInt();
            
            sc.nextLine();
            String[] hoten1= new String[M];
            int[] luong1= new int[M];
            for(int i=0;i<M;i++)
            {
                hoten1[i]=sc.nextLine();
                luong1[i]=sc.nextInt();
                sc.nextLine();
            }
            String[] hoten2 = new String[N];
            int[] luong2 =new int[N];
            int[] hour =new int[N];
            for(int i=0;i<N;i++)
            {
                hoten2[i]=sc.nextLine();
                luong2[i]=sc.nextInt();
                hour[i] =sc.nextInt();
                sc.nextLine();
            }
             int[] arrP = new int[P + 5];
            for (int i = 0; i < P; i++) {
                arrP[i] = sc.nextInt();
            }

            int[] arrQ = new int[Q + 5];
            for (int i = 0; i < Q; i++) {
                arrQ[i] = sc.nextInt();
            }
            System.out.printf("Case #%d:\n", t);
             for (int i = 0; i < P; i++) {
                 System.out.println("Full time employee:");
          FullTimeEmployee a =new FullTimeEmployee(hoten1[arrP[i]],luong1[arrP[i]]);
          a.ShowInfo();
             }
          for (int i = 0; i < Q; i++) {  
              System.out.println("Part time employee:");
          PartTimeEmployee b =new PartTimeEmployee(hour[arrQ[i]],hoten2[arrQ[i]],luong2[arrQ[i]]);
         b.ShowInfo();
          }
        }
    }
}

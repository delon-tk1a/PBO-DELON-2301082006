/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082006.p190324;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ProsesArray1D {
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int i,n;
        int jum,max,min;
        int imax = 0,imin = 0;
        float rata;
        
        System.out.print("Masukkan banyak data : ");
        n = in.nextInt();
        int[] A = new int[n]; //array
        
        //isi array A
        for(i=0;i<=n-1;i++)
        {
            A[i] = rand.nextInt(100)+1; //1-100
        }
        //proses isi array
        jum = A[0];
        max = A[0];
        min = A[0];
        for(i=1;i<=n-1;i++)
        {
            jum = jum + A[i];
            if(A[i]>max)
            {
                max = A[i];
                imax = i;
            }
            if(A[i]<min)
            {
                min = A[i];
                imin = i;
            }
        }
        rata = (float)jum/n;
        //menampilkan isi array A
        System.out.println("\n===Menampilkan Isi Array A===");
        for(i=0;i<n;i++)
        {
            System.out.print(A[i]+"\t");
        }
        //menampilkan isi array A
        System.out.println("\n===Menampilkan Isi Array A Yang Ganjil===");
        for(i=0;i<n;i++)
        {
            if(A[i]%2!=0)
                System.out.print(A[i]+"\t");
        }
        //menampilkan isi array A
        System.out.println("\n===Menampilkan Isi Array A Pada Indeks Ganjil===");
        for(i=0;i<n;i++)
        {
            if(i%2!=0)
                System.out.print(A[i]+"\t");
        }
        System.out.println("\nJumlah         = "+jum);
        System.out.println("Rata-rata      = "+rata);
        System.out.println("Nilai terbesar = "+max+" Pada indeks "+imax);
        System.out.println("Nilai terkecil = "+min+" Pada indeks "+imin);
    }    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082006.p180524;

/**
 *
 * @author HP
 */
import java.io.*;

public class ReadFile {
    public static void main(String args[]) throws IOException {
        System.out.println("What is the name of the file to read form?");
        String filename;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        filename = br.readLine();
        System.out.println("Now reading from " + filename + "...");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found.");
        } 
        try {
            char data;
            int temp;
            int temp1;
            do {
                temp = fis.read();
                temp1 = temp;
                temp1 = temp1 ^ 25;
                data = (char) temp1;
            if (temp != -1) {
                System.out.print(data);                
            }         
           } while (temp != -1);
        }catch (IOException ex){
            System.out.println("Problem in reading from the file.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082006.p230424;

/**
 *
 * @author HP
 */
public class StudentExample {
    public static void main(String[] args) {
        Person ref;
        Student akbar = new Student();
        akbar.setName("akbar");
        akbar.setAddress("Bukittinggi");
        Employee tono = new Employee();
        tono.setName("tono");
        tono.setAddress("Bukittinggi");
        
//        ref = akbar;
//        System.out.println("Nama Mahasiswa :"+ref.getName());
//        System.out.println("Alamat         :"+ref.getAddress());
//        
//        ref = tono;
//        System.out.println("Nama Karyawan :"+ref.getName());
//        System.out.println("Alamat        :"+ref.getAddress());
        
        printInformation(akbar);
        printInformation(tono);
//    Student zan = new Student();
//    System.out.println("Nama    = "+zan.getName());
//    System.out.println("Address = "+zan.getAddress());
    }
    
    public static void printInformation(Person p){
        if(p instanceof Student){
            System.out.println("Nama Mahasiswa :"+p.getName());
            System.out.println("Alamat         :"+p.getAddress());
        }
        if(p instanceof Employee){
            System.out.println("Nama Karyawan  :"+p.getName());
            System.out.println("Alamat         :"+p.getAddress());
        }
    }
}

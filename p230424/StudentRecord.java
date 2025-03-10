/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082006.p230424;

/**
 *
 * @author HP
 */
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    
    private static int StudentCount;
    
    public StudentRecord(){
        StudentCount++;
    }
    
    public StudentRecord(String temp){
        this.name = temp;
    }
    
    public StudentRecord(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public StudentRecord(double mGrade, double eGrade, double sGrade){
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address; 
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade(){
        return englishGrade;
    }
    
    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public double getScienceGrade(){
        return scienceGrade;
    }
    
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade)/3;
        return average;   
    }
    
    public void setAverage(double average){
        this.average = average;
    }
    
    public static int getStudentCount(){
        return StudentCount;
    }
    
    public void print(String temp){
        System.out.println("Name : " +name);
        System.out.println("Address : " +address);
        System.out.println("Age : " +age);
    }
    
    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name : " +name);
        System.out.println("Math Grade : " +mGrade);
        System.out.println("English Grade : " +eGrade);
        System.out.println("Science Grade : " +sGrade);
    }
}

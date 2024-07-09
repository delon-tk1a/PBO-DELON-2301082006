/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082006.p180524;

/**
 *
 * @author HP
 */
public class FactorialRecursif {
    static int factorial(int n){
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
    
    public static void main(String[] args){
        int n = 10;
        System.out.println(factorial(n));
    }
}

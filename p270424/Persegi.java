/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082006.p270424;

/**
 *
 * @author HP
 */
public class Persegi implements Relation{
    public Persegi(){    
    };
    
    public int sisi;
    
    public Persegi(int sisi){
        this.sisi = sisi;
    }
    
    public int getLuas(){
        int Luas = sisi * sisi;
        return Luas;
    }
    
    public boolean isGreater(Object a, Object b){
        int aLuas = ((Persegi) a).getLuas();
        int bLuas = ((Persegi) b).getLuas();
        return (aLuas > bLuas);
    }
    
    public boolean isLess(Object a, Object b){
        int aLuas = ((Persegi) a).getLuas();
        int bLuas = ((Persegi) b).getLuas();
        return (aLuas > bLuas);
    }
    
    public boolean isEqual(Object a, Object b){
        int aLuas = ((Persegi) a).getLuas();
        int bLuas = ((Persegi) b).getLuas();
        return (aLuas > bLuas);
    }
    
}
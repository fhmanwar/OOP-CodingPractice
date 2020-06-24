/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Kiboy
 */
public class OperasiPerkalian extends OperasiBilanganAbs {
    protected double a,b,c;
    
    @Override
    protected void set_A(double a){
        this.a = a;
    }
    @Override
    protected void set_B(double b){
        this.b = b;
    }
    @Override
    protected void set_C(){
        this.c = a * b;
    }
    @Override
    protected double get_A(){
        return a;
    }
    @Override
    protected double get_B(){
        return b;
    }
    @Override
    protected double get_C(){
        return c;
    }
    @Override
    protected void tampil(){
        try {
            System.out.println("Operasi Bilangan Perkalian");
            System.out.println("Hasil dari "+a+" * "+b+" = "+c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

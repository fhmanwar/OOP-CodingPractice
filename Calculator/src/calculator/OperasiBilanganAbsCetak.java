/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Kiboy
 */
final class OperasiBilanganAbsCetak {    
    
    private void cetakSemua(OperasiBilanganAbs OB, double a, double b){
        OB.set_A(a);
        OB.set_B(b);
        OB.set_C();
        OB.tampil();
    }
    
    private void cetakSemua(double a, double b){
        OperasiBilanganAbsCetak OBcetak = new OperasiBilanganAbsCetak();
        
        OperasiPenjumalahan jumlah = new OperasiPenjumalahan();
        OBcetak.cetakSemua(jumlah, a, b);
        System.out.println("========================================");
        System.out.println("");
        
        OperasiPengurangan kurang = new OperasiPengurangan();
        OBcetak.cetakSemua(kurang, a, b);
        System.out.println("========================================");
        System.out.println("");
        
        OperasiPerkalian kali = new OperasiPerkalian();
        OBcetak.cetakSemua(kali, a, b);
        System.out.println("========================================");
        System.out.println("");
        
        OperasiPembagian bagi = new OperasiPembagian();
        OBcetak.cetakSemua(bagi, a, b);
        System.out.println("========================================");
        System.out.println("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperasiBilanganAbsCetak OBcetak = new OperasiBilanganAbsCetak();
        Scanner in = new Scanner(System.in); 
        
        try {
            System.out.print ("Masukan angka 1 :");
            Double a = in.nextDouble();
            System.out.print ("Masukan angka 2 :");
            Double b = in.nextDouble(); 
            OBcetak.cetakSemua(a, b);
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("Input can't use string");
        }
    }    
}

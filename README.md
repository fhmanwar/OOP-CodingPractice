# OOP-CodingPractice

    Class abstract OperasiBilanganAbs :
    Begin
        protected double a,b,c
        method void set_A input double a
        method void set_B input double b
        method void set_c 
        method double get_a
        method double get_b
        method double get_c
        method void tampil
    End

    class OperasiPenjumlahan extends OperasiBilanganAbs :
    Begin
        method void set_A input double a
            this.a <- a
        method void set_B input double b
            this.b <- b
        method void set_c
            c <- a + b 
        method double get_a
            return a
        method double get_b
            return b
        method double get_c
            return c
        method void tampil
            output “Operasi Bilangan Penjumlahan”
            output “Hasil dari "+a+" * "+b+" = "+c”
    End

    class OperasiPengurangan extends OperasiBilanganAbs :
    Begin
        method void set_A input double a
            this.a <- a
        method void set_B input double b
            this.b <- b
        method void set_c
            c <- a - b 
        method double get_a
            return a
        method double get_b
            return b
        method double get_c
            return c
        method void tampil
            output “Operasi Bilangan Pengurangan”
            output “Hasil dari "+a+" * "+b+" = "+c”
    End

    class OperasiPerkalian extends OperasiBilanganAbs :
    Begin
        method void set_A input double a
            this.a <- a
        method void set_B input double b
            this.b <- b
        method void set_c
            c <- a * b 
        method double get_a
            return a
        method double get_b
            return b
        method double get_c
            return c
        method void tampil
            output “Operasi Bilangan Perkalian”
            output “Hasil dari "+a+" * "+b+" = "+c”
    End

    class OperasiPembagian extends OperasiBilanganAbs :
    Begin
        method void set_A (input double a)
            this.a <- a
        method void set_B (input double b)
            this.b <- b
        method void set_c
            c <- a / b 
        method double get_a
            return a
        method double get_b
            return b
        method double get_c
            return c
        method void tampil :
            output “Operasi Bilangan Pembagian”
            output “Hasil dari "+a+" * "+b+" = "+c”
    End

    final class OperasiBilanganAbsCetak :
    Begin

    method cetakSemua(input class OperasiBilanganAbsCetak, input double a, input double b)
        send to set_A(input a) method
        send to set_B(input b) method
        send to set_C method
        send to tampil method

    method cetakSemua(input double a, input double b)
        var OBcetak:OperasiBilanganAbsCetak;
        var jumlah:OperasiPenjumalahan;
        var kurang:OperasiPengurangan;
        var kali:OperasiPerkalian;
        var bagi:OperasiPembagian;

        call cetakSemua(jumlah, input a, input b):OBcetak
        call cetakSemua(kurang, input a, input b):OBcetak
        call cetakSemua(kali, input a, input b):OBcetak
        call cetakSemua(bagi, input a, input b):OBcetak

    {
        In the main function 
        
        print prompt "Input two numbers" 

        Take the first number from the user 
        Take the second number from the user


        Send the first number and second number to the lcmNaive function
    }
    End
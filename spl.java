/* Program Sistem Persamaan Linier
    Anggota :
    1. Taufikurrahman Anwar (13517074)
    2. Michael Ray          (13517092)
    3. Nada Afra Sabrina    (13517118) */

import java.util.*;

public class spl
{
    public static void main(String[] args)
    {
        /* KAMUS LOKAL */
        int i;
        Matriks M = new Matriks();

        /* ALGORITMA */
        Scanner in = new Scanner (System.in);
        System.out.println("Pilihan Masukan");
        System.out.println("1. Input Manual");
        System.out.println("2. Input File");
        System.out.print("Masukkan kode : ");
        int pilihan = in.nextInt();
        if (pilihan == 1)
        {
            System.out.println("MENU");
            System.out.println("1. Sistem Persamaan Linier");
            System.out.println("2. Interpolasi Polinom");
            System.out.println("3. Keluar");
            System.out.print("Masukkan kode : ");
            int kode = in.nextInt();

            System.out.println();
            if (kode == 1)
            {
                System.out.println("Sistem Persamaan Linier");
                System.out.println("MENU SPL");
                System.out.println("1. Metode Eliminasi Gauss");
                System.out.println("2. Metode Eliminasi Gauss-Jordan");
                System.out.print("Masukkan kode : ");
                int code = in.nextInt();

                if (code == 1)
                {
                    System.out.println("Menggunakan metode eliminasi Gauss");
                    System.out.print("Jumlah persamaan : ");
                    int m = in.nextInt();
                    System.out.print("Jumlah peubah : ");
                    int n = in.nextInt();
                    M.buatMat(m, n + 1);
                    M.bacaMatriks(M);
                    M.eliminasiG(M);
                    if (M.MatBrsNgaco(M))
                    {
                        System.out.println("Matriks tidak punya solusi.");
                    }
                    else
                    {
                        System.out.println("Matriks Eselon : ");
                        M.tulisMat(M);
                    }
                }
                else if (code == 2)
                {
                    System.out.println("Menggunakan metode eliminasi Gauss-Jordan");
                    System.out.print("Jumlah persamaan : ");
                    int m = in.nextInt();
                    System.out.print("Jumlah peubah : ");
                    int n = in.nextInt();
                    M.buatMat(m , n+1);
                    M.bacaMatriks(M);
                    M.eliminasiGJ(M);
                    if (M.MatBrsNgaco(M))
                    {
                        System.out.println("Matriks tidak punya solusi.");
                    }
                    else
                    {
                        System.out.println("Matriks Eselon Tereduksi: ");
                        M.tulisMat(M);
                    }
                }
            }
            if (kode == 2)
            {
                System.out.println("Interpolasi Polinom");
                System.out.println("MENU IP");
                System.out.println("1. Metode Eliminasi Gauss");
                System.out.println("2. Metode Eliminasi Gauss-Jordan");
                System.out.print("Masukkan kode : ");
                int code = in.nextInt();

                if (code == 1)
                {
                    System.out.println("Menggunakan metode eliminasi Gauss");
                    System.out.print("Derajat polinom : ");
                    int n = in.nextInt();
                    M.buatMat(n + 1,n + 2);
                    for (i = 1; i <= n; i++)
                    {
                        ;
                    }
                }
                else if (code == 2)
                {
                    System.out.println("Menggunakan metode eliminasi Gauss-Jordan");
                    System.out.print("Derajat polinom : ");
                    int n = in.nextInt();
                    M.buatMat(n + 1, n + 2);
                    for (i = 1; i <= n; i++)
                    {
                        ;
                    }
                }
            }
            if (kode == 3)
            {
                System.out.println("Terimakasih.");
                in.close();
            }
        }
    }
}    

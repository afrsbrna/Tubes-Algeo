/* Program Sistem Persamaan Linier */
import java.util.Scanner;

class spl
{
    public static void main(String[] args)
    {
        /* KAMUS LOKAL */
        int i, j;

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

                    for (i = 1; i <= m; i++)
                    {
                        for (j = 1; j <= n; j++)
                        {
                            ;
                        }
                    }
                }
                else if (code == 2)
                {
                    System.out.println("Menggunakan metode eliminasi Gauss-Jordan");
                    System.out.print("Jumlah persamaan : ");
                    int m = in.nextInt();
                    System.out.print("Jumlah peubah : ");
                    int n = in.nextInt();

                    for (i = 1; i <= m; i++)
                    {
                        for (j = 1; j <= n; j++)
                        {
                            ;
                        }
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

import java.util.Scanner;

class spl
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
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
                ;
            }
            else if (code == 2)
            {
                ;
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
                ;
            }
            else if (code == 2)
            {
                ;
            }
        }
        if (kode == 3)
        {
            System.out.println("Terimakasih.");
            in.close();
        }
    }
}

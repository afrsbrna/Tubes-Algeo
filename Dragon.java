import java.util.*;

public class Dragon{
    public static void main(String[] args)
    {
        /* KAMUS LOKAL */
        int i, j;
        Matriks mat = new Matriks();
        boolean noSolution;

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
                    mat.buatMat(m, n + 1);
                    bacaMatriks(mat);
                    eliminasiG(mat);
                    if (MatBrsNgaco(mat)){
                        System.out.println("Matriks tidak punya solusi");
                    }
                    else{
                    System.out.println("Matriks Eselon : ");
                    tulisMat(mat);
                    }
                }
                else if (code == 2)
                {
                    System.out.println("Menggunakan metode eliminasi Gauss-Jordan");
                    System.out.print("Jumlah persamaan : ");
                    int m = in.nextInt();
                    System.out.print("Jumlah peubah : ");
                    int n = in.nextInt();
                    mat.buatMat(m , n+1);
                    bacaMatriks(mat);
                    eliminasiGJ(mat);
                    if (MatBrsNgaco(mat)){
                        System.out.println("Matriks tidak punya solusi");
                    }
                    else{
                    System.out.println("Matriks Eselon Tereduksi: ");
                    tulisMat(mat);
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
                    mat.buatMat(n + 1,n + 2);
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
                    mat.buatMat(n + 1, n + 2);
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

    public static void bacaMatriks(Matriks mat){
        Scanner in = new Scanner(System.in);
        int i,j;
        for (i = 1; i <= mat.nEff; i++){
            for (j = 1; j <= mat.mEff; j++){
                double tmp = in.nextDouble();
                mat.mat[i][j] = tmp;
            }
        }
    }

    public static void tulisMat(Matriks mat){
         double k; int i,j;
         for (i = 1; i <= mat.nEff; i++){
            for (j = 1;  j  <= mat.mEff; j++ ){
                if (mat.mat[i][j] == -0.0){
                    mat.mat[i][j] = 0;
                } 
                System.out.printf("%.2f ",mat.mat[i][j]);
            }
            System.out.println();
        }
     }
     
         
    public static void bagiBaris(Matriks mat, int i, double k){
         int j;

         for (j = 1; j <= mat.mEff; j++){
             mat.mat[i][j] = mat.mat[i][j] / k;
         }
     }

    public static void minBrsKaliX(Matriks mat, int i1, int i2, double x){
         int j;

         for (j = 1; j <= mat.mEff; j++){
             mat.mat[i1][j] -= x * mat.mat[i2][j];
         }
     }

    public static void tukarBaris(Matriks mat, int i1, int i2){
         int j;
         double tmp;

         for (j = 1; j <= mat.mEff; j++){
             tmp = mat.mat[i1][j];
             mat.mat[i1][j] = mat.mat[i2][j];
             mat.mat[i2][j] = tmp;
         }
     }

    public static boolean brsNol(Matriks mat, int i){
        int j = 1;
        boolean flag = true;

        while ((j <= mat.mEff) && flag){
            flag = mat.mat[i][j] == 0;
            j++;
        }

        return flag;
     }

    public static boolean sisaKolNol(Matriks mat, int i, int j){
         int t = i;
         boolean ada = false;

         while ((t <= mat.nEff) && !ada){
             ada = mat.mat[t][j] != 0;
             t++;
         }

         return !ada;
     }

    public static void eliminasiG(Matriks mat){
         int i,j,k,l;
         k = 1;

        rapihin(mat);
        for (j = 1; j <= mat.mEff; j++){
            for (i = k; i <= mat.nEff; i++){
                if (mat.mat[i][j] != 0){
                    bagiBaris(mat, i, (mat.mat[i][j]));
                    for(l = i + 1; l <= mat.nEff; l++){
                        minBrsKaliX(mat, l, i, (mat.mat[l][j]));
                    }
                    rapihin(mat);
                    k++;
                    break;
                }
            }
        }
     }

    public static void eliminasiGJ(Matriks mat){
         int i,j,k,l;
         k = 1;
         eliminasiG(mat);
         for (j = 1; j <= mat.mEff; j++){
             for (i = k; i <= mat.nEff; i++){
                 if (mat.mat[i][j] == 1){
                     for (l = i - 1; l >= 1; l--){
                         minBrsKaliX(mat, l, i, mat.mat[l][j]);
                     }
                     k++;
                     break;
                 }
             }
         }
     }

    public static void rapihin(Matriks mat){
         int i,j,k;
         k = 1;
         for (j = 1; j <= mat.mEff; j++){
             for (i = k; i <= mat.nEff; i++){
                 if (mat.mat[i][j] != 0){
                     tukarBaris(mat, i, k);
                     k++;
                     break;
                 }
             }
         }
     }
    public static boolean BrsNgaco(Matriks mat,int i){
        int j,k;
        boolean nol,ngaco;
            nol = true;
            j=1;
            while ((j < mat.mEff) && nol){
                if (mat.mat[i][j]!=0){
                    nol = false;
                }
                j++;
            }
            if (nol && (mat.mat[i][mat.mEff]!=0)){
                ngaco = true;
            }
            else {
                ngaco = false;
            }
           return ngaco;

    }
    public static boolean MatBrsNgaco(Matriks mat){
        int i;
        boolean matngaco;
            i=1;
            matngaco = false;
            while ((i <= mat.nEff)&&(!matngaco)){
                matngaco = BrsNgaco(mat, i);
                i++;
            }
            return matngaco;
    }
}    


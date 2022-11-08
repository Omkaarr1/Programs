import java.util.Scanner;

class hellow
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][] = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            {
                c[i][j] = a[i][j]*b[j][i];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }

}
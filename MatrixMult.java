import java.util.Scanner;

class MatrixMult{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row1, row2, col1, col2;
        System.out.println("Enter rows of first matrix:");
        row1 = sc.nextInt();
        System.out.println("Enter the columns of first matrix:");
        col1 = sc.nextInt();

        System.out.println("Enter rows of second matrix:");
        row2 = sc.nextInt();
        System.out.println("Enter the columns of second matrix:");
        col2 = sc.nextInt();

        try{
            if(row1 != col2 || col1 != row2){
                throw new ArithmeticException("Can't multiply");

            }
        }
        catch(ArithmeticException e){
            System.out.println("Error"+ e);
            System.exit(0);
        }
        int matrix1[][] = new int[row1][col1];
        int matrix2[][] = new int[row2][col2];
        int result[][] = new int[row1][col2];

        System.out.println("Enter the elements of the first matrix:");
        for(int i=0; i<row1; i++){
            for(int j=0; j<col1; j++){
                matrix1[i][j] = sc.nextInt();
            }

        }

        System.out.println("Enter the elements of the second matrix:");
        for(int i=0; i<row2; i++){
            for(int j=0; j<col2; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        //on multiplication

        for(int i=0; i<row1; i++){
            for(int j=0; j<col2; j++){
                for(int k=0; k<col1; k++){
                    result[i][j] += (matrix1[i][k])*(matrix2[k][j]);
                }
            }
        }

        //print
        for(int i=0; i<row1; i++){
            for(int j=0; j<col2; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
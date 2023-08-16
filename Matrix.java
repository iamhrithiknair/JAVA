import java.util.Scanner;
class SparseMatrixException extends Exception{
    public SparseMatrixException(String message){
        super(message);
    }
}

class Matrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row, col;
        System.out.println("Enter rows of the matrix:");
        row = sc.nextInt();
        System.out.println("Enter columns of the matrix:");
        col = sc.nextInt();

        int matrix[][] = new int[row][col];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int zerocount=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == 0){
                    zerocount++;
                }
            }
        }

        try{
            if(zerocount>5){
                throw new SparseMatrixException("Zero count is greater than 5");
            }
            else{
                
                for(int j=0; j<col; j++){
                    for(int i=0; i<row; i++){
                    
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        
        }
        catch(SparseMatrixException e){
            System.out.println("error" + e.getMessage());
        }
    }
}
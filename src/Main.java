import java.util.Scanner;

class MinorDiagonalSum{
    public int findMinorDiagonalSum(int row ,int col ,int arr[][]){
        int sum=0;
        int i=0,j=row-1;
        while(i<row){

            sum+=arr[i][j];
            i++;
            j--;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MinorDiagonalSum  minorDiagonalSum=new  MinorDiagonalSum();
        System.out.println("Enter no of row  :");
        int row= scanner.nextInt();
        System.out.println("Enter no of col  :");
        int col= scanner.nextInt();
        System.out.println("Enter array elements  :");
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++) {

            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("MinorDaigonalSum :"+ minorDiagonalSum.findMinorDiagonalSum(row,col,arr));



    }
}
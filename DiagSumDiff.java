import java.util.*;
public class DiagSumDiff
{
static int diagonalDiff(int arr[][])
{
    int leftSum=0;
    int rightSum=0;
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
        leftSum=leftSum+arr[i][i];
        rightSum=rightSum+arr[i][n-1-i];
    }
    return java.lang.Math.abs(leftSum-rightSum);
}
public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter size");
    int n=scan.nextInt();
    int a[][]=new int[n][n];
    System.out.print("Enter array elements");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            a[i][j]=scan.nextInt();
        }
    }
    System.out.print(diagonalDiff(a));
}
}

import java.io.*;
import java.util.*;
public class BubbleSort
{
  public static void main(String []args)throws Exception
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int []arr=new int[n];
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=s.nextInt();
    }
    bubblesort(arr);
    display(arr);
  }
  public static void display(int []arr)
  {
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
  public static void swap(int []arr,int i,int j)
  {
    System.out.println("swapping "+arr[i]+" and "+arr[j]);
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
  public static boolean isSmaller(int []arr,int i,int j)
  {
    System.out.println("Compareing "+arr[i]+" and "+arr[j]);
    if(arr[i]<arr[j])
    {
      return true;
    }else
    {
      return false;
     }
   }
  public static void bubblesort(int []arr)
  {
    for(int i=1;i<arr.length-1;i++)
    {
      for(int j=0;j<arr.length-i;j++)
      {
        if(isSmaller(arr,j+1,j)){
          swap(arr,j+1,j);
      }
    }
  }
}

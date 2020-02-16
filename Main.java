package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            Scanner sc= new Scanner(System.in);
            while(sc.hasNextLine() && sc.hasNext())
            {
                int t= sc.nextInt();
                int array []=new int[t];
                for( int i= 0; i<array.length; i++)
                    array[i]=sc.nextInt();
                 for (int i=array.length-1; i>=0; i--)
                 {
                     int largest=0;
                     for( int j=0; j<=i; j++)
                     {
                         if(array[j]>array[largest])
                         {
                             largest=j;
                         }
                     }
                     int temp=array[largest];
                     array[largest]=array[i];
                     array[i]=temp;
                     System.out.print(array[i]+ " ");
                 }
            }
            sc.close();

        }
        catch( InputMismatchException e)
        {
            System.out.println(e);
        }
        catch(Exception e){};
    }
}

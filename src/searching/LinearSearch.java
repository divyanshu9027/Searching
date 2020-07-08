package searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
        //use for each loop to print the array.
        for(int items:array) {
            System.out.print(items + " ");
        }
        //linear searching algorithm begin.

        //1: traverse an array.

        System.out.println("\nenter the element you want to find in an array:");
        int element = sc.nextInt();
        int pos = -1;
        for(int i=0;i<size;i++) {
            if(element==array[i]) {
                pos = i;
            }
        }
        if(pos==-1) {
            System.out.println("element is not present in an array");
        }
        else {
            System.out.println("element is present at index "+pos);
        }
    }
}

package searching;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // use the for each loop to print the unsorted array.
        for(int items:array) {
            System.out.print(items + " ");
        }
        // To implement BinarySearch, Array must be sorted.
        Arrays.sort(array);
        // BinarySearch is a divide and conquer technique.
        int start = 0;
        int end = size-1;
        int pos = 0;
        System.out.println("\nenter the element you want to search in an array:");
        int element = sc.nextInt();
        while(start<=end) {
            int mid = (start+end)/2;
            if(element==array[mid]) {
                pos = mid;
                System.out.println("element is present at index "+pos);
                break;
            }else if(element<array[mid]) {
                end = mid-1;
            }else if(element>array[mid]) {
                start = mid+1;
            }
        }
        if(start>end) {
            System.out.println("element is not present in an array");
        }

    }
}

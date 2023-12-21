package com.java.demo.Tasks;
import java.util.Scanner;
public class Chat {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] arr = new int[size];

	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int min = arr[0];
	        int max = arr[0];

	        for (int i = 1; i < size; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }

	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        System.out.println("Smallest element: " + min);
	        System.out.println("Largest element: " + max);

	        scanner.close();
	    }
	}



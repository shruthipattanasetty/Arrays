package com.perscholas.array_303_3_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
		question8();
		question9();
		question10();
		question11();
	}
	
	private static void question1() {
		/*Write a program that creates an array of integers with a length of 3. 
		 * Assign the values 1, 2, and 3 to the indexes. Print out each array element.
		 */
		int[] arr = new int[] { 1, 2, 3 };
		System.out.println(Arrays.toString(arr));
	}
	
	private static void question2() {
		/*
		 * Write a program that returns the middle element in an array. Give the
		 * following values to the integer array: {13, 5, 7, 68, 2} and produce the
		 * following output: 7
		 */
		int[] arra= {13, 5, 7, 68, 2};
		System.out.println("Middle element is " +arra[arra.length/2]);       
	}
	
	private static void question3() {
		/*
		 * Write a program that creates an array of String type and initializes it with
		 * the strings “red”, “green”, “blue” and “yellow”. Print out the array length.
		 * Make a copy using the clone( ) method. Use the Arrays.toString( ) method on
		 * the new array to verify that the original array was copied.
		 * 
		 */

		String[] arr2 = {"red", "green", "blue", "yellow"};
		System.out.println("Length of the stringarray:" +arr2.length);
		String[] arr3=arr2.clone();
		//System.out.println("Original: " + arr2.toString());
		//System.out.println("Copy: " + arr3.toString());
		System.out.println(Arrays.toString(arr3));
	}
	
	private static void question4() {
		/*Write a program that creates an integer array with 5 elements (i.e., numbers). 
		 * The numbers can be any integers.  Print out the value at the first index and 
		 * the last index using length - 1 as the index. 
		 * Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  
		 * Notice the type of exception which is produced. Now try to assign a value to the array index 5. 
		 * You should get the same type of exception.
		 */
		int[] arr= {2,4,29,43,21};
		System.out.printf("First index is %d and the last index is %d", arr[0],arr[arr.length-1]);
		System.out.println();
	}
	
	private static void question5() {
		/*Write a program where you create an integer array with a length of 5. 
		 * Loop through the array and assign the value of the loop control variable (e.g., i)
		 * to the corresponding index in the array.
		 */
		int[] arr= {2,4,29,43,21};
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	private static void question6() {
		/*Write a program where you create an integer array of 5 numbers. 
		 * Loop through the array and assign the value of the loop control variable multiplied by 
		 * 2 to the corresponding index in the array.
		 */
		int[] arr= {2,4,29,43,21};
		for (int i = 0; i < arr.length; i++) {
			arr[i]=2*i;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	private static void question7() {
		/*Write a program where you create an array of 5 elements. 
		 * Loop through the array and print the value of each element, 
		 * except for the middle (index 2) element.
		 */
		int[] arr= {2,4,29,43,21};
		for (int i = 0; i < arr.length; i++) {			
			if (i==arr.length/2) {
				continue;
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	private static void question8() {
		/*Write a program that creates a String array of 5 elements and 
		 * swaps the first element with the middle element without creating a new array.
		 */
		
		
		int[] arr= {2,4,29,43,21};
		int t=arr[0];
		arr[0]=arr[arr.length/2];
		arr[arr.length/2]=t;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	private static void question9() {
		 /*Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. 
		 * Print the array in ascending order, and print the smallest and the largest element of the array. 
		 * The output will look like the following:
		 * Array in ascending order: 0, 1, 2, 4, 9, 13
		 * The smallest number is 0
		 * The biggest number is 13
		 */
		int[] arr = {4, 2, 9, 13, 1, 0};
		for(int i=0; i<arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]< arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}				
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();

	}
	
	private static void question10() {
//		Create an array that includes an integer, 3 strings, and 1 double. Print the array.
	}
	
	private static void question11() {
		/*Write some Java code that asks the user how many favorite things they have. 
		 * Based on their answer, you should create a String array of the correct size. 
		 * Then ask the user to enter the things and store them in the array you created. 
		 * Finally, print out the contents of the array.
		 */
//			Example
//
//			How many favorite things do you have?
//			7
//
//			Enter your thing: phone
//			Enter your thing: tv
//			Enter your thing: xbox
//			Enter your thing: wine
//			Enter your thing: beer
//			Enter your thing: sofa
//			Enter your thing: book
//			Your favorite  things are:
//			phone tv xbox wine beer sofa book
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many favorite things do you have?");
		int favCount=sc.nextInt();
		String[] array = new String[favCount];
		System.out.println(array.length);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter your thing: ");
			String favThing= sc.next();
			array[i]=favThing;
		}
		System.out.println("Your favorite things are: ");
		for(String fav:array) {
			System.out.println(fav+" ");
		}
		sc.close();
	}

}

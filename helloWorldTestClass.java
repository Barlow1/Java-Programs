/*Christian Barlow
 * HW #1
 * 10/15/18
 */
package com.HelloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class helloWorldTestClass {
	
	private static int [] reverse(int []array)/** accepts an array of ints
	and returns an array of ints  in reverse order*/{
		int []temp = new int[array.length];
		for(int i = 0,j = array.length-1; i < array.length && j >= 0; i++, j--){
			temp[i] = array[j];
		}
		return temp;
	}
	private static void printGrid(int size)/** This function takes an int for size
	of a grid and prints out an i x i grid for the given int*/{
		System.out.print("\n");
				for(int row = 0; row < (2*size)+1; row++) {
					for(int column = 0; column < size; column++) {
						if(row%2 == 0) {
							if(column == 0) {
							System.out.print("+--+");
							}
							else {
								System.out.print("--+");
								
							}
						}
						if(row%2 == 1) {
							if(column == 0) {
								System.out.print("|  |");
								}
								else {
									System.out.print("  |");
								}
						}
					}
					System.out.print("\n");
					
				}
			}
	private static String [] filterByLength(String [] array, int length)/** accepts an
	array of strings and an integer for length and returns the array of strings without
	the strings that have a length given*/ {
		String filtered[] = new String[array.length];
		int filtIndex = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() != length) {
				filtered[filtIndex] = array[i];
				filtIndex++;
			}
		}
		return filtered;
	}
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String arraySizeData;
		int arraySize;
		String name;
		
		System.out.println("Hello World");
		//take input for name
		BufferedReader br = new BufferedReader( new
                InputStreamReader(System.in));
		System.out.print("What is your name?\n");
		name = br.readLine();
		//print out name
		System.out.print("Hello my name is " + name + "!");
		BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
		String inData;
		int    num;    
		//get input of array size
		System.out.println("\nEnter a Size for Array:");
		inData = stdin.readLine();
		num    = Integer.parseInt( inData ); //convert inData to int
		int[] numArray = new int[num];
		System.out.println("Array Length="+numArray.length);
		//get input elements
		for(int i = 0; i < num; i++) {
			System.out.println("Enter element at index " + i);
			int inNum;
			inData = stdin.readLine();
			inNum = Integer.parseInt( inData );
			numArray[i]= inNum;
			
		}
		//create array of elements
		System.out.print("Original Array: ");
		for(int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
		}
		int []reversedArray = new int[num];
		reversedArray = reverse(numArray);
		System.out.print("\nReversed Array: ");
		//print out reversed array
		for(int i = 0; i < reversedArray.length; i++) {
			System.out.print(reversedArray[i]+ " ");
		}
		//get input for grid size
		System.out.print("\n");
		System.out.print("Enter a number to print out an i x i grid: ");
		arraySizeData = stdin.readLine();
		arraySize = Integer.parseInt(arraySizeData);
		//print out grid
		printGrid(arraySize);
		
		//create array of strings
		String[] words = {"The", "Quick", "Brown", "Fox"};
		System.out.print("Initial Array: ");
				for(int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
		System.out.print("\n");
		//filter the array
		String []filteredArray = new String[words.length];
		System.out.print("Enter word length to be filtered out: ");
		String filterLengthData;
		int filterLength;
		filterLengthData = stdin.readLine();
		filterLength = Integer.parseInt(filterLengthData);
		filteredArray = filterByLength(words,filterLength);
		System.out.println("Words with " + filterLength + " letters are filtered out");
		System.out.print("Filtered Array: ");
		//print out filtered array
		for(int i = 0; i < filteredArray.length; i++) {
			if (filteredArray[i] != null) {
			System.out.print(filteredArray[i]+ " ");
			}
		}
		System.out.println("\nThank you for using my program! Goodbye!");
	}

}

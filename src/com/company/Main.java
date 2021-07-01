package com.company;

public class Main {
    /*TASK:
    Write a Java program to compute the average value of an array of integers
     except the largest and smallest values.
     */

    public static void main(String[] args) {
	// Decided to use an example from class
        int[] ages = {12, 15, 18, 19};

        double average = 0;
        double sum = 0;

        //Formula for average will be a bit different
        //because we must expel min and max values
        // average = (sum[] - min - max)/(array.length - 2)

        for(int i = 0; i < ages.length; i++){
            sum = sum + ages[i];
            //stuck here, because Math.min() and Math.max() cannot be used for arrays
            //figuring out way to transfer arrays to lines
        }

        average = sum / (ages.length - 2);
        System.out.println(average);
    }
}

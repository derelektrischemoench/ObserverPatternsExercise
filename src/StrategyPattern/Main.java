package StrategyPattern;

import java.util.ArrayList;
import java.util.Random;
import StrategyPattern.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int [] nums = new int[10];
        int arrayLength = nums.length;
        
        Random randomGen = new Random();
        for(int i=0; i<nums.length; i++) {
            nums[i] = randomGen.nextInt(arrayLength);
        }
    
        System.out.println("Array before BS:");
        for(int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    
        System.out.println("Array afterwards:");
        InsertionSort.sort(nums);
        
        for(int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}

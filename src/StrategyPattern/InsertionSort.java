package StrategyPattern;

public class InsertionSort extends Strategy {
    public static int[] sort(int[] toBeSorted) {
        
        for (int i = 0; i <= toBeSorted.length; i++) {
            int pointer = toBeSorted[i];
            if(toBeSorted[i+1] < toBeSorted[pointer]) {
                toBeSorted[pointer] = toBeSorted[0];
            }
        }
        
        
        return toBeSorted;
    }
}

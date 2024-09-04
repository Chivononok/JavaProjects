package thread;

import java.util.Arrays;
import java.util.Random;

public class NumThread extends Thread{

    public NumThread(){

    }

    public void run(){
        int[] arr = new int[10];
        int max = 100;
        int min = 0;
        int arrSize = 10;

        Random rand = new Random();
        for (int i = 0; i < arrSize; i++) {
            arr[i] = rand.nextInt(max - min + 1) + min;
        }
        Arrays.sort(arr, 0, arrSize);
        System.out.println(getName() + " max:" + arr[arr.length-1]);
    }
}

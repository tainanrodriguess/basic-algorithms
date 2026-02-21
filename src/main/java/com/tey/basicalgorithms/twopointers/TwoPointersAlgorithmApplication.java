package com.tey.basicalgorithms.twopointers;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwoPointersAlgorithmApplication {

    public static void main(String[] args) {
        String text = "TAINAN RODRIGUES";
        char[] chars = text.toCharArray();

        int leftPointer = 0;
        int rightPointer = chars.length - 1;

        while (leftPointer < rightPointer) {
            char temp = chars[leftPointer];
            chars[leftPointer] = chars[rightPointer];
            chars[rightPointer] = temp;

            leftPointer++;
            rightPointer--;
        }

        System.out.println(new String(chars));
    }

}

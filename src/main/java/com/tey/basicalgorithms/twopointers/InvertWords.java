package com.tey.basicalgorithms.twopointers;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class InvertWords {

    public static void main(String[] args) {
        String text = "TAINAN DA SILVA RODRIGUES";
        String[] words = text.split(" ");

        int leftPointerWord = 0;
        int rightPointerWord = words.length - 1;

        while (leftPointerWord < rightPointerWord) {
            String temp = words[leftPointerWord];
            words[leftPointerWord] = words[rightPointerWord];
            words[rightPointerWord] = temp;

            leftPointerWord++;
            rightPointerWord--;
        }

        System.out.println(Arrays.toString(words));
    }

}

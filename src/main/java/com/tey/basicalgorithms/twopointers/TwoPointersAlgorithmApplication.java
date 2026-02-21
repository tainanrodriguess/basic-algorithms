package com.tey.basicalgorithms.twopointers;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwoPointersAlgorithmApplication {

    public static void main(String[] args) {
        String texto = "TAINAN";
        char[] chars = texto.toCharArray();

        int esquerda = 0;
        int direita = chars.length - 1;

        while (esquerda < direita) {
            char temp = chars[esquerda];
            chars[esquerda] = chars[direita];
            chars[direita] = temp;

            esquerda++;
            direita--;
        }

        System.out.println(new String(chars));
    }

}

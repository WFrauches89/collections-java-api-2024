package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {

    public static boolean isPrimob(int n) {

        if(n <= 0){
            return false;
        }

        if(n == 1){
            return false;
        }

        for(int i =2; i*i <= n; i++){
            if(n%i ==0){
                return false;
            }
            return true;
        }

        return true;
    };


    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .filter(Desafio17::isPrimob)
                .toList()
                .forEach(System.out::println);

    }


}
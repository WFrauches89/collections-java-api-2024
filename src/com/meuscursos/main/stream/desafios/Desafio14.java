package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Encontre o maior número primo da lista:
//        Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
public class Desafio14 {
    public static boolean isPrimo (int n){
        if(n <= 0){
            return false;
        }
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(-2,1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 5, 4, 3, 17, 19);


        numeros.stream()
                .filter(Desafio14::isPrimo)
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);

    }

}
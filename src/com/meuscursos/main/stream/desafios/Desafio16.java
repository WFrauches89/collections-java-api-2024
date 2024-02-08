package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> pares = numeros.stream()
                .filter(n -> n%2 ==0)
                .distinct()
                .toList();
        List<Integer> impares = numeros.stream()
                .filter(n -> n%3 ==0)
                .distinct()
                .toList();

        System.out.println("Pares: "+pares);
        System.out.println("Impares: "+impares);
    }


}
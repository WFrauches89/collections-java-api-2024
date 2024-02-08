package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Filtrando por números ppares");
        numeros.stream()
                .filter(n -> n%2 ==0 || n == 0)
                .toList()
                .stream()
                .forEach(System.out::println);
    }


}
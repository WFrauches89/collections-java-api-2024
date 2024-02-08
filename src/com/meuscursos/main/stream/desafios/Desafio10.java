package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        System.out.println("Números múltiplos de 3 ou 5, desconsiderando os duplicados... ");
        numeros.stream()
                .filter(n -> ((n % 3) == 0) || ((n % 5) == 0))
                .distinct()
                .toList()
                .forEach(System.out::println);


    }

}
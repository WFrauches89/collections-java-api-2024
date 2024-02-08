package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("\nRetornando em ordem todos os elementos da lista");
        numeros.stream()
                .sorted()
                .forEach(n -> System.out.println(n));

        System.out.println("\nRetornando em ordem todos os elementos da lista invertido - Sem repetir elementos duplicados... e usando Method reference");
        numeros.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(System.out::println);

        System.out.println("\nSem repetir elementos duplicados... e usando Method reference");
        numeros.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);

    }
}

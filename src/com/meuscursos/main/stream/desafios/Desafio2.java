package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números que divisíveis por dois e soma - Sem duplicados...");
        numeros.stream()
                .filter(n -> (n % 2) == 0)
                .distinct()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

    }

}

package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

//Desafio 18 - Verifique se todos os números da lista são iguais:
//        Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 1, 23, 22, 2, 3, 19, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Integer, List<Integer>> grupos = numeros.stream()
                .collect(Collectors.groupingBy(n -> n));

        List<Integer> duplicados = grupos.entrySet().stream()
                .filter(e -> e.getValue().size() > 1)
                .map(Map.Entry::getKey)
                .toList();


        System.out.println("Grupos: " + grupos);
        System.out.println("São iguais: " + duplicados);
    }


}
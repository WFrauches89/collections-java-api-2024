package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(-5,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        System.out.println("Numeros negativos na lista: ");
        numeros.stream()
                .filter(n -> n<=0)
                .toList()
                .forEach(System.out::println);

    }


}

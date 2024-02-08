package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,5, 4, 3);


        numeros.stream()
                .filter(n -> n > 5)
                .mapToDouble(integer -> integer.doubleValue())
                .average()
                .ifPresent(n -> System.out.println("A média dos números maior que 5 é: "+n));

    }


}
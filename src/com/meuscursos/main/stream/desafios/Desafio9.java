package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,20,1,3,5);


        boolean equals = numeros.stream()
                .distinct().toList()
                .equals(numeros);

        Map<Integer, Long> repetidos = numeros.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));



        if(equals){
            System.out.println("Todos os números são únicos... Lista de números: "+numeros);
        } else System.out.println(" Temos números repetidos... São eles: "+ repetidos.keySet());



    }

}
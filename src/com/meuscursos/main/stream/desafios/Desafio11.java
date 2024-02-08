package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        double resultado =numeros.stream()
                .mapToDouble(n -> Math.pow(n, 2))
                .sum();

        System.out.println("O valor da soma de todos os quadrados é: "+resultado);
    }

}
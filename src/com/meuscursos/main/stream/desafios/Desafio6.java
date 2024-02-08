package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 5, 4, 3);

        boolean anyMaior = numeros.stream()
                .anyMatch(n -> n > 10);

        Object[] positivos = numeros.stream()
                .filter(n -> n > 10)
                .toArray();

        Object[] negativos= numeros.stream()
                .filter(n -> n <= 10)
                .toArray();


            if(anyMaior){
                System.out.println("Temos números maior que 10? "+anyMaior+" Lista de números: "+ Arrays.toString(positivos));
            } else System.out.println("Nenhum é maior que 10... Números da lista: "+ Arrays.toString(negativos));

    }

}
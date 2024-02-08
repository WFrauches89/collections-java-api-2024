package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean verificando = numeros.stream()
                .allMatch(n -> n >= 0);

        Object[] positivos = numeros.stream()
                .filter(n -> n > 0)
                .toArray();

        Object[] negativos= numeros.stream()
                .filter(n -> n <0)
                .toArray();


        if(verificando){
            System.out.println("Todos os números são maiores que zero ou iguais a zero, portanto todos são positivos..."+verificando+" Lista de números: "+ Arrays.toString(positivos));
        } else System.out.println("Nem todos são positivos..."+ Arrays.toString(negativos));
    }
}

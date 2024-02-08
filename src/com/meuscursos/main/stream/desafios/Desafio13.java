package com.meuscursos.main.stream.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Desafio 13 - Filtrar os números que estão dentro de um intervalo:
//Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos inserir o intervalo para pesquisa...\nQual o limite inferior para a pesquisa: \n");
        int x = sc.nextInt();
        System.out.println("Qual o limite superior? \n");
        sc.nextLine();
        int y = sc.nextInt();

            numeros.stream()
                    .filter(n -> n > x && n < y)
                    .forEach(System.out::println);

    }

}
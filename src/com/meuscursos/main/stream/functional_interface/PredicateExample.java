package com.meuscursos.main.stream.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        System.out.println("Declarando o Predicate dentro do filter - palavras com mais de 6 letras de comprimento ");
        // Usar o Stream para filtrar as palavras com mais de 6 caracteres e, em seguida,
        // imprimir cada palavra que passou no filtro
        //Forma mais BUROCRÁTICA
        palavras.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.length() > 6;
                    }
                })
                .forEach(System.out::println);


        System.out.println("Passando Predicate dentro do filter - palavras com mais de git st5 letras de comprimento");
        // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou no filtro
        //Forma mais BUROCRÁTICA - Com Predicate externo
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);


        System.out.println("Passando condição conforme Predicate dentro do Filter e imprimindo com Lambda - palavras com 4 letras ou menos de comprimento");
        palavras.stream()
                .filter(p -> p.length() <= 4)
                .forEach(var -> System.out.println(var));

        System.out.println("Passando condição conforme Predicate dentro do Filter e imprimindo com Method reference - palavras com 2 letras ou menos de comprimento");
        palavras.stream()
                .filter(p -> p.length() <= 2)
                .forEach(System.out::println);


    }
}
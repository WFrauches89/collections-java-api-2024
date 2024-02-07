package com.meuscursos.main.stream.functional_interface;

import java.sql.SQLOutput;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        List<String> listsaudacoes3 = Stream.generate(
                new Supplier<String>() {
                    @Override
                    public String get() {
                        return "Olá, seja bem vindo com generate Supplier";
                    }
                }
        ).limit(5)
                .toList();

        List<String> listsaudacoes4 = Stream.generate( () -> "Olá, seja bem vindo com generate Supplier")
                .limit(5)
                .toList();

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes2 = Stream.generate(saudacao)
                .limit(1)
                .collect(Collectors.toList());

        // Usar o Supplier para obter uma lista com 3 saudações = o modelo anterior porém como sugerido pela IDE foi suprimido o collect(Collectors.) para apenas .toList()
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(2)
                .toList();


        // Imprimir as saudações geradas com Lambda
        listaSaudacoes2.forEach(variavel -> System.out.println(variavel));

        System.out.println("-----");

        // Imprimir as saudações geradas com Method Reference - Class::Method - Method Reference
        listaSaudacoes.forEach(System.out::println);
    }
}
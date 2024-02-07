package com.meuscursos.main.stream.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> { //Criando o Consumer imprimirNumeroPar com função Lambda
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };
        System.out.println("\nforEach do Consumer imprimirNumeroPar");
        //Usando stream após o Consumer detalhado
        numeros.forEach(imprimirNumeroPar); //imprimindo ln(next line do consumer) todos os itens da lista List numeros que atendam a alteração do consumer (obs: não afeta o List)
        System.out.println("\nforEach de List numeros na mesma linha - print");
        numeros.forEach(System.out::print);//imprimindo na mesma linha todos os itens da lista List numeros - Não foi afetada a List pelo consumer...
        System.out.println("\n\nforEach de List numeros pulando linha - println");
        numeros.forEach(System.out::println); //imprimindo ln(next line) todos os itens da lista List numeros - Não foi afetada a List pelo consumer...

        System.out.println("\nConsumer dentro do forEach");
        // Usar o Consumer para imprimir números pares no Stream método com o consumer dentro do forEach
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if(integer % 2 == 0){
                    System.out.println(integer);
                }
            }
        });

        System.out.println("\nConsumer como Lambda dentro do forEach");
        // Usar o Consumer para imprimir números pares no Stream método com o consumer dentro do forEach
        numeros.stream().forEach(integer -> {
                if(integer % 2 == 0){
                    System.out.println(integer);
                }
        });
        System.out.println("\nConsumer como Lambda dentro do forEach - Ocultando o Stream");
        // Usar o Consumer para imprimir números pares no Stream método com o consumer dentro do forEach
        numeros.forEach(integer -> {
            if(integer % 2 == 0){
                System.out.println(integer);
            }
        });

        System.out.println("\nstream+filter+forEachls");
        //Observação todos os demais chegam ao mesmo resultado porém neste último caso temos a implementação do Predicate...
        // Usar o Consumer para imprimir números pares no Stream
        numeros.stream()
                .filter(n -> n % 2 == 0)              //filter recebe um Predicate...faremos a Lambda para retornar o mesmo que o Consumer imprimirNumeroPar
                .forEach(System.out::println);
    }
}


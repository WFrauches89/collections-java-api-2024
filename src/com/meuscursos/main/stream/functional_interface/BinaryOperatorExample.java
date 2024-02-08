package com.meuscursos.main.stream.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros com Lambda
        BinaryOperator<Integer> somar2 = (n1,n2) -> n1+n2;

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros com Method Reference
        BinaryOperator<Integer> somar = Integer::sum;

        Optional<Integer> resultado4;
        resultado4 = numeros.stream()
                .reduce(new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer i, Integer i2) {
                        return i+i2;
                    }
                });

        int resultado3 = numeros.stream()
                .reduce(0,somar2);

        int resultado2 = numeros.stream()
                .reduce(0,(n1,n2)->n1+n2);

        // Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        // Imprimir o resultado da soma
        System.out.println("A soma 1 dos números é: " + resultado);

        // Imprimir o resultado da soma
        System.out.println("A soma 2 dos números é: " + resultado2);
        // Imprimir o resultado da soma
        System.out.println("A soma 3 dos números é: " + resultado3);
        // Imprimir o resultado da soma
        System.out.println("A soma 4 dos números é: " + resultado4);
    }



}

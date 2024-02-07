package com.meuscursos.main.stream.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class FunctionExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar a Function com expressão lambda para dobrar todos os números Passando Tipo da entrada e Tipo da Saída <Integer,Integer> - <T,R>
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista _ MODO MAIS BUROCRÁTICO
        List<Integer> numerosDobrados3 = numeros.stream()
                .map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer integer) {
                        return integer*2;
                    }
                }) // passando a Function<T,R> COMPLETA como argumento do MAP
                .collect(Collectors.toList()); //Collect toList completo

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista - MODO COM USO DA FUNCTION EXTERNA PASSADA COMO ARGUMENTO EM ->.map()
        List<Integer> numerosDobrados2 = numeros.stream()
                .map(dobrar) // passando a Function<T,R> REDUZIDA criada fora como argumento do MAP
                .collect(Collectors.toList()); //Collect toList completo

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista - Forma para não ter que criar a FUNCTION, apenas com lambda... pode cancelar FUNCTION<T,R>
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        System.out.println("Lambda");
        // Imprimir a lista de números dobrados
        numerosDobrados2.forEach(var -> System.out.println(var));
        System.out.println("-------------");
        System.out.println("Method reference");
        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);
    }
}
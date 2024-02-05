package com.meuscursos.main.list.desafio2;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numero;

    public SomaNumeros() {
        this.numero = new ArrayList<>();
    }

    public void addNumber(int numero) {
        this.numero.add(numero);
    }

    public Integer calcularNumerosList () {
        int number = 0;
        if(!this.numero.isEmpty()){
            for(Integer i:numero){
                number = number + i;
            }
        } else throw new RuntimeException("Lista de números vazia...");
        return number;
    }

    public Integer encontraMaiorNumero () {
        int maiorN = Integer.MIN_VALUE;
        if(!this.numero.isEmpty()){
            for(Integer i: numero){
                if(i > maiorN){
                    maiorN = i;
                }
            }
        } else throw new RuntimeException(" A lista está vazia.");
        return maiorN;
    }

    public Integer encontraMenorNumero () {
        int menorN = Integer.MAX_VALUE;
        if(!this.numero.isEmpty()){

            for(Integer i: numero){
                if(menorN > i){
                    menorN = i;
                }
            }
        } else throw new RuntimeException(" A lista está vazia.");
        return menorN;
    }

    public void exibirNumeros(){
        if (!this.numero.isEmpty()) {
            System.out.println(this.numero);
        } else {
            System.out.println("A lista está vazia!");
        }
    }


    public static void main(String[] args) {
        SomaNumeros sN = new SomaNumeros();

        sN.addNumber(15);
        sN.addNumber(10);
        sN.addNumber(60);
        sN.addNumber(20);
        sN.addNumber(300);
        sN.addNumber(25);
        sN.addNumber(55);


        System.out.println("Valor do cálculo da lista: "+sN.calcularNumerosList());

        System.out.println("O maior valor da lista é: "+sN.encontraMaiorNumero());

        System.out.println("O menor valor da lista é: "+sN.encontraMenorNumero());

        System.out.println("A lista de números é: ");
        sN.exibirNumeros();
    }

}


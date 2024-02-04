package com.meuscursos.main.list.desafio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void addItem(String name, double preco, int qtd) {
        itens.add(new Item(name,preco,qtd));
    }

    public void removeItem (String name) {
        List<Item> removeItem = new ArrayList<>();
        if (itens.isEmpty()) {
            System.out.println("O carrinho de compras está vazio");
        } else {
            for (Item i : itens) {
                if (i.getNome().equalsIgnoreCase(name)) {
                    removeItem.add(i);
                }
            }
            itens.removeAll(removeItem);
        }
    }

    public double calcularValorTotal() {

        double valorTotal = 0.0;
        if (!itens.isEmpty()) {
            for (Item i : itens) {
                valorTotal = valorTotal + (i.getPreco() * i.getQuantidade());
            }
            return valorTotal;
        } else {
            throw new RuntimeException("O carrinho de compras está vazio, valor atual R$0.00");
        }

    }

    public int exibirQtdItensDistintos () {
        if(!itens.isEmpty()){
            return itens.size();
        } else {
            throw new RuntimeException("O carrinho de compras está vazio.");
        }
    }

    public void exibirItens () {
        if(!itens.isEmpty()){
            System.out.println(this.itens);
        } else {
            System.out.println("O carrinho está vazio...");
        }
    }

    public static void main(String[] args) {

        CarrinhoDeCompras cC = new CarrinhoDeCompras();

        cC.addItem("Bola",15,3);
        cC.addItem("Tenis", 98.5,2);
        cC.addItem("Agulha",1.5,12);

        cC.exibirItens();
        System.out.println("Total elementos distintos da lista: " + cC.exibirQtdItensDistintos());

//        System.out.println("Total elementos distintos da lista: " + cC.exibirQtdItensDistintos());

        System.out.println("Total da lista: R$" + cC.calcularValorTotal());


    }



}

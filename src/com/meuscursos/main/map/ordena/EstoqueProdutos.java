package com.meuscursos.main.map.ordena;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    Map<Long, Produto> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtosMap.put(cod, new Produto(nome,quantidade,preco));
    }

    public void exibirMap() {
        if(!produtosMap.isEmpty()){
            System.out.println(produtosMap);
        }else {
            System.out.println("A lista de produtos está vazia...");
        }
    }

    public double calcularValorTotalEstoque() {
        double valorEstoque = 0.0;
        if(!produtosMap.isEmpty()){
            for(Produto p: produtosMap.values()){
                valorEstoque += p.getPreco() *p.getQuantidade();
            }
        } else throw new RuntimeException("Sem produtos na lista");
        return valorEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        double maisCaro = Double.MIN_VALUE;
        Produto produto = null;
        if(!produtosMap.isEmpty()){
            for(Produto p: produtosMap.values()){
                double prodAtual = p.getPreco();
                if(prodAtual > maisCaro){
                    maisCaro = prodAtual;
                    produto =p;
                }
            }
        }
        return produto;
    }

    public Produto obterProdutoMaisBarato() {
        double maisBarato = Double.MAX_VALUE;
        Produto produto = null;
        if(!produtosMap.isEmpty()){
            for(Produto p: produtosMap.values()){
                double prodAtual = p.getPreco();
                if(prodAtual < maisBarato){
                    maisBarato = prodAtual;
                    produto =p;
                }
            }
        }
        return produto;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        double produtoEstoqueMaiorValor = Double.MIN_VALUE;
        Produto produto = null;
        if(!produtosMap.isEmpty()){
            for(Produto p : produtosMap.values()){
               double prodAtual = p.getPreco() * p.getQuantidade();
               if(produtoEstoqueMaiorValor < prodAtual){
                   produtoEstoqueMaiorValor = prodAtual;
                   produto = p;
               }
            }
        }
        return produto;
    }
// possibilidade utilizar o .ENTRY - neste caso não consegui notar o ganho real em utilizar, porém o entry dá acesso a chave e valor ao mesmo tempo...
//    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
//        Produto produtoMaiorQuantidadeValorNoEstoque = null;
//        double maiorValorTotalProdutoEstoque = 0d;
//        if (!estoqueProdutosMap.isEmpty()) {
//            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
//                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
//                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
//                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
//                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
//                }
//            }
//        }
//        return produtoMaiorQuantidadeValorNoEstoque;
//    }

    public static void main(String[] args) {
        EstoqueProdutos eP = new EstoqueProdutos();

        eP.exibirMap();

        eP.adicionarProduto(1L, "Notebook", 1, 1500.0);
        eP.adicionarProduto(2L, "Mouse", 5, 25.0);
        eP.adicionarProduto(3L, "Monitor", 10, 400.0);
        eP.adicionarProduto(4L, "Teclado", 2, 40.0);
        eP.adicionarProduto(1L, "Notebook", 1, 2500.0);

        eP.exibirMap();

        System.out.println("Valor total do estoque atualizado: R$"+eP.calcularValorTotalEstoque());

        System.out.println("O produto mais caro da lista é: "+eP.obterProdutoMaisCaro());
        System.out.println("O produto mais barato da lista é: "+eP.obterProdutoMaisBarato());


        System.out.println("O produto com o maior valor de estoque é: "+eP.obterProdutoMaiorQuantidadeValorTotalNoEstoque()+" e o valor total deste no estoque é de R$"+eP.obterProdutoMaiorQuantidadeValorTotalNoEstoque().getPreco()*eP.obterProdutoMaiorQuantidadeValorTotalNoEstoque().getQuantidade());



    }

}

package com.meuscursos.main.set.ordenacao;

import java.util.Comparator;

public class ComparatorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}

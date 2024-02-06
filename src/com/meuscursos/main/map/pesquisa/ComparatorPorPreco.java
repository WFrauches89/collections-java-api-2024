package com.meuscursos.main.map.pesquisa;

import java.util.Comparator;
import java.util.Map;

class ComparatorPorPreco implements Comparator<Map.Entry<String, Livros>> {
    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
    }
}

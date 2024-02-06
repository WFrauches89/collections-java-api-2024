package com.meuscursos.main.map.pesquisa;

import java.util.Comparator;
import java.util.Map;

class ComparatorPorAutor implements Comparator<Map.Entry<String, Livros>> {
    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
    }
}

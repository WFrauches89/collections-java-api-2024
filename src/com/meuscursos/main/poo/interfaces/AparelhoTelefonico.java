package com.meuscursos.main.poo.interfaces;

public interface AparelhoTelefonico {

    public default void ligar(String numero){};

    public default void atender() {};

    public default void iniciarCorreioVoz(String numero) {};

}

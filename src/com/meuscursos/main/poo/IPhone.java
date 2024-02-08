package com.meuscursos.main.poo;

import com.meuscursos.main.poo.interfaces.AparelhoTelefonico;
import com.meuscursos.main.poo.interfaces.NavegadorNaInternet;
import com.meuscursos.main.poo.interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando... \n número discado: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz(String numero) {
        System.out.println("Abrindo correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void tocar(String nomeMusica) {
        selecionarMusica(nomeMusica);
        System.out.println("Tocando..."+nomeMusica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausado!");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Musica selecionada: "+nomeMusica);
    }

    public static void main(String[] args) {

        IPhone iphone = new IPhone();

        iphone.atender();

        iphone.tocar("Mockingbird");

        iphone.exibirPagina("www.google.com.br");


    }

}

package com.iphone.interfaces;

import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void ligar(String numero) {
        System.out.println("Digite o numero a ser ligado: ");
        numero = scanner.nextLine();
        System.out.println("Ligando para: "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Telefone atendido!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Digite a url: ");
        url = scanner.nextLine();
        System.out.println("A pagina da url: "+url+" esta sendo exibida.");
    }

    @Override
    public void novaAba() {
        System.out.println("Abrindo uma nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina web.");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica selecionada!");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escreva a musica a ser tocada: ");
        String musica = scanner.nextLine();
        System.out.println("A musica: "+musica+" foi selecionada!");
    }

}

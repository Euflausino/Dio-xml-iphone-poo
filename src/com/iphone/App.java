package com.iphone;

import com.iphone.interfaces.Iphone;

import java.util.Scanner;

public class App {
    static Iphone iphone = new Iphone();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int opc = -1;
        while (true){
            System.out.println("=====Escolha uma interface=====");
            System.out.println("1. Contatos");
            System.out.println("2. Internet");
            System.out.println("3. Reprodutor de musica");
            System.out.println("4. Sair");
            opc = scan.nextInt();
            if (opc == 1) {
                contact();
            } else if (opc == 2) {
                internet();
            } else if (opc ==3 ) {
                music();
            } else if (opc == 4) {
                System.out.println("Saindo...");
                break;
            } else  {
                System.out.println("Opçao invalida.");
            }
            System.out.println("==========");
        }
    }
    //metodo contato
    private static void contact(){
        int opc = -1;
        while (true){
            System.out.println("Escolha uma açao");
            System.out.println("1.Ligar");
            System.out.println("2.Atender");
            System.out.println("3.correio de voz");
            System.out.println("4.Sair");
            opc = scan.nextInt();
            if (opc == 1){
                iphone.ligar("");
            }
            else if (opc == 2){
                iphone.atender();
            } else if (opc == 3) {
                iphone.iniciarCorreioVoz();
            }else if (opc == 4){
                System.out.println("Saindo...");
                break;
            }else {
                System.out.println("Opçao invalida");
                continue;
            }
        }

    }
    private static void internet(){
        int opc = -1;
        while (true){
            System.out.println("Escolha uma açao");
            System.out.println("1.Exibir pagina");
            System.out.println("2.Nova aba");
            System.out.println("3.atualizar pagina");
            System.out.println("4.Sair");
            opc = scan.nextInt();
            if (opc == 1){
                iphone.exibirPagina("");
            }
            else if (opc == 2){
                iphone.novaAba();
            } else if (opc == 3) {
                iphone.atualizarPagina();
            }else if (opc == 4){
                System.out.println("Saindo...");
                break;
            }else {
                System.out.println("Opçao invalida");
                continue;
            }
        }

    }
    private static void music(){
        boolean selecao = false;
        int opc = -1;
        while (true){
            System.out.println("EScolha uma açao");
            System.out.println("1.Tocar musica");
            System.out.println("2.Pausar musica");
            System.out.println("3.Selecionar musica");
            System.out.println("4.Sair");
            opc = scan.nextInt();
            if (opc == 1 && selecao == true){
                iphone.tocarMusica();
            } else if (opc == 1 && selecao == false) {
                System.out.println("Selecione uma musica primeiro!");
                continue;
            } else if (opc == 2){
                iphone.pausarMusica();
            } else if (opc == 3) {
                iphone.selecionarMusica();
                selecao = true;
            }else if (opc == 4){
                System.out.println("Saindo...");
                break;
            }else {
                System.out.println("Opçao invalida");
                continue;
            }
        }

    }
}

package br.senai.sp.jandira.jokenpo.model;

import java.util.Random;
import java.util.Scanner;

public class JokenpoJogo {
    int escolhaDoJogador;
    int escolhaDoComputador;
    int calculoEscolhas;
    String resultado;
    String escolhaJogadorPorExtenso;
    String escolhaCompurtadorPorExtenso;
    String reiniciarJogo;


    public void capturarEscolhaDoJogador(){
        Scanner resposta = new Scanner(System.in);
        System.out.println("***VAMOS JOGAR JOKENPÔ!***");
        System.out.println("---------------------------");

        System.out.println("Escolha uma das opções: ");
        System.out.println("---------------------------");
        System.out.printf("(1)Pedra %n(2)Papel %n(3)Tesoura%n");
        System.out.println("---------------------------");
        System.out.print("Digite a sua escolha: ");
        escolhaDoJogador = resposta.nextInt();


        gerarEscolhaDoComputador();
    }
    public void gerarEscolhaDoComputador(){
        Random gerador = new Random();

        escolhaDoComputador = gerador.nextInt(3)+ 1;

        calcularRespostas();
    }
    public void calcularRespostas(){
        calculoEscolhas = (escolhaDoJogador - escolhaDoComputador);

        definirCondicoes();
    }
    public void definirCondicoes(){
        if (calculoEscolhas == 0){
            resultado = "* * * E M P A T E * * *";
        } else if (calculoEscolhas == 1 || calculoEscolhas == -2) {
            resultado = "* * * V O C Ê  V E N C E U ! ! ! * * *";
        }else {
            resultado = " Não foi dessa vez :( ";
        }

        exibirAsEscolhasPorExtenso();
    }
    public void exibirAsEscolhasPorExtenso(){
        //escolhas do jogador
        if (escolhaDoJogador == 1){
            escolhaJogadorPorExtenso = "Pedra";
        } else if (escolhaDoJogador == 2) {
            escolhaJogadorPorExtenso = "Papel";
        }else {
            escolhaJogadorPorExtenso = "Tesoura";
        }
        //escolhas do computador
        if (escolhaDoComputador == 1){
           escolhaCompurtadorPorExtenso = "Pedra";
        } else if (escolhaDoComputador == 2) {
            escolhaCompurtadorPorExtenso = "Papel";
        }else {
            escolhaCompurtadorPorExtenso = "Tesoura";
        }
        exibirResultado();
    }
    public void exibirResultado(){
        System.out.println(" ");
        System.out.println("Você escolheu: " + escolhaJogadorPorExtenso);
        System.out.println("O computador escolheu: " + escolhaCompurtadorPorExtenso);
        System.out.println(" ");
        System.out.println(resultado);

        jogarNovamente();
    }
    public void jogarNovamente(){
        Scanner restarter = new Scanner(System.in);

        System.out.print("Jogar novamente (S/N)? ");
        reiniciarJogo = restarter.nextLine();
        System.out.println(" ");

        if (reiniciarJogo.equalsIgnoreCase("S")){
            capturarEscolhaDoJogador();
        } else if (reiniciarJogo.equalsIgnoreCase("N")) {
            System.out.println("* * * J O G O  E N C E R R A D O * * *");
        }else {
            System.out.println("Desculpe, comando não reconhecido :(. Tente novamente.");
            jogarNovamente();
        }

    }
}

package faqpessoal;

import java.util.Scanner;

public class FaqPessoal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Como você se chama? ");
        String nome = input.nextLine();
        
        System.out.println("Qual a sua idade? ");
        int idade = input.nextInt();
        input.nextLine();
        
        System.out.println("Quais linguagens de programação você mais gosta? ");
        String programacao = input.nextLine();
        
        System.out.println("Seu nome é "+ nome + ", tem " + idade + " anos" + " e gosta das seguintes linguagens de programação: " + programacao);

    }
    
}

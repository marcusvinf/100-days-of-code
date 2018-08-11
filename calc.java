package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int n,itr;
        char operacao;
        double resultado = 0;

	 System.out.println("########## CALCULADORA ############");
	 Scanner add = new Scanner(System.in);
	 System.out.println("Selecione sua operacao");
	 operacao = add.next().charAt(0);
	 System.out.println("Selecione agora quantas vezes vc quer fazer a operacao");
	 n = add.nextInt();

	 switch (operacao){
         case '+': for(int i =0; i<n; i++){
             System.out.println("Voce irá realizar entao soma "+n+" vezes esta eh a : "+(1+i));
             itr = add.nextInt();
             resultado+=itr;
         } break;
         case '-': for(int i =0; i<n; i++){
             System.out.println("Voce irá realizar entao subtracao "+n+" vezes esta eh a : "+(1+i));
             itr = add.nextInt();
             resultado-=itr;
         } break;
         case '*': resultado=1; for(int i =0; i<n; i++){
             System.out.println("Voce irá realizar entao multiplicacao "+n+" vezes esta eh a : "+(1+i));
             itr = add.nextInt();
             resultado*=itr;
         } break;
         case '/': System.out.println("digite um valor"); resultado=add.nextInt();for(int i =0; i<n; i++){
             System.out.println("Voce irá realizar entao divisao "+n+" vezes esta eh a : "+(1+i));
             itr = add.nextInt();
             resultado/=itr;
         } break;
         default: System.out.println("eVoce nao escolheu nenhuma operacao"); break;

     }
     System.out.println("O resultado eh : " + resultado);
	 resultado = 0;
	 itr = 0;

    }
}

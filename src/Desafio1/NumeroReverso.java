package Desafio1;


import java.util.Scanner;

/*
* Número Reverso:
* Faça um programa que leia um valor inteiro
* (este número deverá conter 4 dígitos).
* A saída deverá ser o reverso de um número inteiro informado.
Exemplo: Digamos que a entrada foi 3257. A resposta será 7523.
Regras:
a) A entrada deverá estar entre 1000 e 9999;
b) Se o usuário digitar 3 dígitos ou menos,
* o Programa avisa que tem que conter 4 dígitos
* e continuar a programação até a resposta final.
* */
public class NumeroReverso {

    //esse é o método que vai fazer a entrada do código
    public static void numeroReverso(){

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Digite um numero com 4 dígitos: ");
            int numeroInformado = scan.nextInt();
            String numeroInformadoString = String.valueOf(numeroInformado);
            if(numeroInformado >=1000 && numeroInformado <=9999){

                StringBuilder stringBuilder = new StringBuilder(numeroInformadoString);

                System.out.println(stringBuilder.reverse());

                break;
            } else if (numeroInformadoString.length()<4) {
                System.out.println("O numero precisa ter 4 dígitos;");
            }

        } while (true);

    }
}
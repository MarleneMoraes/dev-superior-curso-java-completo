/*
    Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
    de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
    ponto, ou se est� sobre um dos eixos cartesianos ou na origem (x = y = 0).
    Se o ponto estiver na origem, escreva a mensagem �Origem�.
    Se o ponto estiver sobre um dos eixos escreva �Eixo X� ou �Eixo Y�, conforme for a
    situa��o.
*/

package com.devsuperior.javacompleto.aula037;

import java.util.Scanner;

public class Ex007 {
	static void ex007(){
        Scanner sc = new Scanner(System.in);

        System.out.println("PROGRAMA DE VERIFICA��O - EIXOS X E Y");
        System.out.println("Digite dois valores para verifica��o em qual eix.");
        System.out.print("Primeiro valor: ");
        float x = sc.nextFloat();
        
        System.out.print("Segundo valor: ");
        float y = sc.nextFloat();
        
        if (x == 0 && y == 0){
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0) {
            System.out.println("Eixo X");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        sc.close();
    }
}

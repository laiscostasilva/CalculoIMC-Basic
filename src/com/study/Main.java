package com.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, alt, imc;
        System.out.println("Peso: ");
        peso = Double.parseDouble(sc.nextLine());
        System.out.println("Altura: ");
        alt = Double.parseDouble(sc.nextLine());
        imc = peso / (alt * alt);
        System.out.println("IMC: " + imc);

        // analisando o resultado do imc
        if (imc < 18.5) {
            System.out.println("--- Abaixo do peso! ---");
        }
        else if (imc < 25) {
            System.out.println("--- Peso normal! ---");
        }
        else if (imc < 30) {
            System.out.println("--- Sobrepeso ---");
        }
        else if (imc < 35) {
            System.out.println("--- Obesidade Grau I ---");
        }
        else if (imc < 40) {
            System.out.println("--- Obesidade Grau II ---");
        }
        else {
            System.out.println("--- Obesidade Grau III ---");
        }

    }
}

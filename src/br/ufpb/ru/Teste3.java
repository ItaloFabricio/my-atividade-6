/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpb.ru;

import java.util.Scanner;

/**
 *
 * @author danielfelizardo
 */
public class Teste3 {
    
    public static int amountOfLunchTypeMeal(RefeicaoRealizada [] refeicoes) {
        int amountLunchMeal = 0;
        
        for (RefeicaoRealizada refeicao : refeicoes) {
            if (refeicao.getTipoRefeicao().equalsIgnoreCase("ALMOÇO")) {
                amountLunchMeal++;
            }
        }
        
        return amountLunchMeal;
    }
    
    public static void checksCoffeeTypeMeal(RefeicaoRealizada [] refeicoes) {
        String checkCoffyType = "NÃO";
        
        for (RefeicaoRealizada refeicao : refeicoes) {
            if (refeicao.getTipoRefeicao().equalsIgnoreCase("CAFÉ")) {
                checkCoffyType = "SIM";
            }
        }
        
        System.out.println(checkCoffyType);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas refeições do tipo almoço foram servidas?");
        int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());
        
        double [] precoTotal = new double[quantidadeRefeicoes];

        for (int k = 1; k <= quantidadeRefeicoes; k++) {
            System.out.println("Qual o preço da ["+ k +"] refeição?");
            double preco = Double.parseDouble(leitor.nextLine());
            
            precoTotal[k-1] = preco;
        }
        leitor.close();
        double total = 0;
        
        for (double preco : precoTotal) {
            total += preco;
        }
        
        System.out.println("Total gasto: "+ total);
    }
}

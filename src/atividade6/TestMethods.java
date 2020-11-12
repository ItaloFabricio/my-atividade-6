/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade6;

import java.util.Scanner;

/**
 *
 * @author danielfelizardo
 */
public class TestMethods {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());
        Produto [] produtos = new Produto [quant];
        
        for (int k = 0; k < quant; k++){
            Produto produto = new Produto();
            System.out.println("Qual o nome do produto?");
            produto.setNome(leitor.nextLine());
            System.out.println("Qual o preço original do produto?");
            produto.setPreco(Double.parseDouble(leitor.nextLine()));
            double valorComDesconto = ProgramaDescontos.calculaValorComDesconto(produto.getPreco());
            System.out.printf("O valor a pagar pelo produto é R$ %.2f\n",valorComDesconto);
            produtos[k] = produto;
        }
        
        System.out.println("O valor total dos produtos com desconto foi de: " +
            ProgramaDescontos.calculaSomatorioDescontos(produtos)
        );
        System.out.println("O produto que obteve o maior desconto foi: "+
            ProgramaDescontos.verificaProdutoComMaiorDesconto(produtos)
        );
        
        leitor.close();
    }
}

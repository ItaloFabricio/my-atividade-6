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
public class ProgramaDescontos {
    public static double calculaValorComDesconto(double valorProduto){
        if (valorProduto < 50){
            return (valorProduto);
        } else if (valorProduto < 100){
            return (valorProduto - (valorProduto*0.05));
            //5% de desconto se valor entre 50 e 100 (sem incluir 100)
        } else {
            return (valorProduto - (valorProduto*0.10));
            //10% de desconto
        }
    }

    public static double calculaSomatorioDescontos(Produto[] produtos) {
        double somaDesconto = 0;

        for (int k = 0; k < produtos.length; k++) {
            somaDesconto += calculaValorComDesconto(produtos[k].getPreco());
        }

        return somaDesconto;
    }

    public static String verificaProdutoComMaiorDesconto(Produto[] produtos) {
        if (produtos.length == 0) {
            System.out.println("Nenhum produto cadastrado.");
            return "";
        } else {
            String maiorDesconto = "";
            double maiorProdutoDesconto = 0.0;

            for (int k = 0; k < produtos.length; k++) {
                if (k == 0) {
                    maiorProdutoDesconto = calculaValorComDesconto(produtos[k].getPreco());
                    maiorDesconto = produtos[k].getNome();
                } else {                    
                    if (calculaValorComDesconto(produtos[k].getPreco()) > maiorProdutoDesconto) {
                        maiorProdutoDesconto = calculaValorComDesconto(produtos[k].getPreco());
                        maiorDesconto = produtos[k].getNome();
                    }
                }
            }

            return maiorDesconto;
        }
    }
    
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());
        Produto [] produtos = new Produto [quant];
        
        for (int k=0; k<quant; k++){
            Produto p = new Produto();
            System.out.println("Qual o nome do produto?");
            p.setNome(leitor.nextLine());
            System.out.println("Qual o preço original do produto?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));
            double valorComDesconto =
            calculaValorComDesconto(p.getPreco());
            System.out.printf("O valor a pagar pelo produto é R$ %.2f\n",valorComDesconto);
            produtos[k] = p;
        }
        
        System.out.println(calculaSomatorioDescontos(produtos));
        System.out.println(verificaProdutoComMaiorDesconto(produtos));
        
        leitor.close();
    }
}

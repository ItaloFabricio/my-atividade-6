/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import atividade6.Produto;
import atividade6.ProgramaDescontos;
import java.util.Scanner;

/**
 *
 * @author danielfelizardo
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int productAmount = Integer.parseInt(sc.nextLine());

        Produto[] products = new Produto[productAmount];
        
        for (int i = 0; i < productAmount; i++) {
            System.out.print("Qual o nome do produto? ");
            String nome = sc.nextLine();
            
            System.out.print("Qual o preço do produto? ");
            double preco = Double.parseDouble(sc.nextLine());
            
            Produto product = new Produto();
            
            product.setNome(nome);
            product.setPreco(preco);
            
            products[i] = product;
        }

        System.out.println("O total foi de: "+ ProgramaDescontos.calculaSomatorioDescontos(products));
        System.out.println("O produto que obteve o maior desconto foi: "+
            ProgramaDescontos.verificaProdutoComMaiorDesconto(products)
        );
    }
}

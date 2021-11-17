/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.Produto;
import model.design.Perecivel;

/**
 *
 * @author B1-08
 */
public class TesteProduto {
    public static void main(String[] args) {
        //Criação e instância do objeto da classe Produto
        Produto produto = new Produto();
        /*
        //Construção do objeto
        produto.setCodigo(1);
        produto.setDescricao("Banana");
        produto.setQuantidade(200);
        produto.setPreco(7.25);
        */
        //Imprimindo o produto
        System.out.println("\n\t\t\t -- Produto 1 --\n");
        produto.imprimirProduto();
        
        //Outro produto
        Produto produto2 = new Produto(2, "Feijão", 50, 6.99);
        
        //Imprimindo o produto dois
        System.out.println("\n\t\t\t -- Produto 2 --\n");
        produto2.imprimirProduto();
        
        //Criação e instância de um produto perecível
        Perecivel perecivel = new Perecivel();
        
        //Construção do objeto
        perecivel.setDescricao("Queijo Prato");
        perecivel.setCodigo(10);
        perecivel.setQuantidade(20);
        perecivel.setPreco(40.32);
        perecivel.setDataFabricacao("10/10/2021");
        perecivel.setPrazoValidade(60);        
        
        //Imprimir produto perecível
        System.out.println("\n\t\t\t -- Produto Perecível -- \n");
        perecivel.imprimirProduto();
        //perecivel.imprimirPerecivel();
                                                              
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author B1-08
 */
public class Perecivel extends Produto{
    //Atributos
    private String dataFabricacao;
    private int prazoValidade;
    
    //Métodos
    public void imprimirPerecivel(){
        System.out.println("Data de Fabricação: " + getDataFabricacao());
        System.out.println("Prazo de validade: " + getPrazoValidade() + " dias.");
    }

    @Override
    public void imprimirProduto() {
        super.imprimirProduto(); //To change body of generated methods, choose Tools | Templates.
        this.imprimirPerecivel();
    }
    
    

    /**
     * @return the dataFabricacao
     */
    public String getDataFabricacao() {
        return dataFabricacao;
    }

    /**
     * @param dataFabricacao the dataFabricacao to set
     */
    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    /**
     * @return the prazoValidade
     */
    public int getPrazoValidade() {
        return prazoValidade;
    }

    /**
     * @param prazoValidade the prazoValidade to set
     */
    public void setPrazoValidade(int prazoValidade) {
        this.prazoValidade = prazoValidade;
    }

    public Perecivel(String dataFabricacao, int prazoValidade) {
        this.dataFabricacao = dataFabricacao;
        this.prazoValidade = prazoValidade;
    }

    public Perecivel(String dataFabricacao, int prazoValidade, int codigo, String descricao, int quantidade, double preco) {
        super(codigo, descricao, quantidade, preco);
        this.dataFabricacao = dataFabricacao;
        this.prazoValidade = prazoValidade;
    }

    public Perecivel() {
        super.setDescricao("Produto não definido");
    }
    
    
    
    
}

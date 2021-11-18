/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.design;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.design.Produto;

/**
 *
 * @author EtecMorato
 */
public class TableModel extends AbstractTableModel {
    // Lista para implementar a tabela na memória 
    private List<Produto> produto = new ArrayList<>();
    
    // Vetor com os rótulos dos campos da tabela
    private String[] columns = {"Código", "Descrição", "Quantidade", "Preço"};
    
    @Override
    public int getRowCount() {
        return this.produto.size();
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return this.columns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return produto.get(rowIndex).getCodigo();
            case 1:
                return produto.get(rowIndex).getDescricao();
            case 2:
                return produto.get(rowIndex).getQuantidade();
            case 3:
                return produto.get(rowIndex).getPreco();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                produto.get(rowIndex).setCodigo(Integer.parseInt((String)aValue));
            case 1:
                produto.get(rowIndex).setDescricao((String)aValue);
            case 2:
                produto.get(rowIndex).setQuantidade(Integer.parseInt((String)aValue));
            case 3:
                produto.get(rowIndex).setPreco(Double.parseDouble((String)aValue));
                break;
        }
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
    
    
    public void addRow(Produto p){
        this.produto.add(p);
        this.fireTableDataChanged();
    } 
       
    public void removeRow(int rowIndex){
        this.produto.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    
}

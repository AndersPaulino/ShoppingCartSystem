package org.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    private int numeroVenda;
    private Date dataVenda;
    private Cliente cliente;
    private List<Item> itens;
    private double totalVenda;

    public Venda(int numeroVenda, Date dataVenda, Cliente cliente) {
        this.numeroVenda = numeroVenda;
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.totalVenda = 0.0;
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
        this.totalVenda += item.getValorTotal();
    }

    public int getNumeroVenda() {
        return numeroVenda;
    }

    public void setNumeroVenda(int numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }
}

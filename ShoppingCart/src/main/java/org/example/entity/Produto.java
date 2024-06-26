package org.example.entity;

public class Produto {
    private int codigo;
    private String descricao;
    private String categoria;
    private double precoCompra;
    private double margemLucro;
    private double precoVenda;
    private int quantidadeEstoque;
    private int estoqueMinimo;

    public Produto(int codigo, String descricao, String categoria, double precoCompra, double margemLucro, int quantidadeEstoque, int estoqueMinimo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.precoCompra = precoCompra;
        this.margemLucro = margemLucro;
        this.quantidadeEstoque = quantidadeEstoque;
        this.estoqueMinimo = estoqueMinimo;
        calcularPrecoVenda();
    }

    public void calcularPrecoVenda() {
        this.precoVenda = this.precoCompra * (1 + this.margemLucro / 100);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }
}

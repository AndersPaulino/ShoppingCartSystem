package org.example;

import org.example.entity.Cliente;
import org.example.entity.Item;
import org.example.entity.Produto;
import org.example.entity.Venda;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "João Silva", "123.456.789-00", "Rua A, 123", "São Paulo", "SP", "01000-000", "(11) 91234-5678");

        Produto produto1 = new Produto(1, "Produto A", "Categoria X", 100.0, 20.0, 50, 10);

        Item item1 = new Item(produto1, 2);

        Venda venda1 = new Venda(1, new Date(), cliente1);
        venda1.adicionarItem(item1);

        System.out.println("Venda Nº: " + venda1.getNumeroVenda());
        System.out.println("Data: " + venda1.getDataVenda());
        System.out.println("Cliente: " + venda1.getCliente().getNomeCompleto());
        System.out.println("Total da Venda: R$ " + venda1.getTotalVenda());

    }
}
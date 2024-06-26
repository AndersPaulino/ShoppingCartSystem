# Sistema de Carrinho de Compras

Este repositório contém a implementação de um sistema de carrinho de compras em Java. O sistema inclui classes para gerenciar clientes, produtos, itens e vendas, permitindo a criação e manipulação de um carrinho de compras automatizado.

## Estrutura do Projeto

O projeto está organizado em pacotes e classes da seguinte forma:

- `org.example.entity`
  - `Cliente`: Representa os clientes do sistema.
  - `Produto`: Representa os produtos disponíveis para venda.
  - `Item`: Representa os itens incluídos em uma venda.
  - `Venda`: Representa as vendas realizadas no sistema.

## Classes e Atributos

### Cliente

A classe `Cliente` possui os seguintes atributos:

- `int identificador`
- `String nomeCompleto`
- `String cpf`
- `String endereco`
- `String cidade`
- `String uf`
- `String cep`
- `String telefone`

### Produto

A classe `Produto` possui os seguintes atributos:

- `int codigo`
- `String descricao`
- `String categoria`
- `double precoCompra`
- `double margemLucro`
- `double precoVenda`
- `int quantidadeEstoque`
- `int estoqueMinimo`

### Item

A classe `Item` possui os seguintes atributos:

- `Produto produto`
- `int quantidade`
- `double valorUnitario`
- `double valorTotal`

### Venda

A classe `Venda` possui os seguintes atributos:

- `int numeroVenda`
- `Date dataVenda`
- `Cliente cliente`
- `List<Item> itens`
- `double totalVenda`

## Exemplo de Utilização

Um exemplo de utilização das classes está disponível na classe `Main` no pacote `org.example`. O exemplo cria um cliente, um produto, um item de venda, e uma venda, exibindo as informações da venda no console.

```java
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
```
## Como executar
### Para execytar o projeto, siga os seguintes passos:
* Clone o repositório:
  ```sh
    git clone
  ```

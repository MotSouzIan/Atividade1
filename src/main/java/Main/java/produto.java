package Produto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class produto {
    private int codigo;
    private String descricao;
    private double preco;
    private String caminhoImagem;

    public produto( int codigo, String descricao, double preco, String caminhoImagem){
        this.codigo = codigo;
        this. descricao = descricao;
        this.preco = preco;
        this. caminhoImagem = caminhoImagem;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        produto[] produtos = new produto[5];
        produtos[0] = new produto (1, "Cachorro quente", 4.00, "C:\\Users\\ian_m\\OneDrive\\Pictures\\Cachorro_quente");
        produtos[1] = new produto (2, "X-Salada", 4.50, "C:\\Users\\ian_m\\OneDrive\\Pictures\\X-salada");
        produtos[2] = new produto (3, "X-Bacon", 5.00, "C:\\Users\\ian_m\\OneDrive\\Pictures\\X-Bacon");
        produtos[3] = new produto (4, "Torrada simples", 2.00, "C:\\Users\\ian_m\\OneDrive\\Pictures\\Torrada_simples");
        produtos[4] = new produto (5, "Refrigerante", 1.50, "C:\\Users\\ian_m\\OneDrive\\Pictures\\Refrigerante");

        System.out.println("Digite o código do produto e a quantidade desejada, separados por espaço: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");


        int codigo = Integer.parseInt(parts[0]);
        int quantidade = Integer.parseInt(parts[1]);

        boolean produtoEncontrado = false;
        for (produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                double valorTotal = produto.getPreco() * quantidade;
                System.out.printf("Total: R$ %.2f%n", valorTotal);
                produtoEncontrado = true;
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Código do item inválido.");
        }

    }
}



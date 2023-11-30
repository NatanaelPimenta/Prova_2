import java.util.ArrayList;
import java.util.Date;

public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private String descricaoProduto;
    private int estoqueAtual;

    public Produto(String nomeProduto, double precoProduto, String descricaoProduto, int estoqueAtual) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.descricaoProduto = descricaoProduto;
        this.estoqueAtual = estoqueAtual;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public boolean buscarProduto(Produto produto) {
        return this.nomeProduto.equals(produto.getNomeProduto());
    }
}
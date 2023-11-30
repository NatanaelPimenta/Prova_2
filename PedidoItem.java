public class PedidoItem {
    private String nomeItem;
    private int quantidadeItem;
    private double precoItem;

    public PedidoItem(String nomeItem, int quantidadeItem, double precoItem) {
        this.nomeItem = nomeItem;
        this.quantidadeItem = quantidadeItem;
        this.precoItem = precoItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public void atualizarEstoqueItem(Produto produto) {
        // Lógica para atualizar o estoque do item no pedido
    }
}

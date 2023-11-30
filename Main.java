import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Toddy", 15.0, "Desc1", 39));
        listaProdutos.add(new Produto("Bolacha", 10.0, "Desc2", 20));
        listaProdutos.add(new Produto("Oleo", 12.0, "Desc3", 35));
        listaProdutos.add(new Produto("Cereja", 30.0, "Desc4", 50));


        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        Pedido pedido1 = new Pedido(1, new Date(), 0.0, 3);
        PedidoItem item1 = new PedidoItem("Toddy", 2, 15.0);
        PedidoItem item2 = new PedidoItem("Bolacha", 3, 10.0);

        if (listaProdutos.contains(getProdutoPorNome(listaProdutos, item1.getNomeItem()))
                && listaProdutos.contains(getProdutoPorNome(listaProdutos, item2.getNomeItem()))) {

            pedido1.inserirItensPedido(item1);
            pedido1.inserirItensPedido(item2);

            for (PedidoItem item : pedido1.getItensPedido()) {
                Produto produtoCorrespondente = getProdutoPorNome(listaProdutos, item.getNomeItem());
                if (produtoCorrespondente != null) {
                    int novoEstoque = produtoCorrespondente.getEstoqueAtual() - item.getQuantidadeItem();
                    produtoCorrespondente.setEstoqueAtual(novoEstoque);
                }
            }

            pedido1.setStatusPedido(3);

            double totalPagarPedido1 = pedido1.calculaTotalPagar();
            pedido1.setPrecoTotal(totalPagarPedido1);

            listaPedidos.add(pedido1);
        }

        for (Pedido pedido : listaPedidos) {
            System.out.println("O número do Pedido é: " + pedido.getNumeroPedido());
            System.out.println("Horário do Pedido: " + pedido.getDataHoraPedido());
            System.out.println("Situação do Pedido: " + pedido.getStatusPedido());
            System.out.println("Valor do pedido: " + pedido.getPrecoTotal());

            System.out.println(" Produtos selecionados:");
            for (PedidoItem item : pedido.getItensPedido()) {
                System.out.println("- Nome do Produto: " + item.getNomeItem());
                System.out.println("  Quantidade do produto: " + item.getQuantidadeItem());
                System.out.println("  Valor unitário: " + item.getPrecoItem());
            }
        }
    }

    private static Produto getProdutoPorNome(ArrayList<Produto> listaProdutos, String nomeProduto) {
        for (Produto produto : listaProdutos) {
            if (produto.getNomeProduto().equals(nomeProduto)) {
                return produto;
            }
        }
        return null;
    }
}
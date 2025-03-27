import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando um item de exemplo
        Produto arroz = new Produto("Arroz", 5.0, 100);
        Produto feijao = new Produto("Feijão", 3.0, 50);

        Item item1 = new Item(arroz, 2); // 2 unidades de arroz
        Item item2 = new Item(feijao, 3); // 3 unidades de feijão

        // Criando uma lista de itens
        List<Item> itens = List.of(item1, item2);

        // Criando um pedido com os itens e a forma de pagamento
        Pedido pedido = new Pedido(itens, FormaPagamento.CARTAO);

        // Exibindo o pedido
        System.out.println(pedido);
    }
}

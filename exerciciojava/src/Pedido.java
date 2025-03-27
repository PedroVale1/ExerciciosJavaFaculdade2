import java.util.List;

public class Pedido {
    private List<Item> itens;
    private FormaPagamento formaPagamento;

    // Construtor
    public Pedido(List<Item> itens, FormaPagamento formaPagamento) {
        this.itens = itens;
        this.formaPagamento = formaPagamento;
    }

    // Método para calcular o total do pedido
    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.calcularTotal();
        }
        return total;
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido [itens=");

        // Exibe os itens de maneira formatada
        for (Item item : itens) {
            sb.append(item.toString()).append(", ");
        }

        // Remove a última vírgula e espaço
        if (!itens.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append(", formaPagamento=").append(formaPagamento)
          .append(", total=").append(calcularTotal())
          .append("]");

        return sb.toString();
    }
}

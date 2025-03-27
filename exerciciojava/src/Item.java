public class Item {
  private Produto produto;
  private int quantidade;

  public Item(Produto produto, int quantidade) {
      this.produto = produto;
      this.quantidade = quantidade;
  }

  public double calcularTotal() {
      return produto.getPreco() * quantidade;
  }

  @Override
  public String toString() {
      return produto.toString() + " Quantidade: " + quantidade;
  }
}

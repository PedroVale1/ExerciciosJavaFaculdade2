public class Produto {
  private String nome;
  private double preco;
  private int quantidadeEmEstoque;

  public Produto(String nome, double preco, int quantidadeEmEstoque) {
      this.nome = nome;
      this.preco = preco;
      this.quantidadeEmEstoque = quantidadeEmEstoque;
  }

  public double getPreco() {
      return preco;
  }

  public int getQuantidadeEmEstoque() {
      return quantidadeEmEstoque;
  }

  public String getNome() {
      return nome;
  }

  @Override
  public String toString() {
      return nome + " (Preço: " + preco + ", Estoque: " + quantidadeEmEstoque + ")";
  }
}

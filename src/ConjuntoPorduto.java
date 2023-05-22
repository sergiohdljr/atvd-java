import java.util.ArrayList;

public class ConjuntoPorduto {
  ArrayList<Produto> conjunto = new ArrayList<Produto>();

  public void AdicionarProduto(Produto produto){
    conjunto.add(0, produto);
  }
}

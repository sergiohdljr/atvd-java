public class Produto {
    public int Codigo;
    public String Nome;
    public Float Valor;
    public Fornecedor fornecedor;
    public Float valorAtualizado;

    public Produto(int codigoProduto, String nomeProduto, Float valorProduto, Fornecedor fornecedorProduto) {
        Codigo = codigoProduto;
        Nome = nomeProduto;
        Valor = valorProduto;
        fornecedor = fornecedorProduto;
    }

    public float AtualizarPreco(float valorAtualizado) {
        valorAtualizado = Valor * valorAtualizado / 100;
        return Valor + valorAtualizado;
    }
}

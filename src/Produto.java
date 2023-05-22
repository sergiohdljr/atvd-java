public class Produto {
    public int Codigo;
    public String Nome;
    public Float Valor;
    public Fornecedor fornecedor;
    public Float valorAtualizado;

    public Produto(int Codigo, String Nome, Float Valor, Fornecedor fornecedor) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Valor = Valor;
        this.fornecedor = fornecedor;
    }

    public float AtualizarPreco(float valorAtualizado) {
        valorAtualizado = Valor * valorAtualizado / 100;
        return Valor + valorAtualizado;
    }
}

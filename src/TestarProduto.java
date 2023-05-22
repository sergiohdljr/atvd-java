public class TestarProduto {
    public static void main(String[] args) {

        Fornecedor fornecedor1 = new Fornecedor("Sergio Henrique", "10.897.710/9999-919", "708.854.197-70");
        Fornecedor fornecedor2 = new Fornecedor("Kaio Lucas", "10.897.123/0000-989", "789.000.207-90");

        Produto bola = new Produto(87, "Brazuca", 80.0f, fornecedor1);
        Produto chuteira = new Produto(54, "Nike Mercurial", 125.00f, fornecedor1);
        Produto camisaTime = new Produto(25, "Camisa Real Madrid 2014", 250.00f, fornecedor2);

        System.out.println();
    }
}

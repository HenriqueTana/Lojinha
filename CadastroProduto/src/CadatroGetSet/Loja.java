package CadatroGetSet;
public class Loja {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        
        p1.cadastrarProduto("Celular", 3000.00, 2);
        p2.cadastrarProduto("PCGamer", 7500.00, 3);
        p1.exibirProduto();
        p2.exibirProduto();
    }  
}

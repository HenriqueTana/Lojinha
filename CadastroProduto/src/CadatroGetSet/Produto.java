package CadatroGetSet;
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if (preco>0){
        this.preco = preco;
        }else{
            System.out.println("Preco inválido!");
        }
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        if(quantidade>0){
          this.quantidade = quantidade;
        }else{
            System.out.println("quantidade invalida!");
        }
    }
    
    public void cadastrarProduto(String nome,double preco,int quantidade){
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }
    public void exibirProduto(){
        System.out.println("\n Nome: "+getNome());
        System.out.println("Preço: "+getPreco());
        System.out.println("Quantidade: "+getQuantidade());
    }
    public void excluirProduto(){}
    public void atualizarProduto(){}
}

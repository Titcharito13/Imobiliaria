package imobiliaria;

public class Imovel {
    
    public double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    public String local;
    
    public void mostraDados(){
        
        System.out.println("Informações:"
                + "\n\nLocalização: " + this.getLocal()
                + "\nValor Final: R$" + this.preco);
        
    }
    
}


package imobiliaria;

public class Antigo extends Imovel {
    
    private double desconto;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double Desconto(){
    
        this.preco = this.preco - this.desconto;
        return this.preco;
    }
    
    
}

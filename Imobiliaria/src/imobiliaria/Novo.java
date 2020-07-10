package imobiliaria;

public class Novo extends Imovel {
    
    private double acrescimo;

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(double acrescimo) {
        this.acrescimo = acrescimo;
    }
    
    public double acrescimo(){
        
        this.preco = this.preco + this.acrescimo;
        return this.preco;        
    }    
    
    @Override
    public void mostraDados(){
        
        System.out.println("Informações:"
                + "\n\nLocalização: " + this.getLocal()
                + "\nValor Final: R$" + this.preco);
        
    }
    
}

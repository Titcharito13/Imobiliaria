package imobiliaria;

import javax.swing.JOptionPane;

public class Imobiliaria {

    public static void main(String[] args) {
        
        
        Novo casa = new Novo();
        Antigo casaa = new Antigo();                
        casaa.setPreco(900000);
        casaa.setLocal("New York");
        casaa.setDesconto(20000);        
        casa.setPreco(900000);
        casa.setLocal("New York");
        casa.setAcrescimo(15000);
        
        int manga;
        manga = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 Para comprar Imóvel novo\nDigite 2 para comprar Imóvel Velho"));
        
        if (manga == 1) {
            casa.acrescimo();
            casa.mostraDados();
        }else{
            casaa.Desconto();
            casaa.mostraDados();
        }
       
        
    }
    
}


package listafinal;

import java.util.ArrayList;
import java.util.List;

class Dicionario {
    private String portugues;
    private String ingles;
    
    
      public Dicionario (String ingles, String portugues){
        
        this.ingles = ingles; this.portugues = portugues;
    }

    Dicionario(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       public String getUS() {
        return ingles;
    }

    public String getPt() {
        return portugues;
    }   
    
     public void setUS(String ingles) {{this.ingles = ingles;}
        this.ingles = ingles;
    }

    public void setPt(String portugues) {{this.portugues = portugues;}
        this.portugues = portugues;
    }          

    void lerDados(String ddicionariodad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void salvarArquivo(String ddicionariodad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String tamanho() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String traduz(String fire) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean contem(String fire) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
public class AppEx1 {

    public static void main(String[] args) {
        Dicionario Dic;
        Dic = new Dicionario("100"); 
        Dic.lerDados("d://dicionario.dad");
        if (Dic.contem("fire"))
        System.out.println("A traducao de fire é"+ Dic.traduz("fire"));
        System.out.println ("O dicionário possui "+ Dic.tamanho()+" palavras");
        Dic.salvarArquivo("d://dicionario.dad");
        
        
        
        
        
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    



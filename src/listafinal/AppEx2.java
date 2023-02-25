
package listafinal;

import java.util.ArrayList;
import java.util.List;

class Urna {

    String nome;
    String partido;
    String numero;
    int votos=0;


    public Urna (String nome, String partido, String numero, int votos){
        
        this.nome = nome; this.partido = partido; this.numero = numero; this.votos = votos;
        
        
    }

    Urna(int i, String eleição_para_o_DA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Urna(String branquinha, String gato, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Urna(String pele) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos( int votos) {
        this.votos = votos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
    protected void finalize(){
        
    }

}

public class AppEx2 {
    public static void main(String[] args) {
            Urna u1;
            u1 = new Urna(3, "Eleição para o DA");
            Urna u2 = new Urna ("Pele");
            Urna u3 = new Urna ("Maradona"); 
            Urna u4 = new Urna ("Ronaldo");
            List <Urna> urnaelet = new ArrayList(); 
            
            urnaelet.add(u1);
            urnaelet.add(u2);
            urnaelet.add(u3);
            urnaelet.add(u4);
            
            for (int i=0; i<urnaelet.size(); i++)
          System.out.println (urnaelet.get(i).getNome());
    }
    
}

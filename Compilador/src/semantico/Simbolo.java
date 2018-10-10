package semantico;
import parser.*;

public class Simbolo {
	
	private String nome;
	Token token;
	private TipoDado tipo;
	private int referencia;
	
	public Simbolo(String nome, TipoDado tipo) {
		this.nome = nome;
		this.tipo = tipo;	
	}
	
	public String toString() {
	  return "\n" + "Nome:"+this.getNome() + "\t" + "Tipo:" + 
			  this.getTipo() + "\t" + "ReferÍncia:"+this.getReferencia();
	  }
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoDado getTipo() {
		return tipo;
	}
	
	public int getReferencia(){
		return referencia;
	}
	
	public void setReferencia(Tabela tab, TipoDado tipo) {
		
		this.referencia = tab.marcador;
		
		if(tipo.equals("numero"))
			tab.marcador+=2;
		else if(tipo.equals("palavra"))
			tab.marcador+=1;
		
	}
	
}

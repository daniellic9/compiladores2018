package comando;

import java.util.LinkedList;

import geradorCodigo.Expressao;
import parser.Token;
import semantico.Simbolo;

public class ComandoEntrada extends ComandoAltoNivel{
	LinkedList<Simbolo> variaveis;
	public ComandoEntrada(Token token, LinkedList<Simbolo> variaveis){
		super(token);
		this.variaveis = variaveis;
	}


	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		//implementar na segunda passagem
		return null;
	}


	public String toString() {
		
		return null;
	}

}

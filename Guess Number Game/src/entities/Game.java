package entities;

public class Game {
	
	private int numEscolhido;
	private int numDicaMenor = 0;
	private int numDicaMaior = 100;
	private int numRandom;
	
	public Game() {
		
	}
	public int getNumEscolhido() {
		return numEscolhido;
	}
	public void setNumEscolhido(int numEscolhido) {
		this.numEscolhido = numEscolhido;
	}
	public int getNumDicaMenor() {
		return numDicaMenor;
	}
	public void setNumDicaMenor(int numDicaMenor) {
		this.numDicaMenor = numDicaMenor;
	}
	public int getNumDicaMaior() {
		return numDicaMaior;
	}
	public void setNumDicaMaior(int numDicaMaior) {
		this.numDicaMaior = numDicaMaior;
	}
	public int getNumRandom() {
		return numRandom;
	}
	public void setNumRandom(int numRandom) {
		this.numRandom = numRandom;
	}
	
	
}

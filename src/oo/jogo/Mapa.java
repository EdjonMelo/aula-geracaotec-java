package oo.jogo;

/*
 * O Mapa possui 2 atributos:
 * - Dimensão é uma matriz de tamanho definido durante a construção da 
 *  classe
 * - Obstáculos, são array contendo, ? posições [x,y] definidas pelo 
 *   construtor, tendo como limite as dimensões do mapa.
 * 
 * Os obstáculos devem ser gerados assim que o mapa for construído. 
 * Não podendo haver um obstáculo do lado do outro.
 * 
 */
public class Mapa {
	private int[][] dimensao;
	private int[][] obstaculos;
	
	public Mapa(int largura, int altura, int numObstaculos) {
		this.dimensao = new int[largura][altura];
		gerarObstaculos(numObstaculos);
	}
	
	private void gerarObstaculos(int numObstaculos) {
		this.obstaculos = new int[numObstaculos][2];
		// .... gerar
	}
}

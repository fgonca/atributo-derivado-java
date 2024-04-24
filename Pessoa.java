/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Atributo Derivado
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.atributoderivado;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa 
{
	private String nome;
	private	LocalDate dataNasc;
	private int idade; // atributo derivado

	// método construtor
	public Pessoa(String nome, LocalDate dataNasc) 
	{
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.calcularIdade();
	}	
	
	public String getNome() {
		return nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public int getIdade() {
		return idade;
	}

	// declaração do método privado que acha o valor do atributo derivado idade
	private void calcularIdade() 
	{

		// 1- determina a data actual
		LocalDate dataAtual= LocalDate.now(); 

		// 2- determina a período entre as datas
		Period periodo = Period.between(this.dataNasc, dataAtual);

		// 3- obtem a idade da pessoa
		this.idade = periodo.getYears();
	}
}

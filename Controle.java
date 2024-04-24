/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Atributo Derivado
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */


package fundamentos.atributoderivado;

import java.time.LocalDate;

public class Controle 
{

	public static void main(String[] args) 
	{		
		
		// 1- definir a data de nascimento
		LocalDate dataNasc = LocalDate.of(2001, 01, 01);
		
		// 2- criar uma pessoa
		Pessoa pessoa = new Pessoa("Bela", dataNasc);
		
		// 3- obter o nome da pessoa
		String nomeS = pessoa.getNome();
		
		// 4- obter a data de nascimento da pessoa
		LocalDate dataNascS = pessoa.getDataNasc();
		
		// 5- obter a data de nascimento da pessoa
		int idadeS = pessoa.getIdade();
	
		// 6- apresentar os dados da pessoa
		System.out.printf("%s nasceu em %s; %d anos de idade.", nomeS, dataNascS, idadeS);
	}
}
package view;

import model.Pessoa;

public class Execucao {

	public static void main(String[] args) {
		Pessoa ps = new Pessoa();
		ps.setNome("Gustavo de Souza Veiga Alves");
		ps.setEnd("Rua Palmeira das Bermudas, 849");
		ps.setBairro("Jardim dos Ip�s");
		ps.setCep("08161-160");
		ps.setCid("S�o Paulo");
		ps.setEst("S�o Paulo");
		
		System.out.println(ps.getNome());
		System.out.println(ps.getEnd() );
		System.out.println(ps.getBairro());
		System.out.println(ps.getCep());
		System.out.println(ps.getCid());
		System.out.println(ps.getEst());
		
	}

}

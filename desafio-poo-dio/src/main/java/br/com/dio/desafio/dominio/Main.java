package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("curso java 1");
		curso1.setDescricao("descricao curso java 1");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descricao curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("descricao mentoria java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		// POLIMORFISMO
		Conteudo conteudo = new Curso();
		System.out.println(conteudo);
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("bootcamp java");
		bootcamp.setDescricao("descricao bootcamp java");
		
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devVictor = new Dev();
		devVictor.setNome("Victor");
		devVictor.inscreverBootcamp(bootcamp);
		
		
		System.out.println(devVictor.getConteudosInscritos());
	}

}

package copa_mundo_with_framework.copa_mundo_with_framework;

import java.util.List;

import org.junit.Test;

import dao.GenericDao;
import model.CopaMundo;
import model.Jogador;
import model.Selecao;

public class TesteJogador {
	
	@Test
	public void testSalvarJogador() {
		GenericDao dao = new GenericDao();
		
		Jogador jogador = new Jogador();
		jogador.setNome("Neymar");
		jogador.setDescricao("Atacnte do PSG");
		
		Selecao selecao = new Selecao();
		selecao = (Selecao) dao.pesquisar(3L, selecao);
		
		jogador.setSelecao(selecao);
		
		dao.salvar(jogador);
	}
	
	@Test
	public void testUpdateMergeJogador() {
		GenericDao dao = new GenericDao();
		
		Jogador jogador = new Jogador();
		jogador = (Jogador) dao.pesquisar(9L, jogador);
		
		jogador.setDescricao("Atacante");
		
		dao.updateMerge(jogador);
		
	}
	
	@Test
	public void testDeleteJogador() {
		GenericDao dao = new GenericDao();
		
		Jogador jogador = new Jogador();
		jogador = (Jogador) dao.pesquisar(9L, jogador);
		
		dao.deletarPorId(jogador);
		
	}
	
	@Test
	public void testListarJogador() {
		GenericDao dao = new GenericDao();
		
		List<Jogador> jogadores = dao.listar(Jogador.class);
		
		for(Jogador jogador : jogadores) {
			System.out.println(jogador.getNome());
			System.out.println("---------------------------");
		}
		
	}
	
	

}

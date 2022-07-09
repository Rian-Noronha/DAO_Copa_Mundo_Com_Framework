package copa_mundo_with_framework.copa_mundo_with_framework;

import java.util.List;

import org.junit.Test;

import dao.GenericDao;
import model.CopaMundo;
import model.Jogador;
import model.Selecao;

public class TesteSelecao {
	
	@Test
	public void testSalvarCopaMundo() {
		GenericDao dao = new GenericDao();
		
		Selecao selecao = new Selecao();
		
		CopaMundo copaMundo = new CopaMundo();
		
		copaMundo = (CopaMundo) dao.pesquisar(1L, copaMundo);
		
		selecao.setDescricao("Seleção Holandesa");
		selecao.setCopaMundo(copaMundo);
		
		dao.salvar(selecao);
		
		
	}
	
	@Test
	public void testUpdateMergeSelecao() {
		GenericDao dao = new GenericDao();
		
		Selecao selecao = new Selecao();
		selecao = (Selecao) dao.pesquisar(5L, selecao);
		
		selecao.setDescricao("Laranja Mecânica");
		
		dao.updateMerge(selecao);
		
	}
	
	@Test
	public void testDeleteSelecao() {
		GenericDao dao = new GenericDao();
		
		Selecao selecao = new Selecao();
		selecao = (Selecao) dao.pesquisar(4L, selecao);
		
		dao.deletarPorId(selecao);
		
	}
	
	
	@Test
	public void testListarSelecao() {
		GenericDao dao = new GenericDao();
		
		List<Selecao> selecoes = dao.listar(Selecao.class);
		
		for(Selecao selecao : selecoes) {
			System.out.println(selecao.getDescricao());
			System.out.println("---------------------------");
		}
		
	}
	
	
	@Test
	public void testaListarJogadoresSelecao() {
		GenericDao dao = new GenericDao();
		
		Selecao selecao = new Selecao();
		selecao = (Selecao) dao.pesquisar(3L, selecao);
		
		for(Jogador jogador : selecao.getJogadores()) {
			System.out.println(jogador.getNome());
			System.out.println(jogador.getDescricao());
			System.out.println("------------------------------");
		}
		
	}

}

package copa_mundo_with_framework.copa_mundo_with_framework;

import java.util.List;

import org.junit.Test;

import dao.GenericDao;
import model.CopaMundo;
import model.Selecao;

public class TesteCopaMundo {
	
	@Test
	public void testSalvarCopaMundo() {
		GenericDao<CopaMundo> dao = new GenericDao();
		
		CopaMundo copaMundo = new CopaMundo();
		copaMundo.setLugar("Brasil");
		copaMundo.setDataInicio("20221119");
		copaMundo.setDataFim("20221223");
		
		dao.salvar(copaMundo);
	}
	
	@Test
	public void testUpdateMerge() {
		GenericDao<CopaMundo> dao = new GenericDao();
		
		CopaMundo copaMundo = new CopaMundo();
		
		copaMundo = dao.pesquisar(2L, copaMundo);
		
		copaMundo.setLugar("Será sediada no Qatar");
		dao.updateMerge(copaMundo);
	}
	
	@Test
	public void testPesquisarCopaMundo() {
		GenericDao<CopaMundo> dao = new GenericDao();
		
		CopaMundo copaMundo = new CopaMundo();
		copaMundo = dao.pesquisar(1L, copaMundo);
		
		System.out.println(copaMundo);
	}
	
	@Test
	public void testListarCopaMundo() {
		GenericDao<CopaMundo> dao = new GenericDao();
		
		List<CopaMundo> copasMundo = dao.listar(CopaMundo.class);
		
		for(CopaMundo copa : copasMundo) {
			System.out.println(copa);
		}
	}
	
	@Test
	public void testDeleteCopaMundo() {
		GenericDao<CopaMundo> dao = new GenericDao();
		
		CopaMundo copaMundo = new CopaMundo();
		copaMundo.setId(6L);
		
		dao.deletarPorId(copaMundo);
	}
	
	@Test
	public void testListarSelecoesCopaMundo() {
		GenericDao dao = new GenericDao();
		
		CopaMundo copaMundo = new CopaMundo();
		copaMundo = (CopaMundo) dao.pesquisar(1L, copaMundo);
		
		for(Selecao selecao : copaMundo.getSelecoes()) {
			System.out.println(selecao.getDescricao());
			System.out.println("--------------------------");
		}
		
	}
	
	
	
	
	
	

}

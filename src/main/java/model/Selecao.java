package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Selecao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String descricao;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private CopaMundo copaMundo;
	
	@OneToMany(mappedBy = "selecao", fetch = FetchType.EAGER)
	private List<Jogador> jogadores;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CopaMundo getCopaMundo() {
		return copaMundo;
	}

	public void setCopaMundo(CopaMundo copaMundo) {
		this.copaMundo = copaMundo;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	@Override
	public String toString() {
		return "Selecao [id=" + id + ", descricao=" + descricao + ", copaMundo=" + copaMundo + ", jogadores="
				+ jogadores + "]";
	}

	

	
	
	
	

	
		
	

	
	
	
	
	
	

}

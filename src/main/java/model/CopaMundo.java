package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CopaMundo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String dataInicio;
	private String dataFim;
	private String lugar;
	
	@OneToMany(mappedBy = "copaMundo", fetch = FetchType.EAGER)
	private List<Selecao> selecoes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public List<Selecao> getSelecoes() {
		return selecoes;
	}
	public void setSelecoes(List<Selecao> selecoes) {
		this.selecoes = selecoes;
	}
	
	@Override
	public String toString() {
		return "CopaMundo [id=" + id + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", lugar=" + lugar
				+ ", selecoes=" + selecoes + "]";
	}
	
	
	
	

}

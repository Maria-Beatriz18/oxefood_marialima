package br.com.ifpe.oxefood_marialima.util.entity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@MappedSuperclass
public class EntidadeAuditavel extends EntitadeNegocio{
	
	private static final long serialVersionUID = -3823427575286415422L;
	
	private  Long versao;
	private  LocalDate dataCriacao;
	private  LocalDate dataUltimaModificao;
	private  Long criadorPor; // id do usuario que criou 
	private  Long ultimaModificaoPor;
	

}

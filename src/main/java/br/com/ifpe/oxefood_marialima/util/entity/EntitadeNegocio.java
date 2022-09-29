package br.com.ifpe.oxefood_marialima.util.entity;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(of = {"id"})
@MappedSuperclass
public class EntitadeNegocio implements Serializable {
	
	
	private static final long serialVersionUID = 6409726181849336071L;
	
	private Long id;
	private Boolean habilitado;

}

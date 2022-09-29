package br.com.ifpe.oxefood_marialima.modelo.produto;

import br.com.ifpe.oxefood_marialima.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaProduto  extends EntidadeAuditavel{

	private static final long serialVersionUID = 9204482604500637508L;
	
	
	private String chaveEmpresa;
	
	private String descricao;

}

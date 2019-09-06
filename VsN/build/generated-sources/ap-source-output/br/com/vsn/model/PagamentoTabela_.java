package br.com.vsn.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PagamentoTabela.class)
public abstract class PagamentoTabela_ {

	public static volatile SingularAttribute<PagamentoTabela, String> formaPagamento;
	public static volatile SingularAttribute<PagamentoTabela, Integer> ordemServico_id;
	public static volatile SingularAttribute<PagamentoTabela, Double> troco;
	public static volatile SingularAttribute<PagamentoTabela, Integer> vezes;
	public static volatile SingularAttribute<PagamentoTabela, Double> valorPago;
	public static volatile SingularAttribute<PagamentoTabela, Integer> id;
	public static volatile SingularAttribute<PagamentoTabela, Pagamento> pagamento;
	public static volatile SingularAttribute<PagamentoTabela, Integer> vezesPagar;

}


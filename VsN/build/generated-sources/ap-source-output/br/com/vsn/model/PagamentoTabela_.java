package br.com.vsn.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PagamentoTabela.class)
public abstract class PagamentoTabela_ {

	public static volatile SingularAttribute<PagamentoTabela, String> parcelas;
	public static volatile SingularAttribute<PagamentoTabela, Integer> ordemServico_id;
	public static volatile SingularAttribute<PagamentoTabela, String> finalizador;
	public static volatile SingularAttribute<PagamentoTabela, Double> valor;
	public static volatile SingularAttribute<PagamentoTabela, Integer> id;

}


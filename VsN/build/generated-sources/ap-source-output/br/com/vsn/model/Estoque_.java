package br.com.vsn.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Estoque.class)
public abstract class Estoque_ {

	public static volatile SingularAttribute<Estoque, Double> valor;
	public static volatile SingularAttribute<Estoque, Integer> id;
	public static volatile SingularAttribute<Estoque, Fornecedor> fornecedor;
	public static volatile SingularAttribute<Estoque, String> tipoMedida;
	public static volatile SingularAttribute<Estoque, String> caminhoImg;
	public static volatile SingularAttribute<Estoque, Integer> quantidade;
	public static volatile SingularAttribute<Estoque, String> descricao;

}


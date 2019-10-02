package br.com.vsn.model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Despesa.class)
public abstract class Despesa_ {

	public static volatile SingularAttribute<Despesa, Integer> ParcelasPagar;
	public static volatile SingularAttribute<Despesa, String> situacao;
	public static volatile SingularAttribute<Despesa, Calendar> dataVencimento;
	public static volatile SingularAttribute<Despesa, Double> valor;
	public static volatile SingularAttribute<Despesa, Usuario> usuario;
	public static volatile SingularAttribute<Despesa, Integer> id;
	public static volatile SingularAttribute<Despesa, Double> valorPagar;
	public static volatile SingularAttribute<Despesa, Calendar> dataInicio;
	public static volatile SingularAttribute<Despesa, Integer> Parcelas;
	public static volatile SingularAttribute<Despesa, String> descricao;

}


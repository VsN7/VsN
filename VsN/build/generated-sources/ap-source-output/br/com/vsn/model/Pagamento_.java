package br.com.vsn.model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pagamento.class)
public abstract class Pagamento_ {

	public static volatile SingularAttribute<Pagamento, Integer> ordemServico_id;
	public static volatile SingularAttribute<Pagamento, String> situacao;
	public static volatile SingularAttribute<Pagamento, Double> valor;
	public static volatile SingularAttribute<Pagamento, Usuario> usuario;
	public static volatile SingularAttribute<Pagamento, Integer> id;
	public static volatile SingularAttribute<Pagamento, Calendar> dataFinalizacao;

}


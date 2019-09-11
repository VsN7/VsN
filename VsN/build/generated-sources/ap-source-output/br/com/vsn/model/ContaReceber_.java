package br.com.vsn.model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ContaReceber.class)
public abstract class ContaReceber_ {

	public static volatile SingularAttribute<ContaReceber, String> ParcelasPagar;
	public static volatile SingularAttribute<ContaReceber, String> situacao;
	public static volatile SingularAttribute<ContaReceber, Double> valor;
	public static volatile SingularAttribute<ContaReceber, Integer> pagamento_id;
	public static volatile SingularAttribute<ContaReceber, Calendar> dataVencimento;
	public static volatile SingularAttribute<ContaReceber, String> cpf;
	public static volatile SingularAttribute<ContaReceber, Usuario> usuario;
	public static volatile SingularAttribute<ContaReceber, Integer> id;
	public static volatile SingularAttribute<ContaReceber, Double> valorPagar;
	public static volatile SingularAttribute<ContaReceber, Calendar> dataInicio;
	public static volatile SingularAttribute<ContaReceber, String> Parcelas;
	public static volatile SingularAttribute<ContaReceber, String> Cliente;
	public static volatile SingularAttribute<ContaReceber, String> TipoPagamento;

}


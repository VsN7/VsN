package br.com.vsn.model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrdemServico.class)
public abstract class OrdemServico_ {

	public static volatile SingularAttribute<OrdemServico, String> veiculo;
	public static volatile SingularAttribute<OrdemServico, Calendar> previsaoEntrega;
	public static volatile SingularAttribute<OrdemServico, String> situacao;
	public static volatile SingularAttribute<OrdemServico, Double> valor;
	public static volatile SingularAttribute<OrdemServico, String> modelo;
	public static volatile SingularAttribute<OrdemServico, Calendar> dataFinalizacao;
	public static volatile SingularAttribute<OrdemServico, String> cliente;
	public static volatile SingularAttribute<OrdemServico, String> observacoes;
	public static volatile SingularAttribute<OrdemServico, String> atendente;
	public static volatile SingularAttribute<OrdemServico, String> cpf;
	public static volatile SingularAttribute<OrdemServico, Usuario> usuario;
	public static volatile SingularAttribute<OrdemServico, Integer> id;
	public static volatile SingularAttribute<OrdemServico, Calendar> dataInicio;
	public static volatile SingularAttribute<OrdemServico, String> servico;
	public static volatile SingularAttribute<OrdemServico, Integer> orcamento_id;
	public static volatile SingularAttribute<OrdemServico, String> placa;

}


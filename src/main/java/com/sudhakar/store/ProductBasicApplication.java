package com.sudhakar.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductBasicApplication {

/*@Autowired
private Environment environment;*/
	
	public static void main(String[] args) {
		SpringApplication.run(ProductBasicApplication.class, args);
	}
	

/*	@Bean
	public CassandraClusterFactoryBean cluster() {
		CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
		cluster.setContactPoints(environment.getProperty("cassandra.contactpoints"));
		cluster.setPort(Integer.parseInt(environment.getProperty("cassandra.port")));
		cluster.setAuthProvider(authProvider());
		return cluster;
	}

	@Override
	protected String getKeyspaceName() {
		return environment.getProperty("cassandra.keyspace-name");
	}

	@Bean
	public CassandraMappingContext cassandraMapping() throws ClassNotFoundException {
		return new BasicCassandraMappingContext();
	}


	@Override
	public SchemaAction getSchemaAction() {
		return SchemaAction.NONE;
	}

	//username/password
	@Bean
	public PlainTextAuthProvider authProvider()

	{

	return new PlainTextAuthProvider("cassandra","cassandra");

}	*/
}

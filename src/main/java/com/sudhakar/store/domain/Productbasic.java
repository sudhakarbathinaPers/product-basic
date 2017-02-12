package com.sudhakar.store.domain;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;


@Table
public class Productbasic {

    @PrimaryKeyColumn(name = "product_id", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private String product_id;

    @Column
    private String name;

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

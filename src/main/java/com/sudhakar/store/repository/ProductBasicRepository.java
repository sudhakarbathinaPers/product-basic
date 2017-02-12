package com.sudhakar.store.repository;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.sudhakar.store.domain.Productbasic;

public interface ProductBasicRepository extends CassandraRepository<Productbasic>{
}

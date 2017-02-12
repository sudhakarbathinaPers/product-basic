package com.sudhakar.store.services;
import static org.springframework.data.cassandra.repository.support.BasicMapId.id;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.repository.MapId;
import org.springframework.stereotype.Service;

import com.sudhakar.store.domain.Productbasic;
import com.sudhakar.store.repository.ProductBasicRepository;


@Service
public class ProductBasicService {
	
	    @Autowired
	    private ProductBasicRepository productBasicRepository;

/*	    public Product_basic createProductBasic(Product_basic productbasic){
	        return productBasicRepository.save(productbasic);
	    }

	    public Product_basic findProductById(String product_id){
	        MapId id = id("product_id", product_id);
	        return productBasicRepository.findOne(id);
	    }*/

	    public List<Productbasic> getProductsbasic(){
	        return (List<Productbasic>) productBasicRepository.findAll();
	    }

/*	    public Product_basic editProduct_basic(Product_basic productbasic){
	        return productBasicRepository.save(productbasic);
	    }

	    public void deleteProduct_basic(String product_id){
	        MapId id = id("product_id", product_id);
	        productBasicRepository.delete(id);
	    }

	    public boolean exitsProduct_basic(String product_id){
	        MapId id = id("product_id", product_id);
	        return productBasicRepository.exists(id);
	    }*/


}

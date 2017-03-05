package com.sudhakar.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sudhakar.store.domain.Productbasic;
import com.sudhakar.store.services.ProductBasicService;

@Controller
@RequestMapping("/item/basic/v1")
public class ProductController {

    @Autowired
    private ProductBasicService service;

    @RequestMapping( method = RequestMethod.GET, produces = "application/json" )
    public ResponseEntity<List<Productbasic>> getProducts(){
        return new ResponseEntity<List<Productbasic>>(service.getProductsbasic(), HttpStatus.OK);
    }
    
    @RequestMapping( path = "/{id}", method = RequestMethod.GET, produces = "application/json" )
    public ResponseEntity<Productbasic> getProductBasicById(@PathVariable String id){
        if(!service.exitsProductBasic(id)){
            return new ResponseEntity<Productbasic>(HttpStatus.NOT_FOUND);
        }
        Productbasic productBasic = service.findProductById(id);
        return new ResponseEntity<Productbasic>(productBasic,HttpStatus.ACCEPTED);
    }

}


package com.syncoder.catalogue.repository;

import com.syncoder.catalogue.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

//    @Query(value = "select p from Product p where p.title ilike :filter")  --jpql
//    @Query(value = "select * from catalogue.t_product where c_title ilike :filter", nativeQuery = true)
    @Query(name = "Product.findAllByTitleLikeIgnoreCaseNative", nativeQuery = true)
    List<Product> findAllByTitleLikeIgnoreCase(@Param("filter") String filter);



}

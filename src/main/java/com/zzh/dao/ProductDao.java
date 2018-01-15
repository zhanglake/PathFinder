package com.zzh.dao;

import com.zzh.entity.Product;
import com.zzh.entity.dto.SelectPageDto;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
@Repository
public interface ProductDao {

    Integer findCount();

    List<Product> findList(SelectPageDto dto);

    Product findOne(Long id);

    void insertOne(Product product);

    void updateOne(Product product);

    void insertProductPicture(List list);

    void deleteProductPicture(Long productId);

    void deleteOne(Long productId);

}

package com.zzh.service;

import com.zzh.dao.ProductDao;
import com.zzh.dao.TypeDao;
import com.zzh.entity.Page;
import com.zzh.entity.Product;
import com.zzh.entity.Type;
import com.zzh.entity.dto.ProductListByTypeDto;
import com.zzh.entity.dto.ProductPictureDto;
import com.zzh.entity.dto.ProductSaveDto;
import com.zzh.entity.dto.SelectPageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private TypeDao typeDao;

    @Override
    public Page<Product> findList(Page page, Object param) {
        SelectPageDto pageDto = new SelectPageDto(page.getPageSize(), page.getPageNo() - 1, param);
        Integer count = productDao.findCount();
        List<Product> products = productDao.findList(pageDto);
        page.setResults(products);
        page.setTotalRecord(count);
        return page;
    }

    @Override
    public Product findOne(Long id) {
        Product product = productDao.findOne(id);
        return product;
    }

    @Override
    public void insertOrUpdateOne(ProductSaveDto dto) {
        System.out.println("name:" + dto.getProductName());
        // 保存产品信息
        Product product = new Product();
        product.setProductName(dto.getProductName());
        product.setPrice(dto.getPrice());
        product.setDiscount(dto.getDiscount());
        product.setSalePrice(dto.getSalePrice());
        product.setStock(dto.getStock());
        product.setAvailable(dto.getAvailable());
        product.setDescription(dto.getDescription());
        product.setTypeId(dto.getTypeId());
        if (null != dto.getProductId()) {
            // 更新
            product.setProductId(dto.getProductId());
            product.setModifiedDate(new Date());
            productDao.updateOne(product);
            // 删除之前的产品 - 图片信息
            productDao.deleteProductPicture(product.getProductId());
        } else {
            // 添加
            productDao.insertOne(product);
        }
        // 保存产品 - 图片信息
        List<ProductPictureDto> dtos = new ArrayList<ProductPictureDto>();
        for (Long picId : dto.getPictureIds()) {
            ProductPictureDto productPictureDto = new ProductPictureDto(product.getProductId(), picId);
            dtos.add(productPictureDto);
        }
        if (dtos.size() > 0) {
            productDao.insertProductPicture(dtos);
        }
    }

    @Override
    public void deleteOne(Long id) {
        productDao.deleteOne(id);
    }

    @Override
    public List<ProductListByTypeDto> findProductsByType() {
        List<Type> types = typeDao.findAll();
        List<ProductListByTypeDto> dtos = new ArrayList<ProductListByTypeDto>();
        for (Type type : types) {
            List<Product> products = productDao.findByTypeId(type.getTypeId());
            ProductListByTypeDto dto = new ProductListByTypeDto(type, products);
            dtos.add(dto);
        }
        return dtos;
    }

    @Override
    public List<Product> findNew5() {
        List<Product> products = productDao.findNew5();
        return products;
    }

}

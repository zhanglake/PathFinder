package com.zzh.entity.dto;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
public class ProductPictureDto {
    private Long productId;
    private Long pictureId;

    public ProductPictureDto(Long productId, Long pictureId) {
        this.pictureId = pictureId;
        this.productId = productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public Long getProductId() {

        return productId;
    }

    public Long getPictureId() {
        return pictureId;
    }
}

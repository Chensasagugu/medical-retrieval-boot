package com.chen.medapi.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author aaashuai
 * @since 2023-04-08
 */
@ApiModel(value = "Image对象", description = "")
public class Image implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer imageId;

    @ApiModelProperty("标签")
    private String imageTags;

    @ApiModelProperty("图像描述")
    private String imageDescription;

    @ApiModelProperty("上传者id")
    private Integer uploaderId;

    @ApiModelProperty("上传时间")
    private LocalDateTime uploadTime;

    @ApiModelProperty("图像路径")
    private String imagePath;

    @ApiModelProperty("肺部CT层级")
    private Short imageLevel;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageTags() {
        return imageTags;
    }

    public void setImageTags(String imageTags) {
        this.imageTags = imageTags;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public Integer getUploaderId() {
        return uploaderId;
    }

    public void setUploaderId(Integer uploaderId) {
        this.uploaderId = uploaderId;
    }

    public LocalDateTime getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(LocalDateTime uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Short getImageLevel() {
        return imageLevel;
    }

    public void setImageLevel(Short imageLevel) {
        this.imageLevel = imageLevel;
    }

    @Override
    public String toString() {
        return "Image{" +
        "imageId = " + imageId +
        ", imageTags = " + imageTags +
        ", imageDescription = " + imageDescription +
        ", uploaderId = " + uploaderId +
        ", uploadTime = " + uploadTime +
        ", imagePath = " + imagePath +
        ", imageLevel = " + imageLevel +
        "}";
    }
}

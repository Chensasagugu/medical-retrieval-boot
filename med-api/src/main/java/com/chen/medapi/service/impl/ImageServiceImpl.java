package com.chen.medapi.service.impl;

import com.chen.medapi.entity.Image;
import com.chen.medapi.mapper.ImageMapper;
import com.chen.medapi.service.IImageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author aaashuai
 * @since 2023-04-08
 */
@Primary
@Service
public class ImageServiceImpl extends ServiceImpl<ImageMapper, Image> implements IImageService {

}

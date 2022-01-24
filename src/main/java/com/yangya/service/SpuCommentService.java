package com.yangya.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangya.common.utils.PageUtils;
import com.yangya.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author firenay
 * @email 1046762075@qq.com
 * @date 2020-05-31 17:06:04
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


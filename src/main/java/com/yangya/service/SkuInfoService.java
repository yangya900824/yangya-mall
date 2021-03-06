package com.yangya.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangya.common.utils.PageUtils;
import com.yangya.entity.SkuInfoEntity;
import com.yangya.vo.SkuItemVo;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * sku信息
 *
 * @author firenay
 * @email 1046762075@qq.com
 * @date 2020-05-31 17:06:04
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

	void saveSkuInfo(SkuInfoEntity skuInfoEntity);

	PageUtils queryPageByCondition(Map<String, Object> params);

	List<SkuInfoEntity> getSkusBySpuId(Long spuId);

	SkuItemVo item(Long skuId) throws ExecutionException, InterruptedException;
}


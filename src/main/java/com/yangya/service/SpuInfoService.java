package com.yangya.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangya.common.utils.PageUtils;
import com.yangya.entity.SpuInfoEntity;
import com.yangya.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author firenay
 * @email 1046762075@qq.com
 * @date 2020-05-31 17:06:04
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

	void saveSpuInfo(SpuSaveVo saveVo);

	void saveBatchSpuInfo(SpuInfoEntity spuInfoEntity);

	/**
	 * SPU模糊查询
	 */
	PageUtils queryPageByCondition(Map<String, Object> params);

	void up(Long spuId);

	/**
	 * 返回一个SpuEntity
	 */
	SpuInfoEntity getSpuInfoBySkuId(Long skuId);
}


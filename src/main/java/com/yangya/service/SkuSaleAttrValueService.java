package com.yangya.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangya.common.utils.PageUtils;
import com.yangya.entity.SkuSaleAttrValueEntity;
import com.yangya.vo.ItemSaleAttrVo;

import java.util.List;
import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author firenay
 * @email 1046762075@qq.com
 * @date 2020-05-31 17:06:04
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

	List<ItemSaleAttrVo> getSaleAttrsBuSpuId(Long spuId);

	List<String> getSkuSaleAttrValuesAsStringList(Long skuId);
}


package com.yangya.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yangya.entity.SkuSaleAttrValueEntity;
import com.yangya.vo.ItemSaleAttrVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * sku销售属性&值
 *
 * @author firenay
 * @email 1046762075@qq.com
 * @date 2020-05-31 17:06:04
 */
@Mapper
public interface SkuSaleAttrValueDao extends BaseMapper<SkuSaleAttrValueEntity> {

	List<ItemSaleAttrVo> getSaleAttrsBuSpuId(@Param("spuId") Long spuId);

	List<String> getSkuSaleAttrValuesAsStringList(@Param("skuId") Long skuId);
}

package com.yangya.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangya.common.utils.PageUtils;
import com.yangya.entity.AttrEntity;
import com.yangya.vo.AttrGroupRelationVo;
import com.yangya.vo.AttrRespVo;
import com.yangya.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author firenay
 * @email 1046762075@qq.com
 * @date 2020-05-31 17:06:04
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

	void saveAttr(AttrVo attrVo);

	/**
	 * 规格参数的分页模糊查询
	 */
	PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String attrType);

	/**
	 *
	 */
	AttrRespVo getAttrInfo(Long attrId);

	/**
	 * 更改规格参数：参数名、参数id、参数、状态的一一对应
	 */
	void updateAttr(AttrVo attrVo);

	List<AttrEntity> getRelationAttr(Long attrgroupId);

	void deleteRelation(AttrGroupRelationVo[] vos);

	PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);

	/**
	 * 在指定的集合里面挑出可检索的属性
	 */
	List<Long> selectSearchAttrIds(List<Long> attrIds);
}


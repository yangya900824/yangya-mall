package com.yangya.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yangya.entity.AttrAttrgroupRelationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性&属性分组关联
 *
 * @author firenay
 * @email 1046762075@qq.com
 * @date 2020-05-31 17:06:04
 */
@Mapper
public interface AttrAttrgroupRelationDao extends BaseMapper<AttrAttrgroupRelationEntity> {

	void deleteBatchRelation(@Param("entities") List<AttrAttrgroupRelationEntity> entities);
}

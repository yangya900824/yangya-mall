package com.yangya.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yangya.entity.GrowthChangeHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 *
 * @author firenay
 * @email 1046762075@qq.com
 * @date 2020-05-30 00:49:16
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {

}

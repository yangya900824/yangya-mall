package com.yangya.service.member;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangya.common.utils.PageUtils;
import com.yangya.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author firenay
 * @email 1046762075@qq.com
 * @date 2020-05-30 00:49:16
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


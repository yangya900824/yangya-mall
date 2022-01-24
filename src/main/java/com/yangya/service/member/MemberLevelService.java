package com.yangya.service.member;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangya.common.utils.PageUtils;
import com.yangya.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author firenay
 * @email 1046762075@qq.com
 * @date 2020-05-30 00:49:16
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


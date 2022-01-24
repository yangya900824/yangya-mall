package com.yangya.service.member;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangya.common.utils.PageUtils;
import com.yangya.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author firenay
 * @email 1046762075@qq.com
 * @date 2020-05-30 00:49:16
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.yangya.service.member.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yangya.common.utils.PageUtils;
import com.yangya.common.utils.Query;
import com.yangya.dao.MemberReceiveAddressDao;
import com.yangya.entity.MemberReceiveAddressEntity;
import com.yangya.service.member.MemberReceiveAddressService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("memberReceiveAddressService")
public class MemberReceiveAddressServiceImpl extends ServiceImpl<MemberReceiveAddressDao, MemberReceiveAddressEntity> implements MemberReceiveAddressService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberReceiveAddressEntity> page = this.page(
                new Query<MemberReceiveAddressEntity>().getPage(params),
                new QueryWrapper<MemberReceiveAddressEntity>()
        );

        return new PageUtils(page);
    }

	@Override
	public List<MemberReceiveAddressEntity> getAddress(Long memberId) {

		List<MemberReceiveAddressEntity> member_id = this.list(new QueryWrapper<MemberReceiveAddressEntity>().eq("member_id", memberId));
		return member_id;
	}
}

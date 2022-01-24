package com.yangya.service.member;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangya.common.exception.PhoneExistException;
import com.yangya.common.exception.UserNameExistException;
import com.yangya.common.utils.PageUtils;
import com.yangya.entity.MemberEntity;
import com.yangya.common.vo.MemberLoginVo;
import com.yangya.common.vo.SocialUser;
import com.yangya.common.vo.UserRegisterVo;

import java.util.Map;

/**
 * 会员
 *
 * @author firenay
 * @email 1046762075@qq.com
 * @date 2020-05-30 00:49:16
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

	void register(UserRegisterVo userRegisterVo) throws PhoneExistException, UserNameExistException;

	void checkPhone(String phone) throws PhoneExistException;

	void checkUserName(String username) throws UserNameExistException;

	/**
	 * 普通登录
	 */
	MemberEntity login(MemberLoginVo vo);

	/**
	 * 社交登录
	 */
	MemberEntity login(SocialUser socialUser);
}


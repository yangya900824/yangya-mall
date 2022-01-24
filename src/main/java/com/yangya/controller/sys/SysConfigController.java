/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.yangya.controller.sys;


import com.yangya.common.utils.PageUtils;
import com.yangya.common.utils.R;
import com.yangya.entity.SysConfigEntity;
import com.yangya.service.SysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 系统配置信息
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("/sys/config")
public class SysConfigController extends AbstractController {
	@Autowired
	private SysConfigService sysConfigService;

	/**
	 * 所有配置列表
	 */
	@GetMapping("/list")
	public R list(@RequestParam Map<String, Object> params){
		PageUtils page = sysConfigService.queryPage(params);

		return R.ok().put("page", page);
	}


	/**
	 * 配置信息
	 */
	@GetMapping("/info/{id}")
	public R info(@PathVariable("id") Long id){
		SysConfigEntity config = sysConfigService.getById(id);

		return R.ok().put("config", config);
	}

	/**
	 * 保存配置
	 */
	@PostMapping("/save")
	public R save(@RequestBody SysConfigEntity config){

		sysConfigService.saveConfig(config);

		return R.ok();
	}

	/**
	 * 修改配置
	 */
	@PostMapping("/update")
	public R update(@RequestBody SysConfigEntity config){

		sysConfigService.update(config);

		return R.ok();
	}

	/**
	 * 删除配置
	 */
	@PostMapping("/delete")
	public R delete(@RequestBody Long[] ids){
		sysConfigService.deleteBatch(ids);

		return R.ok();
	}

}

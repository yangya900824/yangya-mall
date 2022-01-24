package com.yangya.controller.product;

import com.yangya.common.utils.PageUtils;
import com.yangya.common.utils.R;
import com.yangya.entity.SpuInfoEntity;
import com.yangya.service.SpuInfoService;
import com.yangya.vo.SpuSaveVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * spu信息
 *
 * @author firenay
 * @email 1046762075@qq.com
 * @date 2020-05-31 17:06:04
 */
@RestController
@RequestMapping("product/spuinfo")
public class SpuInfoController {

    @Autowired
    private SpuInfoService spuInfoService;

    @GetMapping("/skuId/{id}")
    public R getSkuInfoBySkuId(@PathVariable("id") Long skuId){

    	SpuInfoEntity entity = spuInfoService.getSpuInfoBySkuId(skuId);
    	return R.ok().setData(entity);
	}

	/**
	 * 商品上架
	 */
	@PostMapping("/{spuId}/up")
	public R up(@PathVariable("spuId") Long spuId){
		spuInfoService.up(spuId);
		return R.ok();
	}
    /**
     * spu管理的查询
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = spuInfoService.queryPageByCondition(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SpuInfoEntity spuInfo = spuInfoService.getById(id);

        return R.ok().put("spuInfo", spuInfo);
    }

    /**
     * 大保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SpuSaveVo vo){
		spuInfoService.saveSpuInfo(vo);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SpuInfoEntity spuInfo){
		spuInfoService.updateById(spuInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("${moduleNamez}:spuinfo:delete")
    public R delete(@RequestBody Long[] ids){
		spuInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

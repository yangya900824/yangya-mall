package com.yangya.controller.product;

import com.yangya.common.utils.PageUtils;
import com.yangya.common.utils.R;
import com.yangya.entity.SkuInfoEntity;
import com.yangya.service.SkuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * sku信息
 *
 * @author firenay
 * @email 1046762075@qq.com
 * @date 2020-05-31 17:06:04
 */
@RestController
@RequestMapping("product/skuinfo")
public class SkuInfoController {

    @Autowired
    private SkuInfoService skuInfoService;

    @GetMapping("/{skuId}/price")
    public R getPrice(@PathVariable("skuId") Long skuId){

		SkuInfoEntity byId = skuInfoService.getById(skuId);
		return R.ok().setData(byId.getPrice().toString());
	}

    /**
     * SKU查询
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = skuInfoService.queryPageByCondition(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
	 * 		库存保存的时候会远程调用这个接口
     */
    @RequestMapping("/info/{skuId}")
    public R info(@PathVariable("skuId") Long skuId){
		SkuInfoEntity skuInfo = skuInfoService.getById(skuId);

        return R.ok().put("skuInfo", skuInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SkuInfoEntity skuInfo){
		skuInfoService.save(skuInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SkuInfoEntity skuInfo){
		skuInfoService.updateById(skuInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("${moduleNamez}:skuinfo:delete")
    public R delete(@RequestBody Long[] skuIds){
		skuInfoService.removeByIds(Arrays.asList(skuIds));

        return R.ok();
    }
}

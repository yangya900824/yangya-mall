package com.yangya.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yangya.common.utils.PageUtils;
import com.yangya.common.utils.Query;
import com.yangya.dao.BrandDao;
import com.yangya.entity.BrandEntity;
import com.yangya.service.BrandService;
import com.yangya.service.CategoryBrandRelationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

	@Resource
	private CategoryBrandRelationService categoryBrandRelationService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
		QueryWrapper<BrandEntity> wrapper = new QueryWrapper<>();
		String key = (String) params.get("key");
		if(!StringUtils.isEmpty(key)){
			wrapper.eq("brand_id", key).or().like("name", key);
		}
		IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
				wrapper
        );
        return new PageUtils(page);
    }

	/**
	 * 当品牌进行更新的时候 保证关联表的数据也需要进行更新
	 */
	@Transactional
	@Override
	public void updateDetail(BrandEntity brand) {
		// 保证冗余字段的数据一致
		this.updateById(brand);
		if(!StringUtils.isEmpty(brand.getName())){
			// 同步更新其他关联表的数据
			categoryBrandRelationService.updateBrand(brand.getBrandId(), brand.getName());
			// TODO 更新其它关联

		}
	}

	@Override
	public List<BrandEntity> getBrandByIds(List<Long> brandIds) {
		return baseMapper.selectList(new QueryWrapper<BrandEntity>().in("brand_id",brandIds));
	}
}

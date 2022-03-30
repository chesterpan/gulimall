package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {

		BrandEntity brandEntity = new BrandEntity();

//		插入
//		brandEntity.setDescript("first");
//		brandEntity.setName("plm");
//		brandService.save(brandEntity);
//		System.out.println("save successfully ");

//		修改
//		brandEntity.setBrandId(1L);
//		brandEntity.setDescript("Update");
//		brandService.updateById(brandEntity);

//		查询
		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
		list.forEach((item)->{
				System.out.println(item);}
		);

	}

}

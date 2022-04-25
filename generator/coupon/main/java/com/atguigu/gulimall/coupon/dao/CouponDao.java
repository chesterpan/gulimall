package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chester
 * @email chesterpan2019@gmail.com
 * @date 2022-04-13 17:58:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

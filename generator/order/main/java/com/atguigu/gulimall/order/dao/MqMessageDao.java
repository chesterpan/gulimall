package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author chester
 * @email chesterpan2019@gmail.com
 * @date 2022-04-13 17:25:18
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}

package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chester
 * @email sunlightcs@gmail.com
 * @date 2021-09-11 23:21:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

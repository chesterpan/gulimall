package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chester
 * @email chesterpan2019@gmail.com
 * @date 2022-04-13 17:57:07
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

package com.gmall.user.mapper;

import com.gmall.user.pojo.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
      List<UmsMember> selectAllUser();
}
package com.cc.manager.dao;

import com.cc.manager.domain.SysUser;

public interface UserDao {
	public SysUser findByUserName(String username);
}

package com.ai.osrdc.core.req.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.osrdc.core.req.dao.UserDao;
import com.ai.osrdc.core.req.pojo.po.User;
import com.ai.osrdc.core.req.pojo.vo.UserVO;

@Service
@Transactional
public class UserSVImpl implements UserSV {

	@Autowired
	private UserDao userDao;

	@Override
	public void save(UserVO userVO) {
		User user = new User();
		user.setAge(userVO.getAge());
		user.setName(userVO.getName());
		userDao.save(user);

	}

}

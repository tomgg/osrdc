package com.asiainfo.core.req.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.asiainfo.core.req.pojo.vo.UserVO;
import com.asiainfo.core.req.service.UserSVImpl;

@RestController
@RequestMapping("/user")
public class ReqController {
	
	@Autowired
	private UserSVImpl userSVImpl;
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public UserVO getUser() {
		UserVO user = new UserVO();
		user.setId(222l);
		user.setName("章涛");
		user.setAge(81);
		
		userSVImpl.save(user);
		
		return user;
	}
	
	@RequestMapping(value="/set", method=RequestMethod.POST)
	public UserVO setUser() {
		UserVO user = new UserVO();
		user.setId(1l);
		user.setName("222");
		user.setAge(28);
		return user;
	}

}

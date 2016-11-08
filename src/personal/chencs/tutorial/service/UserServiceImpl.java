package personal.chencs.tutorial.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import personal.chencs.tutorial.dao.UserDao;
import personal.chencs.tutorial.entity.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	@Override
	public User queryByName(String name) {
		return this.userDao.queryByName(name);
	}
}

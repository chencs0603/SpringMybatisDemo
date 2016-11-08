package personal.chencs.tutorial.dao;

import java.util.List;

import personal.chencs.tutorial.entity.User;

public interface UserDao {

	/**
	 * 添加单个User
	 * 
	 * @param user
	 * @return
	 */
	public boolean add(User user);

	/**
	 * 删除单个User
	 * 
	 * @param name
	 */
	public void deleteByName(String name);

	/**
	 * 修改指定name的User的多个属性
	 * 
	 * @param name
	 * @param user
	 */
	public void updateByName(String name, User user);

	/**
	 * 修改指定name的User的password属性
	 * 
	 * @param name
	 * @param password
	 */
	public void updatePasswordByName(String name, String password);

	/**
	 * 查询指定name的User
	 * 
	 * @param name
	 * @return
	 */
	public User queryByName(String name);

	/**
	 * 查询所有User
	 * 
	 * @return
	 */
	public List<User> queryAll();
}

package cn.itcast.dao;

import cn.itcast.vo.User;

public interface UserDao {

	boolean saveUser(User user);

	User findUserByCode(String code);

	void updateUser(User user);

	User login(User user);
	
	//啊啊啊啊所所多所大所大所大所多多

}

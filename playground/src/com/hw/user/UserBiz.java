package com.hw.user;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.frame.Biz;
import com.hw.frame.Dao;
import com.hw.vo.User;
@Service("userBiz")
public class UserBiz implements Biz<User, String> {

	@Resource(name="userDao")
	Dao<User, String> dao;
	
	public UserBiz() {
		dao = new UserDao();
	}
	
	@Transactional	// 이거때문에 롤백 가능
	@Override
	public void register(User t) {	// 두개(주문내역, 배송내역)를 해주는 이유는 하나가 실패하면 하나는 자동으로 rollback 됨
		dao.insert(t);
	}
	@Transactional
	@Override
	public void remove(String s) {
		dao.delete(s);

	}
	@Transactional
	@Override
	public void modify(User t) {
		dao.update(t);
	}

	@Override
	public User get(String s) {
		return dao.select(s);
	}

	@Override
	public List<User> get() {
		return dao.select();
	}

	@Override
	public List<User> getif(User s) {
	
		return dao.selectif(s);
	}

}






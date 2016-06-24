package com.cat.simple.dao.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.cat.simple.dao.UserDao;
import com.cat.simple.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Resource
	private SqlSessionFactory sqlSessionFactory;

	@Override
	public int save(User entity) {

		SqlSession session = sqlSessionFactory.openSession();
		// System.out.println(packageName);
		// private String packageName =
		// this.getClass().getInterfaces()[0].getName();
		// int result = session.insert(packageName + ".save", entity);

		UserDao userDao = session.getMapper(UserDao.class);
		int result = userDao.save(entity);
		return result;
	}

	@Override
	public int saves(Collection<User> entities) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByEntity(User entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByIds(int[] ids) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByEntitys(Collection<User> entities) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updates(Collection<User> entities) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<User> findInterval(int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> findList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

}

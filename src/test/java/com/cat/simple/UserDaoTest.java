package com.cat.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cat.simple.dao.UserDao;
import com.cat.simple.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class UserDaoTest {

	@Resource
	private UserDao userDao;

	@Test
	public void FindList() throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("name like", "%c%");// ..
		List<User> users = userDao.findList(map);

		if (users != null) {
			users.forEach(user -> System.out.println(user));
		}
	}

	@Test
	public void count() throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("name like", "%c%");// ..
		int count = userDao.count(map);

		System.out.println("count: " + count);

		map.clear();
		map.put("name = ", "cyy");
		count = userDao.count(map);
		System.out.println("count: " + count);
	}

	@Test
	public void deleteByEntity() throws Exception {
		User user = userDao.findById(4);
		int result = userDao.deleteByEntity(user);
		System.out.println(result);
	}

	@Test
	public void deleteByEntitys() throws Exception {
		int[] ids = { 2, 3 };
		List<User> users = new ArrayList<>();
		for (int id : ids) {
			User user = userDao.findById(id);
			if (user != null) {
				users.add(user);
			}
		}
		users.forEach(user -> System.out.println(user));
		int result = userDao.deleteByEntitys(users);
		System.out.println(result);
	}

	@Test
	public void deleteById() throws Exception {
		int result = userDao.deleteById(4);
		System.out.println(result);
	}

	@Test
	public void deleteByIds() throws Exception {
		int[] ids = { 1, 5 };
		int result = userDao.deleteByIds(ids);
		System.out.println(result);
	}

	@Test
	public void findAll() throws Exception {
		List<User> users = (List<User>) userDao.findAll();
		users.forEach(user -> System.out.println(user));
	}

	@Test
	public void findById() throws Exception {
		System.out.println(userDao.findById(1));
	}

	@Test
	public void findInterval() throws Exception {
		List<User> users = (List<User>) userDao.findInterval(2, 3);
		users.forEach(user -> System.out.println(user));
	}

	@Test
	public void save() throws Exception {
		User user = new User();
		user.setName("amd");
		int result = userDao.save(user);
		System.out.println(result);
	}

	@Test
	public void saves() throws Exception {
		List<User> users = new ArrayList<>();
		User user;
		for (int i = 1; i < 5; i++) {
			user = new User();
			user.setName("name" + i);
			users.add(user);
		}

		int result = userDao.saves(users);
		System.out.println(result);
	}

	@Test
	public void update() throws Exception {
		User user = userDao.findById(3);
		user.setName("update3");
		int result = userDao.update(user);
		System.out.println(result);
	}

	@Test
	public void updates() throws Exception {
		List<User> userList = new ArrayList<>();
		for (int i = 2; i < 6; i++) {
			User user = userDao.findById(i);
			if (user == null) {
				continue;
			}
			user.setName("updateBatch" + i);
			userList.add(user);
		}
		userList.forEach((user) -> System.out.println(user));

		int result = userDao.updates(userList);
		System.out.println(result);
	}

	@Test
	public void findRoles() throws Exception {
		// List<Role> roles = (List<Role>) userDao.findRoles(3);
		// roles.forEach(role -> System.out.println(role));
	}
}

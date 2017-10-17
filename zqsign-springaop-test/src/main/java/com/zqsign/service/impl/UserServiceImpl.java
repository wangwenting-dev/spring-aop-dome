package com.zqsign.service.impl;

import org.springframework.stereotype.Service;

import com.zqsign.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	public int addUser(String name) {
		System.out.println("addUser:" + name);
		return 0;
	}

	public String deleteUser(String uuid) {
		System.out.println("deleteUser:" + uuid);
		return "bb";
	}
}

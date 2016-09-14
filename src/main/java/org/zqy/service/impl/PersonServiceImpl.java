package org.zqy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zqy.dao.entity.Person;
import org.zqy.dao.mapper.PersonMapper;
import org.zqy.service.PersonService;

/**
 * 接口实现类
 * @author yangz
 *
 */
@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonMapper personMapper;

	@Override
	public Person getPersonById(int id) {
		return personMapper.selectByPrimaryKey(id);
	}
}

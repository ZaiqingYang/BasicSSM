package org.zqy.service;

import org.zqy.dao.entity.Person;

/**
 * 定义接口
 * @author yangz
 *
 */
public interface PersonService {

	/**
	 * 根据id查询person
	 * @param id
	 * @return
	 */
	public Person getPersonById(int id);
}

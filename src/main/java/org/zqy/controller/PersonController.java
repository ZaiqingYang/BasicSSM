package org.zqy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zqy.dao.entity.Person;
import org.zqy.service.PersonService;
/**
 * Person controller
 * @author yangz
 *
 */
@Controller("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	/**
	 * 通过Id获取Person
	 * @param req
	 * @param id
	 * @return
	 */
	@RequestMapping("/getbyid")
	public String getPersonById(HttpServletRequest req,int id){
		Person person = personService.getPersonById(id);
		req.setAttribute("person", person);
		return "result";
	}
}

package com.app.hr.controller;

import com.app.hr.dao.PersonInfoDao;
import com.app.hr.model.PersonInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author fz
 * @Date 2017-08-14 20:02
 */

@Controller
public class PersonInfoController {

    @Autowired
    private PersonInfoDao personInfoDao;

    @RequestMapping("/getbyname")
    @ResponseBody
    public String getByName(String name) {
        String userId;
        PersonInfo user = personInfoDao.findByName(name);
        if (user != null) {
            userId = String.valueOf(user.getId());
            return "The user id is: " + userId;
        }
        return "user " + name + " is not exist.";
    }

    @RequestMapping("/addpersion")
    @ResponseBody
    public String getPerson() {
        PersonInfo user = new PersonInfo();
        user.setName("张三");
        PersonInfo user2 = personInfoDao.save(user);
        if (user2 != null) {
            return "The user id is: " + user2.getId();
        }
        return "user id is not exist.";
    }
}

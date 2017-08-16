package com.app.hr.controller;

import com.app.hr.dao.PersonInfoDao;
import com.app.hr.model.PersonInfo;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

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
//        String userId;
//        PersonInfo user = personInfoDao.findByName(name);
//        if (user != null) {
//            userId = String.valueOf(user.getId());
//            return "The user id is: " + userId;
//        }
//        return "user " + name + " is not exist.";
        return null;
    }

    @RequestMapping("/addpersion")
    @ResponseBody
    public String getPerson() {
        PersonInfo user = new PersonInfo();
        user.setName("张三");
        PersonInfo user2 = personInfoDao.save(user);
        if (user2 != null) {
            return "The user id is: " + user2.getPersonInfoId();
        }
        return "user id is not exist.";
    }

//    @RequestMapping("/article-list")
//    public String listArticle(ModelMap map) {
//        List<PersonInfo> test = personInfoDao.findByName("张三");
//        map.addAttribute("persons", test);
//        return "article-list";
//    }

    @RequestMapping("/index")
    public String index(ModelMap map) {
        return "index";
    }

    @ResponseBody
    @RequestMapping("/all")
    public DataTablesOutput<PersonInfo> querytest(@Valid DataTablesInput input) {
        PersonInfo test = personInfoDao.findByName("cc");
        return null;
    }


}

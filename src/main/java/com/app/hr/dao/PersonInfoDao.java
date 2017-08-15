package com.app.hr.dao;

import com.app.hr.model.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author fz
 * @Date 2017-08-14 19:56
 */

@Transactional
public interface PersonInfoDao extends JpaRepository<PersonInfo, Long> {
//    PersonInfo findByName(String name);
    List<PersonInfo> findByName(String userName);
//    public PersonInfo save(PersonInfo personInfo);
//    public PersonInfo update(PersonInfo personInfo);
//    public void delete(PersonInfo personInfo);
}

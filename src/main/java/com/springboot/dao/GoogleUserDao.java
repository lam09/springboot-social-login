package com.springboot.dao;

import com.springboot.google.GooglePojo;
import com.springboot.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by a.lam.tuan on 27. 7. 2018.
 */
@Repository
public class GoogleUserDao {

    @Autowired
    @PersistenceContext(unitName = Constants.JPA_UNIT_NAME_2)
    private EntityManager entityManager;

   // @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    @Transactional
    public void save(GooglePojo googlePojo){
        entityManager.persist(googlePojo);
        entityManager.flush();
    }
}

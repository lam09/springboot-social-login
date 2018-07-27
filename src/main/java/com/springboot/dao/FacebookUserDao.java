package com.springboot.dao;

import com.springboot.facebook.FacebookUser;
import com.springboot.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 * Created by a.lam.tuan on 27. 7. 2018.
 */
@Repository
public class FacebookUserDao{



    @Autowired
    @PersistenceContext(unitName = Constants.JPA_UNIT_NAME_1)
    private EntityManager entityManager;

   // @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    @Transactional
    public void save(FacebookUser facebookUser){
       // Session session = this.sessionFactory.getCurrentSession();

       entityManager.persist(facebookUser);        entityManager.flush();

    }
}

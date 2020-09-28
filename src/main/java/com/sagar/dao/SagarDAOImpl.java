package com.sagar.dao;

import com.sagar.entity.Sagar;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class SagarDAOImpl implements SagarDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Sagar> getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery< Sagar > cq = cb.createQuery(Sagar.class);
        Root< Sagar > root = cq.from(Sagar.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

}

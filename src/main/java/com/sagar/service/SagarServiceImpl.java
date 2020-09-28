package com.sagar.service;

import com.sagar.dao.SagarDAO;
import com.sagar.entity.Sagar;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class SagarServiceImpl implements SagarService {

    @Autowired
    private SagarDAO sagarDAO;

    @Override
    @Transactional
    public List<Sagar> getCustomers() {
        return sagarDAO.getCustomers();
    }

}

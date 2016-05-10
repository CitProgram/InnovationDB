package com.service;

import com.dao.ScopeDao;
import com.entity.Scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pc8 on 28.04.16.
 */
@Service
public class ScopeService {

    @Autowired
    ScopeDao scopeDao;

    public void setScope(String name){
        Scope scope = new Scope();
        scope.setName(name);
        scopeDao.setScope(scope);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.Query;
import java.util.List;

/**
 *
 * @author DRN-PC
 */
public interface QueryDAO {
    
    public void insert(Query query) throws Exception;
    public void update(Query query) throws Exception;
    public void delete(int id) throws Exception;
    public Query getById(int id) throws Exception;
    public List<Query> getAll() throws Exception;
    
}

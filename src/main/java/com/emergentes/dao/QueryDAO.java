package com.emergentes.dao;

import com.emergentes.models.Query;
import java.util.List;

public interface QueryDAO {
    
    public int insert(Query query) throws Exception;
    public void update(Query query) throws Exception;
    public void delete(int id) throws Exception;
    public Query getById(int id) throws Exception;
    public List<Query> getAll() throws Exception;
    
}

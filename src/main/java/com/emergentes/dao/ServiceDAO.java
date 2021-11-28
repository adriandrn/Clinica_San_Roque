package com.emergentes.dao;

import com.emergentes.models.Service;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DRN-PC
 */
public interface ServiceDAO {
    
    public void insert(Service service) throws Exception;
    public void update(Service service) throws Exception;
    public void delete(int id) throws Exception;
    public Service getById(int id) throws Exception;
    public List<Service> getAll() throws Exception;
    
}

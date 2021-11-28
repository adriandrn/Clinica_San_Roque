/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.Hour;
import java.util.List;

/**
 *
 * @author DRN-PC
 */
public interface HourDAO {
    
    public void insert(Hour hour) throws Exception;
    public void update(Hour hour) throws Exception;
    public void delete(int id) throws Exception;
    public Hour getById(int id) throws Exception;
    public List<Hour> getAll() throws Exception;
    
}

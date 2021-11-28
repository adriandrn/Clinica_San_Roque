/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.History;
import java.util.List;

/**
 *
 * @author DRN-PC
 */
public interface HistoryDAO {
    
    public void insert(History history) throws Exception;
    public void update(History history) throws Exception;
    public void delete(int id) throws Exception;
    public History getById(int id) throws Exception;
    public List<History> getAll() throws Exception;
    
}

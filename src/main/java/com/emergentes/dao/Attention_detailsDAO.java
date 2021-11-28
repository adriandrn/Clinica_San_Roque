/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.Attention_details;
import java.util.List;

/**
 *
 * @author DRN-PC
 */
public interface Attention_detailsDAO {
    
    public void insert(Attention_details attention_details) throws Exception;
    public void update(Attention_details attention_details) throws Exception;
    public void delete(int id) throws Exception;
    public Attention_details getById(int id) throws Exception;
    public List<Attention_details> getAll() throws Exception;
    
}

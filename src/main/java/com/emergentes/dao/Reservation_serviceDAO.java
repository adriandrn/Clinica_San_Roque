/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.Reservation_service;
import java.util.List;

/**
 *
 * @author DRN-PC
 */
public interface Reservation_serviceDAO {
    
    public void insert(Reservation_service reservation_service) throws Exception;
    public void update(Reservation_service reservation_service) throws Exception;
    public void delete(int id) throws Exception;
    public Reservation_service getById(int id) throws Exception;
    public List<Reservation_service> getAll() throws Exception;
    
}

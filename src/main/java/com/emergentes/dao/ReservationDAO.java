/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.Reservation;
import java.util.List;

/**
 *
 * @author DRN-PC
 */
public interface ReservationDAO {
    
    public void insert(Reservation reservation) throws Exception;
    public void update(Reservation reservation) throws Exception;
    public void delete(int id) throws Exception;
    public Reservation getById(int id) throws Exception;
    public List<Reservation> getAll() throws Exception;
    
}

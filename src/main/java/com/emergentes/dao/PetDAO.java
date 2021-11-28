/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.Pet;
import java.util.List;

/**
 *
 * @author DRN-PC
 */
public interface PetDAO {
    
    public void insert(Pet pet) throws Exception;
    public void update(Pet pet) throws Exception;
    public void delete(int id) throws Exception;
    public Pet getById(int id) throws Exception;
    public List<Pet> getAll() throws Exception;
    
}

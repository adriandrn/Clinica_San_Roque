
package com.emergentes.dao;

import com.emergentes.models.User;
import java.util.List;

public interface UserDAO {
    public void update(User user) throws Exception;
    public void delete(int id) throws Exception;
    public User getById(int id) throws Exception;
    public List<User> getAll() throws Exception;
    public User getEmailResult(String email) throws Exception;
    public int insert(User user) throws Exception;
}

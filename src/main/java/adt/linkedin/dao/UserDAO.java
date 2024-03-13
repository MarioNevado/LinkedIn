package adt.linkedin.dao;

import adt.linkedin.model.*;


public interface UserDAO {
    
    void removeUser(User user);
    void updateUser(User user);
    void createUser(User user);
    

}

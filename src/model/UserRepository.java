package model;


import java.util.Set;

import USER.User;

public interface  UserRepository {

    void add(User user) throws Exception;

    void update(User user) throws Exception ;

    void delete(int id);

    User find(int id);

    Set<User> findAll();

    void confirm(User user) throws Exception;

}

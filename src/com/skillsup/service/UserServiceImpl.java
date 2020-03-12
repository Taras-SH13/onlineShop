package com.skillsup.service;

import com.skillsup.dao.UserDAO;
import com.skillsup.dao.UserInMemDAO;
import com.skillsup.model.Response;
import com.skillsup.model.User;

public class UserServiceImpl implements UserService {

    UserDAO userDAO = new UserInMemDAO();

    @Override
    public Response<User> login(String username, String pass) {
        if (username == null || pass == null || username.equals("") || pass.equals(""))
            return new Response<>(null, false, "In");
        User u = userDAO.get(username);

    }
}

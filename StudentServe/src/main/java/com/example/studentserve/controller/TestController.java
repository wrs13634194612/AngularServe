package com.example.studentserve.controller;

import com.example.studentserve.entity.User;
import com.example.studentserve.service.UserRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class TestController {

    @Autowired
    UserRepostitory userRepostitory;


    // http://192.168.101.227:8080/test/query?id=2
    @RequestMapping(value = {"/test/add"}, method = RequestMethod.POST)
    public User getAdd(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String id = request.getParameter("id");
        String email = request.getParameter("email");
        String last_name = request.getParameter("last_name");
        System.out.println(id + "\t" + email + "\t" + last_name);
        User user = new User();
        user.setId(Integer.parseInt(id));
        user.setEmail(email);
        user.setLastName(last_name);
        userRepostitory.save(user);
        return user;
    }


    @RequestMapping(value = {"/test/query"}, method = RequestMethod.GET)
    public Optional<User> getQuery(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String id = request.getParameter("id");
        System.out.println(id + "\t");
        Optional<User> user = userRepostitory.findById(Integer.parseInt(id));
        return user;
    }


    @RequestMapping(value = {"/test/query/all"}, method = RequestMethod.GET)
    public List<User> getQueryAll()
            throws IOException {
        List<User> user = userRepostitory.findAll();
        return user;
    }


    @RequestMapping(value = {"/test/delete"}, method = RequestMethod.DELETE)
    public List<User> getDelete(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String id = request.getParameter("id");
        System.out.println(id + "\t");
        userRepostitory.deleteById(Integer.parseInt(id));
        List<User> user = userRepostitory.findAll();
        return user;
    }




}
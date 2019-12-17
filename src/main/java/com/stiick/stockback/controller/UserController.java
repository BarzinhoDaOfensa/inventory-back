package com.stiick.stockback.controller;

import com.stiick.stockback.entity.Team;
import com.stiick.stockback.entity.User;
import com.stiick.stockback.repository.TeamRepository;
import com.stiick.stockback.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "team")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public User findById(@PathVariable String id) throws Exception {
        Optional<User> optionalProduct = userRepository.findById(id);
        return optionalProduct.orElseThrow(Exception::new);
    }

    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<User> findAll() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public User update(@RequestBody User user) {
        return userRepository.save(user);
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable String id) {
        userRepository.deleteById(id);
    }
}

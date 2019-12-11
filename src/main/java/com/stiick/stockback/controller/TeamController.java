package com.stiick.stockback.controller;

import com.stiick.stockback.entity.Team;
import com.stiick.stockback.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "team")
public class TeamController {

    private TeamRepository teamRepository;

    @Autowired
    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Team findById(@PathVariable String id) throws Exception {
        Optional<Team> optionalProduct = teamRepository.findById(id);
        return optionalProduct.orElseThrow(Exception::new);
    }

    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Team> findAll() {
        List<Team> teams = teamRepository.findAll();
        return teams;
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Team update(@RequestBody Team team) {
        return teamRepository.save(team);
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Team save(@RequestBody Team team) {
        return teamRepository.save(team);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable String id) {
        teamRepository.deleteById(id);
    }
}

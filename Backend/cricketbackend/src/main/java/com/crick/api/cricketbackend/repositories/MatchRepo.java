package com.crick.api.cricketbackend.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.api.cricketbackend.entities.Match;


public interface MatchRepo extends JpaRepository <Match,Integer>{
    // I want to find team from the database if it is present --> Giving teamHeading
    Optional<Match> findByTeamHeading(String teamHeading);
}

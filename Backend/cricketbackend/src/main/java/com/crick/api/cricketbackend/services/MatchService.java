/* We are going to make three services
 *  Get all matches
 * Get Live  matches
 * get cwc2023 point table
 */




package com.crick.api.cricketbackend.services;

import java.util.List;
import java.util.Map;

import com.crick.api.cricketbackend.entities.Match;

public interface MatchService {
    Object getLiveMatches = null;

    // get all matches
    List<Match> getAllMatches();

    // get  live matches
    List<Match> getLiveMatches();

   // get cwc2023 point table 
    List<List<String>>getPointTable();
}

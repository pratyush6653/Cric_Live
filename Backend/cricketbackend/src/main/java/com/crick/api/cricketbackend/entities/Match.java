package com.crick.api.cricketbackend.entities;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="crick_matches")

public class Match {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)// auto genrate the id
    private int matchId;

        private String teamHeading;
        private String matchNumberVenue;
        private String battingTeam;
        private String battingTeamScore;
        private String bowlTeam;
        private String bowlTeamScore;
        public Match(int matchId, String teamHeading, String matchNumberVenue, String battingTeam,
                String battingTeamScore, String bowlTeam, String bowlTeamScore, String liveText, String matchLink,
                String textcomplete, MatchStatus status, Date date) {
            this.matchId = matchId;
            this.teamHeading = teamHeading;
            this.matchNumberVenue = matchNumberVenue;
            this.battingTeam = battingTeam;
            this.battingTeamScore = battingTeamScore;
            this.bowlTeam = bowlTeam;
            this.bowlTeamScore = bowlTeamScore;
            this.liveText = liveText;
            this.matchLink = matchLink;
            this.textcomplete = textcomplete;
            this.status = status;
            this.date = date;
        }
        private String liveText;
        private String matchLink;
        private String textcomplete;
        @Enumerated
        private MatchStatus status;
        private Date date=new Date();
        public Match() {
        }

        // set the match status according to textcompelete function

        public void setMatchStatus()
        {
            if(textcomplete.isBlank())
            {
                this.status=MatchStatus.LIVE;
            }
            else
            {
                this.status=MatchStatus.COMPLETED;
            }
        }


        public int getMatchId() {
            return matchId;
        }
        public void setMatchId(int matchId) {
            this.matchId = matchId;
        }
        public String getTeamHeading() {
            return teamHeading;
        }
        public void setTeamHeading(String teamHeading) {
            this.teamHeading = teamHeading;
        }
        public String getMatchNumberVenue() {
            return matchNumberVenue;
        }
        public void setMatchNumberVenue(String matchNumberVenue) {
            this.matchNumberVenue = matchNumberVenue;
        }
        public String getBattingTeam() {
            return battingTeam;
        }
        public void setBattingTeam(String battingTeam) {
            this.battingTeam = battingTeam;
        }
        public String getBattingTeamScore() {
            return battingTeamScore;
        }
        public void setBattingTeamScore(String battingTeamScore) {
            this.battingTeamScore = battingTeamScore;
        }
        public String getBowlTeam() {
            return bowlTeam;
        }
        public void setBowlTeam(String bowlTeam) {
            this.bowlTeam = bowlTeam;
        }
        public String getBowlTeamScore() {
            return bowlTeamScore;
        }
        public void setBowlTeamScore(String bowlTeamScore) {
            this.bowlTeamScore = bowlTeamScore;
        }
        public String getLiveText() {
            return liveText;
        }
        public void setLiveText(String liveText) {
            this.liveText = liveText;
        }
        public String getMatchLink() {
            return matchLink;
        }
        public void setMatchLink(String matchLink) {
            this.matchLink = matchLink;
        }
        public String getTextcomplete() {
            return textcomplete;
        }
        public void setTextcomplete(String textcomplete) {
            this.textcomplete = textcomplete;
        }
        public MatchStatus getStatus() {
            return status;
        }
        public void setStatus(MatchStatus status) {
            this.status = status;
        }
        public Date getDate() {
            return date;
        }
        public void setDate(Date date) {
            this.date = date;
        }


        
        
        


}

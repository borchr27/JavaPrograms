package com.company;

public class Team {
    // TODO: Declare private fields - teamName, teamWins, teamLosses
    private String teamName;
    private int teamWins, teamLosses;

    // TODO: Define mutator methods -
    //       setTeamName(), setTeamWins(), setTeamLosses()
    public void setTeamName(String team) {
        teamName = team;
    }

    public void setTeamWins(int wins){
        teamWins = wins;
    }

    public void setTeamLosses(int lose){
        teamLosses = lose;
    }

    // TODO: Define accessor methods -
    //       getTeamName(), getTeamWins(), getTeamLosses()
    public String getTeamName(){
        return teamName;
    }

    public int getTeamWins(){
        return teamWins;
    }

    public int getTeamLosses(){
        return teamLosses;
    }

    // TODO: Define getWinPercentage()
    public double getWinPercentage(){
        return (double) teamWins / ((double) teamWins + (double) teamLosses);
    }

}

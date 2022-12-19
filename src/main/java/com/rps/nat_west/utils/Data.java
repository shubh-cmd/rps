package com.rps.nat_west.utils;

public class Data {
    
    private final String clientMove;
    private final String computerMove;
    private final String result;
    
    public Data() {
        this.clientMove = "Rock";
        this.computerMove = "Paper";
        this.result = "Computer Wins";
    }
    
    public Data(String clientMove, String computerMove, String result) {
        this.clientMove = clientMove;
        this.computerMove = computerMove;
        this.result = result;
    }


    public String getClientMove() {
        return clientMove;
    }
    public String getComputerMove() {
        return computerMove;
    }
    public String getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Data [clientMove=" + clientMove + ", computerMove=" + computerMove + ", result=" + result + "]";
    }
    
}

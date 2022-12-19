package com.rps.nat_west.utils;

import java.util.Random;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class Helper {
    
    private static final String PLAYER = "Player Wins";
    private static final String COMPUTER = "Computer Wins";
    private static final String TIE = "It is a tie";
    private static final String ROCK =  "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    
    static Logger logger = (Logger)LoggerFactory.getLogger(Helper.class);

    public static boolean CheckValidMove(String value){

        
        if(value.equals(ROCK) || value.equals(PAPER) || value.equals(SCISSORS)){
            return true;
        }
        else{
            return false;
        }
    }
    public static String ComputerRandomMove(){
        String move[] = {"Rock", "Paper", "Scissors"};

        Random random = new Random();

        int id = random.nextInt(3);

        logger.debug("Random move generated: "+move[id]);
        return move[id];
    }

    public static String findResult(String clientMove,String computerMove){
        if(clientMove.equals(ROCK)){
            if(computerMove.equals(PAPER)){
                return COMPUTER;
            }
            else if(computerMove.equals(SCISSORS)){
                return PLAYER;
            }
        }
        else if(clientMove.equals(PAPER)){
            if(computerMove.equals(SCISSORS)){
                return COMPUTER;
            }
            else if(computerMove.equals(ROCK)){
                return PLAYER;
            }
        }
        else if(clientMove.equals(SCISSORS)){
            if(computerMove.equals(PAPER)){
                return PLAYER;
            }
            else if(computerMove.equals(ROCK)){
                return COMPUTER;
            }
        }
        
        return TIE;
    }
}

package com.rps.nat_west.controller;

import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rps.nat_west.utils.Data;
import com.rps.nat_west.utils.Helper;

import ch.qos.logback.classic.Logger;

@RestController
public class ResultController {
    
    Logger logger = (Logger)LoggerFactory.getLogger(ResultController.class);
    @GetMapping("/api/rps")
    public ResponseEntity<Object> get(@RequestParam(value = "clientMove",defaultValue="Null") String clientMove){

        logger.debug("Client move is: "+clientMove);
        boolean isValid = Helper.CheckValidMove(clientMove);
        
        logger.debug("is client move valid? "+isValid);
        if(isValid == false){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("clientMove is not valid");
        }

        String computerMove = Helper.ComputerRandomMove();
        
        logger.debug("Computer move is: "+computerMove);

        String result = Helper.findResult(clientMove,computerMove);

        logger.debug("Result of game is: "+result);
        Data data = new Data(clientMove,computerMove,result);
        
        return ResponseEntity.of(Optional.of(data));
    }
}

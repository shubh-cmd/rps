package com.rps.nat_west.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HelperTest {
    @Test
    void testCheckValidMove() {
        String a = "Rock",b = "Paper", c = "Scissors", d = "dhdhtdn";
        boolean result1 = Helper.CheckValidMove(a);
        boolean result2 = Helper.CheckValidMove(b);
        boolean result3 = Helper.CheckValidMove(c);
        boolean result4 = Helper.CheckValidMove(d);

        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);
        assertFalse(result4);
    }

    @Test
    void testComputerRandomMove() {
        String move = Helper.ComputerRandomMove();

        boolean isValid = false;
        String arr[] = {"Rock", "Paper", "Scissors"};
        for(String str : arr){
            if(move.equals(str)){
                isValid = true;
                break;
            }
        }

        assertTrue(isValid);
    }

    @Test
    void testFindResult() {
        String player = "Rock";
        String computer = "Paper";
        String expected = "Computer Wins";
        String result = Helper.findResult(player, computer);

        assertEquals(expected, result);

        result = Helper.findResult("Rock", "Rock");
        assertEquals("It is a tie", result);
    }
}

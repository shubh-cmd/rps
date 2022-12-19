package com.rps.nat_west.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest
public class ResultControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGet() throws Exception {
        this.mockMvc.perform(get("/api/rps?clientMove=Rock")).andDo(print())
        .andExpect(status().isOk());
    }
}

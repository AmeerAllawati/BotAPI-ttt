package com.tictactoe.botapi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tictactoe.botapi.model.Board;
import com.tictactoe.botapi.model.Bot;
import com.tictactoe.botapi.model.Move;
import com.tictactoe.botapi.model.PostParams;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
public class BotController {
    @PostMapping
    public Move getMove(@RequestBody PostParams params) {
        System.out.println("Printing grid: "+ params.grid.length);
        Board newBoard = new Board(params.grid);
        Bot bot = new Bot();
        return bot.makeMove(newBoard, params.player1, params.player2);
    }
}

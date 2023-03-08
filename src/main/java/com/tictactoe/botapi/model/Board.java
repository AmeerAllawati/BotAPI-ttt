package com.tictactoe.botapi.model;

import java.util.HashMap;

public class Board {
    public char[][] grid = new char[3][3];

    public Board(char[][] grid) {
        this.grid = grid;
    }
}

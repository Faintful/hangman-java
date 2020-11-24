package org.faint.hangman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;

    @BeforeEach
    public void setUp() {
        game = new Game("test");
    }

    @Test
    public void reTry_NullString_ShouldThrowNullPointerException() {
        assertThrows(
                NullPointerException.class,
                () -> game.reTry(null)
        );
    }

}

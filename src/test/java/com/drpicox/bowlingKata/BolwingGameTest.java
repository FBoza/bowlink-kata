package com.drpicox.bowlingKata;

import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

//slides: http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata
public class BolwingGameTest {

    private Game g;

    @Before
    public void setUp(){
        g = new Game();
    }

    @Test
    public void gutterGame(){
        int n = 20;
        int pins = 0;
        rollMany(n, pins);
        assertThat(g.score(), is(0));
    }

    @Test
    public void testAllOnce() throws Exception{
        int n = 20;
        int pins = 1;
        rollMany(n, pins);
        assertThat(g.score(), is(20));
    }

    private void rollMany(int n, int pins) {
        for(int i = 0;  i < n; i++){
            g.roll(pins);
        }
    }

}

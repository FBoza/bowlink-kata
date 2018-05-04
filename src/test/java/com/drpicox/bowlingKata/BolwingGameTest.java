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

    private void rollMany(int n, int pins) {
        for(int i = 0;  i < n; i++){
            g.roll(pins);
        }
    }

    @Test
    public void gutterGame(){
        rollMany(20, 0);
        assertThat(g.score(), is(0));
    }

    @Test
    public void testAllOnce() throws Exception{
        rollMany(20, 0);
        assertThat(g.score(), is(20));
    }

}

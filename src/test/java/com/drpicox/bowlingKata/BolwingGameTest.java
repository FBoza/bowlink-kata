package com.drpicox.bowlingKata;

import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

//slides: http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata
public class BolwingGameTest {

    @Test
    public void gutterGame(){
        Game g = new Game();
        for(int i = 0; i < 20; i++){
            g.roll(0);
        }
    }

}

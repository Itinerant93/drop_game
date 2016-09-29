package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Cool_Prog on 27.09.2016.
 */

public class Drop extends Game {

    SpriteBatch batch;
    BitmapFont font;

    @Override
    public void create() {

        batch = new SpriteBatch();
        font = new BitmapFont();

        this.setScreen(new MainMenuScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();

        batch.dispose();
        font.dispose();
    }
}

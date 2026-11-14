package com.libgdxtext;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class LibgdxTest extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture logo;
    private Texture cat;

    @Override
    public void create() {
        batch = new SpriteBatch();
        logo = new Texture("libgdx.png");
        cat = new Texture("catImg.png");
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(logo, 300, 0);
        batch.draw(cat, 600, 300);
        batch.end();        
    }

    @Override
    public void dispose() {
        batch.dispose();
        logo.dispose();
        cat.dispose();
    }
}

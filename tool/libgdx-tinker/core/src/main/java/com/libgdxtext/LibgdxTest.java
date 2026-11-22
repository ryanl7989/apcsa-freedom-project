package com.libgdxtext;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Input;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class LibgdxTest extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture cat;
    private Sprite catSprite;

    @Override
    public void create() {
        batch = new SpriteBatch();
        cat = new Texture("catImg.png");
        catSprite = new Sprite(cat);
        catSprite.setSize(100, 100);
        catSprite.setPosition(0, 0);
    }

    private void input() {
        float speed = 100f;
        // the time between each frame
        float delta = Gdx.graphics.getDeltaTime();

        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            catSprite.translateX(speed * delta);
        } else if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            catSprite.translateX(-speed * delta);
        }

        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            catSprite.translateY(speed * delta);
        } else if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            catSprite.translateY(-speed * delta);
        }
    }

    @Override
    public void render() {
        input();

        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);

        if (catSprite != null) {
            batch.begin();
            catSprite.draw(batch);
            batch.end();
        }
    }

    @Override
    public void dispose() {
        if (batch != null) batch.dispose();
        if (cat != null) cat.dispose();
    }
}
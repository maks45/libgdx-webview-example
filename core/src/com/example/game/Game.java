package com.example.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Viewport viewport;
	Sprite sprite;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		viewport = new FillViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		img = new Texture("badlogic.jpg");
		sprite = new Sprite(img);
	}

	@Override
	public void render () {
		float rotation = 250;
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sprite.setOriginCenter();
		sprite.setPosition(viewport.getWorldWidth() / 2f - sprite.getWidth() / 2f
				, viewport.getWorldHeight() / 2f - sprite.getHeight() / 2f);
		sprite.rotate(rotation * Gdx.graphics.getDeltaTime());
		batch.begin();
		sprite.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}

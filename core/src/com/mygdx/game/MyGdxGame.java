package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	TextureRegion table;
	TextureRegion cup;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		batch.getProjectionMatrix().setToOrtho2D(0, 0, 480, 320);
		table = new TextureRegion(new Texture(Gdx.files.internal("table.png")), 0, 0, 480, 320);
		cup = new TextureRegion(new Texture(Gdx.files.internal("cup.png")), 0, 0, 50, 50);
	}

	@Override
	public void render () {
		batch.begin();
		batch.draw(table, 0, 0);
		int startingLoc = 95;
		for (int i = 0; i < 3; i++){
			batch.draw(cup, startingLoc, 135);
			startingLoc += 120;
		}
		batch.end();
	}
}

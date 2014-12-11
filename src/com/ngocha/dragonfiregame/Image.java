package com.ngocha.dragonfiregame;

import com.ngocha.dragonfiregame.Graphics.ImageFormat;

public interface Image {
	public int getWidth();

	public int getHeight();

	public ImageFormat getFormat();

	public void dispose();
}

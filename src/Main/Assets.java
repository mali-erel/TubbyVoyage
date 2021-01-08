package Main;

import java.awt.image.BufferedImage;

public class Assets {

	public static BufferedImage menu, bg1;
	public static BufferedImage redTubbyR, redTubbyL;
	public static BufferedImage purpleTubbyR, purpleTubbyL;
	public static BufferedImage yellowTubbyR, yellowTubbyL;
	public static BufferedImage greenTubbyR, greenTubbyL;

	public static void init() {

		bg1 = ImageLoader.loadImage("/BackGround/bg1.png");
		menu = ImageLoader.loadImage("/BackGround/menu.png");
		redTubbyR = ImageLoader.loadImage("/Tubbies/redTubbyR.png");
		redTubbyL = ImageLoader.loadImage("/Tubbies/redTubbyL.png");
		yellowTubbyR = ImageLoader.loadImage("/Tubbies/yellowTubbyR.png");
		yellowTubbyL = ImageLoader.loadImage("/Tubbies/yellowTubbyL.png");
		greenTubbyL = ImageLoader.loadImage("/Tubbies/greenTubbyL.png");
		greenTubbyR = ImageLoader.loadImage("/Tubbies/greenTubbyR.png");
		purpleTubbyL = ImageLoader.loadImage("/Tubbies/purpleTubbyL.png");
		purpleTubbyR = ImageLoader.loadImage("/Tubbies/purpleTubbyR.png");
	}

}

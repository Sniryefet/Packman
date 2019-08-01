package GIS;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Geom.Point3D;
import MyFrame.Map;

public class Player implements Types{
	
	Point3D point;
	int speed;
	double radius;
	private Map map =new Map();
	public static BufferedImage playerImage=null;
	
	public Player() {
		if(playerImage==null) try{playerImage = ImageIO.read(new File("Pictures\\Player_Packman.png"));}
		catch(IOException e) {System.out.println(e);}
	}
	
	
	/*
	 * @return return point in pixel
	 */
	public Point3D getLocationInPixels() {
		return map.polar2pixels(point);
	}
	/*
	 * @return retun player point
	 */
	public Point3D getPoint() {
		return point;
	}
	/*
	 * set player point
	 */
	public void setPoint(Point3D point) {
		this.point = point;
	}
	/*
	 * @return return player's speed
	 */
	public int getSpeed() {
		return speed;
	}
	/*
	 * set player speed
	 * @param speed parameter
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/*
	 * @return return player's eating radius 
	 */
	public double getRadius() {
		return radius;
	}
	/*
	 * set player's radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public Point3D getLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

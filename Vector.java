package frc.robot;

public class Vector {
	private double x;
	private double y;
	private int angle;
	private double mag;

	public Vector (double x, double y) {
		this.x = x;
		this.y = y;
		angle = 0;
		mag = 0.0;
		this.turnCoorToVector();
	}

	public Vector(int angle, double mag) {
		this.angle = angle;
		this.mag = mag;
		x = 0.0;
		y = 0.0;
		this.turnVectorToCoor();
	}

	public Vector() {
		x = 0.0;
		y = 0.0;
		angle = 0;
		mag = 0.0;
	}

	public double getX() {
		return x;
	}

public double getY() {
		return y;
	}

	public int getAngle() {
		return angle;
	}

	public double getMag() {
		return mag;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

	public void setMag(double mag) {
		this.mag = mag;
	}

	public void turnCoorToVector() {
		mag = Math.sqrt(x*x + y*y);
		angle = (int)Math.toDegrees(Math.asin(y/mag));
	}

	public void turnVectorToCoor() {
		x = Math.cos(Math.toRadians(angle))*mag;
		y = Math.sin(Math.toRadians(angle))*mag;
	}

	public void print() {
		System.out. println( "(" + this.getX() + "," + this.getY() + ")" );
		System.out. println("Magnitude: " + this.getMag() + "Angle: " + this.getAngle());
	}

	public static Vector combineVectors(Vector v1, Vector v2) {
		Vector result = new Vector();
		result.setMag(Math.sqrt(Math.pow(v1.getMag(), 2) + Math.pow(v1.getMag(), 2) - 2 * v1.getMag() * v2.getMag() * Math.cos(v2.getAngle() + 180 - v1.getAngle())));
		result.setAngle((int)(v1.getAngle() - Math.asin(v2.getMag() * (v2.getAngle() + 180 - v1.getAngle()) / result.getMag())));
		result.turnVectorToCoor();
		return result;
	}
}


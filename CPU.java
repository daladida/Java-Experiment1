package CPU;

public class CPU {
	public static char type = 'i';public static String brand;
	private double speed;
	protected int cache;
	public double getspeed() {
	return speed;
	}
	public void setSpeed(double speed) {
	this.speed = speed;}
	public int getcache() {
	return cache;
	}
	public void setCache(int cache) {
		this.cache = cache;}
}

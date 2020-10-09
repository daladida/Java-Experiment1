package CPU;

public class CPU {
	public static char type = 'i';public static String brand;//使用静态变量type，类型为字符型
	private int speed;//速度属性(整型)，访问权限修饰符为“私有”
	protected double cache;//容量属性(双浮点型)，访问权限修饰符为“保护”
	public int getSpeed() {
	return speed;
	}//方法权限修饰符为“公有”
	public void setSpeed(int speed) {
	this.speed = speed;}
	public double CPU() {
	return cache;
	}//不含参构造方法
	public void CPU(double cache) {
		this.cache = cache;}//含参构造方法
}

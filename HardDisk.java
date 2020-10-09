package HD;

public class HardDisk {
	private int amount;//容量属性(整型)，访问权限修饰符为“私有”
	protected float rpm;//速度属性(单浮点型)，访问权限修饰符为“保护”
	public int getAmount() {
	return amount;}//方法权限修饰符为“公有”
	public void setAmount(int amount) {
	this.amount = amount;
	}
	public float HardDisk() {
		return rpm;}//不含参构造方法
	public void HardDisk(float rpm) {
	this.rpm = rpm;
	}//含参构造方法
}

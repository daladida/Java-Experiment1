package PC;

import CPU.CPU;
import HD.HardDisk;//导入子类包

public class PC {
	String brand;//品牌属性(字符串型)
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU cpu) {
	this.cpu = cpu;}
	void setHardDisk(HardDisk HD) {
	this.HD = HD;}
	void show(){
		System.out.println("PC品牌:"+brand);System.out.println(""+CPU.brand+CPU.type+"5-6200U");
	    System.out.println("CPU主频:" +cpu.getSpeed()+"Hz");
	    System.out.println("CPU缓存:" +cpu.CPU()+"MB");
	    System.out.println("HDD容量:"+HD.getAmount()+"GB");
	    System.out.println("HDD转速:"+HD.HardDisk()+"rpm");
	}
}
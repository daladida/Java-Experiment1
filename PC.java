package PC;

import CPU.CPU;
import HD.HardDisk;

public class PC {
	String brand;
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU cpu) {
	this.cpu = cpu;}
	void setHardDisk(HardDisk HD) {
	this.HD = HD;}
	void show(){
		System.out.println("PCƷ��:"+brand);System.out.println(""+CPU.brand+CPU.type+"5-6200U");
	    System.out.println("CPU��Ƶ:" +cpu.getspeed()+"GHz");
	    System.out.println("CPU����:" +cpu.getcache()+"MB");
	    System.out.println("HDD����:"+HD.getAmount()+"GB");
	    System.out.println("HDDת��:"+HD.getRpm()+"rpm");
	}
}
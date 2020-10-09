package PC;

import CPU.CPU;
import HD.HardDisk;//导入子类包

public class Test {
	public static void main(String args[]) {
		CPU cpu = new CPU();//创建CPU对象cpu
		HardDisk disk=new HardDisk();//创建HardDisk对象disk
		cpu.setSpeed(2200);//cpu设定自己speed设定为2200
		cpu.CPU(256);
		disk.setAmount(200);//disk将自己amount设定为200
		disk.HardDisk(5400);
		PC pc =new PC();//创建PC对象pc
		pc.setCPU(cpu);//pc调用方法，实参是cpu
		pc.setHardDisk(disk);//pc调用方法，实参是disk
		pc.brand = "DELL-WXJ";
		CPU.brand = "Intel(R)";
		pc.show();//pc调用show()方法
		}
}

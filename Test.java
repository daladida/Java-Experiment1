package PC;

import CPU.CPU;
import HD.HardDisk;

public class Test {
	public static void main(String args[]) {
		CPU cpu = new CPU();
		HardDisk HD=new HardDisk();
		cpu.setSpeed(2.30);
		cpu.setCache(256);
		HD.setAmount(200);
		HD.setRpm(5400);
		PC pc =new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.brand = "Optimus MAX";
		CPU.brand = "Intel(R)";
		pc.show();
		}
}

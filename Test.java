package PC;

import CPU.CPU;
import HD.HardDisk;//���������

public class Test {
	public static void main(String args[]) {
		CPU cpu = new CPU();//����CPU����cpu
		HardDisk disk=new HardDisk();//����HardDisk����disk
		cpu.setSpeed(2200);//cpu�趨�Լ�speed�趨Ϊ2200
		cpu.CPU(256);
		disk.setAmount(200);//disk���Լ�amount�趨Ϊ200
		disk.HardDisk(5400);
		PC pc =new PC();//����PC����pc
		pc.setCPU(cpu);//pc���÷�����ʵ����cpu
		pc.setHardDisk(disk);//pc���÷�����ʵ����disk
		pc.brand = "DELL-WXJ";
		CPU.brand = "Intel(R)";
		pc.show();//pc����show()����
		}
}

package computer;

public class PC {
CPU cpu;
HardDisk HD;
void setCPU(CPU cpu) {
this.cpu = cpu;}
void setHardDisk(HardDisk HD) {
this.HD = HD;}
void show(){
System.out.println("CPU�ٶ�:" +cpu.getspeed());
System.out.println("Ӳ������:"+HD.getAmount());
}}

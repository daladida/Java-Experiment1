package CPU;

public class CPU {
	public static char type = 'i';public static String brand;//ʹ�þ�̬����type������Ϊ�ַ���
	private int speed;//�ٶ�����(����)������Ȩ�����η�Ϊ��˽�С�
	protected double cache;//��������(˫������)������Ȩ�����η�Ϊ��������
	public int getSpeed() {
	return speed;
	}//����Ȩ�����η�Ϊ�����С�
	public void setSpeed(int speed) {
	this.speed = speed;}
	public double CPU() {
	return cache;
	}//�����ι��췽��
	public void CPU(double cache) {
		this.cache = cache;}//���ι��췽��
}

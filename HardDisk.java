package HD;

public class HardDisk {
	private int amount;//��������(����)������Ȩ�����η�Ϊ��˽�С�
	protected float rpm;//�ٶ�����(��������)������Ȩ�����η�Ϊ��������
	public int getAmount() {
	return amount;}//����Ȩ�����η�Ϊ�����С�
	public void setAmount(int amount) {
	this.amount = amount;
	}
	public float HardDisk() {
		return rpm;}//�����ι��췽��
	public void HardDisk(float rpm) {
	this.rpm = rpm;
	}//���ι��췽��
}

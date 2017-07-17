package com.xuetang9.javabase.chapter10.rpgdemo;
/**
 * սʿ�� - �̳��� Hero��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��15�� ����3:25:16
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class Warrior extends Hero{
	/** սʿ���������ԣ��������� */
	private int pysicalAttach;
	
	public Warrior(){
		super();	//���๹���У�Ĭ�Ͼͻ���ø��๹��
		System.out.println("����Ĭ�Ϲ���");
	}
	
	public Warrior(String nickName, int pysicalAttach){
		setNickName(nickName);
		setPysicalAttach(pysicalAttach);
	}
	
	@Override //ע�⣺��д
	public void move() {
		System.out.println("սʿ���ƶ�����ͨ�������ߣ�");
	}
	
	/**
	 * ��дObject���equals�������Ա�Ƚ����������Ƿ����
	 */
	@Override
	public boolean equals(Object obj) {
		//��������obj����Warrior���ʵ��
		if(!(obj instanceof Warrior)){
			return false;
		}
		Warrior newWarrior = (Warrior)obj;
		//�Ƚ���������
		if(getNickName().equals(newWarrior.getNickName()) && getPysicalAttack() == newWarrior.getPysicalAttack()){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		return getNickName() + "\t" + getLevel() + "\t" + getPysicalAttack();
	}

//	public void movee(){
//		System.out.println(getNickName() + ":�ƶ��������ȣ�");
//	}

	public int getPysicalAttack() {
		return pysicalAttach;
	}

	public void setPysicalAttach(int pysicalAttach) {
		this.pysicalAttach = pysicalAttach;
	}
	
	
}

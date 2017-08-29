package com.xuetang9.javabase.chapter14.roledemo;

public class Role{// implements Comparable<Role>{
	private String name;
	private String title;
	private int hp;
	private int attack;
	
	public Role(){
		
	}
	
	public Role(String name, String title, int hp, int attack){
		setAttack(attack);
		setName(name);
		setTitle(title);
		setHp(hp);
	}
	
//	@Override
//	public int compareTo(Role role) {
//		//����ʵ�ֽӿڵķ������ڼ����оͿ��Խ��ж����ɾ����������
//		//Ϊ�˲��Է��㣬����ʹ�ý�ɫ����Ѫֵ���Ƚ�������ɫ�Ĵ�С��ϵ
//		if(hp > role.getHp()) return 1;
//		if(hp < role.getHp()) return -1;
//		return 0;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Role)){
			return false;
		}
		Role role = (Role)obj;
		
		return role.getName().equals(name);
	}
	
	@Override
	public String toString() {
		return name + "\t" + title + "\t" + hp + "\t" + attack;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}

	
	
	
}

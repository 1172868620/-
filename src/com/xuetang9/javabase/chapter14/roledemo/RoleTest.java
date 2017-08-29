package com.xuetang9.javabase.chapter14.roledemo;

import java.util.Comparator;

public class RoleTest {

	public static void main(String[] args) {
		RoleBiz biz = new RoleBiz();
		biz.add(new Role("÷����1", "�������1", 50, 100));
		biz.add(new Role("÷����2", "�������2", 120, 200));
		biz.add(new Role("÷����3", "�������3", 150, 500));
		biz.add(new Role("÷����4", "�������4", 80, 400));
		biz.add(new Role("÷����5", "�������5", 90, 250));
		//�����ʵ���ڼ����еĶ���ɾ��������ȹ��ܣ���Ҫ�õ��Ƚ����ӿ�
		//1��ʵ����ֱ��ʵ��Comparable�ӿ� - ��Ҫʵ�����֧��
		//2����������Comparator������
		Role delRole = new Role("÷����4", "�������4", 80, 300);
		System.out.println(biz.delete(delRole));
		biz.show();
		
		biz.order();
		biz.show();
		
		
	}

}
/**
 * ��������ĵڶ��ַ�ʽ��ֱ��Ϊĳ�����϶���һ���Ƚ���
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��29�� ����11:54:30
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
class RoleComparator implements Comparator<Role>{

	@Override
	public int compare(Role role1, Role role2) {
		if(role1.getAttack() > role2.getAttack()) return 1;
		if(role1.getAttack() < role2.getAttack()) return -1;
		return 0;
	}
	
}






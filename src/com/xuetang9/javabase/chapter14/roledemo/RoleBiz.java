package com.xuetang9.javabase.chapter14.roledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RoleBiz {
	List<Role> roleList = null;;
	public RoleBiz(){
		roleList = new ArrayList<>();
	}
	
	public void add(Role role){
		roleList.add(role);
	}
	
	public boolean delete(Role role){
		return roleList.remove(role);
	}
	
	public void show(){
		System.out.println("��ɫ\t\t�ƺ�\t\t\t��Ѫ\t������");
		Iterator<Role> roleIt = roleList.iterator();
		while(roleIt.hasNext()){
			System.out.println(roleIt.next());
		}
	}
	
	/**
	 * ����ʹ�õ�������д���ӡ�ͨ�á��ķ���
	 * ��������һ���Գ�����ԭ�������ʵ�ְ������Ծ������������С 
	 * @param it
	 */
	public void show(Iterator<Role> it){
		System.out.println("��ɫ\t\t�ƺ�\t\t\t��Ѫ\t������");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public void order(){
		//ʹ��ָ���ıȽ�����������
		Collections.sort(roleList, new RoleComparator());
		//����
		Collections.sort(roleList, Collections.reverseOrder(new RoleComparator()));
	}
}







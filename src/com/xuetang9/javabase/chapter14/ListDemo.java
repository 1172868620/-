package com.xuetang9.javabase.chapter14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		ArrayListDemo();
//		System.out.println("ArrayList��ʱ��" + TimeCost(new ArrayList<>()));
//		System.out.println("LinkedList��ʱ��" + TimeCost(new LinkedList<>()));
	}
	
	/**
	 * ���һ��ͨ�÷������ڵ�һ��λ�ô��������Ԫ��
	 * ���ز�ͬ���ͼ��ϵ�ִ��ʱ��
	 * @param list
	 * @return
	 */
	public static long TimeCost(List<Object> list){
		final int N = 500000;
		long startTime = System.currentTimeMillis();
		Object obj = new Object();
		for(int i = 0; i < N; i++){
			list.add(0, obj);//�ڼ��ϵ���λ�ô��������N��Ԫ��
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	public static void ArrayListDemo(){
		//ʹ�ó���������ArrayList����ʵ�ָ��ӿ�List
		//ע�⣺�����ArrayList�����滻��List�ӿڵ��������࣬��������һ����
		List<String> stringList = new ArrayList<String>();//��̬����
		stringList.add("red");
		stringList.add("blue");
		stringList.add("green");
		System.out.println(stringList);
		stringList.add(0, "orange");
		System.out.println(stringList);
		stringList.add(2, "yellow");
		//System.out.println(stringList);
		//System.out.println("subList:" + stringList.subList(1, 3)); //��String�ķ������ͣ�����ҿ�
		stringList.remove("blue");
		System.out.println(stringList);
		
		//���ϵı��� / ����
		for (int i = 0; i < stringList.size(); i++) {
			System.out.print(stringList.get(i) + ", ");
		}
		System.out.println();
		
		for(String str : stringList){
			System.out.print(str + ", ");
		}
		System.out.println();
		
		System.out.println("ʹ�õ�����������");
		//1.��ü��ϵĵ�����
		Iterator<String> it =  stringList.iterator();
		//2.ʹ�ù̶��ĵ�����������������������
		while(it.hasNext()){
			System.out.print(it.next() + ", ");
		}
		System.out.println();
		
		//ʹ��������ĵ�����
		//ע�⣺��ͳ�ĵ�����ֻ�ܰ�˳�������ʣ����Ҳ����޸ļ����е�Ԫ��
		//      ListIterator�ȿ�����ǰҲ���������ʣ����ҿ����޸ļ����е�Ԫ�أ�
		ListIterator<String> listIt = stringList.listIterator(stringList.size());
		//�Ӻ���ǰ����
		while(listIt.hasPrevious()){
			System.out.print(listIt.previous() + ", ");
		}
		System.out.println();
		//����ͨ�����������Ԫ��
		listIt.set("abc");
		System.out.println(stringList);
		
		List<String> linkedList = new LinkedList<>();
		linkedList.addAll(stringList);
		System.out.println("linkedList:" + linkedList);
	}

}





package com.xuetang9.javabase.chapter9;
/**
 * �ַ���ʾ��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��8�� ����3:57:36
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String value = "Hello World";
		value += "Good";	//�൱�ڵ�����value.concat()��������ֱ�ӷ���һ���µ��ַ�������ռ�
		String value2 = "Hello WorldGood";//���ַ������еĵ�ַ����value2
		
		System.out.println(value.equals(value2));
		
//		String value = "�й������ž�";
//		//value += "��ţ�����ˣ�";
//		value = value.concat("��ţ�����ˣ�");
//		
//		
//		System.out.println(value);
		
	}
}

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
		String ��ǿ������ = "��С��";	//��С������ַ����ͱ���������ַ�������
		��ǿ������ = "�̲�����";			//�̲����� Ҳ�����ַ������еģ�
		//new String("�̲�����@Сǿ��")
		��ǿ������ = ��ǿ������.concat("@Сǿ��");	//ע�⣺��ǿ���������Ѿ�����ԭ���ڳ������е��̲������ˣ�
		//˼�����̲�����@Сǿ�� �Ƿ��ڳ������У�������
		System.out.println(��ǿ������);
		
		String ��ǿ��ǰ�� = "��С��";
		
		
//		String value = "Hello World";
//		String value1 = value;
//		value += "Good";	//�൱�ڵ�����value.concat()��������ֱ�ӷ���һ���µ��ַ�������ռ�
//		String value2 = "Hello WorldGood";//���ַ������еĵ�ַ����value2
//		
//		System.out.println(value);
//		System.out.println(value1);
		
//		String value = "�й������ž�";
//		//value += "��ţ�����ˣ�";
//		value = value.concat("��ţ�����ˣ�");
//		
//		
//		System.out.println(value);
		
	}
}

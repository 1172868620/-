package com.xuetang9.javabase.chapter14;
/**
 * �򵥽��ⷺ�ͱ����E�ĺ��弰�÷�
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��29�� ����10:28:24
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class ElementDemo<E> {
	Object[] objs = new Object[999];
	
	public void add(E e){
		objs[0] = e;
	}
	
	public static void main(String[] args) {
		//<String> ��ʾ����E���;���String����
		ElementDemo<String> elementDemo = new ElementDemo<String>();
		//elementDemo.add(1);   //������ݵĲ����Ƿ�Լ������String�������ڱ������ͻᱨ��-������ӽ�׳
	}
	
//	public void add(String value){
//		//1.������鵱ǰ��ʵ������
//		//2.��valueԪ����ӵ������е�һ��Ϊnull��λ��
//		objs[0] = value;
//		
//		//value�ͱ��Զ�ת�ͳ���Object����
//		String str1 = (String)objs[0];	//ʹ�ö�������ʱ��������⣺ǿ��ת��ʱ��������δ֪���͵��쳣
//		String str2 = (String)objs[1];	//����ʱ���쳣������ʱ���� java.lang.ClassCastException
//		String str3 = (String)objs[2];
//		System.out.println(str1 + ", " + str2 + ", " + str3);
//	}
//	
//	public void add(Integer intValue){
//		//���������objs��������Ͷ���
//		objs[1] = intValue;
//	}
//	
//	public void add(Student stu){
//		//�����������stu����
//		objs[2] = stu;
//	}
//	
//	public static void main(String[] args) {
//		ElementDemo demo = new ElementDemo();
//		demo.add(2);
//		demo.add(new Student());
//		demo.add("abc");
//	}
}
class Student{
	
}






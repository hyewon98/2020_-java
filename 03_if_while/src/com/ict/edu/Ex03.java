package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		// ��ø if�� : if���� ������ ����� ��
		// ����)	if(���ǽ�1){
		//	 		   ���ǽ�1�� ���϶� ���๮��;
		//		    }else if(���ǽ�2){
		//			   ���ǽ�1�� �����̰�, ���ǽ�2�� ���� ��� ���๮��;
		//			}else if(���ǽ�3){
		//			   ���ǽ�1,2�� �����̰�, ���ǽ�3�� ���� ��� ���๮��;
		//			}else{
		//			   ���ǽ�1,2,3 ��� �����϶�, �� ������
		//			}
	
		// int k1�� ������ 90�̻��̸�, A, 80�̻��̸� B, 70�̻��̸� C, ������ F
		int k1 = 91;
		String res = "" ;
		if (k1 >= 90) {
			res = "A" ;
		} else if (k1 >= 80 ) {
			res = "B" ;
		} else if (k1 >= 70) {
			res = "C" ;
		} else {
			res = "F" ;
		}
		System.out.println("��� : " + res) ; 
	
		// char k2�� �빮������, �ҹ�������, ��������, ��Ÿ�������� �Ǻ�
		char k2 = 'a' ;
		if (k2 >= 'A' &&  k2 <= 'Z') {
			res = "�빮��";
		} else if (k2 >= 'a' && k2 <= 'z') {
			res = "�ҹ���";
		} else if (k2>= '0' && k2 <= '9') {
			res = "����";
		} else {
			res = "��Ÿ����";
		}
		System.out.println("��� :" + res );
		
		
		// char k3�� A,a�̸� ������ī B,b�̸� �����, C,c�̸� ĳ���� ������ �ѱ�
		char k3 = 'c' ;
		if (k3 == 'A' || k3 == 'a') {
			res = "������ī";
		}else if (k3 == 'B' || k3 == 'b') {
			res = "�����";
		}else if (k3 == 'C' || k3 == 'c') {
			res = "ĳ����";
		}else {
			res = "�ѱ�";
		}
		System.out.println("��� :" + res );
		
		
		// menu�� 1�̸� ī���ī 3500, 2�̸� ī��� 4000, 3�̸� �Ƹ޸�ī�� 3000,
		// 4�̸� �����꽺 3500�̴�. ģ���� 2���� 10000���� �Ծ���.
		// �ܵ��� ���ΰ�? (��, �ΰ��� 10% ����)
		
		int menu = 3 ;
		
		if (menu == 1) {
			int dan = 3500 ;
			String drink = "ī���ī";
			int su = 2 ;
			int total = dan * su ;
			int vat = (int)(total * 0.1) ;
			int input = 10000 ;
			int output = input - (total + vat) ;
			System.out.println("�ܵ� :" + output);
		}else if (menu == 2) {
			int dan = 4000 ;
			String drink = "ī���";
			int su = 2 ;
			int total = dan * su ;
			int vat = (int)(total * 0.1) ;
			int input = 10000 ;
			int output = input - (total + vat) ;
			System.out.println("�ܵ� :" + output);
		}else if (menu == 3) {
			int dan = 3000 ;
			String drink = "�Ƹ޸�ī��";
			int su = 2 ;
			int total = dan * su ;
			int vat = (int)(total * 0.1) ;
			int input = 10000 ;
			int output = input - (total + vat) ;
			System.out.println("�ܵ� :" + output);
		}else if (menu == 4) {
			int dan = 3500 ;
			String drink = "�����꽺";
			int su = 2 ;
			int total = dan * su ;
			int vat = (int)(total * 0.1) ;
			int input = 10000 ;
			int output = input - (total + vat) ;
			System.out.println("�ܵ� :" + output);
		}
		System.out.println("==== �����丵 : 1. �ߺ��ڵ��� ������");		
		
		int dan2 = 0 ;
		String drink2 = "";
		if (menu == 1) {
			dan2 = 3500 ;
			drink2 = "ī���ī" ;
		}else if (menu == 2) {
			dan2 = 4000 ;
			drink2 = "ī���" ;
		}else if (menu == 3) {
			dan2 = 3000 ;
			drink2 = "�Ƹ޸�ī��" ;
		}else if (menu == 4) {
			dan2 = 3500 ;
			drink2 = "�����꽺" ;
		}
		
		int su2 = 2 ;
		int total2 = dan2 * su2 ;
		int vat2 = (int)(total2 * 0.1) ;
		int input2 = 10000 ;
		int output2 = input2 - (total2 + vat2) ;
		System.out.println("�ܵ� :" + output2);
		
		
		
	}
}
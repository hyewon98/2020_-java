package com.ict.edu;

public class Ex05 {
	

	public static void main(String[] args) {
		// for�� : ������ ��Ģ�� ���� ���๮�� �ݺ�ó���ϴ� ��
		// for(�ʱ��; ���ǽ�; ������){
		//	  ���ǽ��� ���϶� ������ ���� ;
		// 	}
		// for���� ������ �ʱ�ĺ��� �����Ѵ�. ���ǽ����� �̵�
		// ���ǽ��� boolean��(boolean, �񱳿���, ��������)
		// ���ǽ��� ���̸� for�� ���� ������ �����Ѵ�.
		// ���ǽ��� �����̸� for�� �������� �ʴ´�.
		// for���� ���� ������ ������ ���������� ����.
		// �������� �ʱ���� �����ϰų� ���ҽ�Ű�� ������ �ϰ�
		// �ٽ� ���ǽ����� ����.
		
		// �ڹٿ����� if��, switch��, for�� �ȿ� ���� ������
		// �ۿ��� ����� �� ����.
		
		// �ȳ��ϼ��� ���� ����ϱ�
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("===========================");
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " = Hello");
		}
		
		System.out.println("===========================");
		
		// 0 - 10 ���� ����ϱ�
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		
		// 0 - 11 ���� ¦���� ����ϱ� 
		for (int i = 0 ; i < 12; i = i+2) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 12 ; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			
		for (int i = 0; i < 12 ; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			  }
		  }
		
		}
	}		
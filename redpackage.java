package redpackage;

import java.util.*;

public class redpackage {

	public static void main(String[] args) {
		double min=0.01;									//���ٺ�����
		double redpackage_amount;							//�ܵĺ�����
		double num_people;									//�ַ������������
		double redpackage_tmp;								//����ÿһ��������������ʱ����
		int count=0;										//�����ż�¼����
		System.out.println("����������������Ľ�");				
		Scanner scan1 = new Scanner(System.in);				//�������ܽ��
		redpackage_amount=scan1.nextDouble();
		System.out.println("�����뽫Ҫ�����¸�֮·��ƶ���������");
		Scanner scan2=new Scanner(System.in);						//��������������
		num_people=scan2.nextDouble();
		while(num_people!=1){								//�����ѭ���壬���һ��������ʣ�µĽ��
		double max=(redpackage_amount/num_people)*2;		//������������
		Random r=new Random();								//�������
		double tmp=r.nextDouble()*max;						//��max����0��1֮��������
		redpackage_tmp=tmp<min? min:tmp;					//����õ��Ľ����1��Ǯ�������ں���з���һ��Ǯ
		count++;											//����һ���������ż�1
		System.out.println("��"+count+"������Ľ��Ϊ��\t"+String.format("%.2f", redpackage_tmp)+"��");//������õĺ�����
		redpackage_amount-=redpackage_tmp;					//�ܶ����
		num_people--;										//�����������1
		}
		count++;
		System.out.println("��"+count+"������Ľ��Ϊ��\t"+String.format("%.2f", redpackage_amount)+"��");//���һ�����������µĽ��
		scan1.close();
		scan2.close();
	}

}

import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// ����Ϸ��ܽ��
	System.out.print("�����ܽ�������200Ԫ����");
	double money = input.nextDouble();
	while (money < 0.01 || money > 200) {
	  System.out.print("����������Ϸ��ܽ�");
	  money = input.nextDouble();
	}
	
	// ���ܽ��ת�����Է�Ϊ��λ
	int tempMoney = (int)(100 * money);
	
	// ����Ϸ������
	System.out.print("����������");
	int number = input.nextInt();
	while (number < 1 || number > tempMoney) {
	  System.out.print("����������Ϸ��������");
	  number = input.nextInt();
	}
	
	// �������
	int[] part = new int[number];
	
	// Ϊ�����һ������ĺ��������
	for (int i = 0; i < number-1; i++) {
	  part[i] = 1 + (int)(Math.random() * (tempMoney / (number - i)));
	  tempMoney = tempMoney - part[i];
	}
	
	// ʣ�µĽ��ȫ�����һ�����
	part[number-1] = tempMoney;
	
	// ������
	for (int i = 0; i < number; i++) {
		System.out.println("��" + (i+1) + "������еĽ��Ϊ��" + part[i]/100.0 + "Ԫ");
	}
	
	input.close();
  }
}
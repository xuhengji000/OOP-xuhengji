import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// 输入合法总金额
	System.out.print("输入总金额（不超过200元）：");
	double money = input.nextDouble();
	while (money < 0.01 || money > 200) {
	  System.out.print("请重新输入合法总金额：");
	  money = input.nextDouble();
	}
	
	// 将总金额转化成以分为单位
	int tempMoney = (int)(100 * money);
	
	// 输入合法红包数
	System.out.print("输入红包数：");
	int number = input.nextInt();
	while (number < 1 || number > tempMoney) {
	  System.out.print("请重新输入合法红包数：");
	  number = input.nextInt();
	}
	
	// 红包数组
	int[] part = new int[number];
	
	// 为除最后一个以外的红包分配金额
	for (int i = 0; i < number-1; i++) {
	  part[i] = 1 + (int)(Math.random() * (tempMoney / (number - i)));
	  tempMoney = tempMoney - part[i];
	}
	
	// 剩下的金额全给最后一个红包
	part[number-1] = tempMoney;
	
	// 输出结果
	for (int i = 0; i < number; i++) {
		System.out.println("第" + (i+1) + "个红包中的金额为：" + part[i]/100.0 + "元");
	}
	
	input.close();
  }
}
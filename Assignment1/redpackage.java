package redpackage;

import java.util.*;

public class redpackage {

	public static void main(String[] args) {
		double min=0.01;									//最少红包金额
		double redpackage_amount;							//总的红包金额
		double num_people;									//分发红包的总人数
		double redpackage_tmp;								//保存每一个红包具体金额的临时变量
		int count=0;										//红包序号记录变量
		System.out.println("土豪请输入封入红包的金额：");				
		Scanner scan1 = new Scanner(System.in);				//输入红包总金额
		redpackage_amount=scan1.nextDouble();
		System.out.println("请输入将要带上致富之路的贫民的数量：");
		Scanner scan2=new Scanner(System.in);						//输入领红包总人数
		num_people=scan2.nextDouble();
		while(num_people!=1){								//发红包循环体，最后一个人拿走剩下的金额
		double max=(redpackage_amount/num_people)*2;		//设置最大红包金额
		Random r=new Random();								//随机变量
		double tmp=r.nextDouble()*max;						//用max乘上0到1之间的随机数
		redpackage_tmp=tmp<min? min:tmp;					//如果得到的结果比1分钱还少则在红包中放入一分钱
		count++;											//包完一个红包，序号加1
		System.out.println("第"+count+"个红包的金额为：\t"+String.format("%.2f", redpackage_tmp)+"￥");//输出包好的红包金额
		redpackage_amount-=redpackage_tmp;					//总额减少
		num_people--;										//待包红包数减1
		}
		count++;
		System.out.println("第"+count+"个红包的金额为：\t"+String.format("%.2f", redpackage_amount)+"￥");//最后一个人拿走身下的金额
		scan1.close();
		scan2.close();
	}

}

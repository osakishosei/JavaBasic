package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		 Car car = new Car();
		 car.serialNo = 10000;
		 car.color = "Red";
		 car.gasoline = 50;
		 Car car2 = new Car();
		 car2.serialNo = 20000;
		 car2.color = "blue";
		 car2.gasoline = 50;
		 Car car3 = new Car();
		 car3.serialNo = 30000;
		 car3.color = "green";
		 car3.gasoline = 50;
		 Car[] cars = {car,car2,car3};

		 final int distance = 300;
		 for(int i = 0;i<3;i++) {

		 int sum=0;
			int n =0;

			while(true) {
				n++;
				int k = cars[i].run();
				sum+=k;

				if(-1==k) {
					System.out.println("「目的地に到達できませんでした」");
					break;
				}

				if(distance<sum) {
					int x = 50 - n;
					System.out.println("「目的地にまで"+n+"時間かかりました。残りのガソリンは、"+x+"リットルです」");
					break;
				}
			}
		 }
	}
}

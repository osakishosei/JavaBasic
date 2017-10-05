package practice07;
/*
 * PTra07_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_04 {
	public static void main(String[] args) {

		// ★ int型の配列trumpを宣言し、52個の領域を確保してください
		int[]trump = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,
				     24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,
				     45,46,47,48,49, 50,51,};


		// ★ 配列trumpに、[1,2,3,4,5,・・・・,52] を代入してください


		// ★ 0～51の中からランダムで値を取得して、変数indexに代入してください
		int index = new java.util.Random().nextInt(51);



		// ★ 配列trumpのindex番目の中に入っている数字を出力してください
		System.out.println(trump[index]);

	}
}

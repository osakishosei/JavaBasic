package practice11;
/*
 * PTra11_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_03 {

	/*
	 * ★ PTra11_03クラスに、クラスフィールドでint型のnumberを定義してください
	 */
	int number;

	/*
	 * ★ PTra11_03クラスのコンストラクタを引数なしで定義してください
	 * ★ 処理は、クラスフィールドnumberに1を加算してください
	 */
	PTra11_03(){
		this.number++;
	}


	public static void main(String[] args) {
		PTra11_03 x = new PTra11_03();
		x.sum(1,2);
		// ★ sumメソッドを呼び出してください

	}

	public void sum(int x, int y) {
		System.out.println("sumメソッドを呼び出しました。" + x + "＋" + y + "＝" + (x + y));

		PTra11_03 i = new PTra11_03();
		System.out.println("クラスフィールドnumber："+i.number /* + ★ クラスフィールドnumberの出力をしてください */);
	}
}

package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for(int i = 0;i<=9;i++) {
			if(0==i) {
				System.out.println("□□□□□");

			}else if(1==i||9==i) {
				System.out.println("■□□□□");

			}else if(2==i||8==i) {
				System.out.println("■■□□□");

			}else if(3==i||7==i) {
				System.out.println("■■■□□");

			}else if(4==i||6==i) {
				System.out.println("■■■■□");

			}else if(5==i) {
				System.out.println("■■■■■");
			}
		}

	}
}

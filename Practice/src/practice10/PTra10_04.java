package practice10;
/*
 * PTra10_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_04 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ User型の変数が3つ入る配列usersを宣言・確保してください
        User us = new User();
        User us2 = new User();
        User us3 = new User();
        User[] users = {us,us2,us3};

		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
        java.util.Scanner scanner = new java.util.Scanner(System.in);


		// ★ usersのサイズ分繰り返す制御構文を記述してください
		//----------- ループ start
        for(int i = 0;i<users.length;i++) {

			System.out.println(i+1+"人目の情報を入力します");		/* ##には、カウントを入れてください */
			System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

			// ★ コマンドプロンプトに入力された値を、String型の変数lineに格納してください
			String line = scanner.next();

			// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
            String[] s = line.split(",",0);

			// ★ 配列にした値を、users[カウント]の各フィールドに代入してください
			// ★ ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです

              users[i].userId = Integer.parseInt(s[0]);
              users[i].userNm = s[1];
              users[i].mail = s[2];
              users[i].password = s[3];


              System.out.println(users[i].userId);
   		      System.out.println(users[i].userNm);
   		      System.out.println(users[i].mail);
   		      System.out.println(users[i].password);



        }

		//----------- ループ end

		// ★ usersに格納されている全てのインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください

	}
}

/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee employee = new Employee();
			employee.setUserId(1001);
			employee.setUserNm("山田");
			employee.setMail("yamada@hoge.com");
			employee.setPassword("rezo0001");
			employee.setDepartmentNm("5");
		Employee employee2 = new Employee();
			employee2.setUserId(1002);
			employee2.setUserNm("佐藤");
			employee2.setMail("satou@hoge.com");
			employee2.setPassword("rezo0002");
			employee2.setDepartmentNm("10");
		Employee employee3 = new Employee();
			employee3.setUserId(1002);
			employee3.setUserNm("小林");
			employee3.setMail("kobayashi@hoge.com");
			employee3.setPassword("rezo000");
			employee3.setDepartmentNm("35");
	}
}

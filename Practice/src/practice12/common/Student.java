/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;
	public void getStudentId(int studentId) {
		this.studentId = studentId;
	}

	/** 受講生氏名 */
	private String studentName;
	public String getStudentName() {
		return studentName;
	}

	/** 会社名 */
	private String companyName;
	public String CompanyName() {
		return companyName;
	}

	/** 教室名 */
	private String className;
	public String ClassName() {
		return className;
	}

	/** メールアドレス */
	private String mail;
	public String Mail() {
		return mail;
	}

	/** パスワード */
	private String password;
	public String Password() {
		return password;
	}
}

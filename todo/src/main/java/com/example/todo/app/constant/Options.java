package com.example.todo.app.constant;

//　列挙型をまとめたクラス
public class Options {

	// jobName
	public enum jobs {

		Student(1, "学生"),
		Employee(2, "会社員"),
		Employer(3, "自営業"),
		Arbeit(4, "パート・アルバイト"),
		Other(5, "その他"),
		Unselected(6, "未選択");

		private final int jobCode;
		private final String jobName;

		private jobs(int jobCode, String name) {
			this.jobCode = jobCode;
			this.jobName = name;
		}

		public int getJobCode() {
			return this.jobCode;

		}

		public String getJobName() {
			return jobName;
		}

		public void executeJobCode(Object obj) {

		}
	}

}

package score;

public class scoreDTO {

		private String name; //�̸�
		private String studentNum; //�й�
		private int koreanScore; //��������
		private int englishScore; //��������
		private int mathScore; //��������
		
		//getter,setter
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStudentNum() {
			return studentNum;
		}
		public void setStudentNum(String studentNum) {
			this.studentNum = studentNum;
		}
		public int getKoreanScore() {
			return koreanScore;
		}
		public void setKoreanScore(int koreanScore) {
			this.koreanScore = koreanScore;
		}
		public int getEnglishScore() {
			return englishScore;
		}
		public void setEnglishScore(int englishScore) {
			this.englishScore = englishScore;
		}
		public int getMathScore() {
			return mathScore;
		}
		public void setMathScore(int mathScore) {
			this.mathScore = mathScore;
		}
		
}

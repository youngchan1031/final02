package score;

public class scoreDTO {

		private String name; //이름
		private String studentNum; //학번
		private int koreanScore; //국어점수
		private int englishScore; //영어점수
		private int mathScore; //수학점수
		
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

package java_study.chapter03;

public class CoditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		/*
		 * 위의 삼항연산자는 아래와 동일한 코드이다.
		 * if(score>90) {
		 * 	grade = 'A';
		 * } else {
		 * 	if(score>80) {
		 * 		grade = 'B';
		 * 	} else {
		 * 		grade = 'C';
		 * 	}
		 * }
		 * */
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}

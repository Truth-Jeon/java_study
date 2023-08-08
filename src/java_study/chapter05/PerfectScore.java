package java_study.chapter05;

public class PerfectScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] jumsu = new int[10000];
//		Random r = new Random(5); // seed 값 : 씨드값을 주면 내가 몇번을 돌리든 항상 결과가 똑같음.
//		// 씨드값을 지우면 비로소 진짜 랜덤하게 됨.
//		for (int i = 0; i < jumsu.length; i++) {
//			jumsu[i] = r.nextInt(331); // 0 ~ 330
//			// nextInt() 값을 일반화 시켜야 함.
//		}
//		// 수능 만점자 수는 몇 명일까요?

		int[] jumsu = ArrayUtil.getRandomArray(10000, 331);
		int count = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 330) {
				count++;
				System.out.println(count + ": 만점자 번호는 " + i + "번");
			}
		}
		System.out.println("전체 만점자 수는 " + count + "명");
	}
}

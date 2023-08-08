package java_study.chapter06.Block;

public class UseBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Block block1 = new Block();
		// x,y,color == 인스턴스 상태
		block1.x = 50;
		block1.y = 50;
		block1.color = "빨간색";
//		System.out.println(block1.toString());
		System.out.println(block1); // toString 메서드 디버깅용!!! 이라서 .toString()을 쓰지 않아도 됨.

		Block block2 = new Block();
		// x,y,color == 인스턴스 상태
		block2.x = 150;
		block2.y = 150;
		block2.color = "회색";
//		System.out.println(block2.toString());
		System.out.println(block2);

		block1.pile(block1.x, block1.y);
		block2.pile(block2.x, block2.y);
	}

}

package java_study.chapter06.Block;

public class Block {
	int x = 0;
	int y = 0;
	String color = null;

	public void pile(int x, int y) {
		int move = x * y;
		System.out.println(move + "만큼 벽돌을 쌓다.");
	}

	@Override
	public String toString() {
		return "Block [x=" + x + ", y=" + y + ", color=" + color + "]";
	}

//
//	public String toString() {
//		return "Block [x=" + x + ", y=" + y + ", color=" + color + "]";
//	}
}

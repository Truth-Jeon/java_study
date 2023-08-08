package java_study.chapter07.sec05;

public class UseBbs {

	public static void main(String[] args) {
		Bbs bbs1 = new Bbs(1, "java", "fun java", "park");
		Bbs bbs2 = new Bbs(2, "jsp", "fun jsp", "hong");
		Bbs bbs3 = new Bbs(3, "spring", "fun spring", "kim");

		Bbs[] bbsArray = { new Bbs(1, "java", "fun java", "park"), new Bbs(2, "jsp", "fun jsp", "hong"),
				new Bbs(3, "spring", "fun spring", "kim") };

		System.out.println("게시판");
		System.out.println("------");
		System.out.println("no\ttitle\t\tcontent\twriter");
		for (int i = 0; i < bbsArray.length; i++) {
			System.out.println(bbsArray[i]);
		}
	}

}

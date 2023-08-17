package java_study.chapter14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer { // 프로그래밍에서는 전부 의인화 해서 쓰는 것이 관례임.
	// deserialize 역직렬화(복원)
	public static Object load(String filePath) throws Exception {// throws Exception예외처리 호출한 곳에 해달라
		// close() 처리 대신에 try로 자동닫기 처리를 해줌. 닫기(close)만 자동화
		// catch를 안 쓰는 대신, throws Exception으로 던짐. try를 썼기 때문에 자동 close()가 됨
		try (FileInputStream fis = new FileInputStream(filePath); ObjectInputStream ois = new ObjectInputStream(fis);) {
			return ois.readObject(); // 인스턴스 복원
		}
	}

	// serialize 직렬화(기록)
	public static void save(String filePath, Object obj) throws Exception {
		try (FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(obj);
			oos.flush();
		}
	}
}

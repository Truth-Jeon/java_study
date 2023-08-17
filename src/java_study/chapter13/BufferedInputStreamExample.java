package java_study.chapter13;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;

		try (FileInputStream fis1 = new FileInputStream("/Users/jeonhayoon/temp/house.jpeg");) {
			start = System.currentTimeMillis();
			while (fis1.read() != -1) {
			}
			end = System.currentTimeMillis();
			System.out.println("사용하지 않았을 때 : " + (end - start) + "ms");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (FileInputStream fis1 = new FileInputStream("/Users/jeonhayoon/temp/house.jpeg");
				BufferedInputStream bis = new BufferedInputStream(fis1);) {
			start = System.currentTimeMillis();
			while (bis.read() != -1) {
			}
			end = System.currentTimeMillis();
			System.out.println("사용하지 않았을 때 : " + (end - start) + "ms");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

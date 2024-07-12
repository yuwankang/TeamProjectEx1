package model.domain;

import org.junit.Test;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Person2 {
	@NonNull // @NotNull - sql값 반드시 적용하란 설정
	private String id;

	private int pw;

	@NonNull
	private String address;

	// setp01 - 컴파일 정상, 실행 불가 Junit 비추하는 구조
	/*
	 * @NoArgsConstructor
	 * @AllArgsConstructor
	 * @RequiredArgsConstructor
	 * 
	 */
	// @Test
	// public void info() {
	//step02 - junit에선 실행 불가였으나 main 메소드에선 실행됨
	public static void main(String[] args) {
		Person2 p1 = new Person2("Username", 0, "상암");
		System.out.println(p1.id);
	}

}

package ch06.sec08.exam04;

public class CalcEaxm {
	public static void main(String[] args) {
		Calc myCalc = new Calc();
		
		double result1 = myCalc.area(10);
		
		double result2 = myCalc.area(10, 20);
		
		System.out.println(result1);
		System.out.println(result2);
	}
}

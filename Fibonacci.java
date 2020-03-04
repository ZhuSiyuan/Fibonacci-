/*
 * zhusiyuan-3119305630-9073
 * zhusiyuan@stu.xjtu.edu.cn
 * */

import java.math.BigDecimal;

public class Fibonacci {
	
	static BigDecimal of(int N) {
		
		if (N <= 2)
			return BigDecimal.ONE;
		
		BigDecimal a = BigDecimal.ONE, b = BigDecimal.ONE, c = a.add(b);
		
		for (int i=4; i<=N; i++) {
			a = b;
			b = c;
			c = a.add(b);
		}
		
		return c;
	}

	public static void main(String[] args) {
		
		for (int i=1; i<=200; i++)
			System.out.println("Fibonacci.of(" + i + ") == " + Fibonacci.of(i));

	}

}

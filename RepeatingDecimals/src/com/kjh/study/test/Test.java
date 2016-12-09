package com.kjh.study.test;

/**
1/N 모양의 분수를 소수로 나타내어 봅시다.

    1/2 = 0.5
    1/3 = 0.333333...
    1/4 = 0.25
    1/5 = 0.2
    1/6 = 0.166666...
    1/7 = 0.142857142857...
    1/99 = 0.01010101010... 

위에서 보듯이, 분모가 3, 6, 7, 99 등일 때는 소수점 아래에 같은 숫자가 계속 반복됩니다.
1/2 부터 1/100 까지 이렇게 했을 때, 분모 및 반복되는 부분을 출력하는 프로그램을 작성하세요.
(분모가 2, 4, 5일 때처럼 딱 떨어지는 경우는 출력하지 않습니다)

    3 3
    6 6
    7 142857
    9 1
    ...(중략)...
    98 102040816326530612244897959183673469387755
    99 10 
 * @author Jaehyun
 *
 */
public class Test {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		for (int i = 1 ; i < 100 ; i++) {
			String result = cal.getReqeatingDecimalString(1, i);
			if (!result.isEmpty()) {
				System.out.println(i + " " + result);
			}
			
		}
	}
}

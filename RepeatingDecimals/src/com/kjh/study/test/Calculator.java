package com.kjh.study.test;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	public String getReqeatingDecimalString(int numerator, int denominator) {
		
		/* 나머지가 반복되는 것을 확인하기 위한 포인트 변수 */
		int repeatPoint = 0; 

		/* 나머지에 대한 이력 저장 List*/
		List<Integer> numeratorHistoryList = new ArrayList<Integer>();
		
		/* 실제 반복 부분을 저장할 String */
		String decimal = "";
		
		numerator = (numerator % denominator) * 10;
		
		while (numerator != 0) {
			decimal += (int)(numerator / denominator);
			
			numeratorHistoryList.add(numerator);
			numerator = (numerator % denominator) * 10;
			
			if (numeratorHistoryList.contains(numerator)) {
				repeatPoint = numeratorHistoryList.size() - numeratorHistoryList.indexOf(numerator);
				break;
			}
		}
		
		//순환소수가 아닌 경우 출력하지 않도록 빈 값을 반환
		if (repeatPoint == 0) {
			return "";
		}
		
		//반복되는 부분을 제외한 나머지를 자름
		return decimal.substring(decimal.length()-repeatPoint);
	}	
}

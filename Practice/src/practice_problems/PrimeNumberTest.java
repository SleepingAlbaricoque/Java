package practice_problems;

import java.util.ArrayList;
import java.util.Scanner;

/* 날짜 : 2022.09.12
 * 이름 : 조수빈
 * 내용 : Write a program to print all primes smaller than or equal to any given number
 */
public class PrimeNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수 n을 입력해주세요: ");
		System.out.println("프로그램을 종료하려면 엔터를 누르세요");
		while(true) {
			String s = sc.nextLine();
			if(s.isEmpty()) {
				System.out.println("프로그램을 종료합니다");
				return;
			}	
			int n = Integer.valueOf(s);
		
			for(int i =1; i <= n; i++) {
				ArrayList<Integer> list = new ArrayList<>();
					for(int j =1; j <= i; j++) {
						if(i % j == 0) {
							list.add(j);
						}
					}
					if(list.size() <= 2) {
						System.out.print(i + " ");
					}
			}
		System.out.println();	
		System.out.println("자연수 n을 입력해주세요: ");
		System.out.println("프로그램을 종료하려면 엔터를 누르세요");
			}
		}
	}


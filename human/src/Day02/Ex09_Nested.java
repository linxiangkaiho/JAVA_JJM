package Day02;

import java.util.Scanner;

public class Ex09_Nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정보처리기사 자격증 합격기준
		// 4학년, 60점이상 - 합격
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();

		System.out.print("학년(1~4) : ");
		int year = sc.nextInt();

		// 4학년?, 60점이상?
		if (4 == year) {
			if (60 <= score) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} else {
			System.out.println("응시 자격요건에 해당하지 않습니다.");
		}

		// 중첩하지 않고 조건을 줄 수 있다.
		// 조건1) 합격!
		if (year >= 4 && score >= 60) {
			System.out.println("합격입니다.");
		}
		// 조건2) 불합격!
		if (year >= 4 && score < 60) {
			System.out.println("불합격입니다.");
		}
		// 조건3) 응시자격 없음
		if (year < 4) {
			System.out.println("응시 자격요건에 해당하지 않습니다.");
		}

		sc.close();

	}
}

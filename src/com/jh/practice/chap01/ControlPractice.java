package com.jh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	Scanner sc = new Scanner(System.in);
	
	// 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를, 종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
	public void practice1() {
		System.out.println("===== 메뉴 입력 =====");
		boolean key = true;
		while(key) {
		
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = Integer.parseInt(sc.next());
		
		switch(num){
		case 1: System.out.println("입력 메뉴 입니다."); break;
		case 2: System.out.println("수정 메뉴 입니다."); break;
		case 3: System.out.println("조회 메뉴 입니다."); break;
		case 4: System.out.println("삭제 메뉴 입니다."); break;
		case 7: System.out.println("프로그램을 종료 합니다."); key = false; break;
		default : System.out.println("잘못 입력 하셨습니다.");
			}
		System.out.println();
		}
	}
	
	// 입력 받은 정수로 홀짝 구분하기
	public void practice2() {
		System.out.println("===== 홀짝 구분 =====");
		System.out.print("숫자를 한 개 입력 해주세요 : ");
		int num = Integer.parseInt(sc.next());
		if (num > 0) {
			// 나는 왜 자꾸 /, % 몫과 나머지 계산하는 식을 아직도 헷갈려 하고 있는....
			if (num % 2 == 0) {
				System.out.println("짝수다.");
			} else {
				System.out.println("홀수다.");
			}
		} else if (num == 0) {
			System.out.println("0은 홀짝인지 나도 구분을 못하겟다.");
		} else {
			System.out.println("양수만 입력 해주세요.");
		}
	}
	
	/*
	 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을
	 * 구현하세요. (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우) 합격 했을 경우 과목 별 점수와 합계,
	 * 평균, “축하합니다, 합격입니다!”를 출력하고 불합격인 경우에는 “불합격입니다.”를 출력하세요.
	 */
	public void practice3() {
		System.out.println("===== 총점 평균 구하기 =====");
		System.out.print("국어점수 : ");
		int kor = Integer.parseInt(sc.next());
		
		System.out.print("수학점수 : ");
		int math = Integer.parseInt(sc.next());
		
		System.out.print("영어점수 : ");
		int eng = Integer.parseInt(sc.next());
		
		double avg = (kor + math + eng) / 3;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n평균 : %.2f\n축하합니다, 합격입니다.\n", kor,math,eng,avg);
		}else {
			System.out.println("불합격입니다.");
		}
		System.out.println();
	}
	
	//수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
	public void practice4() {
		System.out.println("===== 봄,여름,가을,겨울 출력 =====");
		System.out.print("1~12 사이의 정수를 입력 : ");
		int month = Integer.parseInt(sc.next());
		
		switch(month) {
		case 1:
		case 2:
		case 12: 
			System.out.println("겨울 입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름 입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을 입니다.");
			break;
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		System.out.println();
	}
	
	/*
	 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요. 로그인 성공 시 “로그인 성공”, 아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
	 * 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요
	 */
	public void practice5() {
		System.out.println("===== 로그인 확인 =====");
		String id = "you";
		String pw = "!omygod";
		boolean key;
		
		System.out.print("아이디 : ");
		String ch1 = sc.next();
		
		System.out.print("비밀번호 : ");
		String ch2 = sc.next();
		
		if((ch1.equals(id) && ch2.equals(pw))) {
			System.out.println("로그인 성공");
		}else {
			key = ch1.equals(id);
			if(key) {
				System.out.println("비밀번호가 틀렸습니다.");
			}else {
				if(ch2.equals(pw)) {
					System.out.println("아이디가 틀렸습니다.");
				}else {
					System.out.println("둘다 틀렸습니다.");
				}
			}
		}
		System.out.println();
	}
	
	/*
	 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요. 단, 관리자는 회원관리, 게시글 관리,
	 * 게시글 작성, 게시글 조회, 댓글 작성이 가능하고 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고 비회원은 게시글 조회만
	 * 가능합니다.
	 */
	public void practice6() {
		System.out.println("===== 사용자 등급 =====");
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String rank = sc.next();
		
		switch(rank) {
		case "관리자": System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");	break;
		case "회원": System.out.println("게시글 작성, 게시글 조회, 댓글 작성");	break;
		case "비회원": System.out.println("게시글 조회");	break;
			default: System.out.println("등글읍 잘못 입력 했다.");
		}
		System.out.println();
	}
	
	/*
	 * , 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라 저체중/정상체중/과체중/비만을 출력하세요. BMI = 몸무게
	 * / (키(m) * 키(m)) BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중 BMI가 23이상 25미만일 경우
	 * 과체중 / 25이상 30미만일 경우 비만 BMI가 30이상일 경우 고도 비만
	 */
	public void practice7() {
		System.out.println("===== BMI 구하기 =====");
		System.out.print("키(m)를 입력해 주세요 : ");
		double hegith = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weigth = sc.nextDouble();
		double bmi = weigth / (hegith * hegith);
		String result = "";
		if(bmi >= 30) {
			result = "고도비만";
		}else if(bmi >= 25 && bmi < 30 ) {
			result = "비만";
		}else if(bmi >= 23 && bmi < 25) {
			result = "과체중";
		}else if(bmi >= 18.5 && bmi < 23) {
			result = "정상체중";
		}else {
			result = "저체중";
		}
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
		
	}
	
	/*
	 * 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요. (단, 두 개의 정수 모두 양수일 때만 작동하며
	 * 없는 연산 기호를 입력 했을 시 “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
	 */
	
	public void practice8() {
		System.out.println("===== 연산 계산 =====");
		double result = 0;
		System.out.print("피연산자1 입력 : ");
		int num1 = Integer.parseInt(sc.next());

		System.out.print("피연산자2 입력 : ");
		int num2 = Integer.parseInt(sc.next());

		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
		
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("잘못 입력 하셨습니다. 프로그램을 종료합니다.");
		}else {
			
			switch (operator) {
			case '+':
				result = num1 + num2;
				System.out.printf("%d + %d = %.0f\n", num1, num2, result);
				break;
			case '-':
				result = num1 - num2;
				System.out.printf("%d - %d = %.0f\n", num1, num2, result);
				break;
			case '*':
				result = num1 * num2;
				System.out.printf("%d * %d = %.0f\n", num1, num2, result);
				break;
			case '/':
				result = num1 / num2;
				System.out.printf("%d / %d = %f\n", num1, num2, result);
				break;
			case '%':
				result = num1 % num2;
				System.out.printf("%d % %d = %f\n", num1, num2, result);
				break;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;
			}
			System.out.println();
		}
		
	}
	
	/*
	 * 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요. 평가 비율은 중간고사 20%, 기말고사 30%,
	 * 과제 30%, 출석 20%로 이루어져 있고 이 때, 출석 비율은 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 따진 값으로
	 * 계산하세요. 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
	 */
	public void practice9() {
		System.out.println("===== P/F =====");
		
		System.out.println();
	}
	
	
	public void practice10() {
		System.out.println("===== 프로그램 시작 =====");
		boolean key = true;
		
		while(key) {
			System.out.println("실행할 기능을 선택하세요.");
			System.out.println("1. 메뉴 출력");
			System.out.println("2. 짝수/홀수");
			System.out.println("3. 합격/불합격");
			System.out.println("4. 계절");
			System.out.println("5. 로그인");
			System.out.println("6. 권환 확인");
			System.out.println("7. BMI");
			System.out.println("8. 계산기");
			System.out.println("9. P/F");
			System.out.println("10. 프로그램 종료");
			System.out.print("선택 : ");
			
			int select = Integer.parseInt(sc.next());
			switch(select) {
			case 1: practice1();break;
			case 2: practice2();break;
			case 3: practice3();break;
			case 4: practice4();break;
			case 5: practice5();break;
			case 6: practice6();break;
			case 7: practice7();break;
			case 8: practice8();break;
			case 9: practice9();break;
			case 10: System.out.println("프로그램을 종료 합니다."); key = false; break;
			default : System.out.println("잘못 입력 하셨습니다.");break;
			}
		}
			sc.close();
		
	}
	
	
	
	
	
	
	
	
	
	
}

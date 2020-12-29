package org.hanyang.basic;

//   1. Time.java라는 새 프로그램을 만듭니다.
//
//   2. 시, 분, 초라는 변수를 만듭니다. 대략 현재 시간인 값을 할당합니다.세 오후 2시에 시간 값이 14가 되도록 24시간 시계를 사용하요.
//
//   3. 프로그램에서 자정 이후 시간(초)을 계산하고 표시합니다.
//
//   4. 하루 중 남은 시간(초)을 계산하여 표시합니다.
//
//   5. 하루 중 경과된 백분율을 계산하여 표시합니다. 정수로 백분율을 계산할 때 문제가 발생할 수 있으므로 부동 소수점 사용을 고려해 보십시오.
//
//   6. 시간, 분, 초의 값을 현재 시간으로 변경합니다. 그런 다음 코드를 작성하여 이 연습 작업을 시작한 후 경과된 시간을 계산하십시오.
//
//    힌트: 추가 변수를 사용하여 계산 중에 값을 보유할 수 있습니다. 계산에는 사용되지만 표시되지는 않는 변수를 "중간" 변수 또는 "임시" 변수라고도 합니다.
//    제출: 소스 코드 및 실행을 위한 화면 캡처



public class Time {
    public static void main(String[] args) {
        int hour = 14;
        int min = 35;
        int sec = 0;

        int max1DaySec = 86400;

        String ampm = "AM";
        if(hour >= 12){
            ampm = "PM";
        }


        int calc12hour = ((hour-1)%12+1);
        int calcElapsed = (hour*60*60+min*60+sec);
        double rateDay = ((double)calcElapsed/(double)max1DaySec)*100;


        System.out.println("현재 시간은 : " + ampm + " " + calc12hour + "시 " + min + "분 " + sec + "초 ");
        System.out.println("자정 이후 시간(초) : " + calcElapsed + "초 입니다.");
        System.out.println("정오까지 남은 시간(초) : " + (max1DaySec - calcElapsed) + " 입니다" );
        System.out.println("하루 경과 백분율 : " + String.format("%.2f", rateDay)  + "% 입니다.");


    }
}

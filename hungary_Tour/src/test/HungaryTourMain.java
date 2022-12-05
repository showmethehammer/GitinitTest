package test;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class HungaryTourMain {
    public static void main(String[] args){
        int a = 50;
        String 이름 ="";
        int 시간 = 8*60;
        int 피로도 = 100;
        int 자산 = 800000;
        int 관광지 = 0;
        int 시간측정 = 시간/60;
        int 잔액부족 = 0;
        int 호텔_ch = 0;
        int 음식_ch = 0;
        int 백화점_ch = 0;
        int 국회_ch = 0;
        int 어부_ch = 0;
        int 카지노_ch = 0;
        int 성당_ch = 0;
        int 젝팟_1, 젝팟_2, 배팅금액;
        int 홀짝_ch = 0, 홀짝_1;
        double ran = Math.random();
        int 쇼핑_ch = 0;
        int 쇼핑_ran = (int)(ran * 100);
        int 아르바이트 = 0;
        int 쇼핑_할인 = 100;
        int 밥먹기 = 0;
        String 현재위치 = "호텔";
        String 내정보 = "이름" + 이름 + "\n시간 : " + 시간/60%24 +"시 "+ 시간%60 +
                "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
        Scanner sc = new Scanner(System.in);
        /*
         0. 호텔           1. 백화점    2. 국회의사당
         3. 어부의 요새     4. 카지노    5. 이슈트반 대성당
         */
        // 시작 멘트 //
        int 이동수단 = 0;
        System.out.println(" 항가리 여행을 시작하겠습니다. \n");
        System.out.println(" 이름을 입력하세요. ");
        이름 = sc.nextLine();
        System.out.println(이름 + "님 반갑습니다. 헝가리 여행을 시작하겠습니다.");
        System.out.println("\n////////////////////////////////////////////////////////////////////////////\n");
        내정보 = "이름: " + 이름 + "\n현위치: "+ 현재위치 + "\n시간 : " + 시간/60%24 +"시 "+ 시간%60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
        // 호텔 안내 맨트 //
        int 호텔등급 = 0;
        System.out.println(이름 + "님은 현재 헝가리에 도착하여 호텔에서 체크인 중입니다.\n" +
                "현재" + 내정보 + "호텔 방등급을정하세요. 등급에따라 피로회복율이 달라집니다." +
                "\n1. 저급 : 50,000\n2. 중급 : 100,000 \n3. 고급 : 150,000");
        호텔등급 = sc.nextInt();
        // 호텔 등급별 금액 차감 //
        switch (호텔등급){
            case 1:
                System.out.println("저급을 결제하셨습니다.");
                자산 = 자산 - 50000;
                break;
            case 2:
                System.out.println("중급을 결제하셨습니다.");
                자산 = 자산 - 100000;
                break;
            case 3:
                System.out.println("고급을 결제하셨습니다.");
                자산 = 자산 - 150000;
                break;
            default:
                System.out.println("입력을 잘못하여 고급으로 자동 결제합니다.");
                자산 = 자산 - 150000;
                호텔등급 = 3;
                break;
        }
        System.out.println("잔액 : " + 자산);
        System.out.println("\n////////////////////////////////////////////////////////////////////////////\n");


        // 여행시작 //
        // 현위치 파악 //
        int 호텔_go = 0,  백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60;  ;
        String 행선지 =  "가고싶은 위치를 선택하세요\n" + "0.호텔  1.백화점  2.국회의사당  3.어부의요세\n"
                    +  "4.카지노  5.이슈트반대성당 \n";
        if(시간 < (24+12)*60) {
            switch (관광지) {
                case 0:
                    현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                    break;
                case 1:
                    현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                    break;
                case 2:
                    현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                    break;
                case 3:
                    현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                    break;
                case 4:
                    현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                    break;
                case 5:
                    현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                    break;
                default:
                    break;
            }
            // 이동거리 //
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
            System.out.println("////////////////////////////////////////////////////////////////////////////");
            System.out.println(내정보);
            System.out.println("////////////////////////////////////////////////////////////////////////////");
            System.out.println(행선지);
            int 관광지선택 = sc.nextInt();
            System.out.println("////////////////////////////////////////////////////////////////////////////");

            if (관광지 != 관광지선택 && 관광지선택 < 9) {
                String 이동방식 = " 이동수단을 선택하세요\n" + " 1.걷기: 0원\n 2.공용자전거: 1000원 이동시간 1/2 감소.\n 3.택시: 1분에 1000원 이동시간 1/5 감소";
                System.out.println(이동방식);
                int 이동방식선택 = 이동수단;
                이동수단 = sc.nextInt();
                switch (이동수단) {
                    case 1:
                        System.out.println("걸어서 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 0) {
                                    시간 = 시간 + 호텔_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 0) {
                                    시간 = 시간 + 백화점_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 0) {
                                    시간 = 시간 + 국회_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 0) {
                                    시간 = 시간 + 어부_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 0) {
                                    시간 = 시간 + 카지노_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 0) {
                                    시간 = 시간 + 성당_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("자전거로 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 호텔_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 백화점_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 국회_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 어부_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 카지노_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 성당_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("자동차로 이동합니다.");
                        switch (관광지선택) {
                            case 0:
                                if (자산 >= 호텔_go / 5 * 1000) {
                                    시간 = 시간 + (호텔_go / 5);
                                    자산 = 자산 - 1000 * 호텔_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 백화점_go / 5 * 1000) {
                                    시간 = 시간 + (백화점_go / 5);
                                    자산 = 자산 - 1000 * 백화점_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 국회_go / 5 * 1000) {
                                    시간 = 시간 + (국회_go / 5);
                                    자산 = 자산 - 1000 * 국회_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 어부_go / 5 * 1000) {
                                    시간 = 시간 + (어부_go / 5);
                                    자산 = 자산 - 1000 * 어부_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 카지노_go / 5 * 1000) {
                                    시간 = 시간 + (카지노_go / 5);
                                    자산 = 자산 - 1000 * 카지노_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n" + 내정보);
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 성당_go / 5 * 1000) {
                                    시간 = 시간 + (성당_go / 5);
                                    자산 = 자산 - 1000 * 성당_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;

                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                if (이동수단 < 0 | 이동수단 > 3 | 잔액부족 == 1) {
                    System.out.println("걸어서 이동합니다.");
                    잔액부족 = 0;
                    switch (관광지선택) {
                        //호텔_go = 0, 머르기트_go = 30, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 성당_go = 60, 부다성_go = 30 , 클럽_go = 40, 카지노_go = 60,산책_go = 0;
                        case 0:
                            if (자산 >= 0) {
                                시간 = 시간 + 호텔_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 1:
                            if (자산 >= 0) {
                                시간 = 시간 + 백화점_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 2:
                            if (자산 >= 0) {
                                시간 = 시간 + 국회_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 3:
                            if (자산 >= 0) {
                                시간 = 시간 + 어부_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 4:
                            if (자산 >= 0) {
                                시간 = 시간 + 카지노_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 5:
                            if (자산 >= 0) {
                                시간 = 시간 + 성당_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                if (시간측정 != 시간 / 60) {
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                    if(피로도 < 0){
                        피로도 = 0;
                    }
                    시간측정 = 시간 / 60;
                }

                관광지 = 관광지선택;
                switch (관광지) {
                    case 0:
                        현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                        break;
                    case 1:
                        현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                        break;
                    case 2:
                        현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                        break;
                    case 3:
                        현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                        break;
                    case 4:
                        현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                        break;
                    case 5:
                        현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                        break;
                    default:
                        break;
                }
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
                System.out.println(내정보);
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            }
        }
        if(피로도 == 0){
            System.out.println("피로도를 모두 소진하여 호탤로 이동합니다.");
            시간 = 시간 + 5*60; 피로도 = 80;
            관광지 = 0;

            if(자산 < 30000){
                System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                아르바이트 = 30000 - 자산;
                시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                자산 = 5000 - (아르바이트 % 5000);
            }
            현재위치 = "호텔";
            호텔_go = 0;
            백화점_go = 50;
            국회_go = 50;
            어부_go = 20;
            성당_go = 60;
            카지노_go = 60;
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("////////////////////////////////////////////////////////////////////////////");
        }

        if(시간 < (24+12)*60) {

            switch(관광지){
                case 0 :
                    System.out.println("무엇을 하시겠습니까?");
                        System.out.println("호텔\n1.잠을 잔다. 5시간 \n2.먹는다.(1시간) \n그외숫자.그냥 시간보내기");
                        호텔_ch = sc.nextInt();
                        switch(호텔_ch) {
                            case 1:
                                switch (호텔등급) {
                                    case 1:
                                        System.out.println("!!저급호텔 휴식!!");
                                        시간 = 시간 + 60 * 5;
                                        피로도 = 피로도 + 50;
                                        break;
                                    case 2:
                                        System.out.println("!!저급호텔 휴식!!");
                                        시간 = 시간 + 60 * 5;
                                        피로도 = 피로도 + 60;
                                        break;
                                    case 3:
                                        System.out.println("!!저급호텔 휴식!!");
                                        시간 = 시간 + 60 * 5;
                                        피로도 = 피로도 + 70;
                                        break;
                                    default:
                                        break;
                                }
                                시간측정 = 시간 / 60;
                                break;
                            case 2:
                                System.out.println("메뉴를 고르세요.");
                                System.out.println("1.스테이크: 80,000 피로도: +60\n2.스파게티: 15,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 스테이크");
                                음식_ch = sc.nextInt();
                                switch(음식_ch){
                                    case 1:
                                        밥먹기 = 1;
                                        if(자산 >= 80000){
                                            자산 = 자산 - 80000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 60;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 80000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 60;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 80000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 2:
                                        밥먹기 = 1;
                                        if(자산 >= 15000){
                                            자산 = 자산 - 15000;
                                            if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 15000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 15000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 3:
                                        밥먹기 = 1;
                                        if(자산 >= 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                                피로도 = 피로도 + 10;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    default :
                                        밥먹기 = 1;
                                        if(자산 > 80000){
                                            자산 = 자산 - 80000;
                                            if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                                피로도 = 피로도 + 120;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 60;
                                        }
                                        else if(자산 < 80000){
                                            밥먹기 = 0;
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 80000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                }
                                if(피로도 > 100){
                                    피로도 = 100;
                                }

                                break;
                            default:
                                System.out.println("아무것도 안하고 1시간이 갑니다.");
                                시간 = 시간 + 60;
                                피로도 = 피로도 - 15;
                                break;
                        }
                        break;

                case 1:
                    ///////// 백화점 방문 ////////
                    if( 10 <= (시간 / 60 % 24) && 20 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("백화점 \n1.쇼핑 \n2.식사\n그외숫자. 그냥시간보내기");
                        백화점_ch = sc.nextInt();
                        switch (백화점_ch)
                        {
                            case 1:
                                ran = Math.random();
                                쇼핑_ran = ((int) (ran * 100));
                                if (쇼핑_ran > 80) {
                                    System.out.println("지금부터 1시간동안 할인행사 쓰여진금액의 50% 할인됩니다.");
                                    쇼핑_할인 = 5;
                                } else {
                                    쇼핑_할인 = 10;
                                }
                                System.out.println("무엇을 사시겠습니까?\n1.기념품 30,000 \n2.화장품 15,000 \n3.옷_상의 20,000 \n4.옷_하의 30,000 \n5.비타민 5,000 \n그외숫자.구경");
                                쇼핑_ch = sc.nextInt();

                                switch (쇼핑_ch) {
                                    case 1:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 2:
                                        if (자산 >= 15000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 15000 * 쇼핑_할인 / 10;
                                            System.out.println("화장품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 3:
                                        if (자산 >= 20000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 20000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_상의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 4:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_하의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 5:
                                        if (자산 > 5000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 5000 * 쇼핑_할인 / 10;
                                            System.out.println("비타민을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    default:
                                        System.out.println("백화점 구경합니다.");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                break;

                            case 2:
                                //(밥먹기)
                                System.out.println("메뉴를 고르세요.");
                                System.out.println("1.케밥: 8,000 피로도: +30\n2.굴라쉬: 10,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 구경");
                               음식_ch = sc.nextInt();
                                switch(음식_ch){
                                    case 1:
                                        밥먹기 = 1;
                                        if(자산 > 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            밥먹기 = 0;
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 2:
                                        밥먹기 = 1;
                                        if(자산 > 10000){
                                            자산 = 자산 - 10000;
                                            if(23 >= (시간 / 60) % 24 && 5 <= (시간 / 60) % 24) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 10000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 12000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 3:
                                        밥먹기 = 1;
                                        if(자산 >= 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    default : 밥먹기 = 0;
                                        System.out.println("식품코너 구경");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                if(피로도 > 100){
                                    피로도 = 100;
                                }
                                break;
                            default: System.out.println("백화점 구경"); 시간 = 시간 +120;
                            break;

                            }
                    } else { System.out.println("백화점 Close시간 입니다."); }


                            break;

                    ///////////////////////////////////////////////////
                case 2:
                    ///////// 국회 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("국회의사당\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    국회_ch = sc.nextInt();
                    switch (국회_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000 ) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default:  System.out.println("국회의사당 구경"); 시간 = 시간 +120;

                            break;

                    }


                    break;
                case 3:

                    ///////// 어부의요세 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("어부의요세\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    어부_ch = sc.nextInt();
                    switch (어부_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default: System.out.println("어부의 요세 구경"); 시간 = 시간 + 120;

                            break;

                    }
                    break;
                    /////////////////////////////////////////

                case 4:
                    ///////// 카지노 방문 /////////
                    if( 20 <= (시간 / 60 % 24) || 5 >= (시간 / 60 % 24) )
                    {
                       System.out.println("무엇을 하시겠습니까?");
                       System.out.println("카지노\n1.젝팟 \n2.홀짝 \n나머지. 그냥시간보내기");

                           카지노_ch = sc.nextInt();
                       switch (카지노_ch){
                         case 1:
                             System.out.println("배팅 후 젝팟을 돌려 같은숫자가 나오면 배팅금액의 10배, 7로 같은숫자가 나오면 20배를 드립니다.");
                             System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                             배팅금액 = sc.nextInt();
                             if(자산 < 배팅금액){
                                 System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                 배팅금액 = 자산;
                                 자산 = 0;
                             } else {
                                 자산 = 자산 - 배팅금액;
                             }
                             ran = Math.random();
                             젝팟_1 = ((int) (ran * 10));
                             ran = Math.random();
                             젝팟_2 = ((int) (ran * 10));
                             System.out.println("3초 대기");
                         //    Thread.sleep(3000);
                             System.out.println(젝팟_1+""+젝팟_2);
                             if(젝팟_1 == 젝팟_2){
                                if(젝팟_1==7){
                                    System.out.println("!!!!!!!77젝팟 성공!!!!!!");;
                                    자산 = 자산 + 배팅금액*20;
                                    System.out.println("보유금액: "+자산);
                                }
                                else {
                                    System.out.println("!!젝팟 성공!!");
                                    자산 = 자산 + 배팅금액 * 10;
                                    System.out.println("보유금액: " + 자산);
                                }
                            }
                            else{ System.out.println("실패하였습니다.");System.out.println("보유금액: "+자산); }
                            시간 = 시간 + 120;
                            break;
                        case 2:

                            System.out.println("홀짝 맞추기 게임!!! \n 배팅후 홀수인지 짝수인지를 맞추면 배팅금액의 2배를 드립니다.");
                            System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                            배팅금액 = sc.nextInt();
                            if(자산 < 배팅금액){
                                System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                배팅금액 = 자산;
                                자산 = 0;
                            } else {
                                자산 = 자산 - 배팅금액;
                            }
                            ran = Math.random();
                            홀짝_1 = ((int) (ran * 10));
                            System.out.println("홀수 짝수를 선택하세요.\n1.홀수   2.짝수\n 그외 숫자는 기부하는걸로.");
                            홀짝_ch = sc.nextInt();
                            System.out.println("3초대기");
                         //   Thread.sleep(3000);
                            if(홀짝_1 % 2 == 1 & 홀짝_ch == 1) {
                                System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                자산 = 자산 + 배팅금액*2;
                                System.out.println("보유금액: "+자산);
                            }else if(홀짝_1 % 2 == 0 & 홀짝_ch == 2) {
                                System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                자산 = 자산 + 배팅금액*2;
                                System.out.println("보유금액: "+자산);
                            }else { System.out.println("나온숫자: "+홀짝_1+"\n실패하였습니다.\n잔액: "+자산); }
                            시간 = 시간 + 120;
                            break;

                        default:
                            System.out.println("카지노 구경을 합니다.");
                            시간 = 시간 + 120;
                            break;
                       }
                    } else {System.out.println("영업시간이 아닙니다.");}
                    break;
                    ///////////////////
                case 5:
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("이슈트반 대성당\n1.사진을찍는다.(2시간) \n2.식사를한다.(2시간) \n그외숫자.그냥 2시간보내기");
                    성당_ch = sc.nextInt();
                    switch(성당_ch) {
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 50,000 피로도: +50\n2.오리스테이크: 30,000 피로도: +40\n3.햄버거: 8000 피로도: +10\n그외숫자는 안먹는다");
                            음식_ch = sc.nextInt();
                            switch (음식_ch) {
                                case 1:
                                    밥먹기 = 1;
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 50000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 50000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 15000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 15000) {
                                        밥먹기 = 0;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if (자산 >= 8000) {
                                        자산 = 자산 - 8000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 8000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default: 밥먹기 = 0;
                                    System.out.println("그냥 나간다.");
                                    시간 = 시간+120;

                                    break;
                            }
                            break;
                        default: System.out.println("그냥 시간을 보낸다."); 시간= 시간 +120;
                        break;
                    }
                default:
                    break;
            }
            if (피로도 > 100) {
                피로도 = 100;
            }
            if (시간측정 != 시간 / 60) {
                if(밥먹기 == 0){
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                }
                시간측정 = 시간 / 60;
                밥먹기 = 0;
            }
            if (피로도 < 0){
                피로도 = 0;
            }
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");

            if(피로도 == 0){
                System.out.println("피로도를 모두 소진하여 호텔로 이동합니다.");
                시간 = 시간 + 5*60; 피로도 = 80;
                관광지 = 0;
                시간측정 = 시간 / 60;
                if(자산 >= 20000){
                    자산 = 자산 - 20000;
                }
                else if(자산 < 20000){
                    System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                    아르바이트 = 20000 - 자산;
                    시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                    자산 = 5000 - (아르바이트 % 5000);
                }
                현재위치 = "호텔";호텔_go = 0;백화점_go = 50;국회_go = 50;어부_go = 20;성당_go = 60;;카지노_go = 60;
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
                System.out.println(내정보);
                System.out.println("////////////////////////////////////////////////////////////////////////////");
            }


        }



        if(시간 < (24+12)*60) {
            switch (관광지) {
                case 0:
                    현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                    break;
                case 1:
                    현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                    break;
                case 2:
                    현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                    break;
                case 3:
                    현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                    break;
                case 4:
                    현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                    break;
                case 5:
                    현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                    break;
                default:
                    break;
            }
            // 이동거리 //
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
            System.out.println(행선지);
            int 관광지선택 = sc.nextInt();
            System.out.println("////////////////////////////////////////////////////////////////////////////");

            if (관광지 != 관광지선택 && 관광지선택 < 9) {
                String 이동방식 = " 이동수단을 선택하세요\n" + " 1.걷기: 0원\n 2.공용자전거: 1000원 이동시간 1/2 감소.\n 3.택시: 1분에 1000원 이동시간 1/5 감소";
                System.out.println(이동방식);
                int 이동방식선택 = 이동수단;
                이동수단 = sc.nextInt();
                switch (이동수단) {
                    case 1:
                        System.out.println("걸어서 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 0) {
                                    시간 = 시간 + 호텔_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 0) {
                                    시간 = 시간 + 백화점_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 0) {
                                    시간 = 시간 + 국회_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 0) {
                                    시간 = 시간 + 어부_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 0) {
                                    시간 = 시간 + 카지노_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 0) {
                                    시간 = 시간 + 성당_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("자전거로 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 호텔_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 백화점_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 국회_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 어부_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 카지노_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 성당_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("자동차로 이동합니다.");
                        switch (관광지선택) {
                            case 0:
                                if (자산 >= 호텔_go / 5 * 1000) {
                                    시간 = 시간 + (호텔_go / 5);
                                    자산 = 자산 - 1000 * 호텔_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 백화점_go / 5 * 1000) {
                                    시간 = 시간 + (백화점_go / 5);
                                    자산 = 자산 - 1000 * 백화점_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 국회_go / 5 * 1000) {
                                    시간 = 시간 + (국회_go / 5);
                                    자산 = 자산 - 1000 * 국회_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 어부_go / 5 * 1000) {
                                    시간 = 시간 + (어부_go / 5);
                                    자산 = 자산 - 1000 * 어부_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 카지노_go / 5 * 1000) {
                                    시간 = 시간 + (카지노_go / 5);
                                    자산 = 자산 - 1000 * 카지노_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n" + 내정보);
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 성당_go / 5 * 1000) {
                                    시간 = 시간 + (성당_go / 5);
                                    자산 = 자산 - 1000 * 성당_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;

                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                if (이동수단 < 0 | 이동수단 > 3 | 잔액부족 == 1) {
                    System.out.println("걸어서 이동합니다.");
                    잔액부족 = 0;
                    switch (관광지선택) {
                        //호텔_go = 0, 머르기트_go = 30, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 성당_go = 60, 부다성_go = 30 , 클럽_go = 40, 카지노_go = 60,산책_go = 0;
                        case 0:
                            if (자산 >= 0) {
                                시간 = 시간 + 호텔_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 1:
                            if (자산 >= 0) {
                                시간 = 시간 + 백화점_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 2:
                            if (자산 >= 0) {
                                시간 = 시간 + 국회_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 3:
                            if (자산 >= 0) {
                                시간 = 시간 + 어부_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 4:
                            if (자산 >= 0) {
                                시간 = 시간 + 카지노_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 5:
                            if (자산 >= 0) {
                                시간 = 시간 + 성당_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                if (시간측정 != 시간 / 60) {
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                    if(피로도 < 0){
                        피로도 = 0;
                    }
                    시간측정 = 시간 / 60;
                }

                관광지 = 관광지선택;
                switch (관광지) {
                    case 0:
                        현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                        break;
                    case 1:
                        현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                        break;
                    case 2:
                        현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                        break;
                    case 3:
                        현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                        break;
                    case 4:
                        현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                        break;
                    case 5:
                        현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                        break;
                    default:
                        break;
                }
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
                System.out.println(내정보);
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            }
        }
        if(피로도 == 0){
            System.out.println("피로도를 모두 소진하여 호탤로 이동합니다.");
            시간 = 시간 + 5*60; 피로도 = 80;
            관광지 = 0;

            if(자산 < 30000){
                System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                아르바이트 = 30000 - 자산;
                시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                자산 = 5000 - (아르바이트 % 5000);
            }
            현재위치 = "호텔";
            호텔_go = 0;
            백화점_go = 50;
            국회_go = 50;
            어부_go = 20;
            성당_go = 60;
            카지노_go = 60;
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("////////////////////////////////////////////////////////////////////////////");
        }

        if(시간 < (24+12)*60) {

            switch(관광지){
                case 0 :
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("호텔\n1.잠을 잔다. 5시간 \n2.먹는다.(1시간) \n그외숫자.그냥 시간보내기");
                    호텔_ch = sc.nextInt();
                    switch(호텔_ch) {
                        case 1:
                            switch (호텔등급) {
                                case 1:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 50;
                                    break;
                                case 2:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 60;
                                    break;
                                case 3:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 70;
                                    break;
                                default:
                                    break;
                            }
                            시간측정 = 시간 / 60;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 80,000 피로도: +60\n2.스파게티: 15,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 스테이크");
                            음식_ch = sc.nextInt();
                            switch(음식_ch){
                                case 1:
                                    밥먹기 = 1;
                                    if(자산 >= 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if(자산 >= 15000){
                                        자산 = 자산 - 15000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 30;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 15000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 30;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if(자산 >= 8000){
                                        자산 = 자산 - 8000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 10;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 8000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default :
                                    밥먹기 = 1;
                                    if(자산 > 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 120;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 60;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                            }
                            if(피로도 > 100){
                                피로도 = 100;
                            }

                            break;
                        default:
                            System.out.println("아무것도 안하고 1시간이 갑니다.");
                            시간 = 시간 + 60;
                            피로도 = 피로도 - 15;
                            break;
                    }
                    break;

                case 1:
                    ///////// 백화점 방문 ////////
                    if( 10 <= (시간 / 60 % 24) && 20 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("백화점 \n1.쇼핑 \n2.식사\n그외숫자. 그냥시간보내기");
                        백화점_ch = sc.nextInt();
                        switch (백화점_ch)
                        {
                            case 1:
                                ran = Math.random();
                                쇼핑_ran = ((int) (ran * 100));
                                if (쇼핑_ran > 80) {
                                    System.out.println("지금부터 1시간동안 할인행사 쓰여진금액의 50% 할인됩니다.");
                                    쇼핑_할인 = 5;
                                } else {
                                    쇼핑_할인 = 10;
                                }
                                System.out.println("무엇을 사시겠습니까?\n1.기념품 30,000 \n2.화장품 15,000 \n3.옷_상의 20,000 \n4.옷_하의 30,000 \n5.비타민 5,000 \n그외숫자.구경");
                                쇼핑_ch = sc.nextInt();

                                switch (쇼핑_ch) {
                                    case 1:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 2:
                                        if (자산 >= 15000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 15000 * 쇼핑_할인 / 10;
                                            System.out.println("화장품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 3:
                                        if (자산 >= 20000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 20000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_상의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 4:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_하의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 5:
                                        if (자산 > 5000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 5000 * 쇼핑_할인 / 10;
                                            System.out.println("비타민을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    default:
                                        System.out.println("백화점 구경합니다.");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                break;

                            case 2:
                                //(밥먹기)
                                System.out.println("메뉴를 고르세요.");
                                System.out.println("1.케밥: 8,000 피로도: +30\n2.굴라쉬: 10,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 구경");
                                음식_ch = sc.nextInt();
                                switch(음식_ch){
                                    case 1:
                                        밥먹기 = 1;
                                        if(자산 > 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            밥먹기 = 0;
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 2:
                                        밥먹기 = 1;
                                        if(자산 > 10000){
                                            자산 = 자산 - 10000;
                                            if(23 >= (시간 / 60) % 24 && 5 <= (시간 / 60) % 24) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 10000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 12000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 3:
                                        밥먹기 = 1;
                                        if(자산 >= 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    default : 밥먹기 = 0;
                                        System.out.println("식품코너 구경");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                if(피로도 > 100){
                                    피로도 = 100;
                                }
                                break;
                            default: System.out.println("백화점 구경"); 시간 = 시간 +120;
                                break;

                        }
                    } else { System.out.println("백화점 Close시간 입니다."); }


                    break;

                ///////////////////////////////////////////////////
                case 2:
                    ///////// 국회 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("국회의사당\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    국회_ch = sc.nextInt();
                    switch (국회_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000 ) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default:  System.out.println("국회의사당 구경"); 시간 = 시간 +120;

                            break;

                    }


                    break;
                case 3:

                    ///////// 어부의요세 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("어부의요세\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    어부_ch = sc.nextInt();
                    switch (어부_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default: System.out.println("어부의 요세 구경"); 시간 = 시간 + 120;

                            break;

                    }
                    break;
                /////////////////////////////////////////

                case 4:
                    ///////// 카지노 방문 /////////
                    if( 20 <= (시간 / 60 % 24) || 5 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("카지노\n1.젝팟 \n2.홀짝 \n나머지. 그냥시간보내기");

                        카지노_ch = sc.nextInt();
                        switch (카지노_ch){
                            case 1:
                                System.out.println("배팅 후 젝팟을 돌려 같은숫자가 나오면 배팅금액의 10배, 7로 같은숫자가 나오면 20배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                젝팟_1 = ((int) (ran * 10));
                                ran = Math.random();
                                젝팟_2 = ((int) (ran * 10));
                                System.out.println("3초 대기");
                                //    Thread.sleep(3000);
                                System.out.println(젝팟_1+""+젝팟_2);
                                if(젝팟_1 == 젝팟_2){
                                    if(젝팟_1==7){
                                        System.out.println("!!!!!!!77젝팟 성공!!!!!!");;
                                        자산 = 자산 + 배팅금액*20;
                                        System.out.println("보유금액: "+자산);
                                    }
                                    else {
                                        System.out.println("!!젝팟 성공!!");
                                        자산 = 자산 + 배팅금액 * 10;
                                        System.out.println("보유금액: " + 자산);
                                    }
                                }
                                else{ System.out.println("실패하였습니다.");System.out.println("보유금액: "+자산); }
                                시간 = 시간 + 120;
                                break;
                            case 2:

                                System.out.println("홀짝 맞추기 게임!!! \n 배팅후 홀수인지 짝수인지를 맞추면 배팅금액의 2배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                홀짝_1 = ((int) (ran * 10));
                                System.out.println("홀수 짝수를 선택하세요.\n1.홀수   2.짝수\n 그외 숫자는 기부하는걸로.");
                                홀짝_ch = sc.nextInt();
                                System.out.println("3초대기");
                                //   Thread.sleep(3000);
                                if(홀짝_1 % 2 == 1 & 홀짝_ch == 1) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else if(홀짝_1 % 2 == 0 & 홀짝_ch == 2) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else { System.out.println("나온숫자: "+홀짝_1+"\n실패하였습니다.\n잔액: "+자산); }
                                시간 = 시간 + 120;
                                break;

                            default:
                                System.out.println("카지노 구경을 합니다.");
                                시간 = 시간 + 120;
                                break;
                        }
                    } else {System.out.println("영업시간이 아닙니다.");}
                    break;
                ///////////////////
                case 5:
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("이슈트반 대성당\n1.사진을찍는다.(2시간) \n2.식사를한다.(2시간) \n그외숫자.그냥 2시간보내기");
                    성당_ch = sc.nextInt();
                    switch(성당_ch) {
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 50,000 피로도: +50\n2.오리스테이크: 30,000 피로도: +40\n3.햄버거: 8000 피로도: +10\n그외숫자는 안먹는다");
                            음식_ch = sc.nextInt();
                            switch (음식_ch) {
                                case 1:
                                    밥먹기 = 1;
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 50000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 50000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 15000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 15000) {
                                        밥먹기 = 0;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if (자산 >= 8000) {
                                        자산 = 자산 - 8000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 8000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default: 밥먹기 = 0;
                                    System.out.println("그냥 나간다.");
                                    시간 = 시간+120;

                                    break;
                            }
                            break;
                        default: System.out.println("그냥 시간을 보낸다."); 시간= 시간 +120;
                            break;
                    }
                default:
                    break;
            }
            if (피로도 > 100) {
                피로도 = 100;
            }
            if (시간측정 != 시간 / 60) {
                if(밥먹기 == 0){
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                }
                시간측정 = 시간 / 60;
                밥먹기 = 0;
            }
            if (피로도 < 0){
                피로도 = 0;
            }
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");

            if(피로도 == 0){
                System.out.println("피로도를 모두 소진하여 호텔로 이동합니다.");
                시간 = 시간 + 5*60; 피로도 = 80;
                관광지 = 0;
                시간측정 = 시간 / 60;
                if(자산 >= 20000){
                    자산 = 자산 - 20000;
                }
                else if(자산 < 20000){
                    System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                    아르바이트 = 20000 - 자산;
                    시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                    자산 = 5000 - (아르바이트 % 5000);
                }
                현재위치 = "호텔";호텔_go = 0;백화점_go = 50;국회_go = 50;어부_go = 20;성당_go = 60;;카지노_go = 60;
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
                System.out.println(내정보);
                System.out.println("////////////////////////////////////////////////////////////////////////////");
            }


        }



        if(시간 < (24+12)*60) {
            switch (관광지) {
                case 0:
                    현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                    break;
                case 1:
                    현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                    break;
                case 2:
                    현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                    break;
                case 3:
                    현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                    break;
                case 4:
                    현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                    break;
                case 5:
                    현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                    break;
                default:
                    break;
            }
            // 이동거리 //
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
            System.out.println(행선지);
            int 관광지선택 = sc.nextInt();
            System.out.println("////////////////////////////////////////////////////////////////////////////");

            if (관광지 != 관광지선택 && 관광지선택 < 9) {
                String 이동방식 = " 이동수단을 선택하세요\n" + " 1.걷기: 0원\n 2.공용자전거: 1000원 이동시간 1/2 감소.\n 3.택시: 1분에 1000원 이동시간 1/5 감소";
                System.out.println(이동방식);
                int 이동방식선택 = 이동수단;
                이동수단 = sc.nextInt();
                switch (이동수단) {
                    case 1:
                        System.out.println("걸어서 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 0) {
                                    시간 = 시간 + 호텔_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 0) {
                                    시간 = 시간 + 백화점_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 0) {
                                    시간 = 시간 + 국회_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 0) {
                                    시간 = 시간 + 어부_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 0) {
                                    시간 = 시간 + 카지노_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 0) {
                                    시간 = 시간 + 성당_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("자전거로 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 호텔_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 백화점_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 국회_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 어부_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 카지노_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 성당_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("자동차로 이동합니다.");
                        switch (관광지선택) {
                            case 0:
                                if (자산 >= 호텔_go / 5 * 1000) {
                                    시간 = 시간 + (호텔_go / 5);
                                    자산 = 자산 - 1000 * 호텔_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 백화점_go / 5 * 1000) {
                                    시간 = 시간 + (백화점_go / 5);
                                    자산 = 자산 - 1000 * 백화점_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 국회_go / 5 * 1000) {
                                    시간 = 시간 + (국회_go / 5);
                                    자산 = 자산 - 1000 * 국회_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 어부_go / 5 * 1000) {
                                    시간 = 시간 + (어부_go / 5);
                                    자산 = 자산 - 1000 * 어부_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 카지노_go / 5 * 1000) {
                                    시간 = 시간 + (카지노_go / 5);
                                    자산 = 자산 - 1000 * 카지노_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n" + 내정보);
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 성당_go / 5 * 1000) {
                                    시간 = 시간 + (성당_go / 5);
                                    자산 = 자산 - 1000 * 성당_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;

                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                if (이동수단 < 0 | 이동수단 > 3 | 잔액부족 == 1) {
                    System.out.println("걸어서 이동합니다.");
                    잔액부족 = 0;
                    switch (관광지선택) {
                        //호텔_go = 0, 머르기트_go = 30, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 성당_go = 60, 부다성_go = 30 , 클럽_go = 40, 카지노_go = 60,산책_go = 0;
                        case 0:
                            if (자산 >= 0) {
                                시간 = 시간 + 호텔_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 1:
                            if (자산 >= 0) {
                                시간 = 시간 + 백화점_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 2:
                            if (자산 >= 0) {
                                시간 = 시간 + 국회_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 3:
                            if (자산 >= 0) {
                                시간 = 시간 + 어부_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 4:
                            if (자산 >= 0) {
                                시간 = 시간 + 카지노_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 5:
                            if (자산 >= 0) {
                                시간 = 시간 + 성당_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                if (시간측정 != 시간 / 60) {
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                    if(피로도 < 0){
                        피로도 = 0;
                    }
                    시간측정 = 시간 / 60;
                }

                관광지 = 관광지선택;
                switch (관광지) {
                    case 0:
                        현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                        break;
                    case 1:
                        현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                        break;
                    case 2:
                        현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                        break;
                    case 3:
                        현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                        break;
                    case 4:
                        현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                        break;
                    case 5:
                        현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                        break;
                    default:
                        break;
                }
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
                System.out.println(내정보);
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            }
        }
        if(피로도 == 0){
            System.out.println("피로도를 모두 소진하여 호탤로 이동합니다.");
            시간 = 시간 + 5*60; 피로도 = 80;
            관광지 = 0;

            if(자산 < 30000){
                System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                아르바이트 = 30000 - 자산;
                시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                자산 = 5000 - (아르바이트 % 5000);
            }
            현재위치 = "호텔";
            호텔_go = 0;
            백화점_go = 50;
            국회_go = 50;
            어부_go = 20;
            성당_go = 60;
            카지노_go = 60;
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("////////////////////////////////////////////////////////////////////////////");
        }

        if(시간 < (24+12)*60) {

            switch(관광지){
                case 0 :
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("호텔\n1.잠을 잔다. 5시간 \n2.먹는다.(1시간) \n그외숫자.그냥 시간보내기");
                    호텔_ch = sc.nextInt();
                    switch(호텔_ch) {
                        case 1:
                            switch (호텔등급) {
                                case 1:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 50;
                                    break;
                                case 2:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 60;
                                    break;
                                case 3:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 70;
                                    break;
                                default:
                                    break;
                            }
                            시간측정 = 시간 / 60;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 80,000 피로도: +60\n2.스파게티: 15,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 스테이크");
                            음식_ch = sc.nextInt();
                            switch(음식_ch){
                                case 1:
                                    밥먹기 = 1;
                                    if(자산 >= 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if(자산 >= 15000){
                                        자산 = 자산 - 15000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 30;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 15000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 30;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if(자산 >= 8000){
                                        자산 = 자산 - 8000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 10;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 8000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default :
                                    밥먹기 = 1;
                                    if(자산 > 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 120;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 60;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                            }
                            if(피로도 > 100){
                                피로도 = 100;
                            }

                            break;
                        default:
                            System.out.println("아무것도 안하고 1시간이 갑니다.");
                            시간 = 시간 + 60;
                            피로도 = 피로도 - 15;
                            break;
                    }
                    break;

                case 1:
                    ///////// 백화점 방문 ////////
                    if( 10 <= (시간 / 60 % 24) && 20 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("백화점 \n1.쇼핑 \n2.식사\n그외숫자. 그냥시간보내기");
                        백화점_ch = sc.nextInt();
                        switch (백화점_ch)
                        {
                            case 1:
                                ran = Math.random();
                                쇼핑_ran = ((int) (ran * 100));
                                if (쇼핑_ran > 80) {
                                    System.out.println("지금부터 1시간동안 할인행사 쓰여진금액의 50% 할인됩니다.");
                                    쇼핑_할인 = 5;
                                } else {
                                    쇼핑_할인 = 10;
                                }
                                System.out.println("무엇을 사시겠습니까?\n1.기념품 30,000 \n2.화장품 15,000 \n3.옷_상의 20,000 \n4.옷_하의 30,000 \n5.비타민 5,000 \n그외숫자.구경");
                                쇼핑_ch = sc.nextInt();

                                switch (쇼핑_ch) {
                                    case 1:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 2:
                                        if (자산 >= 15000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 15000 * 쇼핑_할인 / 10;
                                            System.out.println("화장품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 3:
                                        if (자산 >= 20000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 20000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_상의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 4:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_하의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 5:
                                        if (자산 > 5000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 5000 * 쇼핑_할인 / 10;
                                            System.out.println("비타민을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    default:
                                        System.out.println("백화점 구경합니다.");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                break;

                            case 2:
                                //(밥먹기)
                                System.out.println("메뉴를 고르세요.");
                                System.out.println("1.케밥: 8,000 피로도: +30\n2.굴라쉬: 10,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 구경");
                                음식_ch = sc.nextInt();
                                switch(음식_ch){
                                    case 1:
                                        밥먹기 = 1;
                                        if(자산 > 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            밥먹기 = 0;
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 2:
                                        밥먹기 = 1;
                                        if(자산 > 10000){
                                            자산 = 자산 - 10000;
                                            if(23 >= (시간 / 60) % 24 && 5 <= (시간 / 60) % 24) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 10000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 12000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 3:
                                        밥먹기 = 1;
                                        if(자산 >= 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    default : 밥먹기 = 0;
                                        System.out.println("식품코너 구경");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                if(피로도 > 100){
                                    피로도 = 100;
                                }
                                break;
                            default: System.out.println("백화점 구경"); 시간 = 시간 +120;
                                break;

                        }
                    } else { System.out.println("백화점 Close시간 입니다."); }


                    break;

                ///////////////////////////////////////////////////
                case 2:
                    ///////// 국회 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("국회의사당\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    국회_ch = sc.nextInt();
                    switch (국회_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000 ) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default:  System.out.println("국회의사당 구경"); 시간 = 시간 +120;

                            break;

                    }


                    break;
                case 3:

                    ///////// 어부의요세 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("어부의요세\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    어부_ch = sc.nextInt();
                    switch (어부_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default: System.out.println("어부의 요세 구경"); 시간 = 시간 + 120;

                            break;

                    }
                    break;
                /////////////////////////////////////////

                case 4:
                    ///////// 카지노 방문 /////////
                    if( 20 <= (시간 / 60 % 24) || 5 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("카지노\n1.젝팟 \n2.홀짝 \n나머지. 그냥시간보내기");

                        카지노_ch = sc.nextInt();
                        switch (카지노_ch){
                            case 1:
                                System.out.println("배팅 후 젝팟을 돌려 같은숫자가 나오면 배팅금액의 10배, 7로 같은숫자가 나오면 20배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                젝팟_1 = ((int) (ran * 10));
                                ran = Math.random();
                                젝팟_2 = ((int) (ran * 10));
                                System.out.println("3초 대기");
                                //    Thread.sleep(3000);
                                System.out.println(젝팟_1+""+젝팟_2);
                                if(젝팟_1 == 젝팟_2){
                                    if(젝팟_1==7){
                                        System.out.println("!!!!!!!77젝팟 성공!!!!!!");;
                                        자산 = 자산 + 배팅금액*20;
                                        System.out.println("보유금액: "+자산);
                                    }
                                    else {
                                        System.out.println("!!젝팟 성공!!");
                                        자산 = 자산 + 배팅금액 * 10;
                                        System.out.println("보유금액: " + 자산);
                                    }
                                }
                                else{ System.out.println("실패하였습니다.");System.out.println("보유금액: "+자산); }
                                시간 = 시간 + 120;
                                break;
                            case 2:

                                System.out.println("홀짝 맞추기 게임!!! \n 배팅후 홀수인지 짝수인지를 맞추면 배팅금액의 2배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                홀짝_1 = ((int) (ran * 10));
                                System.out.println("홀수 짝수를 선택하세요.\n1.홀수   2.짝수\n 그외 숫자는 기부하는걸로.");
                                홀짝_ch = sc.nextInt();
                                System.out.println("3초대기");
                                //   Thread.sleep(3000);
                                if(홀짝_1 % 2 == 1 & 홀짝_ch == 1) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else if(홀짝_1 % 2 == 0 & 홀짝_ch == 2) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else { System.out.println("나온숫자: "+홀짝_1+"\n실패하였습니다.\n잔액: "+자산); }
                                시간 = 시간 + 120;
                                break;

                            default:
                                System.out.println("카지노 구경을 합니다.");
                                시간 = 시간 + 120;
                                break;
                        }
                    } else {System.out.println("영업시간이 아닙니다.");}
                    break;
                ///////////////////
                case 5:
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("이슈트반 대성당\n1.사진을찍는다.(2시간) \n2.식사를한다.(2시간) \n그외숫자.그냥 2시간보내기");
                    성당_ch = sc.nextInt();
                    switch(성당_ch) {
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 50,000 피로도: +50\n2.오리스테이크: 30,000 피로도: +40\n3.햄버거: 8000 피로도: +10\n그외숫자는 안먹는다");
                            음식_ch = sc.nextInt();
                            switch (음식_ch) {
                                case 1:
                                    밥먹기 = 1;
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 50000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 50000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 15000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 15000) {
                                        밥먹기 = 0;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if (자산 >= 8000) {
                                        자산 = 자산 - 8000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 8000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default: 밥먹기 = 0;
                                    System.out.println("그냥 나간다.");
                                    시간 = 시간+120;

                                    break;
                            }
                            break;
                        default: System.out.println("그냥 시간을 보낸다."); 시간= 시간 +120;
                            break;
                    }
                default:
                    break;
            }
            if (피로도 > 100) {
                피로도 = 100;
            }
            if (시간측정 != 시간 / 60) {
                if(밥먹기 == 0){
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                }
                시간측정 = 시간 / 60;
                밥먹기 = 0;
            }
            if (피로도 < 0){
                피로도 = 0;
            }
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");

            if(피로도 == 0){
                System.out.println("피로도를 모두 소진하여 호텔로 이동합니다.");
                시간 = 시간 + 5*60; 피로도 = 80;
                관광지 = 0;
                시간측정 = 시간 / 60;
                if(자산 >= 20000){
                    자산 = 자산 - 20000;
                }
                else if(자산 < 20000){
                    System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                    아르바이트 = 20000 - 자산;
                    시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                    자산 = 5000 - (아르바이트 % 5000);
                }
                현재위치 = "호텔";호텔_go = 0;백화점_go = 50;국회_go = 50;어부_go = 20;성당_go = 60;;카지노_go = 60;
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
                System.out.println(내정보);
                System.out.println("////////////////////////////////////////////////////////////////////////////");
            }


        }

        if(시간 < (24+12)*60) {
            switch (관광지) {
                case 0:
                    현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                    break;
                case 1:
                    현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                    break;
                case 2:
                    현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                    break;
                case 3:
                    현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                    break;
                case 4:
                    현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                    break;
                case 5:
                    현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                    break;
                default:
                    break;
            }
            // 이동거리 //
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
            System.out.println(행선지);
            int 관광지선택 = sc.nextInt();
            System.out.println("////////////////////////////////////////////////////////////////////////////");

            if (관광지 != 관광지선택 && 관광지선택 < 9) {
                String 이동방식 = " 이동수단을 선택하세요\n" + " 1.걷기: 0원\n 2.공용자전거: 1000원 이동시간 1/2 감소.\n 3.택시: 1분에 1000원 이동시간 1/5 감소";
                System.out.println(이동방식);
                int 이동방식선택 = 이동수단;
                이동수단 = sc.nextInt();
                switch (이동수단) {
                    case 1:
                        System.out.println("걸어서 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 0) {
                                    시간 = 시간 + 호텔_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 0) {
                                    시간 = 시간 + 백화점_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 0) {
                                    시간 = 시간 + 국회_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 0) {
                                    시간 = 시간 + 어부_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 0) {
                                    시간 = 시간 + 카지노_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 0) {
                                    시간 = 시간 + 성당_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("자전거로 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 호텔_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 백화점_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 국회_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 어부_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 카지노_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 성당_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("자동차로 이동합니다.");
                        switch (관광지선택) {
                            case 0:
                                if (자산 >= 호텔_go / 5 * 1000) {
                                    시간 = 시간 + (호텔_go / 5);
                                    자산 = 자산 - 1000 * 호텔_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 백화점_go / 5 * 1000) {
                                    시간 = 시간 + (백화점_go / 5);
                                    자산 = 자산 - 1000 * 백화점_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 국회_go / 5 * 1000) {
                                    시간 = 시간 + (국회_go / 5);
                                    자산 = 자산 - 1000 * 국회_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 어부_go / 5 * 1000) {
                                    시간 = 시간 + (어부_go / 5);
                                    자산 = 자산 - 1000 * 어부_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 카지노_go / 5 * 1000) {
                                    시간 = 시간 + (카지노_go / 5);
                                    자산 = 자산 - 1000 * 카지노_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n" + 내정보);
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 성당_go / 5 * 1000) {
                                    시간 = 시간 + (성당_go / 5);
                                    자산 = 자산 - 1000 * 성당_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;

                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                if (이동수단 < 0 | 이동수단 > 3 | 잔액부족 == 1) {
                    System.out.println("걸어서 이동합니다.");
                    잔액부족 = 0;
                    switch (관광지선택) {
                        //호텔_go = 0, 머르기트_go = 30, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 성당_go = 60, 부다성_go = 30 , 클럽_go = 40, 카지노_go = 60,산책_go = 0;
                        case 0:
                            if (자산 >= 0) {
                                시간 = 시간 + 호텔_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 1:
                            if (자산 >= 0) {
                                시간 = 시간 + 백화점_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 2:
                            if (자산 >= 0) {
                                시간 = 시간 + 국회_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 3:
                            if (자산 >= 0) {
                                시간 = 시간 + 어부_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 4:
                            if (자산 >= 0) {
                                시간 = 시간 + 카지노_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 5:
                            if (자산 >= 0) {
                                시간 = 시간 + 성당_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                if (시간측정 != 시간 / 60) {
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                    if(피로도 < 0){
                        피로도 = 0;
                    }
                    시간측정 = 시간 / 60;
                }

                관광지 = 관광지선택;
                switch (관광지) {
                    case 0:
                        현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                        break;
                    case 1:
                        현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                        break;
                    case 2:
                        현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                        break;
                    case 3:
                        현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                        break;
                    case 4:
                        현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                        break;
                    case 5:
                        현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                        break;
                    default:
                        break;
                }
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
                System.out.println(내정보);
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            }
        }
        if(피로도 == 0){
            System.out.println("피로도를 모두 소진하여 호탤로 이동합니다.");
            시간 = 시간 + 5*60; 피로도 = 80;
            관광지 = 0;

            if(자산 < 30000){
                System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                아르바이트 = 30000 - 자산;
                시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                자산 = 5000 - (아르바이트 % 5000);
            }
            현재위치 = "호텔";
            호텔_go = 0;
            백화점_go = 50;
            국회_go = 50;
            어부_go = 20;
            성당_go = 60;
            카지노_go = 60;
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("////////////////////////////////////////////////////////////////////////////");
        }

        if(시간 < (24+12)*60) {

            switch(관광지){
                case 0 :
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("호텔\n1.잠을 잔다. 5시간 \n2.먹는다.(1시간) \n그외숫자.그냥 시간보내기");
                    호텔_ch = sc.nextInt();
                    switch(호텔_ch) {
                        case 1:
                            switch (호텔등급) {
                                case 1:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 50;
                                    break;
                                case 2:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 60;
                                    break;
                                case 3:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 70;
                                    break;
                                default:
                                    break;
                            }
                            시간측정 = 시간 / 60;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 80,000 피로도: +60\n2.스파게티: 15,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 스테이크");
                            음식_ch = sc.nextInt();
                            switch(음식_ch){
                                case 1:
                                    밥먹기 = 1;
                                    if(자산 >= 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if(자산 >= 15000){
                                        자산 = 자산 - 15000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 30;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 15000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 30;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if(자산 >= 8000){
                                        자산 = 자산 - 8000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 10;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 8000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default :
                                    밥먹기 = 1;
                                    if(자산 > 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 120;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 60;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                            }
                            if(피로도 > 100){
                                피로도 = 100;
                            }

                            break;
                        default:
                            System.out.println("아무것도 안하고 1시간이 갑니다.");
                            시간 = 시간 + 60;
                            피로도 = 피로도 - 15;
                            break;
                    }
                    break;

                case 1:
                    ///////// 백화점 방문 ////////
                    if( 10 <= (시간 / 60 % 24) && 20 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("백화점 \n1.쇼핑 \n2.식사\n그외숫자. 그냥시간보내기");
                        백화점_ch = sc.nextInt();
                        switch (백화점_ch)
                        {
                            case 1:
                                ran = Math.random();
                                쇼핑_ran = ((int) (ran * 100));
                                if (쇼핑_ran > 80) {
                                    System.out.println("지금부터 1시간동안 할인행사 쓰여진금액의 50% 할인됩니다.");
                                    쇼핑_할인 = 5;
                                } else {
                                    쇼핑_할인 = 10;
                                }
                                System.out.println("무엇을 사시겠습니까?\n1.기념품 30,000 \n2.화장품 15,000 \n3.옷_상의 20,000 \n4.옷_하의 30,000 \n5.비타민 5,000 \n그외숫자.구경");
                                쇼핑_ch = sc.nextInt();

                                switch (쇼핑_ch) {
                                    case 1:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 2:
                                        if (자산 >= 15000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 15000 * 쇼핑_할인 / 10;
                                            System.out.println("화장품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 3:
                                        if (자산 >= 20000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 20000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_상의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 4:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_하의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 5:
                                        if (자산 > 5000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 5000 * 쇼핑_할인 / 10;
                                            System.out.println("비타민을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    default:
                                        System.out.println("백화점 구경합니다.");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                break;

                            case 2:
                                //(밥먹기)
                                System.out.println("메뉴를 고르세요.");
                                System.out.println("1.케밥: 8,000 피로도: +30\n2.굴라쉬: 10,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 구경");
                                음식_ch = sc.nextInt();
                                switch(음식_ch){
                                    case 1:
                                        밥먹기 = 1;
                                        if(자산 > 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            밥먹기 = 0;
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 2:
                                        밥먹기 = 1;
                                        if(자산 > 10000){
                                            자산 = 자산 - 10000;
                                            if(23 >= (시간 / 60) % 24 && 5 <= (시간 / 60) % 24) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 10000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 12000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 3:
                                        밥먹기 = 1;
                                        if(자산 >= 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    default : 밥먹기 = 0;
                                        System.out.println("식품코너 구경");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                if(피로도 > 100){
                                    피로도 = 100;
                                }
                                break;
                            default: System.out.println("백화점 구경"); 시간 = 시간 +120;
                                break;

                        }
                    } else { System.out.println("백화점 Close시간 입니다."); }


                    break;

                ///////////////////////////////////////////////////
                case 2:
                    ///////// 국회 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("국회의사당\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    국회_ch = sc.nextInt();
                    switch (국회_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000 ) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default:  System.out.println("국회의사당 구경"); 시간 = 시간 +120;

                            break;

                    }


                    break;
                case 3:

                    ///////// 어부의요세 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("어부의요세\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    어부_ch = sc.nextInt();
                    switch (어부_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default: System.out.println("어부의 요세 구경"); 시간 = 시간 + 120;

                            break;

                    }
                    break;
                /////////////////////////////////////////

                case 4:
                    ///////// 카지노 방문 /////////
                    if( 20 <= (시간 / 60 % 24) || 5 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("카지노\n1.젝팟 \n2.홀짝 \n나머지. 그냥시간보내기");

                        카지노_ch = sc.nextInt();
                        switch (카지노_ch){
                            case 1:
                                System.out.println("배팅 후 젝팟을 돌려 같은숫자가 나오면 배팅금액의 10배, 7로 같은숫자가 나오면 20배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                젝팟_1 = ((int) (ran * 10));
                                ran = Math.random();
                                젝팟_2 = ((int) (ran * 10));
                                System.out.println("3초 대기");
                                //    Thread.sleep(3000);
                                System.out.println(젝팟_1+""+젝팟_2);
                                if(젝팟_1 == 젝팟_2){
                                    if(젝팟_1==7){
                                        System.out.println("!!!!!!!77젝팟 성공!!!!!!");;
                                        자산 = 자산 + 배팅금액*20;
                                        System.out.println("보유금액: "+자산);
                                    }
                                    else {
                                        System.out.println("!!젝팟 성공!!");
                                        자산 = 자산 + 배팅금액 * 10;
                                        System.out.println("보유금액: " + 자산);
                                    }
                                }
                                else{ System.out.println("실패하였습니다.");System.out.println("보유금액: "+자산); }
                                시간 = 시간 + 120;
                                break;
                            case 2:

                                System.out.println("홀짝 맞추기 게임!!! \n 배팅후 홀수인지 짝수인지를 맞추면 배팅금액의 2배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                홀짝_1 = ((int) (ran * 10));
                                System.out.println("홀수 짝수를 선택하세요.\n1.홀수   2.짝수\n 그외 숫자는 기부하는걸로.");
                                홀짝_ch = sc.nextInt();
                                System.out.println("3초대기");
                                //   Thread.sleep(3000);
                                if(홀짝_1 % 2 == 1 & 홀짝_ch == 1) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else if(홀짝_1 % 2 == 0 & 홀짝_ch == 2) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else { System.out.println("나온숫자: "+홀짝_1+"\n실패하였습니다.\n잔액: "+자산); }
                                시간 = 시간 + 120;
                                break;

                            default:
                                System.out.println("카지노 구경을 합니다.");
                                시간 = 시간 + 120;
                                break;
                        }
                    } else {System.out.println("영업시간이 아닙니다.");}
                    break;
                ///////////////////
                case 5:
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("이슈트반 대성당\n1.사진을찍는다.(2시간) \n2.식사를한다.(2시간) \n그외숫자.그냥 2시간보내기");
                    성당_ch = sc.nextInt();
                    switch(성당_ch) {
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 50,000 피로도: +50\n2.오리스테이크: 30,000 피로도: +40\n3.햄버거: 8000 피로도: +10\n그외숫자는 안먹는다");
                            음식_ch = sc.nextInt();
                            switch (음식_ch) {
                                case 1:
                                    밥먹기 = 1;
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 50000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 50000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 15000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 15000) {
                                        밥먹기 = 0;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if (자산 >= 8000) {
                                        자산 = 자산 - 8000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 8000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default: 밥먹기 = 0;
                                    System.out.println("그냥 나간다.");
                                    시간 = 시간+120;

                                    break;
                            }
                            break;
                        default: System.out.println("그냥 시간을 보낸다."); 시간= 시간 +120;
                            break;
                    }
                default:
                    break;
            }
            if (피로도 > 100) {
                피로도 = 100;
            }
            if (시간측정 != 시간 / 60) {
                if(밥먹기 == 0){
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                }
                시간측정 = 시간 / 60;
                밥먹기 = 0;
            }
            if (피로도 < 0){
                피로도 = 0;
            }
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");

            if(피로도 == 0){
                System.out.println("피로도를 모두 소진하여 호텔로 이동합니다.");
                시간 = 시간 + 5*60; 피로도 = 80;
                관광지 = 0;
                시간측정 = 시간 / 60;
                if(자산 >= 20000){
                    자산 = 자산 - 20000;
                }
                else if(자산 < 20000){
                    System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                    아르바이트 = 20000 - 자산;
                    시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                    자산 = 5000 - (아르바이트 % 5000);
                }
                현재위치 = "호텔";호텔_go = 0;백화점_go = 50;국회_go = 50;어부_go = 20;성당_go = 60;;카지노_go = 60;
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
                System.out.println(내정보);
                System.out.println("////////////////////////////////////////////////////////////////////////////");
            }


        }


        if(시간 < (24+12)*60) {
            switch (관광지) {
                case 0:
                    현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                    break;
                case 1:
                    현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                    break;
                case 2:
                    현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                    break;
                case 3:
                    현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                    break;
                case 4:
                    현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                    break;
                case 5:
                    현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                    break;
                default:
                    break;
            }
            // 이동거리 //
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
            System.out.println(행선지);
            int 관광지선택 = sc.nextInt();
            System.out.println("////////////////////////////////////////////////////////////////////////////");

            if (관광지 != 관광지선택 && 관광지선택 < 9) {
                String 이동방식 = " 이동수단을 선택하세요\n" + " 1.걷기: 0원\n 2.공용자전거: 1000원 이동시간 1/2 감소.\n 3.택시: 1분에 1000원 이동시간 1/5 감소";
                System.out.println(이동방식);
                int 이동방식선택 = 이동수단;
                이동수단 = sc.nextInt();
                switch (이동수단) {
                    case 1:
                        System.out.println("걸어서 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 0) {
                                    시간 = 시간 + 호텔_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 0) {
                                    시간 = 시간 + 백화점_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 0) {
                                    시간 = 시간 + 국회_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 0) {
                                    시간 = 시간 + 어부_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 0) {
                                    시간 = 시간 + 카지노_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 0) {
                                    시간 = 시간 + 성당_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("자전거로 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 호텔_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 백화점_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 국회_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 어부_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 카지노_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 성당_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("자동차로 이동합니다.");
                        switch (관광지선택) {
                            case 0:
                                if (자산 >= 호텔_go / 5 * 1000) {
                                    시간 = 시간 + (호텔_go / 5);
                                    자산 = 자산 - 1000 * 호텔_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 백화점_go / 5 * 1000) {
                                    시간 = 시간 + (백화점_go / 5);
                                    자산 = 자산 - 1000 * 백화점_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 국회_go / 5 * 1000) {
                                    시간 = 시간 + (국회_go / 5);
                                    자산 = 자산 - 1000 * 국회_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 어부_go / 5 * 1000) {
                                    시간 = 시간 + (어부_go / 5);
                                    자산 = 자산 - 1000 * 어부_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 카지노_go / 5 * 1000) {
                                    시간 = 시간 + (카지노_go / 5);
                                    자산 = 자산 - 1000 * 카지노_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n" + 내정보);
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 성당_go / 5 * 1000) {
                                    시간 = 시간 + (성당_go / 5);
                                    자산 = 자산 - 1000 * 성당_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;

                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                if (이동수단 < 0 | 이동수단 > 3 | 잔액부족 == 1) {
                    System.out.println("걸어서 이동합니다.");
                    잔액부족 = 0;
                    switch (관광지선택) {
                        //호텔_go = 0, 머르기트_go = 30, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 성당_go = 60, 부다성_go = 30 , 클럽_go = 40, 카지노_go = 60,산책_go = 0;
                        case 0:
                            if (자산 >= 0) {
                                시간 = 시간 + 호텔_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 1:
                            if (자산 >= 0) {
                                시간 = 시간 + 백화점_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 2:
                            if (자산 >= 0) {
                                시간 = 시간 + 국회_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 3:
                            if (자산 >= 0) {
                                시간 = 시간 + 어부_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 4:
                            if (자산 >= 0) {
                                시간 = 시간 + 카지노_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 5:
                            if (자산 >= 0) {
                                시간 = 시간 + 성당_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                if (시간측정 != 시간 / 60) {
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                    if(피로도 < 0){
                        피로도 = 0;
                    }
                    시간측정 = 시간 / 60;
                }

                관광지 = 관광지선택;
                switch (관광지) {
                    case 0:
                        현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                        break;
                    case 1:
                        현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                        break;
                    case 2:
                        현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                        break;
                    case 3:
                        현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                        break;
                    case 4:
                        현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                        break;
                    case 5:
                        현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                        break;
                    default:
                        break;
                }
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
                System.out.println(내정보);
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            }
        }
        if(피로도 == 0){
            System.out.println("피로도를 모두 소진하여 호탤로 이동합니다.");
            시간 = 시간 + 5*60; 피로도 = 80;
            관광지 = 0;

            if(자산 < 30000){
                System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                아르바이트 = 30000 - 자산;
                시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                자산 = 5000 - (아르바이트 % 5000);
            }
            현재위치 = "호텔";
            호텔_go = 0;
            백화점_go = 50;
            국회_go = 50;
            어부_go = 20;
            성당_go = 60;
            카지노_go = 60;
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("////////////////////////////////////////////////////////////////////////////");
        }

        if(시간 < (24+12)*60) {

            switch(관광지){
                case 0 :
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("호텔\n1.잠을 잔다. 5시간 \n2.먹는다.(1시간) \n그외숫자.그냥 시간보내기");
                    호텔_ch = sc.nextInt();
                    switch(호텔_ch) {
                        case 1:
                            switch (호텔등급) {
                                case 1:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 50;
                                    break;
                                case 2:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 60;
                                    break;
                                case 3:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 70;
                                    break;
                                default:
                                    break;
                            }
                            시간측정 = 시간 / 60;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 80,000 피로도: +60\n2.스파게티: 15,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 스테이크");
                            음식_ch = sc.nextInt();
                            switch(음식_ch){
                                case 1:
                                    밥먹기 = 1;
                                    if(자산 >= 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if(자산 >= 15000){
                                        자산 = 자산 - 15000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 30;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 15000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 30;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if(자산 >= 8000){
                                        자산 = 자산 - 8000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 10;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 8000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default :
                                    밥먹기 = 1;
                                    if(자산 > 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 120;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 60;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                            }
                            if(피로도 > 100){
                                피로도 = 100;
                            }

                            break;
                        default:
                            System.out.println("아무것도 안하고 1시간이 갑니다.");
                            시간 = 시간 + 60;
                            피로도 = 피로도 - 15;
                            break;
                    }
                    break;

                case 1:
                    ///////// 백화점 방문 ////////
                    if( 10 <= (시간 / 60 % 24) && 20 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("백화점 \n1.쇼핑 \n2.식사\n그외숫자. 그냥시간보내기");
                        백화점_ch = sc.nextInt();
                        switch (백화점_ch)
                        {
                            case 1:
                                ran = Math.random();
                                쇼핑_ran = ((int) (ran * 100));
                                if (쇼핑_ran > 80) {
                                    System.out.println("지금부터 1시간동안 할인행사 쓰여진금액의 50% 할인됩니다.");
                                    쇼핑_할인 = 5;
                                } else {
                                    쇼핑_할인 = 10;
                                }
                                System.out.println("무엇을 사시겠습니까?\n1.기념품 30,000 \n2.화장품 15,000 \n3.옷_상의 20,000 \n4.옷_하의 30,000 \n5.비타민 5,000 \n그외숫자.구경");
                                쇼핑_ch = sc.nextInt();

                                switch (쇼핑_ch) {
                                    case 1:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 2:
                                        if (자산 >= 15000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 15000 * 쇼핑_할인 / 10;
                                            System.out.println("화장품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 3:
                                        if (자산 >= 20000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 20000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_상의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 4:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_하의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 5:
                                        if (자산 > 5000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 5000 * 쇼핑_할인 / 10;
                                            System.out.println("비타민을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    default:
                                        System.out.println("백화점 구경합니다.");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                break;

                            case 2:
                                //(밥먹기)
                                System.out.println("메뉴를 고르세요.");
                                System.out.println("1.케밥: 8,000 피로도: +30\n2.굴라쉬: 10,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 구경");
                                음식_ch = sc.nextInt();
                                switch(음식_ch){
                                    case 1:
                                        밥먹기 = 1;
                                        if(자산 > 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            밥먹기 = 0;
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 2:
                                        밥먹기 = 1;
                                        if(자산 > 10000){
                                            자산 = 자산 - 10000;
                                            if(23 >= (시간 / 60) % 24 && 5 <= (시간 / 60) % 24) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 10000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 12000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 3:
                                        밥먹기 = 1;
                                        if(자산 >= 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    default : 밥먹기 = 0;
                                        System.out.println("식품코너 구경");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                if(피로도 > 100){
                                    피로도 = 100;
                                }
                                break;
                            default: System.out.println("백화점 구경"); 시간 = 시간 +120;
                                break;

                        }
                    } else { System.out.println("백화점 Close시간 입니다."); }


                    break;

                ///////////////////////////////////////////////////
                case 2:
                    ///////// 국회 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("국회의사당\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    국회_ch = sc.nextInt();
                    switch (국회_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000 ) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default:  System.out.println("국회의사당 구경"); 시간 = 시간 +120;

                            break;

                    }


                    break;
                case 3:

                    ///////// 어부의요세 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("어부의요세\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    어부_ch = sc.nextInt();
                    switch (어부_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default: System.out.println("어부의 요세 구경"); 시간 = 시간 + 120;

                            break;

                    }
                    break;
                /////////////////////////////////////////

                case 4:
                    ///////// 카지노 방문 /////////
                    if( 20 <= (시간 / 60 % 24) || 5 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("카지노\n1.젝팟 \n2.홀짝 \n나머지. 그냥시간보내기");

                        카지노_ch = sc.nextInt();
                        switch (카지노_ch){
                            case 1:
                                System.out.println("배팅 후 젝팟을 돌려 같은숫자가 나오면 배팅금액의 10배, 7로 같은숫자가 나오면 20배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                젝팟_1 = ((int) (ran * 10));
                                ran = Math.random();
                                젝팟_2 = ((int) (ran * 10));
                                System.out.println("3초 대기");
                                //    Thread.sleep(3000);
                                System.out.println(젝팟_1+""+젝팟_2);
                                if(젝팟_1 == 젝팟_2){
                                    if(젝팟_1==7){
                                        System.out.println("!!!!!!!77젝팟 성공!!!!!!");;
                                        자산 = 자산 + 배팅금액*20;
                                        System.out.println("보유금액: "+자산);
                                    }
                                    else {
                                        System.out.println("!!젝팟 성공!!");
                                        자산 = 자산 + 배팅금액 * 10;
                                        System.out.println("보유금액: " + 자산);
                                    }
                                }
                                else{ System.out.println("실패하였습니다.");System.out.println("보유금액: "+자산); }
                                시간 = 시간 + 120;
                                break;
                            case 2:

                                System.out.println("홀짝 맞추기 게임!!! \n 배팅후 홀수인지 짝수인지를 맞추면 배팅금액의 2배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                홀짝_1 = ((int) (ran * 10));
                                System.out.println("홀수 짝수를 선택하세요.\n1.홀수   2.짝수\n 그외 숫자는 기부하는걸로.");
                                홀짝_ch = sc.nextInt();
                                System.out.println("3초대기");
                                //   Thread.sleep(3000);
                                if(홀짝_1 % 2 == 1 & 홀짝_ch == 1) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else if(홀짝_1 % 2 == 0 & 홀짝_ch == 2) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else { System.out.println("나온숫자: "+홀짝_1+"\n실패하였습니다.\n잔액: "+자산); }
                                시간 = 시간 + 120;
                                break;

                            default:
                                System.out.println("카지노 구경을 합니다.");
                                시간 = 시간 + 120;
                                break;
                        }
                    } else {System.out.println("영업시간이 아닙니다.");}
                    break;
                ///////////////////
                case 5:
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("이슈트반 대성당\n1.사진을찍는다.(2시간) \n2.식사를한다.(2시간) \n그외숫자.그냥 2시간보내기");
                    성당_ch = sc.nextInt();
                    switch(성당_ch) {
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 50,000 피로도: +50\n2.오리스테이크: 30,000 피로도: +40\n3.햄버거: 8000 피로도: +10\n그외숫자는 안먹는다");
                            음식_ch = sc.nextInt();
                            switch (음식_ch) {
                                case 1:
                                    밥먹기 = 1;
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 50000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 50000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 15000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 15000) {
                                        밥먹기 = 0;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if (자산 >= 8000) {
                                        자산 = 자산 - 8000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 8000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default: 밥먹기 = 0;
                                    System.out.println("그냥 나간다.");
                                    시간 = 시간+120;

                                    break;
                            }
                            break;
                        default: System.out.println("그냥 시간을 보낸다."); 시간= 시간 +120;
                            break;
                    }
                default:
                    break;
            }
            if (피로도 > 100) {
                피로도 = 100;
            }
            if (시간측정 != 시간 / 60) {
                if(밥먹기 == 0){
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                }
                시간측정 = 시간 / 60;
                밥먹기 = 0;
            }
            if (피로도 < 0){
                피로도 = 0;
            }
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");

            if(피로도 == 0){
                System.out.println("피로도를 모두 소진하여 호텔로 이동합니다.");
                시간 = 시간 + 5*60; 피로도 = 80;
                관광지 = 0;
                시간측정 = 시간 / 60;
                if(자산 >= 20000){
                    자산 = 자산 - 20000;
                }
                else if(자산 < 20000){
                    System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                    아르바이트 = 20000 - 자산;
                    시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                    자산 = 5000 - (아르바이트 % 5000);
                }
                현재위치 = "호텔";호텔_go = 0;백화점_go = 50;국회_go = 50;어부_go = 20;성당_go = 60;;카지노_go = 60;
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
                System.out.println(내정보);
                System.out.println("////////////////////////////////////////////////////////////////////////////");
            }


        }


        if(시간 < (24+12)*60) {
            switch (관광지) {
                case 0:
                    현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                    break;
                case 1:
                    현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                    break;
                case 2:
                    현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                    break;
                case 3:
                    현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                    break;
                case 4:
                    현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                    break;
                case 5:
                    현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                    break;
                default:
                    break;
            }
            // 이동거리 //
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
            System.out.println(행선지);
            int 관광지선택 = sc.nextInt();
            System.out.println("////////////////////////////////////////////////////////////////////////////");

            if (관광지 != 관광지선택 && 관광지선택 < 9) {
                String 이동방식 = " 이동수단을 선택하세요\n" + " 1.걷기: 0원\n 2.공용자전거: 1000원 이동시간 1/2 감소.\n 3.택시: 1분에 1000원 이동시간 1/5 감소";
                System.out.println(이동방식);
                int 이동방식선택 = 이동수단;
                이동수단 = sc.nextInt();
                switch (이동수단) {
                    case 1:
                        System.out.println("걸어서 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 0) {
                                    시간 = 시간 + 호텔_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 0) {
                                    시간 = 시간 + 백화점_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 0) {
                                    시간 = 시간 + 국회_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 0) {
                                    시간 = 시간 + 어부_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 0) {
                                    시간 = 시간 + 카지노_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 0) {
                                    시간 = 시간 + 성당_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("자전거로 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 호텔_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 백화점_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 국회_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 어부_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 카지노_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 성당_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("자동차로 이동합니다.");
                        switch (관광지선택) {
                            case 0:
                                if (자산 >= 호텔_go / 5 * 1000) {
                                    시간 = 시간 + (호텔_go / 5);
                                    자산 = 자산 - 1000 * 호텔_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 백화점_go / 5 * 1000) {
                                    시간 = 시간 + (백화점_go / 5);
                                    자산 = 자산 - 1000 * 백화점_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 국회_go / 5 * 1000) {
                                    시간 = 시간 + (국회_go / 5);
                                    자산 = 자산 - 1000 * 국회_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 어부_go / 5 * 1000) {
                                    시간 = 시간 + (어부_go / 5);
                                    자산 = 자산 - 1000 * 어부_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 카지노_go / 5 * 1000) {
                                    시간 = 시간 + (카지노_go / 5);
                                    자산 = 자산 - 1000 * 카지노_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n" + 내정보);
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 성당_go / 5 * 1000) {
                                    시간 = 시간 + (성당_go / 5);
                                    자산 = 자산 - 1000 * 성당_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;

                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                if (이동수단 < 0 | 이동수단 > 3 | 잔액부족 == 1) {
                    System.out.println("걸어서 이동합니다.");
                    잔액부족 = 0;
                    switch (관광지선택) {
                        //호텔_go = 0, 머르기트_go = 30, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 성당_go = 60, 부다성_go = 30 , 클럽_go = 40, 카지노_go = 60,산책_go = 0;
                        case 0:
                            if (자산 >= 0) {
                                시간 = 시간 + 호텔_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 1:
                            if (자산 >= 0) {
                                시간 = 시간 + 백화점_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 2:
                            if (자산 >= 0) {
                                시간 = 시간 + 국회_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 3:
                            if (자산 >= 0) {
                                시간 = 시간 + 어부_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 4:
                            if (자산 >= 0) {
                                시간 = 시간 + 카지노_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 5:
                            if (자산 >= 0) {
                                시간 = 시간 + 성당_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                if (시간측정 != 시간 / 60) {
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                    if(피로도 < 0){
                        피로도 = 0;
                    }
                    시간측정 = 시간 / 60;
                }

                관광지 = 관광지선택;
                switch (관광지) {
                    case 0:
                        현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                        break;
                    case 1:
                        현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                        break;
                    case 2:
                        현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                        break;
                    case 3:
                        현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                        break;
                    case 4:
                        현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                        break;
                    case 5:
                        현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                        break;
                    default:
                        break;
                }
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
                System.out.println(내정보);
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            }
        }
        if(피로도 == 0){
            System.out.println("피로도를 모두 소진하여 호탤로 이동합니다.");
            시간 = 시간 + 5*60; 피로도 = 80;
            관광지 = 0;

            if(자산 < 30000){
                System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                아르바이트 = 30000 - 자산;
                시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                자산 = 5000 - (아르바이트 % 5000);
            }
            현재위치 = "호텔";
            호텔_go = 0;
            백화점_go = 50;
            국회_go = 50;
            어부_go = 20;
            성당_go = 60;
            카지노_go = 60;
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("////////////////////////////////////////////////////////////////////////////");
        }

        if(시간 < (24+12)*60) {

            switch(관광지){
                case 0 :
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("호텔\n1.잠을 잔다. 5시간 \n2.먹는다.(1시간) \n그외숫자.그냥 시간보내기");
                    호텔_ch = sc.nextInt();
                    switch(호텔_ch) {
                        case 1:
                            switch (호텔등급) {
                                case 1:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 50;
                                    break;
                                case 2:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 60;
                                    break;
                                case 3:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 70;
                                    break;
                                default:
                                    break;
                            }
                            시간측정 = 시간 / 60;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 80,000 피로도: +60\n2.스파게티: 15,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 스테이크");
                            음식_ch = sc.nextInt();
                            switch(음식_ch){
                                case 1:
                                    밥먹기 = 1;
                                    if(자산 >= 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if(자산 >= 15000){
                                        자산 = 자산 - 15000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 30;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 15000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 30;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if(자산 >= 8000){
                                        자산 = 자산 - 8000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 10;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 8000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default :
                                    밥먹기 = 1;
                                    if(자산 > 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 120;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 60;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                            }
                            if(피로도 > 100){
                                피로도 = 100;
                            }

                            break;
                        default:
                            System.out.println("아무것도 안하고 1시간이 갑니다.");
                            시간 = 시간 + 60;
                            피로도 = 피로도 - 15;
                            break;
                    }
                    break;

                case 1:
                    ///////// 백화점 방문 ////////
                    if( 10 <= (시간 / 60 % 24) && 20 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("백화점 \n1.쇼핑 \n2.식사\n그외숫자. 그냥시간보내기");
                        백화점_ch = sc.nextInt();
                        switch (백화점_ch)
                        {
                            case 1:
                                ran = Math.random();
                                쇼핑_ran = ((int) (ran * 100));
                                if (쇼핑_ran > 80) {
                                    System.out.println("지금부터 1시간동안 할인행사 쓰여진금액의 50% 할인됩니다.");
                                    쇼핑_할인 = 5;
                                } else {
                                    쇼핑_할인 = 10;
                                }
                                System.out.println("무엇을 사시겠습니까?\n1.기념품 30,000 \n2.화장품 15,000 \n3.옷_상의 20,000 \n4.옷_하의 30,000 \n5.비타민 5,000 \n그외숫자.구경");
                                쇼핑_ch = sc.nextInt();

                                switch (쇼핑_ch) {
                                    case 1:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 2:
                                        if (자산 >= 15000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 15000 * 쇼핑_할인 / 10;
                                            System.out.println("화장품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 3:
                                        if (자산 >= 20000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 20000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_상의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 4:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_하의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 5:
                                        if (자산 > 5000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 5000 * 쇼핑_할인 / 10;
                                            System.out.println("비타민을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    default:
                                        System.out.println("백화점 구경합니다.");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                break;

                            case 2:
                                //(밥먹기)
                                System.out.println("메뉴를 고르세요.");
                                System.out.println("1.케밥: 8,000 피로도: +30\n2.굴라쉬: 10,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 구경");
                                음식_ch = sc.nextInt();
                                switch(음식_ch){
                                    case 1:
                                        밥먹기 = 1;
                                        if(자산 > 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            밥먹기 = 0;
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 2:
                                        밥먹기 = 1;
                                        if(자산 > 10000){
                                            자산 = 자산 - 10000;
                                            if(23 >= (시간 / 60) % 24 && 5 <= (시간 / 60) % 24) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 10000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 12000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 3:
                                        밥먹기 = 1;
                                        if(자산 >= 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    default : 밥먹기 = 0;
                                        System.out.println("식품코너 구경");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                if(피로도 > 100){
                                    피로도 = 100;
                                }
                                break;
                            default: System.out.println("백화점 구경"); 시간 = 시간 +120;
                                break;

                        }
                    } else { System.out.println("백화점 Close시간 입니다."); }


                    break;

                ///////////////////////////////////////////////////
                case 2:
                    ///////// 국회 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("국회의사당\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    국회_ch = sc.nextInt();
                    switch (국회_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000 ) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default:  System.out.println("국회의사당 구경"); 시간 = 시간 +120;

                            break;

                    }


                    break;
                case 3:

                    ///////// 어부의요세 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("어부의요세\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    어부_ch = sc.nextInt();
                    switch (어부_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default: System.out.println("어부의 요세 구경"); 시간 = 시간 + 120;

                            break;

                    }
                    break;
                /////////////////////////////////////////

                case 4:
                    ///////// 카지노 방문 /////////
                    if( 20 <= (시간 / 60 % 24) || 5 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("카지노\n1.젝팟 \n2.홀짝 \n나머지. 그냥시간보내기");

                        카지노_ch = sc.nextInt();
                        switch (카지노_ch){
                            case 1:
                                System.out.println("배팅 후 젝팟을 돌려 같은숫자가 나오면 배팅금액의 10배, 7로 같은숫자가 나오면 20배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                젝팟_1 = ((int) (ran * 10));
                                ran = Math.random();
                                젝팟_2 = ((int) (ran * 10));
                                System.out.println("3초 대기");
                                //    Thread.sleep(3000);
                                System.out.println(젝팟_1+""+젝팟_2);
                                if(젝팟_1 == 젝팟_2){
                                    if(젝팟_1==7){
                                        System.out.println("!!!!!!!77젝팟 성공!!!!!!");;
                                        자산 = 자산 + 배팅금액*20;
                                        System.out.println("보유금액: "+자산);
                                    }
                                    else {
                                        System.out.println("!!젝팟 성공!!");
                                        자산 = 자산 + 배팅금액 * 10;
                                        System.out.println("보유금액: " + 자산);
                                    }
                                }
                                else{ System.out.println("실패하였습니다.");System.out.println("보유금액: "+자산); }
                                시간 = 시간 + 120;
                                break;
                            case 2:

                                System.out.println("홀짝 맞추기 게임!!! \n 배팅후 홀수인지 짝수인지를 맞추면 배팅금액의 2배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                홀짝_1 = ((int) (ran * 10));
                                System.out.println("홀수 짝수를 선택하세요.\n1.홀수   2.짝수\n 그외 숫자는 기부하는걸로.");
                                홀짝_ch = sc.nextInt();
                                System.out.println("3초대기");
                                //   Thread.sleep(3000);
                                if(홀짝_1 % 2 == 1 & 홀짝_ch == 1) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else if(홀짝_1 % 2 == 0 & 홀짝_ch == 2) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else { System.out.println("나온숫자: "+홀짝_1+"\n실패하였습니다.\n잔액: "+자산); }
                                시간 = 시간 + 120;
                                break;

                            default:
                                System.out.println("카지노 구경을 합니다.");
                                시간 = 시간 + 120;
                                break;
                        }
                    } else {System.out.println("영업시간이 아닙니다.");}
                    break;
                ///////////////////
                case 5:
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("이슈트반 대성당\n1.사진을찍는다.(2시간) \n2.식사를한다.(2시간) \n그외숫자.그냥 2시간보내기");
                    성당_ch = sc.nextInt();
                    switch(성당_ch) {
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 50,000 피로도: +50\n2.오리스테이크: 30,000 피로도: +40\n3.햄버거: 8000 피로도: +10\n그외숫자는 안먹는다");
                            음식_ch = sc.nextInt();
                            switch (음식_ch) {
                                case 1:
                                    밥먹기 = 1;
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 50000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 50000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 15000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 15000) {
                                        밥먹기 = 0;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if (자산 >= 8000) {
                                        자산 = 자산 - 8000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 8000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default: 밥먹기 = 0;
                                    System.out.println("그냥 나간다.");
                                    시간 = 시간+120;

                                    break;
                            }
                            break;
                        default: System.out.println("그냥 시간을 보낸다."); 시간= 시간 +120;
                            break;
                    }
                default:
                    break;
            }
            if (피로도 > 100) {
                피로도 = 100;
            }
            if (시간측정 != 시간 / 60) {
                if(밥먹기 == 0){
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                }
                시간측정 = 시간 / 60;
                밥먹기 = 0;
            }
            if (피로도 < 0){
                피로도 = 0;
            }
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");

            if(피로도 == 0){
                System.out.println("피로도를 모두 소진하여 호텔로 이동합니다.");
                시간 = 시간 + 5*60; 피로도 = 80;
                관광지 = 0;
                시간측정 = 시간 / 60;
                if(자산 >= 20000){
                    자산 = 자산 - 20000;
                }
                else if(자산 < 20000){
                    System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                    아르바이트 = 20000 - 자산;
                    시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                    자산 = 5000 - (아르바이트 % 5000);
                }
                현재위치 = "호텔";호텔_go = 0;백화점_go = 50;국회_go = 50;어부_go = 20;성당_go = 60;;카지노_go = 60;
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
                System.out.println(내정보);
                System.out.println("////////////////////////////////////////////////////////////////////////////");
            }


        }


        if(시간 < (24+12)*60) {
            switch (관광지) {
                case 0:
                    현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                    break;
                case 1:
                    현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                    break;
                case 2:
                    현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                    break;
                case 3:
                    현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                    break;
                case 4:
                    현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                    break;
                case 5:
                    현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                    break;
                default:
                    break;
            }
            // 이동거리 //
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
            System.out.println(행선지);
            int 관광지선택 = sc.nextInt();
            System.out.println("////////////////////////////////////////////////////////////////////////////");

            if (관광지 != 관광지선택 && 관광지선택 < 9) {
                String 이동방식 = " 이동수단을 선택하세요\n" + " 1.걷기: 0원\n 2.공용자전거: 1000원 이동시간 1/2 감소.\n 3.택시: 1분에 1000원 이동시간 1/5 감소";
                System.out.println(이동방식);
                int 이동방식선택 = 이동수단;
                이동수단 = sc.nextInt();
                switch (이동수단) {
                    case 1:
                        System.out.println("걸어서 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 0) {
                                    시간 = 시간 + 호텔_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 0) {
                                    시간 = 시간 + 백화점_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 0) {
                                    시간 = 시간 + 국회_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 0) {
                                    시간 = 시간 + 어부_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 0) {
                                    시간 = 시간 + 카지노_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 0) {
                                    시간 = 시간 + 성당_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("자전거로 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 호텔_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 백화점_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 국회_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 어부_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 카지노_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 성당_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("자동차로 이동합니다.");
                        switch (관광지선택) {
                            case 0:
                                if (자산 >= 호텔_go / 5 * 1000) {
                                    시간 = 시간 + (호텔_go / 5);
                                    자산 = 자산 - 1000 * 호텔_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 백화점_go / 5 * 1000) {
                                    시간 = 시간 + (백화점_go / 5);
                                    자산 = 자산 - 1000 * 백화점_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 국회_go / 5 * 1000) {
                                    시간 = 시간 + (국회_go / 5);
                                    자산 = 자산 - 1000 * 국회_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 어부_go / 5 * 1000) {
                                    시간 = 시간 + (어부_go / 5);
                                    자산 = 자산 - 1000 * 어부_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 카지노_go / 5 * 1000) {
                                    시간 = 시간 + (카지노_go / 5);
                                    자산 = 자산 - 1000 * 카지노_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n" + 내정보);
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 성당_go / 5 * 1000) {
                                    시간 = 시간 + (성당_go / 5);
                                    자산 = 자산 - 1000 * 성당_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;

                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                if (이동수단 < 0 | 이동수단 > 3 | 잔액부족 == 1) {
                    System.out.println("걸어서 이동합니다.");
                    잔액부족 = 0;
                    switch (관광지선택) {
                        //호텔_go = 0, 머르기트_go = 30, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 성당_go = 60, 부다성_go = 30 , 클럽_go = 40, 카지노_go = 60,산책_go = 0;
                        case 0:
                            if (자산 >= 0) {
                                시간 = 시간 + 호텔_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 1:
                            if (자산 >= 0) {
                                시간 = 시간 + 백화점_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 2:
                            if (자산 >= 0) {
                                시간 = 시간 + 국회_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 3:
                            if (자산 >= 0) {
                                시간 = 시간 + 어부_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 4:
                            if (자산 >= 0) {
                                시간 = 시간 + 카지노_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 5:
                            if (자산 >= 0) {
                                시간 = 시간 + 성당_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                if (시간측정 != 시간 / 60) {
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                    if(피로도 < 0){
                        피로도 = 0;
                    }
                    시간측정 = 시간 / 60;
                }

                관광지 = 관광지선택;
                switch (관광지) {
                    case 0:
                        현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                        break;
                    case 1:
                        현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                        break;
                    case 2:
                        현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                        break;
                    case 3:
                        현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                        break;
                    case 4:
                        현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                        break;
                    case 5:
                        현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                        break;
                    default:
                        break;
                }
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
                System.out.println(내정보);
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            }
        }
        if(피로도 == 0){
            System.out.println("피로도를 모두 소진하여 호탤로 이동합니다.");
            시간 = 시간 + 5*60; 피로도 = 80;
            관광지 = 0;

            if(자산 < 30000){
                System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                아르바이트 = 30000 - 자산;
                시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                자산 = 5000 - (아르바이트 % 5000);
            }
            현재위치 = "호텔";
            호텔_go = 0;
            백화점_go = 50;
            국회_go = 50;
            어부_go = 20;
            성당_go = 60;
            카지노_go = 60;
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("////////////////////////////////////////////////////////////////////////////");
        }

        if(시간 < (24+12)*60) {

            switch(관광지){
                case 0 :
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("호텔\n1.잠을 잔다. 5시간 \n2.먹는다.(1시간) \n그외숫자.그냥 시간보내기");
                    호텔_ch = sc.nextInt();
                    switch(호텔_ch) {
                        case 1:
                            switch (호텔등급) {
                                case 1:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 50;
                                    break;
                                case 2:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 60;
                                    break;
                                case 3:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 70;
                                    break;
                                default:
                                    break;
                            }
                            시간측정 = 시간 / 60;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 80,000 피로도: +60\n2.스파게티: 15,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 스테이크");
                            음식_ch = sc.nextInt();
                            switch(음식_ch){
                                case 1:
                                    밥먹기 = 1;
                                    if(자산 >= 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if(자산 >= 15000){
                                        자산 = 자산 - 15000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 30;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 15000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 30;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if(자산 >= 8000){
                                        자산 = 자산 - 8000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 10;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 8000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default :
                                    밥먹기 = 1;
                                    if(자산 > 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 120;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 60;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                            }
                            if(피로도 > 100){
                                피로도 = 100;
                            }

                            break;
                        default:
                            System.out.println("아무것도 안하고 1시간이 갑니다.");
                            시간 = 시간 + 60;
                            피로도 = 피로도 - 15;
                            break;
                    }
                    break;

                case 1:
                    ///////// 백화점 방문 ////////
                    if( 10 <= (시간 / 60 % 24) && 20 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("백화점 \n1.쇼핑 \n2.식사\n그외숫자. 그냥시간보내기");
                        백화점_ch = sc.nextInt();
                        switch (백화점_ch)
                        {
                            case 1:
                                ran = Math.random();
                                쇼핑_ran = ((int) (ran * 100));
                                if (쇼핑_ran > 80) {
                                    System.out.println("지금부터 1시간동안 할인행사 쓰여진금액의 50% 할인됩니다.");
                                    쇼핑_할인 = 5;
                                } else {
                                    쇼핑_할인 = 10;
                                }
                                System.out.println("무엇을 사시겠습니까?\n1.기념품 30,000 \n2.화장품 15,000 \n3.옷_상의 20,000 \n4.옷_하의 30,000 \n5.비타민 5,000 \n그외숫자.구경");
                                쇼핑_ch = sc.nextInt();

                                switch (쇼핑_ch) {
                                    case 1:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 2:
                                        if (자산 >= 15000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 15000 * 쇼핑_할인 / 10;
                                            System.out.println("화장품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 3:
                                        if (자산 >= 20000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 20000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_상의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 4:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_하의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 5:
                                        if (자산 > 5000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 5000 * 쇼핑_할인 / 10;
                                            System.out.println("비타민을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    default:
                                        System.out.println("백화점 구경합니다.");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                break;

                            case 2:
                                //(밥먹기)
                                System.out.println("메뉴를 고르세요.");
                                System.out.println("1.케밥: 8,000 피로도: +30\n2.굴라쉬: 10,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 구경");
                                음식_ch = sc.nextInt();
                                switch(음식_ch){
                                    case 1:
                                        밥먹기 = 1;
                                        if(자산 > 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            밥먹기 = 0;
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 2:
                                        밥먹기 = 1;
                                        if(자산 > 10000){
                                            자산 = 자산 - 10000;
                                            if(23 >= (시간 / 60) % 24 && 5 <= (시간 / 60) % 24) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 10000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 12000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 3:
                                        밥먹기 = 1;
                                        if(자산 >= 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    default : 밥먹기 = 0;
                                        System.out.println("식품코너 구경");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                if(피로도 > 100){
                                    피로도 = 100;
                                }
                                break;
                            default: System.out.println("백화점 구경"); 시간 = 시간 +120;
                                break;

                        }
                    } else { System.out.println("백화점 Close시간 입니다."); }


                    break;

                ///////////////////////////////////////////////////
                case 2:
                    ///////// 국회 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("국회의사당\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    국회_ch = sc.nextInt();
                    switch (국회_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000 ) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default:  System.out.println("국회의사당 구경"); 시간 = 시간 +120;

                            break;

                    }


                    break;
                case 3:

                    ///////// 어부의요세 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("어부의요세\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    어부_ch = sc.nextInt();
                    switch (어부_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default: System.out.println("어부의 요세 구경"); 시간 = 시간 + 120;

                            break;

                    }
                    break;
                /////////////////////////////////////////

                case 4:
                    ///////// 카지노 방문 /////////
                    if( 20 <= (시간 / 60 % 24) || 5 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("카지노\n1.젝팟 \n2.홀짝 \n나머지. 그냥시간보내기");

                        카지노_ch = sc.nextInt();
                        switch (카지노_ch){
                            case 1:
                                System.out.println("배팅 후 젝팟을 돌려 같은숫자가 나오면 배팅금액의 10배, 7로 같은숫자가 나오면 20배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                젝팟_1 = ((int) (ran * 10));
                                ran = Math.random();
                                젝팟_2 = ((int) (ran * 10));
                                System.out.println("3초 대기");
                                //    Thread.sleep(3000);
                                System.out.println(젝팟_1+""+젝팟_2);
                                if(젝팟_1 == 젝팟_2){
                                    if(젝팟_1==7){
                                        System.out.println("!!!!!!!77젝팟 성공!!!!!!");;
                                        자산 = 자산 + 배팅금액*20;
                                        System.out.println("보유금액: "+자산);
                                    }
                                    else {
                                        System.out.println("!!젝팟 성공!!");
                                        자산 = 자산 + 배팅금액 * 10;
                                        System.out.println("보유금액: " + 자산);
                                    }
                                }
                                else{ System.out.println("실패하였습니다.");System.out.println("보유금액: "+자산); }
                                시간 = 시간 + 120;
                                break;
                            case 2:

                                System.out.println("홀짝 맞추기 게임!!! \n 배팅후 홀수인지 짝수인지를 맞추면 배팅금액의 2배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                홀짝_1 = ((int) (ran * 10));
                                System.out.println("홀수 짝수를 선택하세요.\n1.홀수   2.짝수\n 그외 숫자는 기부하는걸로.");
                                홀짝_ch = sc.nextInt();
                                System.out.println("3초대기");
                                //   Thread.sleep(3000);
                                if(홀짝_1 % 2 == 1 & 홀짝_ch == 1) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else if(홀짝_1 % 2 == 0 & 홀짝_ch == 2) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else { System.out.println("나온숫자: "+홀짝_1+"\n실패하였습니다.\n잔액: "+자산); }
                                시간 = 시간 + 120;
                                break;

                            default:
                                System.out.println("카지노 구경을 합니다.");
                                시간 = 시간 + 120;
                                break;
                        }
                    } else {System.out.println("영업시간이 아닙니다.");}
                    break;
                ///////////////////
                case 5:
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("이슈트반 대성당\n1.사진을찍는다.(2시간) \n2.식사를한다.(2시간) \n그외숫자.그냥 2시간보내기");
                    성당_ch = sc.nextInt();
                    switch(성당_ch) {
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 50,000 피로도: +50\n2.오리스테이크: 30,000 피로도: +40\n3.햄버거: 8000 피로도: +10\n그외숫자는 안먹는다");
                            음식_ch = sc.nextInt();
                            switch (음식_ch) {
                                case 1:
                                    밥먹기 = 1;
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 50000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 50000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 15000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 15000) {
                                        밥먹기 = 0;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if (자산 >= 8000) {
                                        자산 = 자산 - 8000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 8000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default: 밥먹기 = 0;
                                    System.out.println("그냥 나간다.");
                                    시간 = 시간+120;

                                    break;
                            }
                            break;
                        default: System.out.println("그냥 시간을 보낸다."); 시간= 시간 +120;
                            break;
                    }
                default:
                    break;
            }
            if (피로도 > 100) {
                피로도 = 100;
            }
            if (시간측정 != 시간 / 60) {
                if(밥먹기 == 0){
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                }
                시간측정 = 시간 / 60;
                밥먹기 = 0;
            }
            if (피로도 < 0){
                피로도 = 0;
            }
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");

            if(피로도 == 0){
                System.out.println("피로도를 모두 소진하여 호텔로 이동합니다.");
                시간 = 시간 + 5*60; 피로도 = 80;
                관광지 = 0;
                시간측정 = 시간 / 60;
                if(자산 >= 20000){
                    자산 = 자산 - 20000;
                }
                else if(자산 < 20000){
                    System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                    아르바이트 = 20000 - 자산;
                    시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                    자산 = 5000 - (아르바이트 % 5000);
                }
                현재위치 = "호텔";호텔_go = 0;백화점_go = 50;국회_go = 50;어부_go = 20;성당_go = 60;;카지노_go = 60;
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
                System.out.println(내정보);
                System.out.println("////////////////////////////////////////////////////////////////////////////");
            }


        }


        if(시간 < (24+12)*60) {
            switch (관광지) {
                case 0:
                    현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                    break;
                case 1:
                    현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                    break;
                case 2:
                    현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                    break;
                case 3:
                    현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                    break;
                case 4:
                    현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                    break;
                case 5:
                    현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                    break;
                default:
                    break;
            }
            // 이동거리 //
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
            System.out.println(행선지);
            int 관광지선택 = sc.nextInt();
            System.out.println("////////////////////////////////////////////////////////////////////////////");

            if (관광지 != 관광지선택 && 관광지선택 < 9) {
                String 이동방식 = " 이동수단을 선택하세요\n" + " 1.걷기: 0원\n 2.공용자전거: 1000원 이동시간 1/2 감소.\n 3.택시: 1분에 1000원 이동시간 1/5 감소";
                System.out.println(이동방식);
                int 이동방식선택 = 이동수단;
                이동수단 = sc.nextInt();
                switch (이동수단) {
                    case 1:
                        System.out.println("걸어서 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 0) {
                                    시간 = 시간 + 호텔_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 0) {
                                    시간 = 시간 + 백화점_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 0) {
                                    시간 = 시간 + 국회_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 0) {
                                    시간 = 시간 + 어부_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 0) {
                                    시간 = 시간 + 카지노_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 0) {
                                    시간 = 시간 + 성당_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("자전거로 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 호텔_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 백화점_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 국회_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 어부_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 카지노_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 성당_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("자동차로 이동합니다.");
                        switch (관광지선택) {
                            case 0:
                                if (자산 >= 호텔_go / 5 * 1000) {
                                    시간 = 시간 + (호텔_go / 5);
                                    자산 = 자산 - 1000 * 호텔_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 백화점_go / 5 * 1000) {
                                    시간 = 시간 + (백화점_go / 5);
                                    자산 = 자산 - 1000 * 백화점_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 국회_go / 5 * 1000) {
                                    시간 = 시간 + (국회_go / 5);
                                    자산 = 자산 - 1000 * 국회_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 어부_go / 5 * 1000) {
                                    시간 = 시간 + (어부_go / 5);
                                    자산 = 자산 - 1000 * 어부_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 카지노_go / 5 * 1000) {
                                    시간 = 시간 + (카지노_go / 5);
                                    자산 = 자산 - 1000 * 카지노_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n" + 내정보);
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 성당_go / 5 * 1000) {
                                    시간 = 시간 + (성당_go / 5);
                                    자산 = 자산 - 1000 * 성당_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;

                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                if (이동수단 < 0 | 이동수단 > 3 | 잔액부족 == 1) {
                    System.out.println("걸어서 이동합니다.");
                    잔액부족 = 0;
                    switch (관광지선택) {
                        //호텔_go = 0, 머르기트_go = 30, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 성당_go = 60, 부다성_go = 30 , 클럽_go = 40, 카지노_go = 60,산책_go = 0;
                        case 0:
                            if (자산 >= 0) {
                                시간 = 시간 + 호텔_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 1:
                            if (자산 >= 0) {
                                시간 = 시간 + 백화점_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 2:
                            if (자산 >= 0) {
                                시간 = 시간 + 국회_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 3:
                            if (자산 >= 0) {
                                시간 = 시간 + 어부_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 4:
                            if (자산 >= 0) {
                                시간 = 시간 + 카지노_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 5:
                            if (자산 >= 0) {
                                시간 = 시간 + 성당_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                if (시간측정 != 시간 / 60) {
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                    if(피로도 < 0){
                        피로도 = 0;
                    }
                    시간측정 = 시간 / 60;
                }

                관광지 = 관광지선택;
                switch (관광지) {
                    case 0:
                        현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                        break;
                    case 1:
                        현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                        break;
                    case 2:
                        현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                        break;
                    case 3:
                        현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                        break;
                    case 4:
                        현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                        break;
                    case 5:
                        현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                        break;
                    default:
                        break;
                }
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
                System.out.println(내정보);
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            }
        }
        if(피로도 == 0){
            System.out.println("피로도를 모두 소진하여 호탤로 이동합니다.");
            시간 = 시간 + 5*60; 피로도 = 80;
            관광지 = 0;

            if(자산 < 30000){
                System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                아르바이트 = 30000 - 자산;
                시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                자산 = 5000 - (아르바이트 % 5000);
            }
            현재위치 = "호텔";
            호텔_go = 0;
            백화점_go = 50;
            국회_go = 50;
            어부_go = 20;
            성당_go = 60;
            카지노_go = 60;
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("////////////////////////////////////////////////////////////////////////////");
        }

        if(시간 < (24+12)*60) {

            switch(관광지){
                case 0 :
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("호텔\n1.잠을 잔다. 5시간 \n2.먹는다.(1시간) \n그외숫자.그냥 시간보내기");
                    호텔_ch = sc.nextInt();
                    switch(호텔_ch) {
                        case 1:
                            switch (호텔등급) {
                                case 1:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 50;
                                    break;
                                case 2:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 60;
                                    break;
                                case 3:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 70;
                                    break;
                                default:
                                    break;
                            }
                            시간측정 = 시간 / 60;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 80,000 피로도: +60\n2.스파게티: 15,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 스테이크");
                            음식_ch = sc.nextInt();
                            switch(음식_ch){
                                case 1:
                                    밥먹기 = 1;
                                    if(자산 >= 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if(자산 >= 15000){
                                        자산 = 자산 - 15000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 30;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 15000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 30;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if(자산 >= 8000){
                                        자산 = 자산 - 8000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 10;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 8000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default :
                                    밥먹기 = 1;
                                    if(자산 > 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 120;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 60;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                            }
                            if(피로도 > 100){
                                피로도 = 100;
                            }

                            break;
                        default:
                            System.out.println("아무것도 안하고 1시간이 갑니다.");
                            시간 = 시간 + 60;
                            피로도 = 피로도 - 15;
                            break;
                    }
                    break;

                case 1:
                    ///////// 백화점 방문 ////////
                    if( 10 <= (시간 / 60 % 24) && 20 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("백화점 \n1.쇼핑 \n2.식사\n그외숫자. 그냥시간보내기");
                        백화점_ch = sc.nextInt();
                        switch (백화점_ch)
                        {
                            case 1:
                                ran = Math.random();
                                쇼핑_ran = ((int) (ran * 100));
                                if (쇼핑_ran > 80) {
                                    System.out.println("지금부터 1시간동안 할인행사 쓰여진금액의 50% 할인됩니다.");
                                    쇼핑_할인 = 5;
                                } else {
                                    쇼핑_할인 = 10;
                                }
                                System.out.println("무엇을 사시겠습니까?\n1.기념품 30,000 \n2.화장품 15,000 \n3.옷_상의 20,000 \n4.옷_하의 30,000 \n5.비타민 5,000 \n그외숫자.구경");
                                쇼핑_ch = sc.nextInt();

                                switch (쇼핑_ch) {
                                    case 1:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 2:
                                        if (자산 >= 15000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 15000 * 쇼핑_할인 / 10;
                                            System.out.println("화장품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 3:
                                        if (자산 >= 20000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 20000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_상의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 4:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_하의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 5:
                                        if (자산 > 5000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 5000 * 쇼핑_할인 / 10;
                                            System.out.println("비타민을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    default:
                                        System.out.println("백화점 구경합니다.");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                break;

                            case 2:
                                //(밥먹기)
                                System.out.println("메뉴를 고르세요.");
                                System.out.println("1.케밥: 8,000 피로도: +30\n2.굴라쉬: 10,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 구경");
                                음식_ch = sc.nextInt();
                                switch(음식_ch){
                                    case 1:
                                        밥먹기 = 1;
                                        if(자산 > 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            밥먹기 = 0;
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 2:
                                        밥먹기 = 1;
                                        if(자산 > 10000){
                                            자산 = 자산 - 10000;
                                            if(23 >= (시간 / 60) % 24 && 5 <= (시간 / 60) % 24) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 10000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 12000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 3:
                                        밥먹기 = 1;
                                        if(자산 >= 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    default : 밥먹기 = 0;
                                        System.out.println("식품코너 구경");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                if(피로도 > 100){
                                    피로도 = 100;
                                }
                                break;
                            default: System.out.println("백화점 구경"); 시간 = 시간 +120;
                                break;

                        }
                    } else { System.out.println("백화점 Close시간 입니다."); }


                    break;

                ///////////////////////////////////////////////////
                case 2:
                    ///////// 국회 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("국회의사당\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    국회_ch = sc.nextInt();
                    switch (국회_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000 ) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default:  System.out.println("국회의사당 구경"); 시간 = 시간 +120;

                            break;

                    }


                    break;
                case 3:

                    ///////// 어부의요세 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("어부의요세\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    어부_ch = sc.nextInt();
                    switch (어부_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default: System.out.println("어부의 요세 구경"); 시간 = 시간 + 120;

                            break;

                    }
                    break;
                /////////////////////////////////////////

                case 4:
                    ///////// 카지노 방문 /////////
                    if( 20 <= (시간 / 60 % 24) || 5 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("카지노\n1.젝팟 \n2.홀짝 \n나머지. 그냥시간보내기");

                        카지노_ch = sc.nextInt();
                        switch (카지노_ch){
                            case 1:
                                System.out.println("배팅 후 젝팟을 돌려 같은숫자가 나오면 배팅금액의 10배, 7로 같은숫자가 나오면 20배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                젝팟_1 = ((int) (ran * 10));
                                ran = Math.random();
                                젝팟_2 = ((int) (ran * 10));
                                System.out.println("3초 대기");
                                //    Thread.sleep(3000);
                                System.out.println(젝팟_1+""+젝팟_2);
                                if(젝팟_1 == 젝팟_2){
                                    if(젝팟_1==7){
                                        System.out.println("!!!!!!!77젝팟 성공!!!!!!");;
                                        자산 = 자산 + 배팅금액*20;
                                        System.out.println("보유금액: "+자산);
                                    }
                                    else {
                                        System.out.println("!!젝팟 성공!!");
                                        자산 = 자산 + 배팅금액 * 10;
                                        System.out.println("보유금액: " + 자산);
                                    }
                                }
                                else{ System.out.println("실패하였습니다.");System.out.println("보유금액: "+자산); }
                                시간 = 시간 + 120;
                                break;
                            case 2:

                                System.out.println("홀짝 맞추기 게임!!! \n 배팅후 홀수인지 짝수인지를 맞추면 배팅금액의 2배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                홀짝_1 = ((int) (ran * 10));
                                System.out.println("홀수 짝수를 선택하세요.\n1.홀수   2.짝수\n 그외 숫자는 기부하는걸로.");
                                홀짝_ch = sc.nextInt();
                                System.out.println("3초대기");
                                //   Thread.sleep(3000);
                                if(홀짝_1 % 2 == 1 & 홀짝_ch == 1) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else if(홀짝_1 % 2 == 0 & 홀짝_ch == 2) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else { System.out.println("나온숫자: "+홀짝_1+"\n실패하였습니다.\n잔액: "+자산); }
                                시간 = 시간 + 120;
                                break;

                            default:
                                System.out.println("카지노 구경을 합니다.");
                                시간 = 시간 + 120;
                                break;
                        }
                    } else {System.out.println("영업시간이 아닙니다.");}
                    break;
                ///////////////////
                case 5:
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("이슈트반 대성당\n1.사진을찍는다.(2시간) \n2.식사를한다.(2시간) \n그외숫자.그냥 2시간보내기");
                    성당_ch = sc.nextInt();
                    switch(성당_ch) {
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 50,000 피로도: +50\n2.오리스테이크: 30,000 피로도: +40\n3.햄버거: 8000 피로도: +10\n그외숫자는 안먹는다");
                            음식_ch = sc.nextInt();
                            switch (음식_ch) {
                                case 1:
                                    밥먹기 = 1;
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 50000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 50000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 15000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 15000) {
                                        밥먹기 = 0;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if (자산 >= 8000) {
                                        자산 = 자산 - 8000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 8000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default: 밥먹기 = 0;
                                    System.out.println("그냥 나간다.");
                                    시간 = 시간+120;

                                    break;
                            }
                            break;
                        default: System.out.println("그냥 시간을 보낸다."); 시간= 시간 +120;
                            break;
                    }
                default:
                    break;
            }
            if (피로도 > 100) {
                피로도 = 100;
            }
            if (시간측정 != 시간 / 60) {
                if(밥먹기 == 0){
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                }
                시간측정 = 시간 / 60;
                밥먹기 = 0;
            }
            if (피로도 < 0){
                피로도 = 0;
            }
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");

            if(피로도 == 0){
                System.out.println("피로도를 모두 소진하여 호텔로 이동합니다.");
                시간 = 시간 + 5*60; 피로도 = 80;
                관광지 = 0;
                시간측정 = 시간 / 60;
                if(자산 >= 20000){
                    자산 = 자산 - 20000;
                }
                else if(자산 < 20000){
                    System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                    아르바이트 = 20000 - 자산;
                    시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                    자산 = 5000 - (아르바이트 % 5000);
                }
                현재위치 = "호텔";호텔_go = 0;백화점_go = 50;국회_go = 50;어부_go = 20;성당_go = 60;;카지노_go = 60;
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
                System.out.println(내정보);
                System.out.println("////////////////////////////////////////////////////////////////////////////");
            }


        }


        if(시간 < (24+12)*60) {
            switch (관광지) {
                case 0:
                    현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                    break;
                case 1:
                    현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                    break;
                case 2:
                    현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                    break;
                case 3:
                    현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                    break;
                case 4:
                    현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                    break;
                case 5:
                    현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                    break;
                default:
                    break;
            }
            // 이동거리 //
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
            System.out.println(행선지);
            int 관광지선택 = sc.nextInt();
            System.out.println("////////////////////////////////////////////////////////////////////////////");

            if (관광지 != 관광지선택 && 관광지선택 < 9) {
                String 이동방식 = " 이동수단을 선택하세요\n" + " 1.걷기: 0원\n 2.공용자전거: 1000원 이동시간 1/2 감소.\n 3.택시: 1분에 1000원 이동시간 1/5 감소";
                System.out.println(이동방식);
                int 이동방식선택 = 이동수단;
                이동수단 = sc.nextInt();
                switch (이동수단) {
                    case 1:
                        System.out.println("걸어서 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 0) {
                                    시간 = 시간 + 호텔_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 0) {
                                    시간 = 시간 + 백화점_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 0) {
                                    시간 = 시간 + 국회_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 0) {
                                    시간 = 시간 + 어부_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 0) {
                                    시간 = 시간 + 카지노_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 0) {
                                    시간 = 시간 + 성당_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("자전거로 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 호텔_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 백화점_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 국회_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 어부_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 카지노_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 성당_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("자동차로 이동합니다.");
                        switch (관광지선택) {
                            case 0:
                                if (자산 >= 호텔_go / 5 * 1000) {
                                    시간 = 시간 + (호텔_go / 5);
                                    자산 = 자산 - 1000 * 호텔_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 백화점_go / 5 * 1000) {
                                    시간 = 시간 + (백화점_go / 5);
                                    자산 = 자산 - 1000 * 백화점_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 국회_go / 5 * 1000) {
                                    시간 = 시간 + (국회_go / 5);
                                    자산 = 자산 - 1000 * 국회_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 어부_go / 5 * 1000) {
                                    시간 = 시간 + (어부_go / 5);
                                    자산 = 자산 - 1000 * 어부_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 카지노_go / 5 * 1000) {
                                    시간 = 시간 + (카지노_go / 5);
                                    자산 = 자산 - 1000 * 카지노_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n" + 내정보);
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 성당_go / 5 * 1000) {
                                    시간 = 시간 + (성당_go / 5);
                                    자산 = 자산 - 1000 * 성당_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;

                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                if (이동수단 < 0 | 이동수단 > 3 | 잔액부족 == 1) {
                    System.out.println("걸어서 이동합니다.");
                    잔액부족 = 0;
                    switch (관광지선택) {
                        //호텔_go = 0, 머르기트_go = 30, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 성당_go = 60, 부다성_go = 30 , 클럽_go = 40, 카지노_go = 60,산책_go = 0;
                        case 0:
                            if (자산 >= 0) {
                                시간 = 시간 + 호텔_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 1:
                            if (자산 >= 0) {
                                시간 = 시간 + 백화점_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 2:
                            if (자산 >= 0) {
                                시간 = 시간 + 국회_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 3:
                            if (자산 >= 0) {
                                시간 = 시간 + 어부_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 4:
                            if (자산 >= 0) {
                                시간 = 시간 + 카지노_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 5:
                            if (자산 >= 0) {
                                시간 = 시간 + 성당_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                if (시간측정 != 시간 / 60) {
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                    if(피로도 < 0){
                        피로도 = 0;
                    }
                    시간측정 = 시간 / 60;
                }

                관광지 = 관광지선택;
                switch (관광지) {
                    case 0:
                        현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                        break;
                    case 1:
                        현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                        break;
                    case 2:
                        현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                        break;
                    case 3:
                        현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                        break;
                    case 4:
                        현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                        break;
                    case 5:
                        현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                        break;
                    default:
                        break;
                }
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
                System.out.println(내정보);
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            }
        }
        if(피로도 == 0){
            System.out.println("피로도를 모두 소진하여 호탤로 이동합니다.");
            시간 = 시간 + 5*60; 피로도 = 80;
            관광지 = 0;

            if(자산 < 30000){
                System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                아르바이트 = 30000 - 자산;
                시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                자산 = 5000 - (아르바이트 % 5000);
            }
            현재위치 = "호텔";
            호텔_go = 0;
            백화점_go = 50;
            국회_go = 50;
            어부_go = 20;
            성당_go = 60;
            카지노_go = 60;
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("////////////////////////////////////////////////////////////////////////////");
        }

        if(시간 < (24+12)*60) {

            switch(관광지){
                case 0 :
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("호텔\n1.잠을 잔다. 5시간 \n2.먹는다.(1시간) \n그외숫자.그냥 시간보내기");
                    호텔_ch = sc.nextInt();
                    switch(호텔_ch) {
                        case 1:
                            switch (호텔등급) {
                                case 1:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 50;
                                    break;
                                case 2:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 60;
                                    break;
                                case 3:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 70;
                                    break;
                                default:
                                    break;
                            }
                            시간측정 = 시간 / 60;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 80,000 피로도: +60\n2.스파게티: 15,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 스테이크");
                            음식_ch = sc.nextInt();
                            switch(음식_ch){
                                case 1:
                                    밥먹기 = 1;
                                    if(자산 >= 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if(자산 >= 15000){
                                        자산 = 자산 - 15000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 30;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 15000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 30;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if(자산 >= 8000){
                                        자산 = 자산 - 8000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 10;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 8000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default :
                                    밥먹기 = 1;
                                    if(자산 > 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 120;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 60;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                            }
                            if(피로도 > 100){
                                피로도 = 100;
                            }

                            break;
                        default:
                            System.out.println("아무것도 안하고 1시간이 갑니다.");
                            시간 = 시간 + 60;
                            피로도 = 피로도 - 15;
                            break;
                    }
                    break;

                case 1:
                    ///////// 백화점 방문 ////////
                    if( 10 <= (시간 / 60 % 24) && 20 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("백화점 \n1.쇼핑 \n2.식사\n그외숫자. 그냥시간보내기");
                        백화점_ch = sc.nextInt();
                        switch (백화점_ch)
                        {
                            case 1:
                                ran = Math.random();
                                쇼핑_ran = ((int) (ran * 100));
                                if (쇼핑_ran > 80) {
                                    System.out.println("지금부터 1시간동안 할인행사 쓰여진금액의 50% 할인됩니다.");
                                    쇼핑_할인 = 5;
                                } else {
                                    쇼핑_할인 = 10;
                                }
                                System.out.println("무엇을 사시겠습니까?\n1.기념품 30,000 \n2.화장품 15,000 \n3.옷_상의 20,000 \n4.옷_하의 30,000 \n5.비타민 5,000 \n그외숫자.구경");
                                쇼핑_ch = sc.nextInt();

                                switch (쇼핑_ch) {
                                    case 1:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 2:
                                        if (자산 >= 15000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 15000 * 쇼핑_할인 / 10;
                                            System.out.println("화장품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 3:
                                        if (자산 >= 20000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 20000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_상의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 4:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_하의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 5:
                                        if (자산 > 5000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 5000 * 쇼핑_할인 / 10;
                                            System.out.println("비타민을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    default:
                                        System.out.println("백화점 구경합니다.");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                break;

                            case 2:
                                //(밥먹기)
                                System.out.println("메뉴를 고르세요.");
                                System.out.println("1.케밥: 8,000 피로도: +30\n2.굴라쉬: 10,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 구경");
                                음식_ch = sc.nextInt();
                                switch(음식_ch){
                                    case 1:
                                        밥먹기 = 1;
                                        if(자산 > 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            밥먹기 = 0;
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 2:
                                        밥먹기 = 1;
                                        if(자산 > 10000){
                                            자산 = 자산 - 10000;
                                            if(23 >= (시간 / 60) % 24 && 5 <= (시간 / 60) % 24) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 10000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 12000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 3:
                                        밥먹기 = 1;
                                        if(자산 >= 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    default : 밥먹기 = 0;
                                        System.out.println("식품코너 구경");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                if(피로도 > 100){
                                    피로도 = 100;
                                }
                                break;
                            default: System.out.println("백화점 구경"); 시간 = 시간 +120;
                                break;

                        }
                    } else { System.out.println("백화점 Close시간 입니다."); }


                    break;

                ///////////////////////////////////////////////////
                case 2:
                    ///////// 국회 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("국회의사당\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    국회_ch = sc.nextInt();
                    switch (국회_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000 ) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default:  System.out.println("국회의사당 구경"); 시간 = 시간 +120;

                            break;

                    }


                    break;
                case 3:

                    ///////// 어부의요세 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("어부의요세\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    어부_ch = sc.nextInt();
                    switch (어부_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default: System.out.println("어부의 요세 구경"); 시간 = 시간 + 120;

                            break;

                    }
                    break;
                /////////////////////////////////////////

                case 4:
                    ///////// 카지노 방문 /////////
                    if( 20 <= (시간 / 60 % 24) || 5 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("카지노\n1.젝팟 \n2.홀짝 \n나머지. 그냥시간보내기");

                        카지노_ch = sc.nextInt();
                        switch (카지노_ch){
                            case 1:
                                System.out.println("배팅 후 젝팟을 돌려 같은숫자가 나오면 배팅금액의 10배, 7로 같은숫자가 나오면 20배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                젝팟_1 = ((int) (ran * 10));
                                ran = Math.random();
                                젝팟_2 = ((int) (ran * 10));
                                System.out.println("3초 대기");
                                //    Thread.sleep(3000);
                                System.out.println(젝팟_1+""+젝팟_2);
                                if(젝팟_1 == 젝팟_2){
                                    if(젝팟_1==7){
                                        System.out.println("!!!!!!!77젝팟 성공!!!!!!");;
                                        자산 = 자산 + 배팅금액*20;
                                        System.out.println("보유금액: "+자산);
                                    }
                                    else {
                                        System.out.println("!!젝팟 성공!!");
                                        자산 = 자산 + 배팅금액 * 10;
                                        System.out.println("보유금액: " + 자산);
                                    }
                                }
                                else{ System.out.println("실패하였습니다.");System.out.println("보유금액: "+자산); }
                                시간 = 시간 + 120;
                                break;
                            case 2:

                                System.out.println("홀짝 맞추기 게임!!! \n 배팅후 홀수인지 짝수인지를 맞추면 배팅금액의 2배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                홀짝_1 = ((int) (ran * 10));
                                System.out.println("홀수 짝수를 선택하세요.\n1.홀수   2.짝수\n 그외 숫자는 기부하는걸로.");
                                홀짝_ch = sc.nextInt();
                                System.out.println("3초대기");
                                //   Thread.sleep(3000);
                                if(홀짝_1 % 2 == 1 & 홀짝_ch == 1) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else if(홀짝_1 % 2 == 0 & 홀짝_ch == 2) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else { System.out.println("나온숫자: "+홀짝_1+"\n실패하였습니다.\n잔액: "+자산); }
                                시간 = 시간 + 120;
                                break;

                            default:
                                System.out.println("카지노 구경을 합니다.");
                                시간 = 시간 + 120;
                                break;
                        }
                    } else {System.out.println("영업시간이 아닙니다.");}
                    break;
                ///////////////////
                case 5:
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("이슈트반 대성당\n1.사진을찍는다.(2시간) \n2.식사를한다.(2시간) \n그외숫자.그냥 2시간보내기");
                    성당_ch = sc.nextInt();
                    switch(성당_ch) {
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 50,000 피로도: +50\n2.오리스테이크: 30,000 피로도: +40\n3.햄버거: 8000 피로도: +10\n그외숫자는 안먹는다");
                            음식_ch = sc.nextInt();
                            switch (음식_ch) {
                                case 1:
                                    밥먹기 = 1;
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 50000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 50000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 15000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 15000) {
                                        밥먹기 = 0;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if (자산 >= 8000) {
                                        자산 = 자산 - 8000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 8000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default: 밥먹기 = 0;
                                    System.out.println("그냥 나간다.");
                                    시간 = 시간+120;

                                    break;
                            }
                            break;
                        default: System.out.println("그냥 시간을 보낸다."); 시간= 시간 +120;
                            break;
                    }
                default:
                    break;
            }
            if (피로도 > 100) {
                피로도 = 100;
            }
            if (시간측정 != 시간 / 60) {
                if(밥먹기 == 0){
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                }
                시간측정 = 시간 / 60;
                밥먹기 = 0;
            }
            if (피로도 < 0){
                피로도 = 0;
            }
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");

            if(피로도 == 0){
                System.out.println("피로도를 모두 소진하여 호텔로 이동합니다.");
                시간 = 시간 + 5*60; 피로도 = 80;
                관광지 = 0;
                시간측정 = 시간 / 60;
                if(자산 >= 20000){
                    자산 = 자산 - 20000;
                }
                else if(자산 < 20000){
                    System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                    아르바이트 = 20000 - 자산;
                    시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                    자산 = 5000 - (아르바이트 % 5000);
                }
                현재위치 = "호텔";호텔_go = 0;백화점_go = 50;국회_go = 50;어부_go = 20;성당_go = 60;;카지노_go = 60;
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
                System.out.println(내정보);
                System.out.println("////////////////////////////////////////////////////////////////////////////");
            }


        }


        if(시간 < (24+12)*60) {
            switch (관광지) {
                case 0:
                    현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                    break;
                case 1:
                    현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                    break;
                case 2:
                    현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                    break;
                case 3:
                    현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                    break;
                case 4:
                    현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                    break;
                case 5:
                    현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                    break;
                default:
                    break;
            }
            // 이동거리 //
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
            System.out.println(행선지);
            int 관광지선택 = sc.nextInt();
            System.out.println("////////////////////////////////////////////////////////////////////////////");

            if (관광지 != 관광지선택 && 관광지선택 < 9) {
                String 이동방식 = " 이동수단을 선택하세요\n" + " 1.걷기: 0원\n 2.공용자전거: 1000원 이동시간 1/2 감소.\n 3.택시: 1분에 1000원 이동시간 1/5 감소";
                System.out.println(이동방식);
                int 이동방식선택 = 이동수단;
                이동수단 = sc.nextInt();
                switch (이동수단) {
                    case 1:
                        System.out.println("걸어서 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 0) {
                                    시간 = 시간 + 호텔_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 0) {
                                    시간 = 시간 + 백화점_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 0) {
                                    시간 = 시간 + 국회_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 0) {
                                    시간 = 시간 + 어부_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 0) {
                                    시간 = 시간 + 카지노_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 0) {
                                    시간 = 시간 + 성당_go;
                                    자산 = 자산 - 0;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("자전거로 이동합니다.");
                        switch (관광지선택) {
                            //호텔_go = 0, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 카지노_go = 60, 성당_go = 60 ;
                            case 0:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 호텔_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 백화점_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 국회_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 어부_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 카지노_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 1000) {
                                    시간 = 시간 + 성당_go / 2;
                                    자산 = 자산 - 1000;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("자동차로 이동합니다.");
                        switch (관광지선택) {
                            case 0:
                                if (자산 >= 호텔_go / 5 * 1000) {
                                    시간 = 시간 + (호텔_go / 5);
                                    자산 = 자산 - 1000 * 호텔_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 1:
                                if (자산 >= 백화점_go / 5 * 1000) {
                                    시간 = 시간 + (백화점_go / 5);
                                    자산 = 자산 - 1000 * 백화점_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 2:
                                if (자산 >= 국회_go / 5 * 1000) {
                                    시간 = 시간 + (국회_go / 5);
                                    자산 = 자산 - 1000 * 국회_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 3:
                                if (자산 >= 어부_go / 5 * 1000) {
                                    시간 = 시간 + (어부_go / 5);
                                    자산 = 자산 - 1000 * 어부_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 4:
                                if (자산 >= 카지노_go / 5 * 1000) {
                                    시간 = 시간 + (카지노_go / 5);
                                    자산 = 자산 - 1000 * 카지노_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n" + 내정보);
                                    잔액부족 = 1;
                                    break;
                                }
                                break;
                            case 5:
                                if (자산 >= 성당_go / 5 * 1000) {
                                    시간 = 시간 + (성당_go / 5);
                                    자산 = 자산 - 1000 * 성당_go / 5;
                                } else {
                                    System.out.println("잔액이 부족합니다.\n");
                                    잔액부족 = 1;
                                    break;
                                }
                                break;

                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                if (이동수단 < 0 | 이동수단 > 3 | 잔액부족 == 1) {
                    System.out.println("걸어서 이동합니다.");
                    잔액부족 = 0;
                    switch (관광지선택) {
                        //호텔_go = 0, 머르기트_go = 30, 백화점_go = 50, 국회_go = 40, 어부_go = 20 , 성당_go = 60, 부다성_go = 30 , 클럽_go = 40, 카지노_go = 60,산책_go = 0;
                        case 0:
                            if (자산 >= 0) {
                                시간 = 시간 + 호텔_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 1:
                            if (자산 >= 0) {
                                시간 = 시간 + 백화점_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 2:
                            if (자산 >= 0) {
                                시간 = 시간 + 국회_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 3:
                            if (자산 >= 0) {
                                시간 = 시간 + 어부_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 4:
                            if (자산 >= 0) {
                                시간 = 시간 + 카지노_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        case 5:
                            if (자산 >= 0) {
                                시간 = 시간 + 성당_go;
                                자산 = 자산 - 0;
                            } else {
                                System.out.println("잔액이 부족합니다.\n");
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                if (시간측정 != 시간 / 60) {
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                    if(피로도 < 0){
                        피로도 = 0;
                    }
                    시간측정 = 시간 / 60;
                }

                관광지 = 관광지선택;
                switch (관광지) {
                    case 0:
                        현재위치 = "호텔"; 호텔_go = 0;백화점_go = 50;국회_go = 40;어부_go = 20;카지노_go = 60;성당_go = 60;
                        break;
                    case 1:
                        현재위치 = "백화점";호텔_go = 50;백화점_go = 0;국회_go = 20;어부_go = 70;카지노_go = 20;성당_go = 20;
                        break;
                    case 2:
                        현재위치 = "국회의사당";호텔_go = 50;백화점_go = 20;국회_go = 0;어부_go = 60;카지노_go = 10;성당_go = 20;
                        break;
                    case 3:
                        현재위치 = "어부의 요세";호텔_go = 20;백화점_go = 70;국회_go = 60;어부_go = 0;카지노_go = 50;성당_go = 60;
                        break;
                    case 4:
                        현재위치 = "카지노";호텔_go = 60;백화점_go = 20;국회_go = 10;어부_go = 0;카지노_go = 0;성당_go = 10;
                        break;
                    case 5:
                        현재위치 = "이슈르반대성당";호텔_go = 60;백화점_go = 20;국회_go = 20;어부_go = 60;카지노_go = 10;성당_go = 0;
                        break;
                    default:
                        break;
                }
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산 + "\n";
                System.out.println(내정보);
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            }
        }
        if(피로도 == 0){
            System.out.println("피로도를 모두 소진하여 호탤로 이동합니다.");
            시간 = 시간 + 5*60; 피로도 = 80;
            관광지 = 0;

            if(자산 < 30000){
                System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                아르바이트 = 30000 - 자산;
                시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                자산 = 5000 - (아르바이트 % 5000);
            }
            현재위치 = "호텔";
            호텔_go = 0;
            백화점_go = 50;
            국회_go = 50;
            어부_go = 20;
            성당_go = 60;
            카지노_go = 60;
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("////////////////////////////////////////////////////////////////////////////");
        }

        if(시간 < (24+12)*60) {

            switch(관광지){
                case 0 :
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("호텔\n1.잠을 잔다. 5시간 \n2.먹는다.(1시간) \n그외숫자.그냥 시간보내기");
                    호텔_ch = sc.nextInt();
                    switch(호텔_ch) {
                        case 1:
                            switch (호텔등급) {
                                case 1:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 50;
                                    break;
                                case 2:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 60;
                                    break;
                                case 3:
                                    System.out.println("!!저급호텔 휴식!!");
                                    시간 = 시간 + 60 * 5;
                                    피로도 = 피로도 + 70;
                                    break;
                                default:
                                    break;
                            }
                            시간측정 = 시간 / 60;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 80,000 피로도: +60\n2.스파게티: 15,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 스테이크");
                            음식_ch = sc.nextInt();
                            switch(음식_ch){
                                case 1:
                                    밥먹기 = 1;
                                    if(자산 >= 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 60;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if(자산 >= 15000){
                                        자산 = 자산 - 15000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 30;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 15000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 30;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if(자산 >= 8000){
                                        자산 = 자산 - 8000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 10;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 120;
                                    }
                                    else if(자산 < 8000){
                                        밥먹기 = 0;
                                        if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default :
                                    밥먹기 = 1;
                                    if(자산 > 80000){
                                        자산 = 자산 - 80000;
                                        if(23 >= (시간 / 60 % 24) && 5 <= (시간 / 60 % 24)) {
                                            피로도 = 피로도 + 120;
                                        }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                        시간 = 시간 + 60;
                                    }
                                    else if(자산 < 80000){
                                        밥먹기 = 0;
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 80000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                            }
                            if(피로도 > 100){
                                피로도 = 100;
                            }

                            break;
                        default:
                            System.out.println("아무것도 안하고 1시간이 갑니다.");
                            시간 = 시간 + 60;
                            피로도 = 피로도 - 15;
                            break;
                    }
                    break;

                case 1:
                    ///////// 백화점 방문 ////////
                    if( 10 <= (시간 / 60 % 24) && 20 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("백화점 \n1.쇼핑 \n2.식사\n그외숫자. 그냥시간보내기");
                        백화점_ch = sc.nextInt();
                        switch (백화점_ch)
                        {
                            case 1:
                                ran = Math.random();
                                쇼핑_ran = ((int) (ran * 100));
                                if (쇼핑_ran > 80) {
                                    System.out.println("지금부터 1시간동안 할인행사 쓰여진금액의 50% 할인됩니다.");
                                    쇼핑_할인 = 5;
                                } else {
                                    쇼핑_할인 = 10;
                                }
                                System.out.println("무엇을 사시겠습니까?\n1.기념품 30,000 \n2.화장품 15,000 \n3.옷_상의 20,000 \n4.옷_하의 30,000 \n5.비타민 5,000 \n그외숫자.구경");
                                쇼핑_ch = sc.nextInt();

                                switch (쇼핑_ch) {
                                    case 1:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 2:
                                        if (자산 >= 15000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 15000 * 쇼핑_할인 / 10;
                                            System.out.println("화장품을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 3:
                                        if (자산 >= 20000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 20000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_상의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 4:
                                        if (자산 >= 30000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 30000 * 쇼핑_할인 / 10;
                                            System.out.println("옷_하의을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    case 5:
                                        if (자산 > 5000 * 쇼핑_할인 / 10) {
                                            자산 = 자산 - 5000 * 쇼핑_할인 / 10;
                                            System.out.println("비타민을 구매했습니다.\n잔액: " + 자산);
                                            시간 = 시간 + 120;
                                        } else {
                                            System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                            시간 = 시간 + 120;
                                        }
                                        break;
                                    default:
                                        System.out.println("백화점 구경합니다.");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                break;

                            case 2:
                                //(밥먹기)
                                System.out.println("메뉴를 고르세요.");
                                System.out.println("1.케밥: 8,000 피로도: +30\n2.굴라쉬: 10,000 피로도: +30\n3.햄버거: 8000 피로도: +10\n그외숫자는 구경");
                                음식_ch = sc.nextInt();
                                switch(음식_ch){
                                    case 1:
                                        밥먹기 = 1;
                                        if(자산 > 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            밥먹기 = 0;
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 2:
                                        밥먹기 = 1;
                                        if(자산 > 10000){
                                            자산 = 자산 - 10000;
                                            if(23 >= (시간 / 60) % 24 && 5 <= (시간 / 60) % 24) {
                                                피로도 = 피로도 + 30;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 10000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 30;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 12000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    case 3:
                                        밥먹기 = 1;
                                        if(자산 >= 8000){
                                            자산 = 자산 - 8000;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }else{ 밥먹기 = 0; System.out.println("자는시간이어 피로도 회복이 되지 않았습니다."); }
                                            시간 = 시간 + 120;
                                        }
                                        else if(자산 < 8000){
                                            밥먹기 = 0;
                                            if(23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                                피로도 = 피로도 + 10;
                                            }
                                            System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                            아르바이트 = 8000 - 자산;
                                            시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                            자산 = 5000 - (아르바이트 % 5000);
                                        }
                                        break;
                                    default : 밥먹기 = 0;
                                        System.out.println("식품코너 구경");
                                        시간 = 시간 + 120;
                                        break;
                                }
                                if(피로도 > 100){
                                    피로도 = 100;
                                }
                                break;
                            default: System.out.println("백화점 구경"); 시간 = 시간 +120;
                                break;

                        }
                    } else { System.out.println("백화점 Close시간 입니다."); }


                    break;

                ///////////////////////////////////////////////////
                case 2:
                    ///////// 국회 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("국회의사당\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    국회_ch = sc.nextInt();
                    switch (국회_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000 ) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default:  System.out.println("국회의사당 구경"); 시간 = 시간 +120;

                            break;

                    }


                    break;
                case 3:

                    ///////// 어부의요세 방문 //////////
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("어부의요세\n1.사진찍기\n2.기념품사기 \n그외숫자. 그냥시간보내기");

                    어부_ch = sc.nextInt();
                    switch (어부_ch){
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("무엇을 사시겠습니까?\n1.컵 20,000 \n2.프로치 20,000 \n3.인형 50,000 \n그외숫자.구경");
                            쇼핑_ch = sc.nextInt();

                            switch (쇼핑_ch) {
                                case 1:
                                    if (자산 >= 20000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("기념품을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간동안 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                case 2:
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 20000;
                                        System.out.println("브로치를 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                case 3:
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println("인형을 구매했습니다.\n잔액: " + 자산);
                                        시간 = 시간 + 120;
                                    } else {
                                        System.out.println("한도초과 입니다. 1시간 상품구경합니다.");
                                        시간 = 시간 + 120;
                                    }
                                    break;
                                default:
                                    System.out.println("기념품들을 구경합니다.");
                                    시간 = 시간 + 120;
                                    break;
                            }
                            break;
                        default: System.out.println("어부의 요세 구경"); 시간 = 시간 + 120;

                            break;

                    }
                    break;
                /////////////////////////////////////////

                case 4:
                    ///////// 카지노 방문 /////////
                    if( 20 <= (시간 / 60 % 24) || 5 >= (시간 / 60 % 24) )
                    {
                        System.out.println("무엇을 하시겠습니까?");
                        System.out.println("카지노\n1.젝팟 \n2.홀짝 \n나머지. 그냥시간보내기");

                        카지노_ch = sc.nextInt();
                        switch (카지노_ch){
                            case 1:
                                System.out.println("배팅 후 젝팟을 돌려 같은숫자가 나오면 배팅금액의 10배, 7로 같은숫자가 나오면 20배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                젝팟_1 = ((int) (ran * 10));
                                ran = Math.random();
                                젝팟_2 = ((int) (ran * 10));
                                System.out.println("3초 대기");
                                //    Thread.sleep(3000);
                                System.out.println(젝팟_1+""+젝팟_2);
                                if(젝팟_1 == 젝팟_2){
                                    if(젝팟_1==7){
                                        System.out.println("!!!!!!!77젝팟 성공!!!!!!");;
                                        자산 = 자산 + 배팅금액*20;
                                        System.out.println("보유금액: "+자산);
                                    }
                                    else {
                                        System.out.println("!!젝팟 성공!!");
                                        자산 = 자산 + 배팅금액 * 10;
                                        System.out.println("보유금액: " + 자산);
                                    }
                                }
                                else{ System.out.println("실패하였습니다.");System.out.println("보유금액: "+자산); }
                                시간 = 시간 + 120;
                                break;
                            case 2:

                                System.out.println("홀짝 맞추기 게임!!! \n 배팅후 홀수인지 짝수인지를 맞추면 배팅금액의 2배를 드립니다.");
                                System.out.println("배팅할 금액을 입력하세요.\n보유금액: "+자산);
                                배팅금액 = sc.nextInt();
                                if(자산 < 배팅금액){
                                    System.out.println("자금이부족하여 가지고있는 자산 전액을 배팅합니다.");
                                    배팅금액 = 자산;
                                    자산 = 0;
                                } else {
                                    자산 = 자산 - 배팅금액;
                                }
                                ran = Math.random();
                                홀짝_1 = ((int) (ran * 10));
                                System.out.println("홀수 짝수를 선택하세요.\n1.홀수   2.짝수\n 그외 숫자는 기부하는걸로.");
                                홀짝_ch = sc.nextInt();
                                System.out.println("3초대기");
                                //   Thread.sleep(3000);
                                if(홀짝_1 % 2 == 1 & 홀짝_ch == 1) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else if(홀짝_1 % 2 == 0 & 홀짝_ch == 2) {
                                    System.out.println("나온 숫자: "+홀짝_1+ "\n !!홀수!! 성공하셨습니다.");
                                    자산 = 자산 + 배팅금액*2;
                                    System.out.println("보유금액: "+자산);
                                }else { System.out.println("나온숫자: "+홀짝_1+"\n실패하였습니다.\n잔액: "+자산); }
                                시간 = 시간 + 120;
                                break;

                            default:
                                System.out.println("카지노 구경을 합니다.");
                                시간 = 시간 + 120;
                                break;
                        }
                    } else {System.out.println("영업시간이 아닙니다.");}
                    break;
                ///////////////////
                case 5:
                    System.out.println("무엇을 하시겠습니까?");
                    System.out.println("이슈트반 대성당\n1.사진을찍는다.(2시간) \n2.식사를한다.(2시간) \n그외숫자.그냥 2시간보내기");
                    성당_ch = sc.nextInt();
                    switch(성당_ch) {
                        case 1:
                            System.out.println("사진찍기\n 찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!찰칵!");
                            시간 = 시간 + 120;
                            break;
                        case 2:
                            System.out.println("메뉴를 고르세요.");
                            System.out.println("1.스테이크: 50,000 피로도: +50\n2.오리스테이크: 30,000 피로도: +40\n3.햄버거: 8000 피로도: +10\n그외숫자는 안먹는다");
                            음식_ch = sc.nextInt();
                            switch (음식_ch) {
                                case 1:
                                    밥먹기 = 1;
                                    if (자산 >= 50000) {
                                        자산 = 자산 - 50000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 50000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 50;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 50000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 2:
                                    밥먹기 = 1;
                                    if (자산 >= 15000) {
                                        자산 = 자산 - 15000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 15000) {
                                        밥먹기 = 0;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 40;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 15000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                case 3:
                                    밥먹기 = 1;
                                    if (자산 >= 8000) {
                                        자산 = 자산 - 8000;
                                        System.out.println((시간 / 60) % 24);
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        } else {
                                            밥먹기 = 0;
                                            System.out.println("자는시간이어 피로도 회복이 되지 않았습니다.");
                                        }
                                        시간 = 시간 + 120;
                                    } else if (자산 < 8000) {
                                        밥먹기 = 0;
                                        if (23 >= ((시간 / 60) % 24) && 5 <= ((시간 / 60) % 24)) {
                                            피로도 = 피로도 + 10;
                                        }
                                        System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                                        아르바이트 = 8000 - 자산;
                                        시간 = 시간 + 60 * (아르바이트 / 5000 + 1) + 60;
                                        자산 = 5000 - (아르바이트 % 5000);
                                    }
                                    break;
                                default: 밥먹기 = 0;
                                    System.out.println("그냥 나간다.");
                                    시간 = 시간+120;

                                    break;
                            }
                            break;
                        default: System.out.println("그냥 시간을 보낸다."); 시간= 시간 +120;
                            break;
                    }
                default:
                    break;
            }
            if (피로도 > 100) {
                피로도 = 100;
            }
            if (시간측정 != 시간 / 60) {
                if(밥먹기 == 0){
                    피로도 = 피로도 - 15 * (시간 / 60 - 시간측정);
                }
                시간측정 = 시간 / 60;
                밥먹기 = 0;
            }
            if (피로도 < 0){
                피로도 = 0;
            }
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");
            내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
            System.out.println(내정보);
            System.out.println("\n////////////////////////////////////////////////////////////////////////////");

            if(피로도 == 0){
                System.out.println("피로도를 모두 소진하여 호텔로 이동합니다.");
                시간 = 시간 + 5*60; 피로도 = 80;
                관광지 = 0;
                시간측정 = 시간 / 60;
                if(자산 >= 20000){
                    자산 = 자산 - 20000;
                }
                else if(자산 < 20000){
                    System.out.println("자산이 부족하여 강제 아르바이트에 들어갑니다.");
                    아르바이트 = 20000 - 자산;
                    시간 = 시간 + 60 * (아르바이트 / 5000 + 1);
                    자산 = 5000 - (아르바이트 % 5000);
                }
                현재위치 = "호텔";호텔_go = 0;백화점_go = 50;국회_go = 50;어부_go = 20;성당_go = 60;;카지노_go = 60;
                System.out.println("\n////////////////////////////////////////////////////////////////////////////");
                내정보 = "-내정보-\n이름: " + 이름 + "\n현위치: " + 현재위치 + "\n시간 : " + 시간 / 60 % 24 + "시 " + 시간 % 60 + "분\n피로도 : " + 피로도 + "\n자산 : " + 자산;
                System.out.println(내정보);
                System.out.println("////////////////////////////////////////////////////////////////////////////");
            }


        }





        System.out.println("여행이 종료되었습니다.");
    }

}

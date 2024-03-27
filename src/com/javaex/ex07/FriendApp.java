package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        
        //for문 시작

        for(int a = 0; a < friendArray.length; a++) {
        	
        	friendArray[a] = new Friend();
        //친구정보 3명 입력 로직 --> 반복문 사용
        	
        	System.out.print("이름: ");
        	friendArray[a].setName(sc.next());
        	System.out.print("핸드폰: ");
        	friendArray[a].setHp(sc.next());
        	System.out.print("학교: ");
        	friendArray[a].setSchool(sc.next());
        		
      
        //for문 끝
        
        }
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}

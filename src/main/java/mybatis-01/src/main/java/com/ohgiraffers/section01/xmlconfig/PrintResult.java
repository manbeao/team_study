package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class PrintResult {

    //전체 조회
    public void printMenuList(List<MenuDTO> menuList){
        for (MenuDTO menu : menuList){
            System.out.println(menu);
        }
    }

    //상세 조회
    public void printMenu(MenuDTO menu) {
        System.out.println(menu);
    }

    public void printErrormessage(String errorCode){
        String errorMessage="";
        switch (errorCode){
            case "selectList" : errorMessage = "메뉴 목록을 조회 실패 했습니다"; break;
            case "selectOne" : errorMessage = "메뉴 상세 조회를 실패하였습니다"; break;
            case  "insert" : errorMessage="신규 메뉴 등록을 실패하였습니다";break;
            case "update" : errorMessage="메뉴 수정에 실패했습니다";break;
            case "delete" : errorMessage="메뉴 삭제에 실패했습니다"; break;
            case "samePrice" : errorMessage="가격이 같은 메뉴 조회에 실패했습니다"; break;
        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage="";
        switch (successCode){
            case "insert" : successMessage ="신규 메뉴 등록을 성공하였습니다"; break;
            case  "update" : successMessage="메뉴 수정에 성공했습니다";break;
            case "delete" : successMessage ="메뉴 삭제에 성공했습니다";break;
            case "samePrice" : successMessage = "가격이 같은 메뉴 조회에 성공했습니다"; break;
        }

        System.out.println(successMessage);
    }
}

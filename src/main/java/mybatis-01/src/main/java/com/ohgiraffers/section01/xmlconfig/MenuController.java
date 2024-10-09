package com.ohgiraffers.section01.xmlconfig;

import java.util.List;
import java.util.Map;

public class MenuController {

    private final PrintResult printResult;
    private final MenuService menuService;

    public MenuController(){
        printResult = new PrintResult();
        menuService = new MenuService();
    }

    public void selectAllMenu() {
        List<MenuDTO> menuList = menuService.selectAllMenu();

        if (menuList != null){
            printResult.printMenuList(menuList);
        }else {
            printResult.printErrormessage("selectList");
        }
    }

    public void selectMenuByCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        MenuDTO menu = menuService.selectMenuByCode(code);

        if (menu != null){
            printResult.printMenu(menu);
        }else {
            printResult.printErrormessage("selectOne");
        }
    }

    public void registMenu(Map<String, String> parameter) {

        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int categorycode = Integer.parseInt(parameter.get("categoryCode"));

        MenuDTO menuDTO = new MenuDTO();
        menuDTO.setName(name);
        menuDTO.setPrice(price);
        menuDTO.setCategory(categorycode);

        if (menuService.registMenu(menuDTO)){
            printResult.printSuccessMessage("insert");
        }else {
            printResult.printErrormessage("insert");
        }
    }

    public void modifyMenu(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));
        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        MenuDTO menuDTO = new MenuDTO();
        menuDTO.setCode(code);
        menuDTO.setName(name);
        menuDTO.setPrice(price);
        menuDTO.setCategory(categoryCode);

        if(menuService.modifyMenu(menuDTO)){
            printResult.printSuccessMessage("update");
        }else {
            printResult.printErrormessage("update");
        }
    }

    public void deleteMenu(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        if (menuService.deleteMenu(code)){
            printResult.printSuccessMessage("delete");
        }else {
            printResult.printErrormessage("delete");
        }
    }

    public void samePriceMenu(Map<String, String> parameter) {
        int price = Integer.parseInt(parameter.get("price"));
        MenuDTO menu = menuService.selectMenuByCode(price);
        List<MenuDTO> menuList = menuService.selectSamePrice();

        if (menuList != null && menu !=null){
            printResult.printSuccessMessage("samePrice");
        }else {
            printResult.printErrormessage("samePrice");
        }

    }
}

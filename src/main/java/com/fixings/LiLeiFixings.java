package com.fixings;

/**
 * @author Zx
 * @date 2020/6/19 16:23
 * @modified By:
 */
public class LiLeiFixings implements IFixings {
    @Override
    public String produceFixings() {
        System.out.println("李雷做的配菜");
        return "李雷做的配菜";
    }
}

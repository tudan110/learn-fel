package indi.tudan.fel;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;

/**
 * 学习 fast-el
 *
 * @author wangtan
 * @date 2019-12-12 17:09:57
 * @since 1.0
 */
public class LearnFel {

    public static void main(String[] args) {

        FelEngine felEngine = new FelEngineImpl();
        System.out.println(felEngine.eval("5 * 34"));

    }

}

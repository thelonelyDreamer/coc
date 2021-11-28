package com.felixwc.coc.pojo.test;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * in order to learn java!
 * created at 2021/11/21 18:31
 *
 * @author wangchao
 */
@Data
public class A {
    private List<B> list;

    public A() {
        this.list = new ArrayList<B>();
    }
}

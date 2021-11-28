package com.felixwc.coc.pojo.test;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * in order to learn java!
 * created at 2021/11/21 18:32
 *
 * @author wangchao
 */
@Data
public class B {
    @JsonIgnore
    private List<A> list;

    public B() {
        this.list = new ArrayList<A>();
    }
}

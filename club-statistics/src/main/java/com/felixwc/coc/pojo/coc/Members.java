package com.felixwc.coc.pojo.coc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/11/21 12:49
 *
 * @author wangchao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Members {
    private List<Member> items;
    private Paging paging;
}

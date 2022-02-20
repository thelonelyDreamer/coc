package com.felixwc.coc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * in order to learn java!
 * created at 2021/11/20 16:39
 *
 * @author wangchao
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableTransactionManagement
public class BootCOC {

    public static void main(String[] args) {
        SpringApplication.run(BootCOC.class,args);
    }
}

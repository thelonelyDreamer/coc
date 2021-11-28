package com.felixwc.coc.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * in order to learn java!
 * created at 2021/11/21 14:30
 *
 * @author wangchao
 */
@ConfigurationProperties(prefix = "club")
@Configuration
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClubConfig {
    private String id = "%23299YQL9CU";
}

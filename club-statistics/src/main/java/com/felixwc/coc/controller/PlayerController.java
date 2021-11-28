package com.felixwc.coc.controller;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * in order to learn java!
 * created at 2021/11/22 13:33
 *
 * @author wangchao
 */
@Controller
@RequestMapping("/player")
@Log
public class PlayerController {
    @ResponseBody
    @GetMapping("/{tag}")
    public String getPlayerInfo(@PathVariable String tag){

        return tag;
    }

    @GetMapping("/validation/{tag}")
    @ResponseBody
    public boolean validatePlayer(@PathVariable String tag,@RequestParam("code") String apiCode){
        log.info(tag+ apiCode);
        return false;
    }

}

package com.felixwc.coc.service.coc;

import com.felixwc.coc.pojo.coc.player.PlayerInfo;

public interface PlayerService {
    PlayerInfo obtainPlayer(String playerTag);
    boolean validPlayer(String tag,String api);
}

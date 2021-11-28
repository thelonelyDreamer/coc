package com.felixwc.coc.pojo.coc.player;

import com.felixwc.coc.pojo.coc.League;
import jdk.nashorn.internal.ir.Labels;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/11/21 17:55
 *
 * @author wangchao
 */
public class PlayerInfo {
    private String tag;
    private String name;
    private int townHallLevel;
    private int townHallWeaponLevel;
    private int expLevel;
    private int trophies;
    private int bestTrophies;
    private int warStars;
    private int attackWins;
    private int defenseWins;
    private int builderHallLevel;
    private int versusTrophies;
    private int bestVersusTrophies;
    private int versusBattleWins;
    private String role;
    private String warPreference;
    private int donations;
    private int donationsReceived;
    private Clan clan;
    private League league;
    private LegendStatistics legendStatistics;
    private List<Achievements> achievements;
    private int versusBattleWinCount;
    private List<Labels> labels;
    private List<Heroes> heroes;
    private List<Spells> spells;
    private List<Troops> troops;
}

package jp.ac.uryukyu.ie.a;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WarriorTest {
    /**
     * Warriorの攻撃力がattackの150%になっているか検証。
     * 検証手順
     * (1)戦士と敵を準備。戦士の攻撃力と敵の体力の値を用いるので、わかりやすい値を与える。
     * (2)戦士が敵を攻撃する。
     * (3)敵が実際に減らされた体力値と戦士の攻撃力値 * 150%の値が等しいかを確かめ、これを3回検証する。
     */

    @Test
    void attackWithWeponSkillTest(){
        for(int i = 0; i<3; i++){
            int attackPower = 10;
            int demoSlimeHP = 100;
            boolean judge = false;
            Warrior demoWarrior = new Warrior("デモ戦士", 100, attackPower);
            Enemy demoSlime = new Enemy("デモスライム", demoSlimeHP, 10);
            demoWarrior.attackWithWeponSkill(demoSlime); 
            if(demoSlimeHP - demoSlime.getHitPoint() == attackPower * 1.5){
                judge = true;
            }
            assertEquals(judge, true);
        }   
    }
}
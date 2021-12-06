package jp.ac.uryukyu.ie.a;

public class Warrior extends LivingThing{
    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }
    public void attackWithWeponSkill(LivingThing e){
        if(hitPoint > 0){
            int damage = (int)(getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(),e.getName(), damage);
            e.wounded(damage);
    }

    }
}

package jp.ac.uryukyu.ie.a;

public class LivingThing {
    private String name;
    public int hitPoint;
    private int attack;
    public boolean dead;
    
    /**
     * void setName; //nameを設定する
     * @param _name 名前
     */
    public void setName(String _name){
        this.name = _name;
    }

    /**
     * String getName(); //nameを取得する
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * void setHitPoint; //hitPointを設定する
     * @param _hitPoint 敵のHP
     */
    public void setHitPoint(int _hitPoint){
        this.hitPoint = _hitPoint;
    }

    /**
     * int getHitPoint(); //hitPointを取得する
     * @return hitPoint
     */
    public int getHitPoint(){
        return hitPoint;
    }

    /**
     * void setAttack; //attackを設定する
     * @param _attack 敵の攻撃力
     */
    public void setAttack(int _attack){
        this.attack = _attack;
    }

    /**
     * int getAttack(); //attackを取得する
     * @return attack
     */
    public int getAttack(){
        return attack;
    }

    /**
     * void setDead; //deadを設定する
     * @param _dead 敵の生死状態。true = 死亡
     */
    public void setDead(boolean _dead){
        this.dead = _dead;
    }

    /**
     * boolean getDead(); //deadを取得する
     * @return dead
     */
    public boolean getDead(){
        return dead;
    }

   /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 指定キャラの名前
     * @param maximumHP 指定キャラのHP
     * @param attack 指定キャラの攻撃力
     */
    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        if(hitPoint > 0){
        int damage = (int)(Math.random() * attack);
        
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name,opponent.getName(), damage);
        opponent.wounded(damage);
    }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    public boolean isDead(){
        return isDead();
    }

}



package org.dp.StructuralPatterns.FlyWeightPattern;

public class Bullet {
    int x,y,velocity;
    BulletType type;


    public Bullet(String color, int x, int y, int velocity) {
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.type = BulletTypeFactory.getBulletType(color);
        System.out.println(display());
    }

    public String display(){
        return "Creating bullet of "+ type.color+" color at: ("+this.x+", "+this.y+") with velocity of "+ this.velocity;
    }
}

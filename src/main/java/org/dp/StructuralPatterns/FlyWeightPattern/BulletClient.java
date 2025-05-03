package org.dp.StructuralPatterns.FlyWeightPattern;

public class BulletClient {
    public static void main(String[] args) {
        // 5 Red Bullet Objects
        for(int i=0;i<5;i++){
            Bullet bullet = new Bullet("Red",i*10,i*12,5);
        }
        // 5 Green Bullet Objects
        for(int i=0;i<5;i++){
            Bullet bullet = new Bullet("Red",i*10,i*12,5);
        }

    }
}

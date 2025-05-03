package org.dp.StructuralPatterns.FlyWeightPattern;

import java.util.*;

public class BulletTypeFactory {

    public  static final Map<String, BulletType> map = new HashMap<>();

    public static BulletType getBulletType(String color){

        if(!map.containsKey(color)){
            map.put(color, new BulletType(color));
        }
        return map.get(color);
    }

}

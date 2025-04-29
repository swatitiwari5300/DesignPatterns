package org.dp.CreationalPatterns.BuilderPattern;

public class BuilderClient {

    public static void main(String[] args) {
        House house = new House.HouseBuilder("Cement", "Building", "tile")
                .setHasGarage(true).setHasGarden(true)
                .build();

        System.out.println(house);
    }
}

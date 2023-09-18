package br.com.exercises.sequential.terrain;


import br.com.exercises.sequential.terrain.Terrain;

public class Main {
    public static void main(String[] args) {
        Terrain terrainAndrade = new Terrain(10.0, 30.0, 200.0);

        Terrain terrainGiselle = new Terrain(12.0, 20.0, 150.0);

        System.out.println("Terrain 1" + "\n" + terrainAndrade);
        System.out.println("-=-=-=-=-=-=-=-=");
        System.out.println("Terrain 2" + "\n" + terrainGiselle);

    }
}

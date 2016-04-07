package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

import java.util.TreeSet;

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public static void main(String[] args) {
        TreeSet<Beach> beach = new TreeSet<>();
        beach.add(new Beach("Vasya",13.4f ,4));
        beach.add(new Beach("Katya", 12.5f, 5));
        beach.add(new Beach("Lilya", 15.3f, 5));
        beach.add(new Beach("Stas", 12.3f, 3));
        beach.add(new Beach("Olya", 11.4f, 6));

        for (Beach x : beach){
            System.out.println(x.getName() + " " + x.getDistance() + " " + x.getQuality());
        }

    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int qualityParam = quality - o.getQuality();
        int distanceParam = (int)(distance - o.getDistance());
        return 10000 * name.compareTo(o.getName()) + 100 * distanceParam + qualityParam;

    }
}

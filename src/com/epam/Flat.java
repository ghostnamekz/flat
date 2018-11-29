package com.epam;

import java.util.ArrayList;

public class Flat {
    public static void main(String[] args) {
        double SqFlat;

        ArrayList<Door> DoorCount = new ArrayList<>();
        ArrayList<Window> WindowCount = new ArrayList<>();
        Door Door1 = new Door(50, 20);
        DoorCount.add(Door1);
        Door Door2 = new Door(50, 20);
        DoorCount.add(Door2);
        Door Door3 = new Door(50, 20);
        DoorCount.add(Door3);
        Door Door4 = new Door(50, 20);
        DoorCount.add(Door4);
        Door Door5 = new Door(50, 20);
        DoorCount.add(Door5);

        Window Window1 = new Window(30, 30);
        WindowCount.add(Window1);
        Window Window2 = new Window(30, 30);
        WindowCount.add(Window2);
        Window Window3 = new Window(30, 30);
        WindowCount.add(Window3);

        Walls Room1OuterWall1 = new Walls(1, 2.7, 4);
        Walls Room1OuterWall2 = new Walls(2, 2.7, 2);
        Walls Room1OuterWall3 = new Walls(3, 2.7, 2);
        Walls Room1InnerWall4 = new Walls(4, 2.7, 4);
        Walls Room2InnerWall5 = new Walls(4, 2.7, 4);
        Walls Room2OuterWall6 = new Walls(5, 2.7, 2);
        Walls Room2OuterWall7 = new Walls(6, 2.7, 2);
        Walls Room2InnerWall8 = new Walls(7, 2.7, 4);
        Walls Room3InnerWall9 = new Walls(7, 2.7, 4);
        Walls Room3OuterWall10 = new Walls(10, 2.7, 2);
        Walls Room3OuterWall11 = new Walls(10, 2.7, 2);
        Walls Room3OuterWall12 = new Walls(10, 2.7, 4);

        ArrayList<Walls> WallCount = new ArrayList<>();
        WallCount.add(Room1OuterWall1);
        WallCount.add(Room1OuterWall2);
        WallCount.add(Room1OuterWall3);
        WallCount.add(Room1InnerWall4);
        if (Room2InnerWall5.equals(Room1InnerWall4) == false) {
            WallCount.add(Room2InnerWall5);
        }
        ;
        WallCount.add(Room2OuterWall6);
        WallCount.add(Room2OuterWall7);
        WallCount.add(Room2InnerWall8);
        if (Room3InnerWall9.equals(Room2InnerWall8) == false) {
            WallCount.add(Room3InnerWall9);
        }

        WallCount.add(Room3OuterWall10);
        WallCount.add(Room3OuterWall11);
        WallCount.add(Room3OuterWall12);
        SqFlat = ((Room1InnerWall4.getWidth() * Room1OuterWall3.getWidth()) + (Room2InnerWall5.getWidth() *
                Room2OuterWall6.getWidth()) +(Room3InnerWall9.getWidth() * Room3OuterWall12.getWidth()));

        System.out.println("Square of flat: " + SqFlat);
        System.out.println("Count of Doors: " + DoorCount.size());
        System.out.println("Count of Windows: " + WindowCount.size());
        System.out.println("Count of Walls: " + WallCount.size());
    }
}

package com.epam;

import java.util.Objects;

public class Walls {
    private int id;
    private double Height;
    private double Width;

     Walls(int id, double Height, double Width) {
        this.id = id;
        this.Height = Height;
        this.Width = Width;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;

        if (!(o instanceof Walls)) {
            return false;
        }
        Walls w = (Walls) o;
        return id == w.id &&
                Double.compare(w.Height, Height) == 0 &&
                Double.compare(w.Width, Width) == 0;
    }

    public double getWidth(){
        return Width;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id,Height,Width);
    }
}
package com.epam;

public class Window {
    WindowType Plastic, Wood;
    private double Height;
    private double Width;

    public Window(double Height, double Width) {
        if(Height>0){
        this.Height = Height;}
        this.Width = Width;
    }
}
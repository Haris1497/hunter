package com.example.haris.project;

public class Info
{
    private double Latitude;
    private double Longitude;

    public Info()
    {
        this.Latitude = 0;
        this.Longitude = 0;
    }

    public Info(double latitude, double longitude)
    {
        Latitude = latitude;
        Longitude = longitude;
    }

    public void setLatitude(double Latitude)
    {
        this.Latitude = Latitude;
    }

    public void setLongitude(double Longitude)
    {
        this.Longitude = Longitude;
    }

    public double getLatitude()
    {
        return Latitude;
    }

    public double getLongitude()
    {
        return Longitude;
    }
}
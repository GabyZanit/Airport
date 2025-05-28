/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.gaby.airports.projections;

/**
 *
 * @author ppjatb
 */
    public interface AirportNearMeProjection {
        
        long getId();
        String getName();
        String getCity();
        String getIataCode();
        double getLatitude();
        double getLongitude();
        double getAltitude();
        double getDistanciaKM();   
    }


    




package com.sparta.sdets.openweatherdtos;

public class DTOLocationQryImpl implements DTOLocationQry {

    //TODO implement these so that they can be utilised by the DTOMultiCityQry and DTOSingCityQry Objects

    @Override
    public boolean checkCoordinatesWithinRestraints(double lon, double lat){
        return true;    //TODO
    }

    @Override
    public boolean checkNullOrEmpty(Object variable){
        return true;    //TODO
    }

    @Override
    public boolean checkPercentageWithinRestraints(int percentage){
        return true;    //TODO
    }

    @Override
    public boolean checkPercentageWithinRestraints(double percentage){
        return true;    //TODO
    }

    @Override
    public boolean checkTemperatureWithinRestraints(double temp, double min, double max){
        return true;    //TODO
    }

    @Override
    public boolean checkTemperatureMinLessThanMax(double min, double max){
        return min <= max;    //TODO
    }

    @Override
    public boolean checkSunriseTimeLessThanSunsetTime(int Sunrise, int Sunset){
        return true;    //TODO
    }

    @Override
    public boolean checkSystemInformationValid(){
        return true;    //TODO
    }

    @Override
    public boolean checkWeatherIsOfValidResponse(Object weather){
        return true;    //TODO
    }
}
package com.sparta.sdets.openweatherdtos;

import java.time.Instant;

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
        return true;    //TODO
    }

    @Override
    public boolean checkSunriseTimeLessThanSunsetTime(int sunrise, int sunset){
        return sunrise<sunset;
    }

    @Override
    public boolean checkDtLessThanCurrentTime(int dateTime) {
        long currentTimestamp = Instant.now().toEpochMilli();
        return dateTime < currentTimestamp ;
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

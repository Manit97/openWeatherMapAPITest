package com.sparta.sdets.openweatherdtos;

import java.time.Instant;
import com.sparta.sdets.openweatherdtos.properties.Coord;

public class DTOLocationQryImpl implements DTOLocationQry {

    //TODO implement these so that they can be utilised by the DTOMultiCityQry and DTOSingCityQry Objects

    @Override
    public boolean checkCoordinatesWithinRestraints(double lon, double lat){
        if(lon >= -180.0000000 && lon <= 180.0000000){
            return true;
        }

        if (lat >= -90.0000000 && lat <= 90.0000000){
            return true;
        }
        else return false;

    }

    @Override
    public boolean checkNullOrEmpty(Object variable){
        return variable == "" || variable == null;
    }

    @Override
    public boolean checkPercentageWithinRestraints(int percentage){

        if(percentage >= 0 && percentage <= 100){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean checkPercentageWithinRestraints(double percentage){
        if(percentage >= 0 && percentage <= 100){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean checkTemperatureWithinRestraints(double temp, double min, double max){
        return (temp >= min) && (temp <= max);
    }

    @Override
    public boolean checkTemperatureMinLessThanMax(double min, double max){
        return min <= max;    //TODO
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

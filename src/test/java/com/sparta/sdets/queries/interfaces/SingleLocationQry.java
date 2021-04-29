package com.sparta.sdets.queries.interfaces;


public interface SingleLocationQry {

    boolean checkCoordinatesWithinRestraints(double lon, double lat);
    boolean checkNullOrEmpty(Object variable);
    boolean checkPercentageWithinRestraints(double percentage);
    boolean checkTemperatureWithinRestraints(double temp, double min, double max);
    boolean checkTemperatureMinLessThanMax(double min, double max);
    boolean checkSunriseTimeLessThanSunsetTime(int Sunrise, int Sunset);
    boolean checkDtLessThanCurrentTime(int dateTime);

}
package com.taxit.mini_pro_android_5779.model.entities;

public class LocationHandlerFactory {
    private static final LocationHandlerFactory ourInstance = new LocationHandlerFactory();

    public static LocationHandlerFactory getInstance() {
        return ourInstance;
    }

    private LocationHandlerFactory() {
    }
}

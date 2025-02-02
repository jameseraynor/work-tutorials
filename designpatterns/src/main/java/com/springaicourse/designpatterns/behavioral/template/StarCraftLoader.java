package com.springaicourse.designpatterns.behavioral.template;

public  class StarCraftLoader extends BaseGameLoader{


    @Override
    public byte[] loadLocalData() {
        System.out.println("Loading local StarCraft files...");
        // Some StarCraft Code...
        return new byte[0];
    }

    @Override
    public void createObjects(byte[] data) {
        System.out.println("Creating StarCraft objects...");
        // Some StarCraft Code...
    }

    @Override
    public void downloadAdditionalFiles() {
        System.out.println("Downloading StarCraft sounds...");
        // Some StarCraft Code...
    }

    @Override
    public void initializeProfiles() {
        System.out.println("Loading StarCraft profiles...");
        // Some StarCraft Code...
    }
}

package com.entertainment;

/*
 * Business class to model the workings of a television set.
 * No main() method here.
 */
public class Television {
    // class level static shared variables.
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "Sony", "LG", "Toshiba"};
    private static int instanceCount = 0;
    private boolean isMuted;
    private int oldVolume;  // not exposed via get/set methods - internal only

    // attributes or properties, called "fields" or "instance variables"
    private String brand = "Toshiba"; //default value when client doesn't give one
    private static int volume = 1;
    private DisplayType display = DisplayType.valueOf("LED");
    private Tuner tuner;


    // constructors
    public Television() {
        instanceCount++;
        tuner = new Tuner();
    }
    public Television(String brand) {
        this();
        setBrand(brand);
    }
    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // functions or operations, called "methods" in Java
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("turning on...Hello " + volume);
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    public void turnOff() {
        System.out.println("turning off... Goodbye " + volume);
    }

    public void mute() {
        if(!isMuted()) { // not currently mute
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        }
        else {      // are currently muted
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    public void changeChannel(String channel) {
        tuner.setChannel(channel);
    }

    public String getCurrentChannel() {
        return tuner.getChannel();
    }

    // accessor methods - provide "controlled access" to the object's internal data
    public boolean isMuted() {
        return isMuted;
    }

    public String getBrand() {
        return brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;
        }
        else {
            System.out.printf("Invalid volume: %s, valid range is %s-%s\n", volume, MIN_VOLUME, MAX_VOLUME);
//            System.out.println("Invalid Volume Requested");
        }
    }
        public static int getInstanceCount() {
        return instanceCount;
    }

    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand=%s, volume=%s, display=%s\n", getBrand(), volumeString, getDisplay());
//        return "Television: brand=" + getBrand() + ", volume=" + volumeString + ", display=" + getDisplay();
    }

    public void setBrand(String brand) {
        switch (brand) {
            case "Samsung":
            case "LG":
            case "Sony":
            case "Toshiba":
                this.brand = brand;
                break;
            default:
                System.out.println("Invalid brand:" + brand +
                        ", valid brands are Samsung, LG, Sony, Toshiba");
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }


}
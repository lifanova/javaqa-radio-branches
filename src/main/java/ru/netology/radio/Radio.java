package ru.netology.radio;

public class Radio {
    private static final int MIN_STATION_NUMBER = 0;
    private static final int MAX_STATION_NUMBER = 9;
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;

    private int maxStationNumber = MAX_STATION_NUMBER;

    // Номер текущей (прослушиваемой) радиостанции
    private int stationNumber;
    // Громкость звука
    private int volume;

    public Radio() {
    }

    public Radio(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public void setMaxStationNumber(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber > maxStationNumber) {
            this.stationNumber = MIN_STATION_NUMBER;
            return;
        }

        if (stationNumber < MIN_STATION_NUMBER) {
            this.stationNumber = maxStationNumber;
            return;
        }

        this.stationNumber = stationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
            return;
        }

        if (volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
            return;
        }

        this.volume = volume;
    }

    /**
     * Увеличить номер радиостанции (клиент нажал на кнопку next)
     * */
    public void increaseStationNumber(){
        if(stationNumber == maxStationNumber) {
            stationNumber = MIN_STATION_NUMBER;
            return;
        }

        stationNumber++;
    }

    /**
     * Уменьшить номер радиостанции (клиент нажал на кнопку prev)
     * */
    public void decreaseStationNumber(){
        if(stationNumber == MIN_STATION_NUMBER) {
            stationNumber = maxStationNumber;
            return;
        }

        stationNumber--;
    }

    /**
     * Увеличить громкость
     * */
    public void increaseVolume(){
        if(volume == MAX_VOLUME) {
            return;
        }

        volume++;
    }

    /**
     * Уменьшить громкость
     * */
    public void decreaseVolume(){
        if(volume == MIN_VOLUME) {
            return;
        }

        volume--;
    }
}

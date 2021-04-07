package ru.netology.radio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    /* Station Number Tests */
    @Test
    void setStationNumberInRangeTest(){
        Radio radio = new Radio();
        // Проверяем любой положительный сценарий: номер в диапазоне [0; 9]
        int number = 5;
        radio.setStationNumber(number);

        assertEquals(number, radio.getStationNumber());
    }

    @Test
    void setStationNumberLessMinTest(){
        Radio radio = new Radio();
        // Проверяем, если номер радиостанции < MIN
        int number = -1;
        // Ожидаемый результат
        int expected = 9;

        radio.setStationNumber(number);

        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    void setStationNumberMoreMaxTest(){
        Radio radio = new Radio();
        // Проверяем, если номер радиостанции > MAX
        int number = 10;
        // Ожидаемый результат
        int expected = 0;

        radio.setStationNumber(number);

        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    public void increaseStationNumberTest() {
        Radio radio = new Radio();
        // Проверяем переключение радиостанций (next)
        int number = 3;
        // Ожидаемый результат
        int expected = 4;

        radio.setStationNumber(number);
        radio.increaseStationNumber();
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    void decreaseStationNumberTest() {
        Radio radio = new Radio();
        // Проверяем переключение радиостанций (prev)
        int number = 3;
        // Ожидаемый результат
        int expected = 2;

        radio.setStationNumber(number);
        radio.decreaseStationNumber();
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    public void increaseStationNumberFromMaxTest() {
        Radio radio = new Radio();
        // Проверяем переключение радиостанций с максимальной
        int number = 9;
        // Ожидаемый результат
        int expected = 0;

        radio.setStationNumber(number);
        radio.increaseStationNumber();
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    public void decreaseStationNumberFromMinTest() {
        Radio radio = new Radio();
        // Проверяем переключение радиостанций с минимальной
        int number = 0;
        // Ожидаемый результат
        int expected = 9;

        radio.setStationNumber(number);
        radio.decreaseStationNumber();
        assertEquals(expected, radio.getStationNumber());
    }

    /* Volume Tests */

    @Test
    void setVolumeInRangeTest(){
        Radio radio = new Radio();
        // Проверяем любой положительный сценарий: громкость в диапазоне [0; 10]
        int volume = 5;
        radio.setVolume(volume);

        assertEquals(volume, radio.getVolume());
    }

    @Test
    void setVolumeLessMinTest(){
        Radio radio = new Radio();
        // Проверяем, если громкость < MIN
        int volume = -1;
        // Ожидаемый результат
        int expected = 0;

        radio.setVolume(volume);

        assertEquals(expected, radio.getVolume());
    }

    @Test
    void setVolumeMoreMaxTest(){
        Radio radio = new Radio();
        // Проверяем, если громкость > MAX
        int volume = 11;
        // Ожидаемый результат
        int expected = 10;

        radio.setVolume(volume);

        assertEquals(expected, radio.getVolume());
    }

    @Test
    void increaseVolumeTest() {
        Radio radio = new Radio();
        // Проверяем увеличение громкости
        int volume = 5;
        // Ожидаемый результат
        int expected = 6;

        radio.setVolume(volume);
        radio.increaseVolume();
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void decreaseVolumeTest() {
        Radio radio = new Radio();
        // Проверяем уменьшение громкости
        int volume = 5;
        // Ожидаемый результат
        int expected = 4;

        radio.setVolume(volume);
        radio.decreaseVolume();
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void increaseVolumeFromMaxTest() {
        Radio radio = new Radio();
        // Проверяем увеличение громкости с максимальной (громкость не изменится)
        int volume = 10;
        // Ожидаемый результат
        int expected = 10;

        radio.setVolume(volume);
        radio.increaseVolume();
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void decreaseVolumeFromMinTest() {
        Radio radio = new Radio();
        // Проверяем увеличение громкости с минимальной (громкость не изменится)
        int volume = 0;
        // Ожидаемый результат
        int expected = 0;

        radio.setVolume(volume);
        radio.decreaseVolume();
        assertEquals(expected, radio.getVolume());
    }
}

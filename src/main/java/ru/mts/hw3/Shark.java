package ru.mts.hw3;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Класс, представляющий собой акулу. Наследуется от класса Predator.
 */
public class Shark extends Predator {

    /**
     * Конструктор класса Shark.
     *
     * @param breed Порода акула.
     * @param name  Имя акула.
     * @param cost  Стоимость акула.
     * @param character Характер акула.
     */
    public Shark(String breed, String name, BigDecimal cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost.setScale(2, RoundingMode.HALF_UP);
        this.character = character;
    }

    /**
     * Конструктор класса Shark.
     *
     * @param breed Порода акулы.
     * @param name  Имя акулы.
     * @param cost  Стоимость акулы.
     */
    public Shark(String breed, String name, BigDecimal cost) {
        this.breed = breed;
        this.name = name;
        this.cost = cost.setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * Метод toString для получения строкового представления акулы.
     *
     * @return Строковое представление акулы.
     */
    @Override
    public String toString() {
        return "Shark{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                '}';
    }
}

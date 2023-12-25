package org.example.task;
/**
 * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары, а также
 * переопределение метода toString(), возвращающее строковое представление пары.
 */

public class Pair <T, S> {
    T elem1;
    S elem2;

    public Pair(T elem1, S elem2) {
        this.elem1 = elem1;
        this.elem2 = elem2;
    }

    public T getElem1() {
        return elem1;
    }

    public S getElem2() {
        return elem2;
    }

    @Override
    public String toString() {
        return String.format("Pair: (%s (type: %s), %s (type: %s)\n",
                elem1, elem1.getClass().getSimpleName(), elem2, elem2.getClass().getSimpleName());
    }
}

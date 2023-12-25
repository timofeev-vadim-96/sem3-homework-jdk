package org.example.task;

/**
 * * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(),
 * * divide(), subtract(). Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 */
public class Calculator{
    public static <T extends Number> T sum(T t1, T t2) {
        //для проверки выхода за границы допустимых значений суммы двух целочисленных элементов
        Long value = t1.longValue() + t2.longValue();
        //для проверки выхода за границы допустимых значений суммы двух дробных элементов
        //при превышении значения для типов данных double или long при суммировании, выбросится дефолтное исключение
        Double fractional = t1.doubleValue() + t2.doubleValue();
        if (t1 instanceof Double || t2 instanceof Double)
            return (T) Double.valueOf(t1.doubleValue() + t2.doubleValue());
        else if ((t1 instanceof Float || t2 instanceof Float) && Float.MIN_VALUE <= fractional && fractional <= Float.MAX_VALUE)
            return (T) Float.valueOf(t1.floatValue() + t2.floatValue());
        else if ((t1 instanceof Long || t2 instanceof Long))
            return (T) Long.valueOf(t1.longValue() + t2.longValue());
        else if (t1 instanceof Integer || t2 instanceof Integer && Integer.MIN_VALUE <= value && value <= Integer.MAX_VALUE)
            return (T) Integer.valueOf(t1.intValue() + t2.intValue());
        else if (t1 instanceof Short || t2 instanceof Short && Short.MIN_VALUE <= value && value <= Short.MAX_VALUE)
            return (T) Short.valueOf(value.shortValue());
        if (t1 instanceof Byte || t2 instanceof Byte && Byte.MIN_VALUE <= value && value <= Byte.MAX_VALUE) {
            return (T) Byte.valueOf(value.byteValue());
        }
        else throw new NumberFormatException();
    }

    public static <T extends Number> T multiply(T t1, T t2) {
        //для проверки выхода за границы допустимых значений суммы двух целочисленных элементов
        Long value = t1.longValue() * t2.longValue();
        //для проверки выхода за границы допустимых значений суммы двух дробных элементов
        //при превышении значения для типов данных double или long при суммировании, выбросится дефолтное исключение
        Double fractional = t1.doubleValue() * t2.doubleValue();
        if (t1 instanceof Double || t2 instanceof Double)
            return (T) Double.valueOf(t1.doubleValue() * t2.doubleValue());
        else if ((t1 instanceof Float || t2 instanceof Float) && Float.MIN_VALUE <= fractional && fractional <= Float.MAX_VALUE)
            return (T) Float.valueOf(t1.floatValue() * t2.floatValue());
        else if ((t1 instanceof Long || t2 instanceof Long))
            return (T) Long.valueOf(t1.longValue() * t2.longValue());
        else if (t1 instanceof Integer || t2 instanceof Integer && Integer.MIN_VALUE <= value && value <= Integer.MAX_VALUE)
            return (T) Integer.valueOf(t1.intValue() * t2.intValue());
        else if (t1 instanceof Short || t2 instanceof Short && Short.MIN_VALUE <= value && value <= Short.MAX_VALUE)
            return (T) Short.valueOf(value.shortValue());
        if (t1 instanceof Byte || t2 instanceof Byte && Byte.MIN_VALUE <= value && value <= Byte.MAX_VALUE) {
            return (T) Byte.valueOf(value.byteValue());
        }
        else throw new NumberFormatException();
    }

    public static <T extends Number> T divide(T t1, T t2) {
        //для проверки выхода за границы допустимых значений суммы двух целочисленных элементов
        Long value = t1.longValue() / t2.longValue();
        //для проверки выхода за границы допустимых значений суммы двух дробных элементов
        //при превышении значения для типов данных double или long при суммировании, выбросится дефолтное исключение
        Double fractional = t1.doubleValue() / t2.doubleValue();
        if (t1 instanceof Double || t2 instanceof Double)
            return (T) Double.valueOf(t1.doubleValue() / t2.doubleValue());
        else if ((t1 instanceof Float || t2 instanceof Float) && Float.MIN_VALUE <= fractional && fractional <= Float.MAX_VALUE)
            return (T) Float.valueOf(t1.floatValue() / t2.floatValue());
        else if ((t1 instanceof Long || t2 instanceof Long))
            return (T) Long.valueOf(t1.longValue() / t2.longValue());
        else if (t1 instanceof Integer || t2 instanceof Integer && Integer.MIN_VALUE <= value && value <= Integer.MAX_VALUE)
            return (T) Integer.valueOf(t1.intValue() / t2.intValue());
        else if (t1 instanceof Short || t2 instanceof Short && Short.MIN_VALUE <= value && value <= Short.MAX_VALUE)
            return (T) Short.valueOf(value.shortValue());
        if (t1 instanceof Byte || t2 instanceof Byte && Byte.MIN_VALUE <= value && value <= Byte.MAX_VALUE) {
            return (T) Byte.valueOf(value.byteValue());
        }
        else throw new NumberFormatException();
    }

    public static <T extends Number> T subtract(T t1, T t2) {
        //для проверки выхода за границы допустимых значений суммы двух целочисленных элементов
        Long value = t1.longValue() - t2.longValue();
        //для проверки выхода за границы допустимых значений суммы двух дробных элементов
        //при превышении значения для типов данных double или long при суммировании, выбросится дефолтное исключение
        Double fractional = t1.doubleValue() - t2.doubleValue();
        if (t1 instanceof Double || t2 instanceof Double)
            return (T) Double.valueOf(t1.doubleValue() - t2.doubleValue());
        else if ((t1 instanceof Float || t2 instanceof Float) && Float.MIN_VALUE <= fractional && fractional <= Float.MAX_VALUE)
            return (T) Float.valueOf(t1.floatValue() - t2.floatValue());
        else if ((t1 instanceof Long || t2 instanceof Long))
            return (T) Long.valueOf(t1.longValue() - t2.longValue());
        else if (t1 instanceof Integer || t2 instanceof Integer && Integer.MIN_VALUE <= value && value <= Integer.MAX_VALUE)
            return (T) Integer.valueOf(t1.intValue() - t2.intValue());
        else if (t1 instanceof Short || t2 instanceof Short && Short.MIN_VALUE <= value && value <= Short.MAX_VALUE)
            return (T) Short.valueOf(value.shortValue());
        if (t1 instanceof Byte || t2 instanceof Byte && Byte.MIN_VALUE <= value && value <= Byte.MAX_VALUE) {
            return (T) Byte.valueOf(value.byteValue());
        }
        else throw new NumberFormatException();
    }
}


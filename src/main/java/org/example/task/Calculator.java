package org.example.task;

/**
 * * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(),
 * * divide(), subtract(). Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 */
public class Calculator {
    public static <T extends Number> T sum(T t1, T t2) {
        //для проверки выхода за границы допустимых значений суммы двух целочисленных элементов
        Long value = t1.longValue() + t2.longValue();
        //для проверки выхода за границы допустимых значений суммы двух дробных элементов
        //при превышении значения для типов данных double или long при суммировании, выбросится дефолтное исключение
        Double fractional = t1.doubleValue() + t2.doubleValue();
        if (isDouble(t1, t2))
            return (T) fractional;
        else if (isFloat(t1, t2, fractional))
            return (T) Float.valueOf(fractional.floatValue());
        else if (isLong(t1, t2))
            return (T) value;
        else if (isInteger(t1, t2, value))
            return (T) Integer.valueOf(value.intValue());
        else if (isShort(t1, t2, value))
            return (T) Short.valueOf(value.shortValue());
        if (isByte(t1, t2, value)) {
            return (T) Byte.valueOf(value.byteValue());
        } else throw new NumberFormatException();
    }

    public static <T extends Number> T multiply(T t1, T t2) {
        Long value = t1.longValue() * t2.longValue();
        Double fractional = t1.doubleValue() * t2.doubleValue();
        if (isDouble(t1, t2))
            return (T) fractional;
        else if (isFloat(t1, t2, fractional))
            return (T) Float.valueOf(fractional.floatValue());
        else if (isLong(t1, t2))
            return (T) value;
        else if (isInteger(t1, t2, value))
            return (T) Integer.valueOf(value.intValue());
        else if (isShort(t1, t2, value))
            return (T) Short.valueOf(value.shortValue());
        if (isByte(t1, t2, value)) {
            return (T) Byte.valueOf(value.byteValue());
        } else throw new NumberFormatException();
    }

    public static <T extends Number> T divide(T t1, T t2) {
        Long value = t1.longValue() / t2.longValue();
        Double fractional = t1.doubleValue() / t2.doubleValue();
        if (isDouble(t1, t2))
            return (T) fractional;
        else if (isFloat(t1, t2, fractional))
            return (T) Float.valueOf(fractional.floatValue());
        else if (isLong(t1, t2))
            return (T) value;
        else if (isInteger(t1, t2, value))
            return (T) Integer.valueOf(value.intValue());
        else if (isShort(t1, t2, value))
            return (T) Short.valueOf(value.shortValue());
        if (isByte(t1, t2, value)) {
            return (T) Byte.valueOf(value.byteValue());
        } else throw new NumberFormatException();
    }

    public static <T extends Number> T subtract(T t1, T t2) {
        Long value = t1.longValue() - t2.longValue();
        Double fractional = t1.doubleValue() - t2.doubleValue();
        if (isDouble(t1, t2))
            return (T) fractional;
        else if (isFloat(t1, t2, fractional))
            return (T) Float.valueOf(fractional.floatValue());
        else if (isLong(t1, t2))
            return (T) value;
        else if (isInteger(t1, t2, value))
            return (T) Integer.valueOf(value.intValue());
        else if (isShort(t1, t2, value))
            return (T) Short.valueOf(value.shortValue());
        if (isByte(t1, t2, value)) {
            return (T) Byte.valueOf(value.byteValue());
        } else throw new NumberFormatException();
    }

    private static <T extends Number> boolean isByte(T t1, T t2, Long value) {
        return t1 instanceof Byte || t2 instanceof Byte && Byte.MIN_VALUE <= value && value <= Byte.MAX_VALUE;
    }

    private static <T extends Number> boolean isShort(T t1, T t2, Long value) {
        return t1 instanceof Short || t2 instanceof Short && Short.MIN_VALUE <= value && value <= Short.MAX_VALUE;
    }

    private static <T extends Number> boolean isInteger(T t1, T t2, Long value) {
        return t1 instanceof Integer || t2 instanceof Integer && Integer.MIN_VALUE <= value && value <= Integer.MAX_VALUE;
    }

    private static <T extends Number> boolean isLong(T t1, T t2) {
        return t1 instanceof Long || t2 instanceof Long;
    }

    private static <T extends Number> boolean isFloat(T t1, T t2, Double fractional) {
        return t1 instanceof Float || t2 instanceof Float && Float.MIN_VALUE <= fractional && fractional <= Float.MAX_VALUE;
    }

    private static <T extends Number> boolean isDouble(T t1, T t2) {
        return t1 instanceof Double || t2 instanceof Double;
    }
}


/**
 * Класс преобразования строки в массив
 */

public final class ArrayCreation {
    public static Object[] add(String[] values, String valueForAdd) {
        int length = values != null ? values.length : 0;
        String[] result = new String[length + 1];
        for (int i = 0; i < length; i++) {
            result[i] = values[i];
        }
        result[length] = String.valueOf(valueForAdd);
        return result;
    }
}


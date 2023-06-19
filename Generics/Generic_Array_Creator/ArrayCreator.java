package Generic_Array_Creator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.reflect.Array.newInstance;

public class ArrayCreator {

    public static <T> T[] create(int length, T item) {
        return create(item.getClass(), length, item);

    }

    public static <T> T[] create(Class<?> clazz, int length, T item) {

        T[] array;
        array = (T[]) newInstance(clazz, length);
        Arrays.fill(array, item);
        return array;
    }
}
//public class ArrayCreator {
//
//    public static <T> T[] create(int length, T item) {
//       T[] array;
//        array = (T[]) new Object[length];
//        Arrays.fill(array, item);
//        return array;
//    }
//
//    public static <T> T[] create(Class<T> tClass, int length, T item) {
//
//        T[] array = (T[]) Array.newInstance(tClass, length);
//        Arrays.fill(array, item);
//        return array;
//    }
//}
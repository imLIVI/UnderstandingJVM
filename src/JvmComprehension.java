/*Подсистема загрузчиков классов (ClassLoaders) производит
поиск класса JvmComprehension последовательно на 3 уровнях:
- на уровне ядра (Bootstrap ClassLoader)
- на уровне платформы (Platform ClassLoader)
- на уровне приложения (Application ClassLoader).

Если класс найден на каком-либо их уровней, то
- выполняется проверка того, код валиден. Система проверяет, нет ли ошибок в байт-коде.
Например, проверяет корректность инструкций, переполнение стека и совместимость типов переменных (Verify)
- выделяется память под статические поля и их инициализация (Prepare)
- происходит связывание ссылок на другие классы, методы и поля (Resolve)
- выполняются все static инициализаторы.
Далее выполняется загрузка данных о классе JvmComprehension в Metaspace. Если же класс
не найден, то появится ошибка ClassNotFoundException.

Когда JVM получила JvmComprehension.class, интерпретатор интерпретирует
код строка за строкой и рассортировывает переменные по областям памяти, после чего выполняет код.

Сборщик мусора периодически сибирает не используемые объекты из памяти путем обхода графа достижимых объектов.
При сборке мусора происходит Stop The World пауза - полная остановка программы для безопасной сборки мусора.
*
* */
public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1;                      // 1
        Object o = new Object();        // 2
        Integer ii = 2;                 // 3
        printAll(o, i, ii);             // 4
        System.out.println("finished"); // 7
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5
        System.out.println(o.toString() + i + ii);  // 6
    }
}
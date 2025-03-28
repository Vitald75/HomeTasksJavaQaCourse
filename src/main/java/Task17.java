// Lambda expression

public class Task17 {

    //описание фукционального интерфейса
    @FunctionalInterface
    interface Operationable{
        int calculate(int x, int y, int z);
    }

    public static void main(String[] args) {

        Operationable operationFindMax;
        // реализация лябмда выражения
        operationFindMax = (x,y, z)-> {
            int res;
            if (x>y)  {res = x;} else {res = y;}
            if (res < z) res = z;
            return res;
        };

        Operationable operationFindSum;
        // реализация лябмда выражения для суммы, упрощенный вид
        operationFindSum = (x,y,z)-> x + y + z;

        int resultMax = operationFindMax.calculate(60, 45, 35);
        System.out.println(resultMax); //

        int resultSum = operationFindSum.calculate(60, 45, 35);
        System.out.println(resultSum); //

    }
}



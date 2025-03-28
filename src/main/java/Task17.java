// Lambda expression

public class Task17 {

    @FunctionalInterface
    interface Operationable{
        int calculate(int x, int y, int z);
    }

    public static void main(String[] args) {

        Operationable operationFindMax;
        operationFindMax = (x,y, z)-> {
            int res;
            if (x>y)  {res = x;} else {res = y;}
            if (res < z) res = z;
            return res;
        };

        Operationable operationFindSum;
        operationFindSum = (x,y,z)-> {
            return x + y + z;
        };


        int resultMax = operationFindMax.calculate(60, 45, 35);
        System.out.println(resultMax); //

        int resultSum = operationFindSum.calculate(60, 45, 35);
        System.out.println(resultSum); //




    }
}



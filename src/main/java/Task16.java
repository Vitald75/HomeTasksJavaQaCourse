// Lambda expression

public class Task16 {
    interface Operationable{
        int calculate(int x, int y, int z);
    }

    public static void main(String[] args) {

        Operationable operation;
        operation = (x,y, z)-> {
            int res;
            if (x>y)  {res = x;} else {res = y;}
            if (res < z) res = z;
            return res;
        };

        int result = operation.calculate(60, 45, 35);
        System.out.println(result); //30
    }
}



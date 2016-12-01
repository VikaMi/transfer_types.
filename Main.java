public class Main {

    public static void main(String[] args) {

        int val = calcSum(-3, 3);

        System.out.println(val);

    }
//рекурсія - можливість викликати в нашій функції такий самий метод
    static int calcSum(int a, int b){
        int sum = a + b;
        if(sum == 0) {
            sum = calcSum(1, 1);
        }
        return sum;
    }
}



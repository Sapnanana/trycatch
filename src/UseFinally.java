public class UseFinally {
    public static void generateException(int what){
        int t;
        int numbers[]= new int[3];
        System.out.println("input value" + what);
        try {
            switch (what){
                case 0:
                    t=10/what;break;
                case 1:
                    numbers[4]=4;break;
                case 2:
                    return;
            }
        }catch (ArithmeticException e){
            System.out.println("You cant divide by zero");
        }catch (IndexOutOfBoundsException e){
            System.out.println("There is no such a  thing");

        }finally {
            System.out.println("This code is always be used");
        }
    }
}

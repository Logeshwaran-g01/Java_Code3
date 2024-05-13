public class ExceptionDemo {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException
        try{
            int[] array = {1, 2, 3};
            System.out.println(array[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // StringIndexOutOfBoundsException

        try{
            String str = "Lokesh";
            System.out.println(str.charAt(10));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}

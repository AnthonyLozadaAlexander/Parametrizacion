package E4;

public class Main {
    public static void main(String[] args) {

        String[] nombres = {"Juan", "Pedro", "Carlos"};
        Integer[] nums = {10, 20, 30};

        mostrarArrUniversal(nombres);
        mostrarArrUniversal(nums);

    }

    public static <T> void mostrarArrUniversal(T[] arr){
        int count = 0;
        for(T i : arr){
            System.out.println("T["+count+"]");
            System.out.println(i);
            count++;
        }
    }
}

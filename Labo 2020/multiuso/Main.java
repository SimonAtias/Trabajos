package multiuso;

public class Main {
    public static void main(String[] args) {

        ArrayListMejorada<Integer> alm = new ArrayListMejorada<>();
        alm.agregarElementosIndefinidos(1,2,3,4,5,6,7,8,9,10);
        for(int n: alm){
            System.out.println(n);
        }
    }
}

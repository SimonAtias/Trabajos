package multiuso;
import java.util.ArrayList;

public class ArrayListMejorada<E> extends ArrayList<E>{

    public void agregarElementosIndefinidos(E... elementos){
        for (E v: elementos){
            this.add(v);
        }
    }

}

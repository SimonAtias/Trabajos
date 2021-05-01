package multiuso;
import java.util.HashSet;

public class HashSetMejorado<E> extends HashSet<E>{

    public void agregarElementosIndefinidos(E... elementos){
        for(E elem: elementos){
            this.add(elem);
        }
    }

}

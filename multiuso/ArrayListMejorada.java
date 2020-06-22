package multiuso;
import java.util.ArrayList;

public class ArrayListMejorada extends ArrayList{

    public void agregarElementosIndefinidos(Object... elementos){
        for (Object o: elementos){
            this.add(o);
        }
    }

}

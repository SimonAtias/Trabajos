import java.util.ArrayList;

public class Hotel {

    private ArrayList<Persona> Huesped = new ArrayList<Persona>();
    private ArrayList<Habitacion> Habitaciones = new ArrayList<Habitacion>();

    public int sacarParametroDelMayor(ArrayList<Persona> gente){
        int i=1;
        int parameter = 0;
        int mayor=gente.get(0).getVecesHospedado();
        while(i<gente.size()){
            if(gente.get(i).getVecesHospedado()>mayor){
                mayor = gente.get(i).getVecesHospedado();
                parameter=i;
            }
            i++;
        }
        return parameter;
    }

    public int sacarParametroDeLaHabMasSoli(){
        ArrayList<Habitacion> habitaciones= this.Habitaciones;
        int i=1;
        int parameter = 0;
        int mayor=habitaciones.get(0).getSolicitudes();
        while(i<habitaciones.size()){
            if(habitaciones.get(i).getSolicitudes()>mayor){
                mayor = habitaciones.get(i).getSolicitudes();
                parameter=i;
            }
            i++;
        }
        return parameter;
    }

    public void addClientes(Persona clienteEquis) {
        this.Huesped.add(clienteEquis);
    }

    public void addHabitacion(Habitacion habitacionEquis) {
        this.Habitaciones.add(habitacionEquis);
    }

    public void masFrecuentes(){                                    // Metodo para sacar a los Huespedes mas frecuentes: Crea un arreglo en el que obtiene todos los huespedes y por la
        ArrayList<Persona> frecuentes= new ArrayList<>();           // variable vecesHospedado se obtienen los DNIs que tienen los 2 mas hospedados huespedes.  La logica es: se  busca
        ArrayList<Persona> huespedes = (ArrayList<Persona>) this.Huesped.clone();                 // el parametro del mayor, se lo saca del arreglo en donde estan todos y se pone en uno nuevo para despues mostrarlo
        int i=0;
        while(i<2){
            int parametroMayor=sacarParametroDelMayor(huespedes);
            frecuentes.add(huespedes.get(parametroMayor));
            huespedes.get(parametroMayor).printDNIs();
            huespedes.remove(parametroMayor);
            i++;
        }
    }

    public void masSolicitadas(){ //imprime la 5 habitaciones mas solicitadas. Usa la misma logica que el de los huespedes que mas frecuentan el hotel.
        ArrayList<Habitacion> habitaciones= this.Habitaciones;
        ArrayList<Habitacion> habitacionesMasSolicitadas= new ArrayList<Habitacion>();
        int i=0;
        while(i<5){
            int parametroMayor=this.sacarParametroDeLaHabMasSoli();
            habitacionesMasSolicitadas.add(habitaciones.get(parametroMayor));
            habitaciones.remove(parametroMayor);
            habitaciones.get(parametroMayor).printNumeroHab();
            i++;
        }
    }

    public void habOcupadas(){
        int i=0;
        System.out.println("Las habitaciones no disponibles son:");
        while(i<this.Habitaciones.size()){
            if(this.Habitaciones.get(i).getOcupada()){
                System.out.println(Habitaciones.get(i).getNumero());
            }
            i++;
        }
    }

    public void habDisponibles(){
        int i=0;
        System.out.println("Las habitaciones disponibles son:");
        while(i<this.Habitaciones.size()){
            if(!this.Habitaciones.get(i).getOcupada()){
                System.out.println(Habitaciones.get(i).getNumero());
            }
            i++;
        }
    }

    public int getIngresoTotal(){
        int ingreso=0;
        int i=0;
        while(i<this.Habitaciones.size()){
            if(this.Habitaciones.get(i).getOcupada()){
                int dias=this.Habitaciones.get(i).getHuespedes().getFechaEntrada().getCantDias(this.Habitaciones.get(i).getHuespedes().getFechaSalida());
                if(dias<30) {
                    ingreso = ingreso + dias * this.Habitaciones.get(i).getPrecioPorDia();
                }
                else{
                    int monto = dias*(this.Habitaciones.get(i).getPrecioPorDia());
                    ingreso = ingreso + monto - (monto / 4);
                }
            }
            i++;
        }
        return ingreso;
    }

    public void personasEstadiaProlongada(){
        int i = 0;
        while(i<this.Huesped.size()){
            if(this.Huesped.get(i).getFechaEntrada().getCantDias(this.Huesped.get(i).getFechaSalida())>30){
                System.out.println(Huesped.get(i).getDNI());
            }
            i++;
        }
    }

    public int getHuespedDNI(int numHab) {
        int i=0;
        while(i<Habitaciones.size()){
            if(numHab==Habitaciones.get(i).getNumero()){
                break;
            }
        }
        return Habitaciones.get(i).getHuespedes().getDNI();
    }

    public void importeAPagar(){
        int i=0;
        while(i<this.Habitaciones.size()){
            if(this.Habitaciones.get(i).getOcupada()){
                System.out.println("Nombre: "+this.Habitaciones.get(i).getHuespedes().getNombre()+" "+this.Habitaciones.get(i).getHuespedes().getApellido()+". Importe a pagar: "+ this.Habitaciones.get(i).getPrecioPorDia()*this.Habitaciones.get(i).getHuespedes().getFechaEntrada().getCantDias(this.Habitaciones.get(i).getHuespedes().getFechaSalida()));
            }
            i++;
        }
    }



}


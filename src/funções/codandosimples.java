package funções;

public class codandosimples {
    public static void main(String[] args) {

        //aqui acabamos de definir a nossa expressão lambda
        Taxi taxi = ()->  {
                System.out.println("Taxi reservado");

        };



    }
}

interface  Taxi{
    void reservar();
}

class TaxiImpl implements Taxi{

    @Override
    public void reservar() {
        System.out.println("Taxi reservado");
    }
}
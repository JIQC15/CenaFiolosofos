package backend;

public class MainTemporal {

    public static void main(String[] args) {
        int numFilosofos = 5; // Número de filósofos en la mesa
        Mesa mesa = new Mesa(numFilosofos); // Crear la mesa y tenedores

        // Crear e iniciar a los filósofos
        filosofos[] filosofos = new filosofos[numFilosofos];
        for (int i = 0; i < numFilosofos; i++) {
            Tenedor tenedorIzquierdo = mesa.getTenedorIzquierdo(i);
            Tenedor tenedorDerecho = mesa.getTenedorDerecho(i);
            filosofos[i] = new filosofos(i, tenedorIzquierdo, tenedorDerecho, mesa);
            filosofos[i].start(); // Iniciar el hilo del filósofo
        }

        //Esperar a que todos los filósofos terminen (esto es opcional)
        try {
            for (filosofos filosofo : filosofos) {
                filosofo.join();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

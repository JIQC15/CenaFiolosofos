package backend;

public class Tenedor {

    public int numero;
    public boolean disponible = true;

    public Tenedor(int numero) {
        this.numero = numero;
    }

    public synchronized void tomar(int filosofoId) throws InterruptedException {
        while (!disponible) {
            wait(); // Espera hasta que el tenedor esté disponible
        }
        disponible = false;
        System.out.println("Filosofo " + filosofoId + " tomo el tenedor " + getNumero());
    }

    public synchronized void soltar(int filosofoId) {
        disponible = true;
        notifyAll(); // Notifica a todos los filósofos en espera que el tenedor está disponible
        System.out.println("Filosofo " + filosofoId + " solto el tenedor " + getNumero());
    }

    public int getNumero() {
        return numero;
    }
    
    public boolean getDisponible() {
        return disponible;
    }
    
}

package backend;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Filosofo extends Thread {

    //Atributos
    public int id;
    public Tenedor tenedorIzquierdo;
    public Tenedor tenedorDerecho;
    public Mesa mesa;
    public boolean estaComiendo;
    public boolean estaPensando;
    public Tenedor tenedorAgarradoIzquierdo;
    public Tenedor tenedorAgarradoDerecho;
    private volatile boolean detenerHilo = false; // Variable para controlar la detención del hilo

    public Filosofo(int id, Tenedor tenedorIzquierdo, Tenedor tenedorDerecho, Mesa mesa) {
        this.id = id;
        this.tenedorIzquierdo = tenedorIzquierdo;
        this.tenedorDerecho = tenedorDerecho;
        this.mesa = mesa;
        this.estaComiendo = false;
    }
    
    public void detener() {
        detenerHilo = true; // Establecer la bandera de detención en true
    }

    public Tenedor getTenedorAgarradoIzquierdo() {
        return tenedorAgarradoIzquierdo;
    }

    public Tenedor getTenedorAgarradoDerecho() {
        return tenedorAgarradoDerecho;
    }

    public int idFilosofo() {
        return id;
    }

    @Override
    public void run() {
        try {
            while (!detenerHilo) {
                pensar();
                tomarTenedores();
                comer();
                soltarTenedores();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void pensar() throws InterruptedException {
        estaPensando = true;
        System.out.println("Filosofo " + id + " esta pensando.");
        Thread.sleep((long) (Math.random() * 6000)); // Simula el tiempo de pensamiento

    }

    private void tomarTenedores() throws InterruptedException {
        // Obtener los tenedores izquierdo y derecho de la mesa
        Tenedor izquierdo = mesa.getTenedorIzquierdo(id);
        Tenedor derecho = mesa.getTenedorDerecho(id);

        // Tomar los tenedores de la mesa
        izquierdo.tomar(id);
        derecho.tomar(id);

        // Asignar los tenedores agarrados a los atributos
        tenedorAgarradoIzquierdo = izquierdo;
        tenedorAgarradoDerecho = derecho;

        // Imprimir información sobre los tenedores agarrados
//        System.out.println("Filosofo " + id + " agarro el tenedor izquierdo " + izquierdo.getNumero() + " y el tenedor derecho " + derecho.getNumero());
        System.out.println("Filosofo " + id + " tiene los tenedores.");
    }

    private void comer() {
        estaComiendo = true;
        System.out.println("Filosofo " + id + " esta comiendo.");
        try {
            Thread.sleep((long) (Math.random() * 8000)); // Simula el tiempo de comida
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void soltarTenedores() {
        mesa.soltarTenedor(id, tenedorIzquierdo, tenedorDerecho);
        estaComiendo = false;
        System.out.println("Filosofo " + id + " solto los tenedores.");
    }

    public boolean getEstado() {
        return estaComiendo;
    }
}

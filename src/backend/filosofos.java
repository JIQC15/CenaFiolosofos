package backend;

public class filosofos extends Thread {

    //Atributos
    private int id;
    private Tenedor tenedorIzquierdo;
    private Tenedor tenedorDerecho;
    private Mesa mesa;
    private boolean estaComiendo;
    private Tenedor tenedorAgarradoIzquierdo;
    private Tenedor tenedorAgarradoDerecho;

    public filosofos(int id, Tenedor tenedorIzquierdo, Tenedor tenedorDerecho, Mesa mesa) {
        this.id = id;
        this.tenedorIzquierdo = tenedorIzquierdo;
        this.tenedorDerecho = tenedorDerecho;
        this.mesa = mesa;
        this.estaComiendo = false;
    }

    public Tenedor getTenedorAgarradoIzquierdo() {
        return tenedorAgarradoIzquierdo;
    }

    public Tenedor getTenedorAgarradoDerecho() {
        return tenedorAgarradoDerecho;
    }

    @Override
    public void run() {
        try {
            while (true) {
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
        System.out.println("Filosofo " + id + " esta pensando.");
        Thread.sleep((long) (Math.random() * 4000)); // Simula el tiempo de pensamiento
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
        System.out.println("Filosofo " + id + " agarro el tenedor izquierdo " + izquierdo.getNumero() + " y el tenedor derecho " + derecho.getNumero());

        estaComiendo = true;
        System.out.println("Filosofo " + id + " tiene los tenedores.");
    }

    private void comer() throws InterruptedException {
        System.out.println("Filosofo " + id + " esta comiendo.");
        Thread.sleep((long) (Math.random() * 5000)); // Simula el tiempo de comida
    }

    private void soltarTenedores() {
        
        mesa.soltarTenedor(id, tenedorIzquierdo, tenedorDerecho);
        estaComiendo = false;
        System.out.println("Filosofo " + id + " solto los tenedores.");
    }

    public boolean estaComiendo() {
        return estaComiendo;
    }
}
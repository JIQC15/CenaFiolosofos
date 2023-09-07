package backend;

public class Mesa {

    private int numFilosofos;
    private Tenedor[] tenedores;

    public Mesa(int numFilosofos) {
        this.numFilosofos = numFilosofos;
        tenedores = new Tenedor[numFilosofos];
        for (int i = 0; i < numFilosofos; i++) {
            tenedores[i] = new Tenedor(i + 1);
        }
    }

    public Tenedor getTenedorIzquierdo(int filosofoId) {
        return tenedores[filosofoId];
    }

    public Tenedor getTenedorDerecho(int filosofoId) {
        return tenedores[(filosofoId + 1) % numFilosofos];
    }

    public void tomarTenedor(int filosofoId, Tenedor tenedorIzquierdo, Tenedor tenedorDerecho) throws InterruptedException {
        tenedorIzquierdo.tomar(filosofoId);
        tenedorDerecho.tomar(filosofoId);
    }

    public void soltarTenedor(int filosofoId, Tenedor tenedorIzquierdo, Tenedor tenedorDerecho) {
        tenedorIzquierdo.soltar(filosofoId);
        tenedorDerecho.soltar(filosofoId);
    }
}

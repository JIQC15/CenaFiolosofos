package backend;

public class Mesa {
    
    public int numFilosofos;
    public Tenedor[] tenedores;

    public Mesa(int numFilosofos) {
        this.numFilosofos = numFilosofos;
        tenedores = new Tenedor[numFilosofos];
        for (int i = 0; i < numFilosofos; i++) {
            tenedores[i] = new Tenedor(i);
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
    
    public boolean getEstadoTenedor(int i){
        return tenedores[i].getDisponible();
    }
}

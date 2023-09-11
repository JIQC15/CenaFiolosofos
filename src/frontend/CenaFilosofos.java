package frontend;

import backend.Filosofo;
import backend.Mesa;
import backend.Tenedor;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CenaFilosofos extends javax.swing.JFrame {

    ImageIcon EstadoComiendo = new ImageIcon(getClass().getResource("/IMG/Comiendo.png"));
    ImageIcon EstadoPensando = new ImageIcon(getClass().getResource("/IMG/Pensando.png"));
    ImageIcon TenedorFilosofo1 = new ImageIcon(getClass().getResource("/IMG/TenedorRotIzq.png"));

    public Tenedor tenedor;
    public Mesa mesa;
    public Filosofo filosofo;

    private ArrayList<javax.swing.JLabel> etiquetasDeEstado = new ArrayList<>();
    private ArrayList<javax.swing.JLabel> etiquetasDeTenedores = new ArrayList<>();
    public ArrayList<javax.swing.JLabel> etiquetasFilosofos = new ArrayList<>();
    private boolean[] estadosFilosofos = new boolean[5]; // Supongo que tienes 5 filósofos

    int filosofosEnMesa = contarFilosofos();
    Mesa planificador = new Mesa(filosofosEnMesa);
    int TenedoresEnMesa = contarTenedoresEnMesa();

    public CenaFilosofos() {
        initComponents();

        filosofosEnMesa = contarFilosofos(); // Mover esta línea aquí
        planificador = new Mesa(filosofosEnMesa); // Mover esta línea aquí
        TenedoresEnMesa = contarTenedoresEnMesa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEmpezar = new javax.swing.JButton();
        lblFilosofo0 = new javax.swing.JLabel();
        lblFilosofo1 = new javax.swing.JLabel();
        lblFilosofo2 = new javax.swing.JLabel();
        lblFilosofo3 = new javax.swing.JLabel();
        lblFilosofo4 = new javax.swing.JLabel();
        Plato0 = new javax.swing.JLabel();
        Plato1 = new javax.swing.JLabel();
        Plato2 = new javax.swing.JLabel();
        Plato3 = new javax.swing.JLabel();
        Plato4 = new javax.swing.JLabel();
        lblTenedor1 = new javax.swing.JLabel();
        lblTenedor2 = new javax.swing.JLabel();
        lblTenedor3 = new javax.swing.JLabel();
        lblTenedor4 = new javax.swing.JLabel();
        lblTenedor5 = new javax.swing.JLabel();
        lblNumTenedor2 = new javax.swing.JLabel();
        lblNumTenedor5 = new javax.swing.JLabel();
        lblNumTenedor1 = new javax.swing.JLabel();
        lblNumTenedor3 = new javax.swing.JLabel();
        lblNumTenedor4 = new javax.swing.JLabel();
        lblMesa = new javax.swing.JLabel();
        lblIMGEstado0 = new javax.swing.JLabel();
        lblIMGEstado1 = new javax.swing.JLabel();
        lblIMGEstado2 = new javax.swing.JLabel();
        lblIMGEstado3 = new javax.swing.JLabel();
        lblIMGEstado4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpezar.setBackground(new java.awt.Color(204, 102, 0));
        btnEmpezar.setFont(new java.awt.Font("Book Antiqua", 2, 12)); // NOI18N
        btnEmpezar.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpezar.setText("EMPEZAR");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 102, 34));

        lblFilosofo0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FilosofoArabia.png"))); // NOI18N
        jPanel1.add(lblFilosofo0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 90, 90));

        lblFilosofo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FilosofoEinstein.png"))); // NOI18N
        jPanel1.add(lblFilosofo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 90, 90));

        lblFilosofo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FilosofoReina.png"))); // NOI18N
        lblFilosofo2.setText("jLabel2");
        jPanel1.add(lblFilosofo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 90, 90));

        lblFilosofo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FilosofoMago.png"))); // NOI18N
        lblFilosofo3.setText("jLabel2");
        jPanel1.add(lblFilosofo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 90, 90));

        lblFilosofo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FilosofoRey.png"))); // NOI18N
        jPanel1.add(lblFilosofo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 90, 90));

        Plato0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Spaguetti.png"))); // NOI18N
        jPanel1.add(Plato0, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 50, 50));

        Plato1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Spaguetti.png"))); // NOI18N
        jPanel1.add(Plato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 50, 50));

        Plato2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Spaguetti.png"))); // NOI18N
        jPanel1.add(Plato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 50, 50));

        Plato3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Spaguetti.png"))); // NOI18N
        jPanel1.add(Plato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 50, 50));

        Plato4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Spaguetti.png"))); // NOI18N
        jPanel1.add(Plato4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 50, 50));

        lblTenedor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/TenedorRotIzq.png"))); // NOI18N
        jPanel1.add(lblTenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        lblTenedor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/TenedorRotIzq.png"))); // NOI18N
        jPanel1.add(lblTenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, 30));

        lblTenedor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Tenedor.png"))); // NOI18N
        jPanel1.add(lblTenedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        lblTenedor4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/TenedorRotDer.png"))); // NOI18N
        jPanel1.add(lblTenedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        lblTenedor5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/TenedorReves.png"))); // NOI18N
        jPanel1.add(lblTenedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        lblNumTenedor2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumTenedor2.setText("2");
        jPanel1.add(lblNumTenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        lblNumTenedor5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumTenedor5.setText("5");
        jPanel1.add(lblNumTenedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        lblNumTenedor1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumTenedor1.setText("1");
        jPanel1.add(lblNumTenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        lblNumTenedor3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumTenedor3.setText("3");
        jPanel1.add(lblNumTenedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, -1));

        lblNumTenedor4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumTenedor4.setText("4");
        jPanel1.add(lblNumTenedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        lblMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Mesa redonda.png"))); // NOI18N
        jPanel1.add(lblMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 300, 300));
        jPanel1.add(lblIMGEstado0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 80));
        jPanel1.add(lblIMGEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 80, 80));
        jPanel1.add(lblIMGEstado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 80, 80));
        jPanel1.add(lblIMGEstado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 80, 80));
        jPanel1.add(lblIMGEstado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 80, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        iniciarPrograma();
    }//GEN-LAST:event_btnEmpezarActionPerformed

    //METODOS
//    public void iniciarPrograma() {
//
//        System.out.println("Hay en la mesa: " + filosofosEnMesa + " Filosofos.");
//
//        if (filosofosEnMesa >= 2) {
//            for (int i = 0; i < filosofosEnMesa; i++) {
//                Filosofo filosofos = new Filosofo(i, planificador.getTenedorIzquierdo(i), planificador.getTenedorIzquierdo(i), planificador);
//
//                filosofos.start();
//            }
//            actualizarEstadoFilosofo();
//
//        } else {
//            JOptionPane.showMessageDialog(this, "Debe haber al menos 2 filósofos para iniciar la simulación.", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
    public void iniciarPrograma() {
        System.out.println("Hay en la mesa: " + filosofosEnMesa + " Filosofos.");

        if (filosofosEnMesa >= 2) {
            for (int i = 0; i < filosofosEnMesa; i++) {
                Filosofo filosofo = new Filosofo(i, planificador.getTenedorIzquierdo(i), planificador.getTenedorDerecho(i), planificador);
                

                filosofo.start();

                // Actualizar el estado del filósofo como comiendo
//                estadosFilosofos[i] = filosofo.getEstado();
               
            }
                actualizarEstadoFilosofo();
        } else {
            JOptionPane.showMessageDialog(this, "Debe haber al menos 2 filósofos para iniciar la simulación.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int contarFilosofos() {
        int cantidadFilosofos = 0;

        // Lista de etiquetas de filósofos
        etiquetasFilosofos.add(lblFilosofo0);
        etiquetasFilosofos.add(lblFilosofo1);
        etiquetasFilosofos.add(lblFilosofo2);
        etiquetasFilosofos.add(lblFilosofo3);
        etiquetasFilosofos.add(lblFilosofo4);

        // Iterar a través de las etiquetas y contar las que no son nulas
        for (javax.swing.JLabel etiqueta : etiquetasFilosofos) {
            if (etiqueta != null) {
                cantidadFilosofos++;
            }
        }
        return cantidadFilosofos;
    }

    public int contarTenedoresEnMesa() {
        int cantidadTenedores = 0;

        // Lista de etiquetas de filósofos
        etiquetasDeTenedores.add(lblNumTenedor1);
        etiquetasDeTenedores.add(lblNumTenedor2);
        etiquetasDeTenedores.add(lblNumTenedor3);
        etiquetasDeTenedores.add(lblNumTenedor4);
        etiquetasDeTenedores.add(lblNumTenedor5);

        // Iterar a través de las etiquetas y contar las que no son nulas
        for (javax.swing.JLabel etiqueta : etiquetasFilosofos) {
            if (etiqueta != null) {
                cantidadTenedores++;
            }
        }
        return cantidadTenedores;
    }

    private void actualizarEstadoFilosofo() {
        Thread ventana = new Thread(() -> {
            for (int i = 0; i < estadosFilosofos.length; i++) {
                boolean estadoFilosofo = estadosFilosofos[i];
                actualizarImagenEstado(i, estadoFilosofo);
            }
        });
        ventana.start();
    }

    private void actualizarImagenEstado(int indiceFilosofo, boolean estadoComiendo) {
        ImageIcon imagenEstado = estadoComiendo ? EstadoComiendo : EstadoPensando;

        switch (indiceFilosofo) {
            case 0:
                lblIMGEstado0.setIcon(imagenEstado);
                break;
            case 1:
                lblIMGEstado1.setIcon(imagenEstado);
                break;
            case 2:
                lblIMGEstado2.setIcon(imagenEstado);
                break;
            case 3:
                lblIMGEstado3.setIcon(imagenEstado);
                break;
            case 4:
                lblIMGEstado4.setIcon(imagenEstado);
                break;
            default:
                break;
        }
    }

    //MetodoMAIN
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CenaFilosofos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CenaFilosofos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CenaFilosofos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CenaFilosofos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CenaFilosofos().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Plato0;
    private javax.swing.JLabel Plato1;
    private javax.swing.JLabel Plato2;
    private javax.swing.JLabel Plato3;
    private javax.swing.JLabel Plato4;
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFilosofo0;
    private javax.swing.JLabel lblFilosofo1;
    private javax.swing.JLabel lblFilosofo2;
    private javax.swing.JLabel lblFilosofo3;
    private javax.swing.JLabel lblFilosofo4;
    private javax.swing.JLabel lblIMGEstado0;
    private javax.swing.JLabel lblIMGEstado1;
    private javax.swing.JLabel lblIMGEstado2;
    private javax.swing.JLabel lblIMGEstado3;
    private javax.swing.JLabel lblIMGEstado4;
    private javax.swing.JLabel lblMesa;
    private javax.swing.JLabel lblNumTenedor1;
    private javax.swing.JLabel lblNumTenedor2;
    private javax.swing.JLabel lblNumTenedor3;
    private javax.swing.JLabel lblNumTenedor4;
    private javax.swing.JLabel lblNumTenedor5;
    private javax.swing.JLabel lblTenedor1;
    private javax.swing.JLabel lblTenedor2;
    private javax.swing.JLabel lblTenedor3;
    private javax.swing.JLabel lblTenedor4;
    private javax.swing.JLabel lblTenedor5;
    // End of variables declaration//GEN-END:variables
}

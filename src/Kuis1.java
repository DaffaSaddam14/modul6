/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Kuis1 extends javax.swing.JFrame {

    /**
     * Creates new form Kuis1
     */
    public Kuis1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        Matpel = new javax.swing.JTextField();
        Nilai = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Penilaian Siswa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 20, 100, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Absen");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 60, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nilai");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 140, 60, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nama");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 50, 60, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Matpel");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 110, 60, 15);
        getContentPane().add(Nama);
        Nama.setBounds(110, 50, 140, 20);
        getContentPane().add(Absen);
        Absen.setBounds(110, 80, 140, 20);
        getContentPane().add(Matpel);
        Matpel.setBounds(110, 110, 140, 20);

        Nilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NilaiActionPerformed(evt);
            }
        });
        getContentPane().add(Nilai);
        Nilai.setBounds(110, 140, 140, 20);

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 180, 90, 23);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 210, 360, 130);

        setBounds(0, 0, 416, 387);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String nama = Nama.getText();
String absen = Absen.getText();
String matpel = Matpel.getText();
double nilai = Double.parseDouble(Nilai.getText());
String nilaiAkhir;
if(nilai>100)
    nilaiAkhir = "Masukkan Ulang Nilai";
else if(nilai>=75)
    nilaiAkhir = "Lulus";
else if(nilai<75)
    nilaiAkhir = "Tidak Lulus";
else
    nilaiAkhir = "Masukkan ulang";

TA.setText("Nama :"+nama+"\nAbsen :"+absen+"\nMatpel :"+matpel+"\nNilai :"+nilai+"\nKeterangan :"+nilaiAkhir);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NilaiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextField Matpel;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nilai;
    private javax.swing.JTextArea TA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

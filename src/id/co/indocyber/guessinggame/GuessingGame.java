/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.indocyber.guessinggame;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author user
 */
public class GuessingGame extends javax.swing.JFrame {
    WordModel modelWord;
    //String basicWord; 
    //String[] bankSoal = {" Pondok Indah","Sudirman","Tugu Tani","Citos"};
//    WordModel soal1 = new WordModel("Pondok indah","Daerah dijakarta selatan");
//    WordModel soal2 = new WordModel ("Sudirman","Jalan utama dijakarta");
//    WordModel soal3 = new WordModel("Tugu Tani","Deket Monas");
//    WordModel soal4 = new WordModel ("Citos","Mall pinggir tol di jakarta selatan");
//    WordModel soal5 = new WordModel ("IndoCyber","nama Perusahaan");
    List<WordModel> bankSoal;

    /**
     * Creates new form GuessingGame
     */
    public GuessingGame() throws IOException {
        bankSoal = WordQuetionGenerator.createQuestionFromFile();
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        SoalTextt = new javax.swing.JTextField();
        JawabanText = new javax.swing.JTextField();
        btnPeriksa = new javax.swing.JButton();
        jwb = new javax.swing.JLabel();
        Comment = new javax.swing.JLabel();
        btnMulai = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        btnBantu = new javax.swing.JButton();
        hinttlabel = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SoalTextt.setEditable(false);

        btnPeriksa.setText("Periksa");
        btnPeriksa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeriksaActionPerformed(evt);
            }
        });

        jwb.setText("Jawaban : ");

        Comment.setText("Belum Ada Jawaban");

        btnMulai.setText("Mulai");
        btnMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulaiActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kota ", "Buah" }));

        btnBantu.setText("Bantu");
        btnBantu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBantuActionPerformed(evt);
            }
        });

        hinttlabel.setText("Hint");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jwb)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(SoalTextt)
                            .addComponent(JawabanText, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPeriksa)
                            .addComponent(Comment, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(btnMulai)
                        .addGap(18, 18, 18)
                        .addComponent(btnBantu)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(hinttlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMulai)
                    .addComponent(btnBantu))
                .addGap(18, 18, 18)
                .addComponent(hinttlabel)
                .addGap(9, 9, 9)
                .addComponent(SoalTextt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JawabanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jwb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPeriksa)
                .addGap(18, 18, 18)
                .addComponent(Comment, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulaiActionPerformed
        // TODO add your handling code here:
        
        int SoalIndex = (int) Math.floor(Math.random()* bankSoal.size());
        System.out.println("index soal: " + SoalIndex);
        modelWord = bankSoal.get(SoalIndex);
        SoalTextt.setText(modelWord.acakHuruf());
        
//         //String basicWord = "Buaya Darat";
//        basicWord = basicWord.toUpperCase();
//        String[] arrayOfWord = basicWord.split("");
//        
//        //System.out.println("huruf ke 2 : " + arrayOfWord[1]);
//        
//        for (int i = 0; i < arrayOfWord.length; i++) {
//            System.out.println(arrayOfWord[i]);
//        }
//        
//        Arrays.sort(arrayOfWord);
//        StringBuilder sb = new StringBuilder();
//        System.out.println("\nSetelah disort\n");
//        for (int i = 0; i < arrayOfWord.length; i++) {
//            //System.out.println(arrayOfWord[i]);
//            sb.append(arrayOfWord[i]);
//        }
//        
//        String soal = sb.toString();
//        System.out.println(" Soal yang harus dijawab: " + soal.trim());
//        SoalTextt.setText(soal.trim());
//        
    }//GEN-LAST:event_btnMulaiActionPerformed

    private void btnPeriksaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeriksaActionPerformed
        // TODO add your handling code here:
        
        String jawaban = JawabanText.getText().trim();
        modelWord.setJawaban(jawaban);
        boolean hasil = modelWord.cekJawaban();
        if(hasil){
            Comment.setText("Jenius");
        }else{
            Comment.setText("Coba Lagi");
        }
        
    }//GEN-LAST:event_btnPeriksaActionPerformed

    private void btnBantuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBantuActionPerformed
        // TODO add your handling code here:
        hinttlabel.setText(modelWord.getHint());
    }//GEN-LAST:event_btnBantuActionPerformed

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
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GuessingGame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GuessingGame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Comment;
    private javax.swing.JTextField JawabanText;
    private javax.swing.JTextField SoalTextt;
    private javax.swing.JButton btnBantu;
    private javax.swing.JButton btnMulai;
    private javax.swing.JButton btnPeriksa;
    private javax.swing.JLabel hinttlabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jwb;
    // End of variables declaration//GEN-END:variables
}

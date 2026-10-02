/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loja;

/**
 *
 * @author kaua_santos154
 */
public class CadastroJogos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CadastroJogos.class.getName());

          public CadastroJogos() {
        initComponents();

        // Aplica o visual moderno
        estilizarTela();

        // Centraliza a janela
        setLocationRelativeTo(null);
    }
          
             
                // ============================================================
        // CONFIGURAÇÃO DO VISUAL DA TELA
        // ============================================================
        private void estilizarTela() {

            // ========================================================
            // FUNDO PRINCIPAL DA JANELA
            // ========================================================
            getContentPane().setBackground(
                   new java.awt.Color(15, 23, 42)
            );
            // ========================================================
            // PAINEL PRINCIPAL
            // ========================================================

            jPanel1.setBackground(
                   new java.awt.Color(15, 23, 42)
            );
            // ========================================================
            // TÍTULO "CADASTRO DE JOGOS"
            // ========================================================

            jLabel1.setForeground(
                    new java.awt.Color(0, 200, 255)
            );

            jLabel1.setFont(
                    new java.awt.Font(
                            "Segoe UI",
                            java.awt.Font.BOLD,
                            22
                    )
            );


            // ========================================================
            // LABEL "NOME"
            // ========================================================

            jLabel2.setForeground(
                    new java.awt.Color(226, 232, 240)
            );

            jLabel2.setFont(
                    new java.awt.Font(
                            "Segoe UI",
                            java.awt.Font.BOLD,
                            14
                    )
            );


            // ========================================================
            // LABEL "GÊNERO"
            // ========================================================

            jLabel3.setForeground(
                    new java.awt.Color(226, 232, 240)
            );

            jLabel3.setFont(
                    new java.awt.Font(
                            "Segoe UI",
                            java.awt.Font.BOLD,
                            14
                    )
            );


            // ========================================================
            // CAMPO NOME
            // ========================================================

            txtNome.setBackground(
                    new java.awt.Color(30, 41, 59)
            );

            txtNome.setForeground(
                    java.awt.Color.WHITE
            );

            txtNome.setCaretColor(
                    java.awt.Color.WHITE
            );

            txtNome.setFont(
                    new java.awt.Font(
                            "Segoe UI",
                            java.awt.Font.PLAIN,
                            14
                    )
            );

            txtNome.setBorder(
                    javax.swing.BorderFactory.createCompoundBorder(
                            javax.swing.BorderFactory.createLineBorder(
                                    new java.awt.Color(71, 85, 105),
                                    1
                            ),
                            javax.swing.BorderFactory.createEmptyBorder(
                                    5, 8, 5, 8
                            )
                    )
            );


            // ========================================================
            // COMBOBOX DE GÊNERO
            // ========================================================

            jComboBox1.setBackground(
                    new java.awt.Color(30, 41, 59)
            );

            jComboBox1.setForeground(
                    java.awt.Color.WHITE
            );

            jComboBox1.setFont(
                    new java.awt.Font(
                            "Segoe UI",
                            java.awt.Font.PLAIN,
                            14
                    )
            );


            // ========================================================
            // CONFIGURAÇÕES DA JANELA
            // ========================================================

            setTitle("Cadastro de Jogos");

            setResizable(false);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DE JOGOS");

        txtNome.addActionListener(this::txtNomeActionPerformed);

        jLabel2.setText("Nome:");

        jLabel3.setText("Gênero:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ação", "Aventura", "RPG", "RPG de Ação", "JRPG", "Estratégia", "Estratégia em Tempo Real (RTS)", "Estratégia por Turnos (TBS)", "Simulação", "Esportes", "Corrida", "Luta", "Tiro em Primeira Pessoa (FPS)", "Tiro em Terceira Pessoa (TPS)", "Battle Royale", "MOBA", "MMORPG", "MMO", "Hack and Slash", "Beat 'em Up", "Plataforma", "Metroidvania", "Puzzle", "Terror", "Survival Horror", "Sobrevivência", "Stealth", "Sandbox", "Mundo Aberto", "Roguelike", "Roguelite", "Cartas", "Tabuleiro", "Ritmo", "Musical", "Visual Novel", "Novela Interativa", "Point and Click", "Tower Defense", "Defesa de Torre", "Construção", "Gerenciamento", "Casual", "Arcade", "Indie", "Horror", "Ficção Científica", "Fantasia", "Educativo", "Estratégia Tática", "RPG Tático", "Dungeon Crawler", "Shoot 'em Up", "Bullet Hell", "Furtividade", "Narrativo", "Party Game", "Multiplayer", "Cooperativo" }));

        jLabel1.setText("CADASTRO DE JOGOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CadastroJogos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}

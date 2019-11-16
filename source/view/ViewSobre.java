package view;

public class ViewSobre extends javax.swing.JFrame {

    public ViewSobre() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel_Sobre = new javax.swing.JPanel();
        jLabel_IconJava = new javax.swing.JLabel();
        jLabel_IconUser = new javax.swing.JLabel();
        jLabel_IconLinkedin = new javax.swing.JLabel();
        jLabel_IconRepositorio = new javax.swing.JLabel();
        jLabel_IconLicenca = new javax.swing.JLabel();
        jLabel_IconIcons8 = new javax.swing.JLabel();
        jLabel_NomePrograma = new javax.swing.JLabel();
        jLabel_Nome = new javax.swing.JLabel();
        jLabel_Linkedin = new javax.swing.JLabel();
        jLabel_Repositorio = new javax.swing.JLabel();
        jLabel_Licenca = new javax.swing.JLabel();
        jLabel_Icons8 = new javax.swing.JLabel();

        setTitle("Sobre");

        jPanel_Sobre.setBackground(new java.awt.Color(2, 37, 140));
        jPanel_Sobre.setLayout(new java.awt.GridBagLayout());

        jLabel_IconJava.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_IconJava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/java.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 16;
        jPanel_Sobre.add(jLabel_IconJava, gridBagConstraints);

        jLabel_IconUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_IconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_IconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/user.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 16;
        jPanel_Sobre.add(jLabel_IconUser, gridBagConstraints);

        jLabel_IconLinkedin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_IconLinkedin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_IconLinkedin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/linkedin.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 16;
        jPanel_Sobre.add(jLabel_IconLinkedin, gridBagConstraints);

        jLabel_IconRepositorio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_IconRepositorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_IconRepositorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 16;
        jPanel_Sobre.add(jLabel_IconRepositorio, gridBagConstraints);

        jLabel_IconLicenca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_IconLicenca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_IconLicenca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/rules.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 16;
        jPanel_Sobre.add(jLabel_IconLicenca, gridBagConstraints);

        jLabel_IconIcons8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_IconIcons8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_IconIcons8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/icons8_logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 16;
        jPanel_Sobre.add(jLabel_IconIcons8, gridBagConstraints);

        jLabel_NomePrograma.setBackground(new java.awt.Color(38, 80, 165));
        jLabel_NomePrograma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_NomePrograma.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NomePrograma.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_NomePrograma.setText(" MVC - Tutorial");
        jLabel_NomePrograma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_NomePrograma.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel_Sobre.add(jLabel_NomePrograma, gridBagConstraints);

        jLabel_Nome.setBackground(new java.awt.Color(38, 80, 165));
        jLabel_Nome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Nome.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Nome.setText(" Vitor de Siqueira Cotta");
        jLabel_Nome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Nome.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel_Sobre.add(jLabel_Nome, gridBagConstraints);

        jLabel_Linkedin.setBackground(new java.awt.Color(38, 80, 165));
        jLabel_Linkedin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Linkedin.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Linkedin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Linkedin.setText(" https://www.linkedin.com/in/vitor-de-siqueira-cotta-analista-de-sistemas/");
        jLabel_Linkedin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Linkedin.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel_Sobre.add(jLabel_Linkedin, gridBagConstraints);

        jLabel_Repositorio.setBackground(new java.awt.Color(38, 80, 165));
        jLabel_Repositorio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Repositorio.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Repositorio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Repositorio.setText(" https://github.com/VitorDeSiqueiraCotta");
        jLabel_Repositorio.setToolTipText("");
        jLabel_Repositorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Repositorio.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel_Sobre.add(jLabel_Repositorio, gridBagConstraints);

        jLabel_Licenca.setBackground(new java.awt.Color(38, 80, 165));
        jLabel_Licenca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Licenca.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Licenca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Licenca.setText(" Licença MIT");
        jLabel_Licenca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Licenca.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel_Sobre.add(jLabel_Licenca, gridBagConstraints);

        jLabel_Icons8.setBackground(new java.awt.Color(38, 80, 165));
        jLabel_Icons8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Icons8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Icons8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Icons8.setText(" https://icons8.com/");
        jLabel_Icons8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Icons8.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel_Sobre.add(jLabel_Icons8, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Sobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Sobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_IconIcons8;
    private javax.swing.JLabel jLabel_IconJava;
    private javax.swing.JLabel jLabel_IconLicenca;
    private javax.swing.JLabel jLabel_IconLinkedin;
    private javax.swing.JLabel jLabel_IconRepositorio;
    private javax.swing.JLabel jLabel_IconUser;
    private javax.swing.JLabel jLabel_Icons8;
    private javax.swing.JLabel jLabel_Licenca;
    private javax.swing.JLabel jLabel_Linkedin;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JLabel jLabel_NomePrograma;
    private javax.swing.JLabel jLabel_Repositorio;
    private javax.swing.JPanel jPanel_Sobre;
    // End of variables declaration//GEN-END:variables
}

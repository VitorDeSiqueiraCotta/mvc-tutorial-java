package view;

import model.Model;
import java.awt.event.ActionListener;

public class View extends javax.swing.JFrame {

    public View(Model model) {
        initComponents();
    }
    
    public String getEntrada() {
        return jTextField_Entrada.getText();
    }
    
    public void setResult(String valor) {
        jTextField_Result.setText(valor);
    }
    
    public void addListenerBtnSobre(ActionListener act) {
        jButton_Sobre.addActionListener(act);
    }
    
    public void addListenerBtnSomar(ActionListener act) {
        jButton_Somar.addActionListener(act);
    }
    
    public void addListenerBtnLimpar(ActionListener act) {
        jButton_Limpar.addActionListener(act);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Principal = new javax.swing.JPanel();
        jButton_Limpar = new javax.swing.JButton();
        jButton_Somar = new javax.swing.JButton();
        jButton_Sobre = new javax.swing.JButton();
        jTextField_Entrada = new javax.swing.JTextField();
        jTextField_Result = new javax.swing.JTextField();
        jLabel_Result = new javax.swing.JLabel();
        jLabel_Entrada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MVC - Tutorial");

        jPanel_Principal.setBackground(new java.awt.Color(2, 37, 140));

        jButton_Limpar.setBackground(new java.awt.Color(38, 80, 165));
        jButton_Limpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Limpar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Limpar.setMnemonic('l');
        jButton_Limpar.setText("Limpar");

        jButton_Somar.setBackground(new java.awt.Color(38, 80, 165));
        jButton_Somar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Somar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Somar.setMnemonic('o');
        jButton_Somar.setText("Somar");

        jButton_Sobre.setBackground(new java.awt.Color(38, 80, 165));
        jButton_Sobre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Sobre.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Sobre.setMnemonic('s');
        jButton_Sobre.setText("Sobre");

        jTextField_Entrada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextField_Result.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_Result.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_Result.setEnabled(false);

        jLabel_Result.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Result.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Result.setText("Resultado");

        jLabel_Entrada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Entrada.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Entrada.setText("Entrada");

        javax.swing.GroupLayout jPanel_PrincipalLayout = new javax.swing.GroupLayout(jPanel_Principal);
        jPanel_Principal.setLayout(jPanel_PrincipalLayout);
        jPanel_PrincipalLayout.setHorizontalGroup(
            jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Entrada)
                    .addComponent(jTextField_Result, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                        .addGroup(jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Result)
                            .addComponent(jLabel_Entrada))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_Sobre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Somar)))
                .addContainerGap())
        );
        jPanel_PrincipalLayout.setVerticalGroup(
            jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Entrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Result)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Somar)
                    .addComponent(jButton_Limpar)
                    .addComponent(jButton_Sobre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Limpar;
    private javax.swing.JButton jButton_Sobre;
    private javax.swing.JButton jButton_Somar;
    private javax.swing.JLabel jLabel_Entrada;
    private javax.swing.JLabel jLabel_Result;
    private javax.swing.JPanel jPanel_Principal;
    private javax.swing.JTextField jTextField_Entrada;
    private javax.swing.JTextField jTextField_Result;
    // End of variables declaration//GEN-END:variables
}
package Views;

import Controllers.ContaController;
import Controllers.PessoaController;
import semana05.Semana05;
import Models.Conta;
import Models.Pessoa;
import javax.swing.JOptionPane;

public class Gerente extends javax.swing.JFrame {
    
    private final PessoaController pessoaController;
    private final ContaController contaController;
    
    public Gerente() {
        initComponents();
        pessoaController = new PessoaController();
        contaController = new ContaController();
        
        this.setLocationRelativeTo(null);
    }
    
    
    private void limparCampos() {
        this.nomeTitular.setText("");
        this.cpfOuCpf.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoConta = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cpfOuCpf = new javax.swing.JTextField();
        nomeTitular = new javax.swing.JTextField();
        tipoTitular = new javax.swing.JComboBox<>();
        contaCorrente = new javax.swing.JRadioButton();
        contaSalario = new javax.swing.JRadioButton();
        contaPoupanca = new javax.swing.JRadioButton();
        criarConta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("JetBrainsMono NF", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerente");

        jLabel2.setFont(new java.awt.Font("JetBrainsMono NF", 1, 14)); // NOI18N
        jLabel2.setText("CPF/CNPJ");

        jLabel3.setFont(new java.awt.Font("JetBrainsMono NF", 1, 14)); // NOI18N
        jLabel3.setText("Nome Titular");

        jLabel4.setFont(new java.awt.Font("JetBrainsMono NF", 1, 14)); // NOI18N
        jLabel4.setText("Tipo de Titular");

        jLabel5.setFont(new java.awt.Font("JetBrainsMono NF", 1, 14)); // NOI18N
        jLabel5.setText("Tipo de Conta");

        tipoTitular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física", "Pessoa Jurídica" }));
        tipoTitular.setToolTipText("");

        tipoConta.add(contaCorrente);
        contaCorrente.setFont(new java.awt.Font("Fira Sans", 1, 13)); // NOI18N
        contaCorrente.setText("Conta Corrente");

        tipoConta.add(contaSalario);
        contaSalario.setFont(new java.awt.Font("Fira Sans", 1, 13)); // NOI18N
        contaSalario.setText("Conta Salário");

        tipoConta.add(contaPoupanca);
        contaPoupanca.setFont(new java.awt.Font("Fira Sans", 1, 13)); // NOI18N
        contaPoupanca.setSelected(true);
        contaPoupanca.setText("Conta Poupança");

        criarConta.setText("CRIAR CONTA");
        criarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarContaActionPerformed(evt);
            }
        });

        jButton1.setText("Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(criarConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(nomeTitular, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfOuCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tipoTitular, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contaCorrente)
                        .addGap(42, 42, 42)
                        .addComponent(contaPoupanca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contaSalario)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tipoTitular)
                    .addComponent(cpfOuCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contaCorrente)
                    .addComponent(contaSalario)
                    .addComponent(contaPoupanca))
                .addGap(33, 33, 33)
                .addComponent(criarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void criarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarContaActionPerformed
        // PEGA INFORMAÇÕES DO TITULAR
        String nome = this.nomeTitular.getText();
        String cpfOuCnpj = this.cpfOuCpf.getText();
        String tipoPessoa = (String) this.tipoTitular.getSelectedItem(); 
        
        // CHAMA QUEM CRIA TITULAR
        Pessoa titular = pessoaController.criarPessoa(nome, cpfOuCnpj, tipoPessoa);
           
        // PEGA INFORMAÇÕES DA CONTA
        boolean corrente = this.contaCorrente.isSelected();
        boolean poupanca = this.contaPoupanca.isSelected();
        boolean salario = this.contaSalario.isSelected();     
        
        // CHAMA QUEM CRIA CONTA
        int numeroConta = contaController.criarConta(titular, corrente, poupanca, salario);
            
        JOptionPane.showMessageDialog(this, "Sua conta foi criada com sucesso. O número dela é: " + numeroConta);
        limparCampos();
        
        for(Conta c : Semana05.banco){
            System.out.println("Nº: " + c.getNumero() + " Titular: " + c.getTitular().getNome());
        }
         
    }//GEN-LAST:event_criarContaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Cliente().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton contaCorrente;
    private javax.swing.JRadioButton contaPoupanca;
    private javax.swing.JRadioButton contaSalario;
    private javax.swing.JTextField cpfOuCpf;
    private javax.swing.JButton criarConta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomeTitular;
    private javax.swing.ButtonGroup tipoConta;
    private javax.swing.JComboBox<String> tipoTitular;
    // End of variables declaration//GEN-END:variables
}

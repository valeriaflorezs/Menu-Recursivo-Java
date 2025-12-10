/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu_recursivo;

/**
 *
 * @author FLOREZVALERIA
 */
public class Recursividad extends javax.swing.JFrame {

    /**
     * Creates new form Recursividad
     */
    public Recursividad() {
        initComponents();
        setLocationRelativeTo(null);
        
        txtnum2.setVisible(false);
        num2.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        operacion = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtnum1 = new javax.swing.JLabel();
        num1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JLabel();
        num2 = new javax.swing.JTextField();
        msj0 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENÚ RECURSIVIDAD");

        operacion.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        operacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Factorial", "Fibonacci", "Potencia", "Suma de dígitos (SumOfDigits)", "Combinación", "Máximo común divisor (MCD)", "Sumtok", "Multiply", "ADDODD", "CountChr A" }));
        operacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 10));
        operacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                operacionItemStateChanged(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setText("CALCULAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 10));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        txtnum1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        txtnum1.setForeground(new java.awt.Color(255, 255, 255));
        txtnum1.setText("Digite Número:");

        txtnum2.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        txtnum2.setForeground(new java.awt.Color(255, 255, 255));
        txtnum2.setText("Digite Número:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnum2)
                    .addComponent(txtnum1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(num1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnum1)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnum2)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        msj0.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        msj0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(msj0, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(operacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(msj0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        switch(operacion.getSelectedIndex()){
            case 0:
                //No está seleccionado nada
                msj0.setText("Seleccione la operación a realizar");
            case 1:
                //Factorial
                int fact = Integer.parseInt(num1.getText());
                msj0.setText("Factorial: " + factorial(fact));
                break;
            case 2:
                //Fibonacci
                int fibo = Integer.parseInt(num1.getText());
                msj0.setText("Fibonacci: " + fibonacci(fibo));
                break;
            case 3:
                //Potencia
                int b = Integer.parseInt(num1.getText());
                int a = Integer.parseInt(num2.getText());
                msj0.setText("Result: " + potencia(a,b));
                break;
            case 4:
                //SumOfDigits
                int sod = Integer.parseInt(num1.getText());
                msj0.setText("SumOfDigits: " + sumOfDigits(sod));
                break;
            case 5:
                //Combinación
                a = Integer.parseInt(num1.getText());
                b = Integer.parseInt(num2.getText());
                msj0.setText("Result: " + combinacion(a,b));
                break;
            case 6:
                //Máximo común divisor (MCD)
                int x = Integer.parseInt(num1.getText());
                int y = Integer.parseInt(num2.getText());
                msj0.setText("MCD: " + mcd(x,y));
                break;
            case 7:
                //Sumtok
                int sum = Integer.parseInt(num1.getText());
                msj0.setText("suma: " + sumtok(sum));
                break;
            case 8:
                //Multiply
                x = Integer.parseInt(num1.getText());
                y = Integer.parseInt(num2.getText());
                msj0.setText("Result: " + multiply(x,y));
                break;
            case 9:
                //ADDODD
                int ad = Integer.parseInt(num1.getText());
                msj0.setText("ADDODD: " + ADDODD(ad));
                break;
            case 10:
                //CountChr A    
                String ch = num1.getText().toUpperCase();
                msj0.setText("countChr A: " + countChr(ch));
                break;
        }
        } catch(NumberFormatException e){
            msj0.setText("Los datos ingresados no son válidos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void operacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_operacionItemStateChanged
        int i= operacion.getSelectedIndex();
        if(i==3 || i==5 || i==6 || i==8){
            txtnum2.setVisible(true);
            num2.setVisible(true);
        } else{
            txtnum2.setVisible(false);
            num2.setVisible(false);
        }
        switch(operacion.getSelectedIndex()){
            case 2:
                //Fibonacci
                txtnum1.setText("Digite la posición:");
                break;
            case 3:
                //Potencia
                txtnum1.setText("Digite la base:");
                txtnum2.setText("Digite el exponente:");
                break;
            case 5:
                //Combinación
                txtnum1.setText("Digite Número 1:");
                txtnum2.setText("Digite Número 2:");
                break;
            case 6:
                //Máximo común divisor (MCD)
                txtnum1.setText("Digite Número 1:");
                txtnum2.setText("Digite Número 2:");
                break;
            case 8:
                //Multiply
               txtnum1.setText("Digite factor 1:");
               txtnum2.setText("Digite factor 2:");
                break;
            case 10:
                //CountChr A    
                txtnum1.setText("Digite la cadena:");
                break;
            default:
                txtnum1.setText("Digite Número:");
        }
    }//GEN-LAST:event_operacionItemStateChanged
    public static int multiply(int x, int y){
        if (x == 1){
            return  y;
        }else{
            return multiply(x-1,y)+y;
        }
    }
    public static int sumtok (int k){
        if (k<= 0){
            return 0;
        }else{
            return sumtok(k-1) + k;
        }
    }
    public static int ADDODD (int n){
        if (n<= 0){
            return 0;
        }else if (n%2 != 0){
            return ADDODD(n-1) + n;
        }else{
            return ADDODD(n-1);
        }
    }
   
    public static int sumOfDigits(int n){
        if (n<10){
            return n;
        }else{
            return sumOfDigits(n%10) + sumOfDigits(n/10);
        }
    }
    public static int countChr(String str){
        if (str.length()==0){
            return 0;
        }
        int count = 0;
        if (str.substring(0,1).equals("A")){
            count = 1;
        }
        return count + countChr(str.substring(1,str.length()));
    }
   
    public static int potencia(int a, int b){
        if (a==0){
            return 1;
        }
        if (a==1){
            return b;
        }else{
            return potencia(a-1, b)*b;
        }
    }
    public static int factorial (int n){
        if (n <1){
            return 1;
        }else{
            return factorial(n-1)*n;
        }
    }
   
    public static int fibonacci(int n){
        if (n==0){
            return 0;
        }else if (n==1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static int combinacion(int n, int m){
        if (m == 0 || m == n || n == 1){
            return 1;
        }else{
            return combinacion(n-1,m) + combinacion(n-1,m-1);
        }
    }
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }
 
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
            java.util.logging.Logger.getLogger(Recursividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recursividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recursividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recursividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recursividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel msj0;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JComboBox<String> operacion;
    private javax.swing.JLabel txtnum1;
    private javax.swing.JLabel txtnum2;
    // End of variables declaration//GEN-END:variables
}

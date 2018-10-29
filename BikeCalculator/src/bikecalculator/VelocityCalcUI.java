/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikecalculator;

import static bikecalculator.BikeCalculator.aeroValues;
import static bikecalculator.BikeCalculator.tireValues;

/**
 *
 * @author Orosz
 */
public class VelocityCalcUI extends javax.swing.JFrame {

    /**
     * Creates new form PowerCalcUI
     */
    public VelocityCalcUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabelRiderWeight = new javax.swing.JLabel();
        jLabelBikeWeight = new javax.swing.JLabel();
        jLabelTires = new javax.swing.JLabel();
        jLabelPosition = new javax.swing.JLabel();
        jLabelGrade = new javax.swing.JLabel();
        jLabelHeadWind = new javax.swing.JLabel();
        jLabelDistance = new javax.swing.JLabel();
        jLabelTemperature = new javax.swing.JLabel();
        jLabelElevation = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabelCalories = new javax.swing.JLabel();
        jLabelWeightLoss = new javax.swing.JLabel();
        jLabelSpeedResult = new javax.swing.JLabel();
        jTextFieldRiderWeight = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBikeWeight = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldGrade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldHeadWind = new javax.swing.JTextField();
        jTextFieldDistance = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTemperature = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldElevation = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabelResult = new javax.swing.JLabel();
        jButtonGO = new javax.swing.JButton();
        jComboBoxTires = new javax.swing.JComboBox<>();
        jComboBoxPosition = new javax.swing.JComboBox<>();
        jLabelPower = new javax.swing.JLabel();
        jTextFieldPower = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelRiderWeight.setText("Rider Weight:");

        jLabelBikeWeight.setText("Bicycle Weight:");

        jLabelTires.setText("Tires:");

        jLabelPosition.setText("Position:");

        jLabelGrade.setText("Grade:");

        jLabelHeadWind.setText("Head Wind:");

        jLabelDistance.setText("Distance:");

        jLabelTemperature.setText("Temperature:");

        jLabelElevation.setText("Elevation:");

        jLabelTime.setText("Time: ----");

        jLabelCalories.setText("Calories: ----");

        jLabelWeightLoss.setText("Weight Loss: ---");

        jLabelSpeedResult.setText("Speed:");

        jTextFieldRiderWeight.setText("60");

        jLabel1.setText("kg");

        jTextFieldBikeWeight.setText("10");

        jLabel2.setText("kg");

        jTextFieldGrade.setText("0");

        jLabel3.setText("%");

        jLabel4.setText("watts");

        jTextFieldHeadWind.setText("0");

        jTextFieldDistance.setText("30");

        jLabel5.setText("km");

        jTextFieldTemperature.setText("25");

        jLabel6.setText("C");

        jTextFieldElevation.setText("100");

        jLabel7.setText("m");

        jLabelResult.setText("Results");

        jButtonGO.setText("GO!");
        jButtonGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGOActionPerformed(evt);
            }
        });

        jComboBoxTires.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clinchers", "Tubular", "MTB" }));

        jComboBoxPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoods", "BarTops", "Bar Ends", "Drops", "Aero" }));

        jLabelPower.setText("Power");

        jTextFieldPower.setText("25");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonGO)
                .addGap(147, 147, 147))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelBikeWeight)
                            .addComponent(jLabelRiderWeight)
                            .addComponent(jLabelTires)
                            .addComponent(jLabelPosition)
                            .addComponent(jLabelGrade)
                            .addComponent(jLabelHeadWind)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelPower)
                                .addComponent(jLabelDistance)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxTires, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldPower, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldRiderWeight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(jTextFieldBikeWeight, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldGrade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldHeadWind, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDistance, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelSpeedResult, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelWeightLoss, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelTemperature)
                                            .addComponent(jLabelElevation))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldElevation)
                                            .addComponent(jTextFieldTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)))
                                    .addComponent(jLabelCalories, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTime, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jLabelResult))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRiderWeight)
                    .addComponent(jTextFieldRiderWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBikeWeight)
                    .addComponent(jTextFieldBikeWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTires)
                    .addComponent(jComboBoxTires, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPosition)
                    .addComponent(jComboBoxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGrade)
                    .addComponent(jTextFieldGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHeadWind)
                    .addComponent(jTextFieldHeadWind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jLabelDistance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPower)
                    .addComponent(jTextFieldPower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTemperature)
                        .addComponent(jTextFieldTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelElevation)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextFieldElevation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jLabelResult)
                .addGap(16, 16, 16)
                .addComponent(jLabelTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCalories)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWeightLoss)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSpeedResult)
                .addGap(41, 41, 41)
                .addComponent(jButtonGO, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGOActionPerformed
        try {
            double riderWeight = Double.parseDouble(jTextFieldRiderWeight.getText());
            double bikeWeight = Double.parseDouble(jTextFieldBikeWeight.getText());
            double tires = tireValues[jComboBoxTires.getSelectedIndex()];
            double aero = aeroValues[jComboBoxPosition.getSelectedIndex()];
            double grade = Double.parseDouble(jTextFieldGrade.getText());
            grade = grade * 0.01;
            double headWind = Double.parseDouble(jTextFieldHeadWind.getText());
            headWind = headWind * 1.0 / 3.6;
            double distance = Double.parseDouble(jTextFieldDistance.getText());
            double temperature = Double.parseDouble(jTextFieldTemperature.getText());
            double elevation = Double.parseDouble(jTextFieldElevation.getText());
            double power = Double.parseDouble(jTextFieldPower.getText());
            
            double transv = 0.95; //don't know what it is, so why bother?
            
            /* Common calculations*/
            double density = (1.293 - 0.00426 * temperature) * Math.exp(-elevation / 7000.0);
            double twt = 9.8 * (riderWeight + bikeWeight); // total weight in newtons
            double A2 = 0.5 * aero * density; // full air resistance parameter;
            double tres = twt * (grade + tires); //gravity and rolling resistance;
            
            double v = BikeCalculator.newton(A2, headWind, tres, transv, power) * 3.6;            
                      
            double t;
            if (v > 0.0) {
                t = 60.0 * distance / v; // v is m/s here, t in minutes
            } else t = 0.0;  // don't want any div by zero errors;
            
            // c = t * 60.0 * powerv / 0.25 / 1000.0; // kilowatt-seconds, aka kilojoules. t is converted to seconds from minutes, 25% conversion efficiency
            double c = t * power * 0.24;  // simplified
            double wl = c / 3218.0; // comes from 1 lb = 3500 Calories
            
            jLabelTime.setText("Time: " + t + " minutes");
            jLabelCalories.setText("Calories: " + c + " kJ / calories");
            jLabelWeightLoss.setText("Weight Loss: " + wl + " kg");
            jLabelSpeedResult.setText("Speed:  " + v + " km/h");
            
            
            
        } catch (NumberFormatException ex) {
            jLabelResult.setText("Enter the specific data\n" + ex);
        }
    }//GEN-LAST:event_jButtonGOActionPerformed

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
            java.util.logging.Logger.getLogger(PowerCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PowerCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PowerCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PowerCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PowerCalcUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGO;
    private javax.swing.JComboBox<String> jComboBoxPosition;
    private javax.swing.JComboBox<String> jComboBoxTires;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelBikeWeight;
    private javax.swing.JLabel jLabelCalories;
    private javax.swing.JLabel jLabelDistance;
    private javax.swing.JLabel jLabelElevation;
    private javax.swing.JLabel jLabelGrade;
    private javax.swing.JLabel jLabelHeadWind;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JLabel jLabelPower;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JLabel jLabelRiderWeight;
    private javax.swing.JLabel jLabelSpeedResult;
    private javax.swing.JLabel jLabelTemperature;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTires;
    private javax.swing.JLabel jLabelWeightLoss;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBikeWeight;
    private javax.swing.JTextField jTextFieldDistance;
    private javax.swing.JTextField jTextFieldElevation;
    private javax.swing.JTextField jTextFieldGrade;
    private javax.swing.JTextField jTextFieldHeadWind;
    private javax.swing.JTextField jTextFieldPower;
    private javax.swing.JTextField jTextFieldRiderWeight;
    private javax.swing.JTextField jTextFieldTemperature;
    // End of variables declaration//GEN-END:variables
}

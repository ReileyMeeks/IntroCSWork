/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9storybook;

/**
 *
 * @author ReileyMeeks
 */
public class EndFrame extends javax.swing.JFrame {
    private StorybookModel myModel;

    /**
     * Creates new form EndFrame
     */
    public EndFrame() {
        initComponents();
    }

    EndFrame(StorybookModel myModel) {
        initComponents();
        this.myModel = myModel;
        welcomeLabel.setText("Welcome, " + myModel.getUserName() + ".");
        crimeLabel.setText("You have been accused of " 
                + myModel.getCrime() + "!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        crimeLabel = new javax.swing.JLabel();
        instructionLabel = new javax.swing.JLabel();
        leftDoorButton = new javax.swing.JButton();
        rightDoorButton = new javax.swing.JButton();
        exitTribunal = new javax.swing.JButton();
        nextTrial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setText("Welcome");

        crimeLabel.setText("You have been accused of");

        instructionLabel.setText("Pick a door to determine your verdict.");

        leftDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab9storybook/Door.GIF"))); // NOI18N
        leftDoorButton.setBorderPainted(false);
        leftDoorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftDoorButtonActionPerformed(evt);
            }
        });

        rightDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab9storybook/Door.GIF"))); // NOI18N
        rightDoorButton.setBorderPainted(false);
        rightDoorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightDoorButtonActionPerformed(evt);
            }
        });

        exitTribunal.setText("Exit Tribunal");
        exitTribunal.setEnabled(false);
        exitTribunal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitTribunalActionPerformed(evt);
            }
        });

        nextTrial.setText("Next Trial -->");
        nextTrial.setEnabled(false);
        nextTrial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextTrialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftDoorButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rightDoorButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeLabel)
                            .addComponent(crimeLabel)
                            .addComponent(instructionLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exitTribunal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(nextTrial)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rightDoorButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(welcomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(crimeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(instructionLabel)
                        .addGap(67, 67, 67)
                        .addComponent(leftDoorButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitTribunal)
                    .addComponent(nextTrial))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftDoorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftDoorButtonActionPerformed
        leftDoorButton.setIcon
        (new javax.swing.ImageIcon(getClass().getResource("/lab9storybook/Tiger.GIF")));
        instructionLabel.setText("You are GUILTY! Prepare to be eaten!");
        
        exitTribunal.setEnabled(true);
        nextTrial.setEnabled(true);
        rightDoorButton.setEnabled(false);
        
    }//GEN-LAST:event_leftDoorButtonActionPerformed

    private void rightDoorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightDoorButtonActionPerformed
        rightDoorButton.setIcon
        (new javax.swing.ImageIcon(getClass().getResource("/lab9storybook/Lady.GIF")));
        instructionLabel.setText("You are INNOCENT! Sorry about that. Please accept this lady.");
        
        exitTribunal.setEnabled(true);
        nextTrial.setEnabled(true);
        leftDoorButton.setEnabled(false);
        
    }//GEN-LAST:event_rightDoorButtonActionPerformed

    private void exitTribunalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitTribunalActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitTribunalActionPerformed

    private void nextTrialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextTrialActionPerformed
        StartFrame newStart = new StartFrame(myModel);
        newStart.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nextTrialActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel crimeLabel;
    private javax.swing.JButton exitTribunal;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JButton leftDoorButton;
    private javax.swing.JButton nextTrial;
    private javax.swing.JButton rightDoorButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}

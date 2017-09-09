package frm;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dev
 */
public class print extends javax.swing.JFrame {

    public print() {
        initComponents();
        onRun();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        txtpane = new javax.swing.JTextPane();
        btn_print = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtpane.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        txtpane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpaneKeyPressed(evt);
            }
        });
        scrollPane.setViewportView(txtpane);

        btn_print.setFont(new java.awt.Font("Lucida Sans", 1, 32)); // NOI18N
        btn_print.setForeground(new java.awt.Color(56, 56, 57));
        btn_print.setText("Print");
        btn_print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_printMouseClicked(evt);
            }
        });

        btn_cancel.setFont(new java.awt.Font("Lucida Sans", 1, 32)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(56, 56, 57));
        btn_cancel.setText("Cancel");
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(btn_print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_print)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseClicked
        resetText();
        JOptionPane.showMessageDialog(this, "done :P", "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_cancelMouseClicked

    private void btn_printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_printMouseClicked
        printText();
        JOptionPane.showMessageDialog(this, "end!", "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_printMouseClicked

    private void txtpaneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaneKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_TAB: {
                printText();
                break;
            }
            case KeyEvent.VK_ESCAPE: {
                onStop();
                break;
            }
            default: {
                break;
            }
        }
    }//GEN-LAST:event_txtpaneKeyPressed

    public void onRun() {
        btn_print.setBackground(new java.awt.Color(135, 72, 64));
        btn_cancel.setBackground(new java.awt.Color(160, 51, 58));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("print.png")));
        getContentPane().setBackground(new java.awt.Color(70, 85, 79));
        setTitle("print text");
    }

    public void printText() {
        //txtpane.setContentType("text/html");
        try {
            txtpane.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this, "fail :(", "", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void resetText() {
        txtpane.setText("");
    }

    public void onStop() {
        System.exit(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new print().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_print;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextPane txtpane;
    // End of variables declaration//GEN-END:variables
}

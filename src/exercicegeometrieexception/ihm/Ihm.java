package exercicegeometrieexception.ihm;

import exercicegeometrieexception.ctrl.ICtrlIhm;
import java.awt.Dimension;
import java.awt.Image;
import java.lang.reflect.Method;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class Ihm extends javax.swing.JFrame implements IIhmCtrl {

    private ICtrlIhm refCtrl;

    /**
     * Creates new form Ihm
     */
    public Ihm() {

//        // Dire à Java de faire ressembler cette application à celles de la plateforme sur laquelle on tourne.
//        try {
//            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
//        }
//        catch ( Exception e ) {
//        }
// 
        // Initialiser les composants de notre ihm.
        initComponents();
// 
//        // Notre fenêtre ne peut être redimensionnée qu'horizontalement et pas plus petit que la taille de design
//        pack();
//        Dimension initialSize = getSize();
//        Dimension dimPreferred = new Dimension( initialSize );
//        Dimension dimMinimum = new Dimension( initialSize );
//        Dimension dimMaximum = getMaximumSize();
//        dimMaximum.height = initialSize.height;   // Pour empêcher le redimensionnement vertical
//        setPreferredSize( dimPreferred );
//        setMinimumSize( dimMinimum );
//        setMaximumSize( dimMaximum );
//        setResizable( true );
//  
//        // Définir le titre de l'application.
////        setTitle( "Pneus v1.0 - written by Paul Friedli" );
// 
//        // Ne pas fermer la fenêtre automatiquement, nous appellerons dispose() nous-même.
////        setDefaultCloseOperation( javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE );
// 
//        // La centrer à l'écran
//        setLocationRelativeTo( null );
    }

    public void demarrer() {
        setVisible( true );
    }

    public void setRefCtrl( ICtrlIhm refCtrl ) {
        this.refCtrl = refCtrl;
    }

    public void afficheResultat( String value ) {
        tResultCircle.setText( value );
    }

    public void afficheMessage( String message ) {
        tMessage.setText( message );
    }

    public void afficheResultatCircle( String value ) {
        tResultCircle.setText( value );
    }

    public void afficheResultatRectangle( String value ) {
        tResultRectangle.setText( value );
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAdresse1 = new javax.swing.JPanel();
        lUser1 = new javax.swing.JLabel();
        lLogin1 = new javax.swing.JLabel();
        bRayon = new javax.swing.JButton();
        tAireCercle = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tResultCircle = new javax.swing.JTextField();
        tMessage = new javax.swing.JTextField();
        panelAdresse2 = new javax.swing.JPanel();
        lUser2 = new javax.swing.JLabel();
        lLogin2 = new javax.swing.JLabel();
        bLargeur = new javax.swing.JButton();
        tAireRectangle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tResultRectangle = new javax.swing.JTextField();
        tLongueur = new javax.swing.JTextField();
        lUser3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAdresse1.setBackground(new java.awt.Color(255, 255, 204));
        panelAdresse1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lUser1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lUser1.setText("Aire");

        lLogin1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lLogin1.setText("Cercle");

        bRayon.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bRayon.setText("Calculer le rayon");
        bRayon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRayonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("RAYON:");

        tResultCircle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tResultCircle.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tResultCircle.setEnabled(false);

        javax.swing.GroupLayout panelAdresse1Layout = new javax.swing.GroupLayout(panelAdresse1);
        panelAdresse1.setLayout(panelAdresse1Layout);
        panelAdresse1Layout.setHorizontalGroup(
            panelAdresse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdresse1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdresse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelAdresse1Layout.createSequentialGroup()
                        .addComponent(lUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tAireCercle))
                    .addComponent(bRayon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAdresse1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tResultCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelAdresse1Layout.setVerticalGroup(
            panelAdresse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdresse1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lLogin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAdresse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lUser1)
                    .addComponent(tAireCercle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRayon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAdresse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tResultCircle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tMessage.setForeground(new java.awt.Color(255, 51, 51));
        tMessage.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tMessage.setEnabled(false);

        panelAdresse2.setBackground(new java.awt.Color(255, 255, 204));
        panelAdresse2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lUser2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lUser2.setText("Aire");

        lLogin2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lLogin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lLogin2.setText("Rectangle");

        bLargeur.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bLargeur.setText("Calculer la largeur");
        bLargeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLargeurActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Largeur:");

        tResultRectangle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tResultRectangle.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tResultRectangle.setEnabled(false);

        lUser3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lUser3.setText("Longueur");

        javax.swing.GroupLayout panelAdresse2Layout = new javax.swing.GroupLayout(panelAdresse2);
        panelAdresse2.setLayout(panelAdresse2Layout);
        panelAdresse2Layout.setHorizontalGroup(
            panelAdresse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdresse2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdresse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdresse2Layout.createSequentialGroup()
                        .addComponent(lUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tAireRectangle))
                    .addComponent(bLargeur, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdresse2Layout.createSequentialGroup()
                        .addComponent(lUser3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tLongueur))
                    .addGroup(panelAdresse2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tResultRectangle, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lLogin2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAdresse2Layout.setVerticalGroup(
            panelAdresse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdresse2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lLogin2)
                .addGap(18, 18, 18)
                .addGroup(panelAdresse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lUser2)
                    .addComponent(tAireRectangle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAdresse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tLongueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUser3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bLargeur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAdresse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tResultRectangle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAdresse1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAdresse2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAdresse1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelAdresse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(tMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRayonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRayonActionPerformed
        refCtrl.selectCalcRadius( tAireCercle.getText() );
    }//GEN-LAST:event_bRayonActionPerformed

    private void bLargeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLargeurActionPerformed
        refCtrl.selectCalcLargeur( tAireRectangle.getText(), tLongueur.getText() );
    }//GEN-LAST:event_bLargeurActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLargeur;
    private javax.swing.JButton bRayon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lLogin1;
    private javax.swing.JLabel lLogin2;
    private javax.swing.JLabel lUser1;
    private javax.swing.JLabel lUser2;
    private javax.swing.JLabel lUser3;
    private javax.swing.JPanel panelAdresse1;
    private javax.swing.JPanel panelAdresse2;
    private javax.swing.JTextField tAireCercle;
    private javax.swing.JTextField tAireRectangle;
    private javax.swing.JTextField tLongueur;
    public javax.swing.JTextField tMessage;
    public javax.swing.JTextField tResultCircle;
    public javax.swing.JTextField tResultRectangle;
    // End of variables declaration//GEN-END:variables

}
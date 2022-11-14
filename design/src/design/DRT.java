
package design;

import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
public class DRT extends javax.swing.JFrame {

    public DRT() {
        initComponents();
        loadData();
        n1.setVisible(false);
        n2.setVisible(false);
        n4.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        list = new javax.swing.JButton();
        credits = new javax.swing.JButton();
        b = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        pag = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        clean = new javax.swing.JButton();
        jtitle = new javax.swing.JTextField();
        n4 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        jyear = new javax.swing.JTextField();
        jpages = new javax.swing.JTextField();
        jlist = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        add.setBackground(new java.awt.Color(183, 237, 214));
        add.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Añadir");
        add.setBorderPainted(false);
        add.setFocusPainted(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(183, 237, 214));
        edit.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Editar");
        edit.setBorderPainted(false);
        edit.setFocusPainted(false);

        delete.setBackground(new java.awt.Color(183, 237, 214));
        delete.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Eliminar");
        delete.setBorderPainted(false);
        delete.setFocusPainted(false);

        list.setBackground(new java.awt.Color(183, 237, 214));
        list.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        list.setForeground(new java.awt.Color(255, 255, 255));
        list.setText("Listar");
        list.setBorderPainted(false);
        list.setFocusPainted(false);

        credits.setBackground(new java.awt.Color(183, 237, 214));
        credits.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        credits.setForeground(new java.awt.Color(255, 255, 255));
        credits.setText("Créditos");
        credits.setBorderPainted(false);
        credits.setFocusPainted(false);
        credits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditsMouseClicked(evt);
            }
        });
        credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsActionPerformed(evt);
            }
        });

        b.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        b.setForeground(new java.awt.Color(104, 203, 159));
        b.setText("Guarda tus metas de lectura en un solo lugar");

        b1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(104, 203, 159));
        b1.setText("Bienvenid@, selecciona la opción deseada");

        b2.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        b2.setForeground(new java.awt.Color(57, 189, 131));
        b2.setText("Daily Reading Tracker");

        n1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        n1.setForeground(new java.awt.Color(104, 203, 159));
        n1.setText("María Camila Villamizar Villamizar");

        pag.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        pag.setForeground(new java.awt.Color(104, 203, 159));
        pag.setText("Número de páginas: ");

        n2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        n2.setForeground(new java.awt.Color(104, 203, 159));
        n2.setText("Anghel Andres Gutierrez Gonzalez");

        save.setBackground(new java.awt.Color(57, 189, 131));
        save.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Guardar");
        save.setBorderPainted(false);
        save.setFocusPainted(false);

        clean.setBackground(new java.awt.Color(57, 189, 131));
        clean.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        clean.setForeground(new java.awt.Color(255, 255, 255));
        clean.setText("Limpiar");
        clean.setBorderPainted(false);
        clean.setFocusPainted(false);
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });

        jtitle.setBackground(new java.awt.Color(183, 237, 214));
        jtitle.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jtitle.setForeground(new java.awt.Color(255, 255, 255));
        jtitle.setSelectionColor(new java.awt.Color(57, 189, 131));

        n4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        n4.setForeground(new java.awt.Color(104, 203, 159));
        n4.setText("Carlos Andres Rueda Ortega");

        title.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(104, 203, 159));
        title.setText("Título del libro: ");

        year.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        year.setForeground(new java.awt.Color(104, 203, 159));
        year.setText("Año: ");

        jyear.setBackground(new java.awt.Color(183, 237, 214));
        jyear.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jyear.setForeground(new java.awt.Color(255, 255, 255));
        jyear.setSelectionColor(new java.awt.Color(57, 189, 131));

        jpages.setBackground(new java.awt.Color(183, 237, 214));
        jpages.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jpages.setForeground(new java.awt.Color(255, 255, 255));
        jpages.setSelectionColor(new java.awt.Color(57, 189, 131));

        jlist.setBackground(new java.awt.Color(183, 237, 214));
        jlist.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jlist.setForeground(new java.awt.Color(255, 255, 255));
        jlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlistActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(57, 189, 131));
        search.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Buscar");
        search.setBorderPainted(false);
        search.setFocusPainted(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(b))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(credits, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pag)
                                        .addGap(18, 18, 18)
                                        .addComponent(jpages, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(title)
                                        .addGap(51, 51, 51)
                                        .addComponent(jtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(year)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jyear, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jlist, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(n2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(102, 102, 102)
                                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32))
                                    .addComponent(n4, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(b1)
                                .addGap(233, 233, 233))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(b2)
                                .addGap(189, 189, 189))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(n1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b1)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(title)
                            .addComponent(jtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pag)
                            .addComponent(jpages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(list)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(credits)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(search)
                    .addComponent(clean))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n1)
                    .addComponent(n2)
                    .addComponent(n4))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
     n1.setVisible(false);
       n2.setVisible(false);
       n4.setVisible(false);
    }//GEN-LAST:event_cleanActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlistActionPerformed
        
    }//GEN-LAST:event_jlistActionPerformed

    private void creditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsActionPerformed
       
       n1.setVisible(true);
       n2.setVisible(true);
       n4.setVisible(true);
    }//GEN-LAST:event_creditsActionPerformed

    private void creditsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsMouseClicked

       
       
       
    }//GEN-LAST:event_creditsMouseClicked
    private void loadData() {
        booksModel BooksModel = new booksModel();
        DefaultComboBoxModel<books> defaultComboBoxModel = new DefaultComboBoxModel<books>();
        //for (books book:booksModel.findAll()) {
            ///defaultComboBoxModel.addElement(book);
        //}
        //jlist.setModel(defaultComboBoxModel);
        jlist.setRenderer(new booksListCellRenderer());//

    }

    private class booksListCellRenderer extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            if (value instanceof books) {
                books book = (books) value;
                value = book.getTitulo();
            }
            return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        }
    }

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
            java.util.logging.Logger.getLogger(DRT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DRT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DRT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DRT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DRT().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel b;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JButton clean;
    private javax.swing.JButton credits;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jlist;
    private javax.swing.JTextField jpages;
    private javax.swing.JTextField jtitle;
    private javax.swing.JTextField jyear;
    private javax.swing.JButton list;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel pag;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JLabel title;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}

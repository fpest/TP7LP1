/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7lp1.vistas;

import java.util.HashSet;
import java.util.Set;
import tp7lp1.Materia;
import tp7lp1.Alumno;

/**
 *
 * @author FP
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private static Set<Materia> listaMaterias = new HashSet<>(); 
    private static Set<Alumno> listaAlumnos = new HashSet<>();
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    public static Set<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public static Set<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnColegio = new javax.swing.JMenu();
        jMnAlumnos = new javax.swing.JMenuItem();
        jMnMaterias = new javax.swing.JMenuItem();
        jMnInscripciones = new javax.swing.JMenuItem();
        jMnSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        jMnColegio.setText("Colegio");
        jMnColegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnColegioActionPerformed(evt);
            }
        });

        jMnAlumnos.setText("Alumnos");
        jMnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnAlumnosActionPerformed(evt);
            }
        });
        jMnColegio.add(jMnAlumnos);

        jMnMaterias.setText("Materias");
        jMnMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnMateriasActionPerformed(evt);
            }
        });
        jMnColegio.add(jMnMaterias);

        jMnInscripciones.setText("Inscripciones");
        jMnInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnInscripcionesActionPerformed(evt);
            }
        });
        jMnColegio.add(jMnInscripciones);

        jMenuBar1.add(jMnColegio);

        jMnSalir.setText("Salir");
        jMnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMnSalirMouseClicked(evt);
            }
        });
        jMnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMnSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnColegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnColegioActionPerformed

    }//GEN-LAST:event_jMnColegioActionPerformed

    private void jMnMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnMateriasActionPerformed
        frm_FormularioDeMaterias vFormularioDeMaterias = new frm_FormularioDeMaterias();
        escritorio.removeAll();
        escritorio.repaint();

        vFormularioDeMaterias.setVisible(true);
        escritorio.add(vFormularioDeMaterias);
    }//GEN-LAST:event_jMnMateriasActionPerformed

    private void jMnInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnInscripcionesActionPerformed
        frm_FormularioDeInscripcion vFormularioDeInscripcion = new frm_FormularioDeInscripcion();
        escritorio.removeAll();
        escritorio.repaint();

        vFormularioDeInscripcion.setVisible(true);
        escritorio.add(vFormularioDeInscripcion);
    }//GEN-LAST:event_jMnInscripcionesActionPerformed

    private void jMnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnSalirActionPerformed
       
    }//GEN-LAST:event_jMnSalirActionPerformed

    private void jMnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnAlumnosActionPerformed
        frm_FormularioDeAlumnos vFormularioDeAlumnos = new frm_FormularioDeAlumnos();
        escritorio.removeAll();
        escritorio.repaint();

        vFormularioDeAlumnos.setVisible(true);
        escritorio.add(vFormularioDeAlumnos);
    }//GEN-LAST:event_jMnAlumnosActionPerformed

    private void jMnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMnSalirMouseClicked
     System.exit(0);  
    }//GEN-LAST:event_jMnSalirMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnAlumnos;
    private javax.swing.JMenu jMnColegio;
    private javax.swing.JMenuItem jMnInscripciones;
    private javax.swing.JMenuItem jMnMaterias;
    private javax.swing.JMenu jMnSalir;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.*;
import javax.swing.*;

import org.jvnet.substance.SubstanceLookAndFeel;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Usuario
 */
public class Main extends javax.swing.JFrame {

    ArrayList<Clase> clases = new ArrayList();
    Clase clase = null;
    Método método = null;
    Interface Interface = null;
    DefaultMutableTreeNode nodo_seleccionado;

    /**
     * Creates new form Main
     */
    public Main() {
        this.setDefaultLookAndFeelDecorated(false);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.RavenGraphiteGlassSkin");
        SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceMetalWallWatermark");
        initComponents();
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crear_clase = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        clase_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        clase_atributos = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        clase_interfaces = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        clase_metodos = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        clase_scope = new javax.swing.JComboBox<>();
        clase_herencia = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        crear_atributo = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        atr_nombre = new javax.swing.JTextField();
        atr_scope = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        atr_tipo = new javax.swing.JComboBox<>();
        atr_valor = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        crear_método = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        mtd_nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        mtd_tipo = new javax.swing.JComboBox<>();
        mtd_scope = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mtd_parametros = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        mtd_cuerpo = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        crear_interface = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        intf_nombre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        intf_atributos = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        intf_métodos = new javax.swing.JList<>();
        jButton7 = new javax.swing.JButton();
        menuClass_Kit = new javax.swing.JPopupMenu();
        menu_añadirTodo = new javax.swing.JMenu();
        añadir_atributo = new javax.swing.JMenuItem();
        añadir_método = new javax.swing.JMenuItem();
        añadir_interface = new javax.swing.JMenuItem();
        menuMtd = new javax.swing.JPopupMenu();
        añadir_atributo1 = new javax.swing.JMenuItem();
        menuIntf = new javax.swing.JPopupMenu();
        menu_añadirTodo1 = new javax.swing.JMenu();
        añadir_atributo2 = new javax.swing.JMenuItem();
        añadir_método1 = new javax.swing.JMenuItem();
        main_Clase = new javax.swing.JPopupMenu();
        añadir_clase = new javax.swing.JMenuItem();
        modificar_clase = new javax.swing.JMenuItem();
        eliminar_clase = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree2 = new javax.swing.JTree();
        jScrollPane3 = new javax.swing.JScrollPane();
        uml = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        crear_clase.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        crear_clase.setBackground(new java.awt.Color(102, 102, 102));
        crear_clase.setName("Panel de Clase"); // NOI18N
        crear_clase.setType(java.awt.Window.Type.UTILITY);
        crear_clase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_claseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setText("Visibilidad");

        clase_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clase_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clase_nombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setText("Atributos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel4.setText("Métodos");

        clase_atributos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clase_atributos.setModel(new DefaultListModel());
        clase_atributos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(clase_atributos);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel5.setText("Interfaces");

        clase_interfaces.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clase_interfaces.setModel(new DefaultListModel());
        clase_interfaces.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(clase_interfaces);

        clase_metodos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clase_metodos.setModel(new DefaultListModel());
        clase_metodos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane7.setViewportView(clase_metodos);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setText("Nombre");

        clase_scope.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clase_scope.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "public", "private", "package", "protected" }));

        clase_herencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel8.setText("Herencia");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Aceptar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crear_claseLayout = new javax.swing.GroupLayout(crear_clase.getContentPane());
        crear_clase.getContentPane().setLayout(crear_claseLayout);
        crear_claseLayout.setHorizontalGroup(
            crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_claseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_claseLayout.createSequentialGroup()
                        .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(crear_claseLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 187, Short.MAX_VALUE))
                            .addComponent(jScrollPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(crear_claseLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clase_herencia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crear_claseLayout.createSequentialGroup()
                                .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))))
                    .addGroup(crear_claseLayout.createSequentialGroup()
                        .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(crear_claseLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clase_scope, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crear_claseLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(clase_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(crear_claseLayout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        crear_claseLayout.setVerticalGroup(
            crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_claseLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clase_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clase_herencia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_claseLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crear_claseLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clase_scope, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Valor");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nombre");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Tipo");

        atr_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        atr_scope.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        atr_scope.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "public", "private", "package", "protected" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Encapsulamiento");

        atr_tipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        atr_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "byte", "short", "int", "long", "float", "double", "char", "boolean", "String" }));

        atr_valor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Aceptar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crear_atributoLayout = new javax.swing.GroupLayout(crear_atributo.getContentPane());
        crear_atributo.getContentPane().setLayout(crear_atributoLayout);
        crear_atributoLayout.setHorizontalGroup(
            crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_atributoLayout.createSequentialGroup()
                .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_atributoLayout.createSequentialGroup()
                        .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(crear_atributoLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crear_atributoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atr_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(crear_atributoLayout.createSequentialGroup()
                                .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(atr_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(atr_valor))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(atr_scope, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(crear_atributoLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        crear_atributoLayout.setVerticalGroup(
            crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_atributoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atr_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atr_scope, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_atributoLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atr_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(atr_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        crear_método.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_métodoMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Nombre");

        mtd_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Tipo");

        mtd_tipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mtd_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "byte", "short", "int", "long", "float", "double", "char", "boolean", "String" }));

        mtd_scope.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mtd_scope.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "public", "private", "package", "protected" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Encapsulamiento");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Cuerpo");

        mtd_parametros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mtd_parametros.setModel(new DefaultListModel());
        mtd_parametros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        mtd_parametros.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jScrollPane1.setViewportView(mtd_parametros);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Parámetros");

        mtd_cuerpo.setColumns(20);
        mtd_cuerpo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mtd_cuerpo.setRows(5);
        jScrollPane5.setViewportView(mtd_cuerpo);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Aceptar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crear_métodoLayout = new javax.swing.GroupLayout(crear_método.getContentPane());
        crear_método.getContentPane().setLayout(crear_métodoLayout);
        crear_métodoLayout.setHorizontalGroup(
            crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_métodoLayout.createSequentialGroup()
                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_métodoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(crear_métodoLayout.createSequentialGroup()
                                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(crear_métodoLayout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(crear_métodoLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mtd_nombre)
                                        .addGap(73, 73, 73)))
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(mtd_scope, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crear_métodoLayout.createSequentialGroup()
                                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mtd_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(crear_métodoLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        crear_métodoLayout.setVerticalGroup(
            crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_métodoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mtd_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mtd_scope, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mtd_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        crear_interface.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_interfaceMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel17.setText("Nombre");

        intf_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        intf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intf_nombreActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel18.setText("Atributos");

        intf_atributos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        intf_atributos.setModel(new DefaultListModel());
        intf_atributos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane8.setViewportView(intf_atributos);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel19.setText("Métodos");

        intf_métodos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        intf_métodos.setModel(new DefaultListModel());
        intf_métodos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane9.setViewportView(intf_métodos);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Aceptar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crear_interfaceLayout = new javax.swing.GroupLayout(crear_interface.getContentPane());
        crear_interface.getContentPane().setLayout(crear_interfaceLayout);
        crear_interfaceLayout.setHorizontalGroup(
            crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_interfaceLayout.createSequentialGroup()
                .addGroup(crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_interfaceLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(crear_interfaceLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(intf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crear_interfaceLayout.createSequentialGroup()
                                .addGroup(crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(crear_interfaceLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(172, 172, 172))
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                    .addGroup(crear_interfaceLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        crear_interfaceLayout.setVerticalGroup(
            crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_interfaceLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuClass_Kit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menu_añadirTodo.setText("Añadir");
        menu_añadirTodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        añadir_atributo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadir_atributo.setText("Atributo");
        añadir_atributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_atributoActionPerformed(evt);
            }
        });
        menu_añadirTodo.add(añadir_atributo);

        añadir_método.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadir_método.setText("Método");
        añadir_método.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_métodoActionPerformed(evt);
            }
        });
        menu_añadirTodo.add(añadir_método);

        añadir_interface.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadir_interface.setText("Interface");
        añadir_interface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_interfaceActionPerformed(evt);
            }
        });
        menu_añadirTodo.add(añadir_interface);

        menuClass_Kit.add(menu_añadirTodo);

        menuMtd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        añadir_atributo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadir_atributo1.setText("Añadir Parámetros");
        añadir_atributo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_atributo1ActionPerformed(evt);
            }
        });
        menuMtd.add(añadir_atributo1);

        menuIntf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menu_añadirTodo1.setText("Añadir");
        menu_añadirTodo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        añadir_atributo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadir_atributo2.setText("Atributo");
        añadir_atributo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_atributo2ActionPerformed(evt);
            }
        });
        menu_añadirTodo1.add(añadir_atributo2);

        añadir_método1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadir_método1.setText("Método");
        añadir_método1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_método1ActionPerformed(evt);
            }
        });
        menu_añadirTodo1.add(añadir_método1);

        menuIntf.add(menu_añadirTodo1);

        main_Clase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        añadir_clase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadir_clase.setText("Añadir Clase");
        añadir_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_claseActionPerformed(evt);
            }
        });
        main_Clase.add(añadir_clase);

        modificar_clase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modificar_clase.setText("Modificar");
        modificar_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_claseActionPerformed(evt);
            }
        });
        main_Clase.add(modificar_clase);

        eliminar_clase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminar_clase.setText("Eliminar");
        eliminar_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_claseActionPerformed(evt);
            }
        });
        main_Clase.add(eliminar_clase);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Acciones");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Generar Códigos");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(131, 131, 131)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Vacío");
        jTree2.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree2.setToolTipText("Diagrama UML");
        jScrollPane2.setViewportView(jTree2);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Proyecto");
        uml.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        uml.setToolTipText("Diagrama UML");
        uml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                umlMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(uml);

        jDesktopPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jDesktopPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clase_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clase_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clase_nombreActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clase.setNombre(clase_nombre.getText());
        clase.setVisibilidad(clase_scope.getSelectedItem().toString());
        if (!clase.equals(nodo_seleccionado.getUserObject())) {
            if (nodo_seleccionado.getUserObject() instanceof String) {
                clase.setPadre(null);
            } else {
                clase.setPadre((Clase) nodo_seleccionado.getUserObject());
            }
            nodo_seleccionado.add(new DefaultMutableTreeNode(clase));
            DefaultComboBoxModel model = (DefaultComboBoxModel) atr_tipo.getModel();
            model.addElement(clase);
            model = (DefaultComboBoxModel) mtd_tipo.getModel();
            model.addElement(clase);
        }
        DefaultTreeModel modeloArbol = (DefaultTreeModel) uml.getModel();
        modeloArbol.reload();
        crear_clase.setVisible(false);
        clase_nombre.setText("");
        clase_metodos.setModel(new DefaultListModel());
        clase_atributos.setModel(new DefaultListModel());
        clase_interfaces.setModel(new DefaultListModel());
        this.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void crear_claseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_claseMouseClicked
        if (evt.isMetaDown()) {
            menuTodo(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_crear_claseMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (clase != null && método == null && Interface == null) {
            agregarAtributo(clase);
        }
        if (clase != null & método != null && Interface == null) {
            agregarAtributo(método);
        }
        if (clase != null && Interface != null && método == null) {
            agregarAtributo(Interface);
        }
        if (clase != null && método != null && Interface != null) {
            agregarAtributo(método);
        }
        atr_nombre.setText("");
        atr_valor.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        método.setNombre(mtd_nombre.getText());
        método.setRetorno(mtd_tipo.getSelectedItem().toString());
        método.setVisibilidad(this.mtd_scope.getSelectedItem().toString());
        método.setCuerpo(mtd_nombre.getText());
        if (clase != null && Interface == null) {
            agregarMétodo(clase);
        }
        if (clase != null && Interface != null) {
            agregarMétodo(Interface);
        }
        crear_método.setVisible(false);
        método = null;
        mtd_nombre.setText("");
        mtd_nombre.setText("");
        mtd_cuerpo.setText("");
        mtd_parametros.setModel(new DefaultListModel());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void crear_métodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_métodoMouseClicked
        if (evt.isMetaDown()) {
            menuTodo(crear_método, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_crear_métodoMouseClicked

    private void añadir_atributo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_atributo1ActionPerformed
        if (método != null) {
            atributo(crear_método);
        }
    }//GEN-LAST:event_añadir_atributo1ActionPerformed

    private void añadir_atributo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_atributo2ActionPerformed
        atributo(crear_interface);
    }//GEN-LAST:event_añadir_atributo2ActionPerformed

    private void añadir_método1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_método1ActionPerformed
        metodo(crear_interface);
    }//GEN-LAST:event_añadir_método1ActionPerformed

    private void añadir_interfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_interfaceActionPerformed
        interf(crear_clase);
    }//GEN-LAST:event_añadir_interfaceActionPerformed

    private void añadir_métodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_métodoActionPerformed
        metodo(crear_clase);
    }//GEN-LAST:event_añadir_métodoActionPerformed

    private void añadir_atributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_atributoActionPerformed
        atributo(crear_clase);
    }//GEN-LAST:event_añadir_atributoActionPerformed

    private void crear_interfaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_interfaceMouseClicked
        if (evt.isMetaDown()) {
            menuTodo(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_crear_interfaceMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        agregarInterface(clase);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void intf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intf_nombreActionPerformed

    private void umlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_umlMouseClicked
        if (evt.isMetaDown()) {
            int row = uml.getClosestRowForLocation(evt.getX(), evt.getY());
            uml.setSelectionRow(row);
            Object v1 = uml.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            if (nodo_seleccionado.getUserObject() instanceof Clase) {
                clase = (Clase) nodo_seleccionado.getUserObject();
            }
            menuTodo(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_umlMouseClicked

    private void añadir_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_claseActionPerformed
        Clase(null);
    }//GEN-LAST:event_añadir_claseActionPerformed

    private void modificar_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_claseActionPerformed
        Clase(nodo_seleccionado);
        if (nodo_seleccionado.getUserObject() instanceof Clase) {
            clase = (Clase) nodo_seleccionado.getUserObject();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una clase.");
        }
    }//GEN-LAST:event_modificar_claseActionPerformed

    private void eliminar_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_claseActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Seguro de eliminar?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        uml.removeSelectionPath(uml.getSelectionPath());
        if (response == JOptionPane.OK_OPTION) {
            DefaultTreeModel m = (DefaultTreeModel) uml.getModel();
            if (nodo_seleccionado.getUserObject() instanceof String) {
                JOptionPane.showMessageDialog(this, "No puede eliminar el proyecto.");

            } else {
                m.removeNodeFromParent(nodo_seleccionado);

            }

            m.reload();
        }
    }//GEN-LAST:event_eliminar_claseActionPerformed

    public void agregarAtributo(Object objeto) {
        String nombre = atr_nombre.getText();
        String tipo = atr_tipo.getSelectedItem().toString();
        String encap = atr_scope.getSelectedItem().toString();
        String valor = atr_valor.getText();
        Atributo atributo = new Atributo(nombre, tipo, encap, valor);
        if (objeto instanceof Clase) {
            Clase clase = ((Clase) objeto);
            clase.getAtributos().add(atributo);
            clase_atributos.setModel(new DefaultListModel());
            DefaultListModel model = (DefaultListModel) clase_atributos.getModel();
            for (Atributo attr : clase.getAtributos()) {
                model.addElement(attr);
            }
        } else if (objeto instanceof Interface) {
            Interface obj = ((Interface) objeto);
            obj.getAtributos().add(atributo);
            intf_atributos.setModel(new DefaultListModel());
            DefaultListModel model = (DefaultListModel) intf_atributos.getModel();
            for (Atributo attr : obj.getAtributos()) {
                model.addElement(attr);
            }
        } else if (objeto instanceof Método) {
            Método mt = ((Método) objeto);
            mt.getParametros().add(atributo);
            mtd_parametros.setModel(new DefaultListModel());
            DefaultListModel model = (DefaultListModel) mtd_parametros.getModel();
            for (Atributo attr : método.getParametros()) {
                model.addElement(attr);
            }
        }
    }

    public void agregarMétodo(Object objeto) {
        if (objeto instanceof Clase) {
            Clase clase = ((Clase) objeto);
            clase.getMétodos().add(método);
            clase_metodos.setModel(new DefaultListModel());
            DefaultListModel model = (DefaultListModel) clase_metodos.getModel();
            for (Método mtd : clase.getMétodos()) {
                model.addElement(mtd);
            }
        } else if (objeto instanceof Interface) {
            Interface intf = ((Interface) objeto);
            intf.getMetodos().add(método);
            intf_métodos.setModel(new DefaultListModel());
            DefaultListModel model = (DefaultListModel) intf_métodos.getModel();
            for (Método mtd : intf.getMetodos()) {
                model.addElement(mtd);
            }
        }
    }

    public void agregarInterface(Object objeto) {
        Clase clase = ((Clase) objeto);
        Interface.setNombre(intf_nombre.getText());
        clase.getInterfaces().add(Interface);
        clase_interfaces.setModel(new DefaultListModel());
        DefaultListModel model = (DefaultListModel) clase_interfaces.getModel();
        for (Interface intf : clase.getInterfaces()) {
            model.addElement(intf);
        }
        crear_interface.setVisible(false);
        Interface = null;
    }

    public void atributo(Component comp) {
        atr_nombre.setText("");
        atr_valor.setText("");
        crear_atributo.setModal(true);
        crear_atributo.setSize(513, 250);

        crear_atributo.setResizable(false);
        crear_atributo.setLocationRelativeTo(comp);
        if (comp.equals(crear_método)) {
            jLabel11.setVisible(false);
            atr_scope.setVisible(false);
            jLabel7.setVisible(false);
            atr_valor.setVisible(false);
            crear_atributo.setSize(513, 240);

        } else {
            jLabel11.setVisible(true);
            atr_scope.setVisible(true);
            jLabel7.setVisible(true);
            atr_valor.setVisible(true);
        }
        crear_atributo.setVisible(true);
    }

    public void Clase(Object object) {
        crear_clase.setSize(866, 480);
        crear_clase.setResizable(false);
        crear_clase.setLocationRelativeTo(null);
        if (object == null) {
            int abstr = JOptionPane.showConfirmDialog(crear_clase, "¿Su clase es abstracta?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (abstr == 0) {
                clase = new Clase(true);
            } else {
                clase = new Clase();
            }

            if (!(nodo_seleccionado.getUserObject() instanceof String)) {
                clase_herencia.setEnabled(false);
                clase_herencia.setModel(new DefaultComboBoxModel());
                DefaultComboBoxModel mod = (DefaultComboBoxModel) clase_herencia.getModel();
                mod.addElement(nodo_seleccionado);
            } else {
                clase_herencia.setEnabled(false);
            }
        } else {
            clase_nombre.setText(clase.getNombre());
            clase_metodos.setModel(new DefaultListModel());
            clase_atributos.setModel(new DefaultListModel());
            clase_interfaces.setModel(new DefaultListModel());
            DefaultListModel model = (DefaultListModel) clase_metodos.getModel();
            for (Método met : clase.getMétodos()) {
                model.addElement(met);
            }
            model = (DefaultListModel) clase_atributos.getModel();
            for (Atributo met : clase.getAtributos()) {
                model.addElement(met);
            }
            model = (DefaultListModel) clase_interfaces.getModel();
            for (Interface met : clase.getInterfaces()) {
                model.addElement(met);
            }
            if (clase.getPadre() != null) {
                clase_herencia.setEnabled(false);
                clase_herencia.setModel(new DefaultComboBoxModel());
                DefaultComboBoxModel mod = (DefaultComboBoxModel) clase_herencia.getModel();
                mod.addElement(clase.getPadre());
            } else {
                clase_herencia.setEnabled(false);
            }
        }
        crear_clase.setVisible(true);
        this.setVisible(false);
    }

    public void metodo(Component comp) {
        int abstr = 0;
        if (comp.equals(crear_clase)) {
            abstr = JOptionPane.showConfirmDialog(crear_clase, "¿Su método es abstracto?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        }
        if (abstr == 0) {
            mtd_cuerpo.setEnabled(false);
            método = new Método(true);
        } else {
            método = new Método();
            mtd_cuerpo.setEnabled(true);
        }
        crear_método.setSize(605, 406);
        crear_método.setResizable(false);
        crear_método.setModal(false);
        crear_método.setLocationRelativeTo(comp);
        crear_método.setVisible(true);
    }

    public void interf(Component comp) {
        Interface = new Interface();
        intf_métodos.setModel(new DefaultListModel());
        intf_atributos.setModel(new DefaultListModel());
        intf_nombre.setText("");
        crear_interface.setSize(568, 360);
        crear_interface.setLocationRelativeTo(null);
        crear_interface.setVisible(true);
    }

    public void menuTodo(Component comp, int x, int y) {
        if (comp.equals(crear_clase)) {
            menuClass_Kit.show(comp, x, y);
        } else if (comp.equals(crear_método)) {
            menuMtd.show(comp, x, y);
        } else if (comp.equals(crear_interface)) {
            menuIntf.show(comp, x, y);
        } else if (comp.equals(uml)) {
            main_Clase.show(comp, x, y);
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField atr_nombre;
    private javax.swing.JComboBox<String> atr_scope;
    private javax.swing.JComboBox<String> atr_tipo;
    private javax.swing.JTextField atr_valor;
    private javax.swing.JMenuItem añadir_atributo;
    private javax.swing.JMenuItem añadir_atributo1;
    private javax.swing.JMenuItem añadir_atributo2;
    private javax.swing.JMenuItem añadir_clase;
    private javax.swing.JMenuItem añadir_interface;
    private javax.swing.JMenuItem añadir_método;
    private javax.swing.JMenuItem añadir_método1;
    private javax.swing.JList<String> clase_atributos;
    private javax.swing.JComboBox<String> clase_herencia;
    private javax.swing.JList<String> clase_interfaces;
    private javax.swing.JList<String> clase_metodos;
    private javax.swing.JTextField clase_nombre;
    private javax.swing.JComboBox<String> clase_scope;
    private javax.swing.JDialog crear_atributo;
    private javax.swing.JDialog crear_clase;
    private javax.swing.JDialog crear_interface;
    private javax.swing.JDialog crear_método;
    private javax.swing.JMenuItem eliminar_clase;
    private javax.swing.JList<String> intf_atributos;
    private javax.swing.JList<String> intf_métodos;
    private javax.swing.JTextField intf_nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTree jTree2;
    private javax.swing.JPopupMenu main_Clase;
    private javax.swing.JPopupMenu menuClass_Kit;
    private javax.swing.JPopupMenu menuIntf;
    private javax.swing.JPopupMenu menuMtd;
    private javax.swing.JMenu menu_añadirTodo;
    private javax.swing.JMenu menu_añadirTodo1;
    private javax.swing.JMenuItem modificar_clase;
    private javax.swing.JTextArea mtd_cuerpo;
    private javax.swing.JTextField mtd_nombre;
    private javax.swing.JList<String> mtd_parametros;
    private javax.swing.JComboBox<String> mtd_scope;
    private javax.swing.JComboBox<String> mtd_tipo;
    private javax.swing.JTree uml;
    // End of variables declaration//GEN-END:variables
}

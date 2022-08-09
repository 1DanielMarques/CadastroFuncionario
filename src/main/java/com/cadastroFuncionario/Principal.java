package com.cadastroFuncionario;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mDanielSE
 */
public class Principal extends javax.swing.JFrame {

    ArrayList<Departamento> listaDep;
    ArrayList<Funcionario> listaFunc;
    String modoDep;
    String modoFunc;

    public void loadTableDep() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{
            "Código", "Nome"}, 0);

        for (int i = 0; i < listaDep.size(); i++) {
            Object linha[] = new Object[]{listaDep.get(i).getCodigo(), listaDep.get(i).getNome()};
            modelo.addRow(linha);
        }

        tb_dep.setModel(modelo);
        tb_dep.getColumnModel().getColumn(0).setPreferredWidth(50);
        tb_dep.getColumnModel().getColumn(1).setPreferredWidth(200);

        loadCbDep();
    }

    public void loadCbDep() {
        cb_func_dep.removeAllItems();
        cb_func_dep.addItem("Selecione");
        for (int i = 0; i < listaDep.size(); i++) {
            cb_func_dep.addItem(listaDep.get(i).getNome());

        }

    }

    public void loadTableFunc() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{
            "Matrícula", "Nome", "Departamento"}, 0);

        for (int i = 0; i < listaFunc.size(); i++) {
            Object linha[] = new Object[]{listaFunc.get(i).getMatricula(), listaFunc.get(i).getNome(), listaFunc.get(i).getDep().getNome()};
            modelo.addRow(linha);
        }

        tb_func.setModel(modelo);
        tb_func.getColumnModel().getColumn(0).setPreferredWidth(50);
        tb_func.getColumnModel().getColumn(1).setPreferredWidth(150);
        tb_func.getColumnModel().getColumn(2).setPreferredWidth(150);

    }

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        listaDep = new ArrayList();
        listaFunc = new ArrayList();

        modoDep = "Navegar";
        modoFunc = "Navegar";

        manipulaInterfaceDep();
        manipulaInterfaceFunc();

    }

    public void manipulaInterfaceDep() {
        switch (modoDep) {
            case "Navegar":
                bt_dep_salvar.setEnabled(false);
                bt_dep_cancelar.setEnabled(false);
                c_dep_codigo.setEditable(false);
                c_dep_nome.setEditable(false);
                bt_dep_novo.setEnabled(true);
                bt_dep_editar.setEnabled(false);
                bt_dep_excluir.setEnabled(false);
                break;
            case "Novo":
                bt_dep_salvar.setEnabled(true);
                bt_dep_cancelar.setEnabled(true);
                c_dep_codigo.setEditable(true);
                c_dep_nome.setEditable(true);
                bt_dep_novo.setEnabled(false);
                bt_dep_editar.setEnabled(false);
                bt_dep_excluir.setEnabled(false);
                break;
            case "Editar":
                bt_dep_salvar.setEnabled(true);
                bt_dep_cancelar.setEnabled(true);
                c_dep_codigo.setEditable(true);
                c_dep_nome.setEditable(true);
                bt_dep_novo.setEnabled(true);
                bt_dep_editar.setEnabled(false);
                bt_dep_excluir.setEnabled(false);
                break;
            case "Selecao":
                bt_dep_salvar.setEnabled(false);
                bt_dep_cancelar.setEnabled(false);
                c_dep_codigo.setEditable(false);
                c_dep_nome.setEditable(false);
                bt_dep_novo.setEnabled(true);
                bt_dep_editar.setEnabled(true);
                bt_dep_excluir.setEnabled(true);
                break;
            default:
                System.out.println("Modo Inválido");

        }

    }

    public void manipulaInterfaceFunc() {
        switch (modoFunc) {
            case "Navegar":
                bt_func_salvar.setEnabled(false);
                bt_func_cancelar.setEnabled(false);
                c_func_mat.setEditable(false);
                c_func_nome.setEditable(false);
                bt_func_novo.setEnabled(true);
                bt_func_editar.setEnabled(false);
                bt_func_excluir.setEnabled(false);
                cb_func_dep.setEnabled(false);
                break;
            case "Novo":
                bt_func_salvar.setEnabled(true);
                bt_func_cancelar.setEnabled(true);
                c_func_mat.setEditable(true);
                c_func_nome.setEditable(true);
                bt_func_novo.setEnabled(false);
                bt_func_editar.setEnabled(false);
                bt_func_excluir.setEnabled(false);
                cb_func_dep.setEnabled(true);
                break;
            case "Editar":
                bt_func_salvar.setEnabled(true);
                bt_func_cancelar.setEnabled(true);
                c_func_mat.setEditable(true);
                c_func_nome.setEditable(true);
                bt_func_novo.setEnabled(true);
                bt_func_editar.setEnabled(false);
                bt_func_excluir.setEnabled(false);
                cb_func_dep.setEnabled(true);
                break;
            case "Selecao":
                bt_func_salvar.setEnabled(false);
                bt_func_cancelar.setEnabled(false);
                c_func_mat.setEditable(false);
                c_func_nome.setEditable(false);
                cb_func_dep.setEnabled(false);
                bt_func_novo.setEnabled(true);
                bt_func_editar.setEnabled(true);
                bt_func_excluir.setEnabled(true);
                break;
            default:
                System.out.println("Modo Inválido");

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_dep = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        c_dep_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_dep_nome = new javax.swing.JTextField();
        bt_dep_cancelar = new javax.swing.JButton();
        bt_dep_salvar = new javax.swing.JButton();
        bt_dep_novo = new javax.swing.JButton();
        bt_dep_editar = new javax.swing.JButton();
        bt_dep_excluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bt_func_novo = new javax.swing.JButton();
        bt_func_editar = new javax.swing.JButton();
        bt_func_excluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_func = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        c_func_mat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        c_func_nome = new javax.swing.JTextField();
        bt_func_cancelar = new javax.swing.JButton();
        bt_func_salvar = new javax.swing.JButton();
        cb_func_dep = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_dep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_dep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_depMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_dep);
        if (tb_dep.getColumnModel().getColumnCount() > 0) {
            tb_dep.getColumnModel().getColumn(0).setPreferredWidth(100);
            tb_dep.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Departamento"));

        jLabel1.setText("Código: ");

        jLabel2.setText("Nome: ");

        bt_dep_cancelar.setText("Cancelar");
        bt_dep_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dep_cancelarActionPerformed(evt);
            }
        });

        bt_dep_salvar.setText("Salvar");
        bt_dep_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dep_salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_dep_nome)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(c_dep_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(bt_dep_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(bt_dep_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_dep_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(c_dep_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_dep_cancelar)
                    .addComponent(bt_dep_salvar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        bt_dep_novo.setText("Novo");
        bt_dep_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dep_novoActionPerformed(evt);
            }
        });

        bt_dep_editar.setText("Editar");
        bt_dep_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dep_editarActionPerformed(evt);
            }
        });

        bt_dep_excluir.setText("Excluir");
        bt_dep_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dep_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_dep_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(bt_dep_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(bt_dep_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_dep_novo)
                    .addComponent(bt_dep_editar)
                    .addComponent(bt_dep_excluir))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("Departamentos", jPanel1);

        bt_func_novo.setText("Novo");
        bt_func_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_func_novoActionPerformed(evt);
            }
        });

        bt_func_editar.setText("Editar");
        bt_func_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_func_editarActionPerformed(evt);
            }
        });

        bt_func_excluir.setText("Excluir");
        bt_func_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_func_excluirActionPerformed(evt);
            }
        });

        tb_func.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Departamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_func.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_funcMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_func);
        if (tb_func.getColumnModel().getColumnCount() > 0) {
            tb_func.getColumnModel().getColumn(0).setPreferredWidth(100);
            tb_func.getColumnModel().getColumn(1).setPreferredWidth(150);
            tb_func.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Funcionário"));

        jLabel7.setText("Matrícula:");

        jLabel8.setText("Nome: ");

        bt_func_cancelar.setText("Cancelar");
        bt_func_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_func_cancelarActionPerformed(evt);
            }
        });

        bt_func_salvar.setText("Salvar");
        bt_func_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_func_salvarActionPerformed(evt);
            }
        });

        cb_func_dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_func_depActionPerformed(evt);
            }
        });

        jLabel9.setText("Dep:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(bt_func_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(bt_func_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_func_nome)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(c_func_mat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cb_func_dep, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(c_func_mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(c_func_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_func_dep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(49, 49, 49)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_func_cancelar)
                    .addComponent(bt_func_salvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt_func_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(bt_func_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(bt_func_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_func_novo)
                    .addComponent(bt_func_editar)
                    .addComponent(bt_func_excluir))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Funcionarios", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_dep_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dep_novoActionPerformed
        modoDep = "Novo";
        manipulaInterfaceDep();


    }//GEN-LAST:event_bt_dep_novoActionPerformed

    private void bt_dep_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dep_cancelarActionPerformed
        c_dep_codigo.setText("");
        c_dep_nome.setText("");
        modoDep = "Navegar";
        manipulaInterfaceDep();
    }//GEN-LAST:event_bt_dep_cancelarActionPerformed

    private void bt_dep_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dep_salvarActionPerformed
        int cod = Integer.parseInt(c_dep_codigo.getText());
        if (modoDep.equals("Novo")) {
            Departamento d = new Departamento(cod, c_dep_nome.getText());
            listaDep.add(d);
        } else if (modoDep.equals("Editar")) {
            int index = tb_dep.getSelectedRow();
            listaDep.get(index).setCodigo(cod);
            listaDep.get(index).setNome(c_dep_nome.getText());
        }

        loadTableDep();
        modoDep = "Navegar";
        manipulaInterfaceDep();
        c_dep_codigo.setText("");
        c_dep_nome.setText("");
    }//GEN-LAST:event_bt_dep_salvarActionPerformed

    private void tb_depMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_depMouseClicked
        int index = tb_dep.getSelectedRow();
        if (index >= 0 && index < listaDep.size()) {
            Departamento d = listaDep.get(index);
            c_dep_codigo.setText(String.valueOf(d.getCodigo()));
            c_dep_nome.setText(d.getNome());
            modoDep = "Selecao";
            manipulaInterfaceDep();
        }
    }//GEN-LAST:event_tb_depMouseClicked

    private void bt_dep_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dep_editarActionPerformed
        modoDep = "Editar";
        manipulaInterfaceDep();
    }//GEN-LAST:event_bt_dep_editarActionPerformed

    private void bt_dep_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dep_excluirActionPerformed
        int index = tb_dep.getSelectedRow();
        if (index >= 0 && index < listaDep.size()) {
            listaDep.remove(index);
        }
        loadTableDep();
        modoDep = "Navegar";
        manipulaInterfaceDep();
        c_dep_codigo.setText("");
        c_dep_nome.setText("");
    }//GEN-LAST:event_bt_dep_excluirActionPerformed

    private void bt_func_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_func_novoActionPerformed
        modoFunc = "Novo";
        manipulaInterfaceFunc();
        c_func_mat.setText("");
        c_func_nome.setText("");
    }//GEN-LAST:event_bt_func_novoActionPerformed

    private void bt_func_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_func_editarActionPerformed

        modoFunc = "Editar";
        manipulaInterfaceFunc();
    }//GEN-LAST:event_bt_func_editarActionPerformed

    private void bt_func_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_func_excluirActionPerformed
        int index = tb_func.getSelectedRow();
        if (index >= 0 && index < listaFunc.size()) {
            listaFunc.remove(index);
        }
        loadTableFunc();
        modoFunc = "Navegar";
        manipulaInterfaceFunc();
        c_func_mat.setText("");
        c_func_nome.setText("");
        cb_func_dep.setSelectedIndex(0);
    }//GEN-LAST:event_bt_func_excluirActionPerformed

    private void tb_funcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_funcMouseClicked

        int index = tb_func.getSelectedRow();
        if (index >= 0 && index < listaFunc.size()) {
            Funcionario f = listaFunc.get(index);
            c_func_mat.setText(String.valueOf(f.getMatricula()));
            c_func_nome.setText(f.getNome());
            modoFunc = "Selecao";
            manipulaInterfaceFunc();
        }

    }//GEN-LAST:event_tb_funcMouseClicked

    private void bt_func_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_func_cancelarActionPerformed
        c_func_mat.setText("");
        c_func_nome.setText("");
        modoFunc = "Navegar";
        manipulaInterfaceFunc();
    }//GEN-LAST:event_bt_func_cancelarActionPerformed

    private void bt_func_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_func_salvarActionPerformed
        int index = cb_func_dep.getSelectedIndex();
        if (index == 0) {
            JOptionPane.showMessageDialog(this, "Selecione um departamento");
        } else if (modoFunc.equals("Novo")) {
            Funcionario f = new Funcionario(Integer.parseInt(c_func_mat.getText()), c_func_nome.getText());
            listaFunc.add(f);
            listaDep.get(index - 1).addFunc(f);
        } else if (modoFunc.equals("Editar")) {
            int i = tb_func.getSelectedRow();
            listaFunc.get(i).setMatricula(Integer.parseInt(c_func_mat.getText()));
            listaFunc.get(i).setNome(c_func_nome.getText());
            listaFunc.get(i).getDep().setNome(listaDep.get(index - 1).getNome());
        }
        loadTableFunc();
        modoFunc = "Navegar";
        manipulaInterfaceFunc();
        c_func_mat.setText("");
        c_func_nome.setText("");
        cb_func_dep.setSelectedIndex(0);
    }//GEN-LAST:event_bt_func_salvarActionPerformed

    private void cb_func_depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_func_depActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_func_depActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_dep_cancelar;
    private javax.swing.JButton bt_dep_editar;
    private javax.swing.JButton bt_dep_excluir;
    private javax.swing.JButton bt_dep_novo;
    private javax.swing.JButton bt_dep_salvar;
    private javax.swing.JButton bt_func_cancelar;
    private javax.swing.JButton bt_func_editar;
    private javax.swing.JButton bt_func_excluir;
    private javax.swing.JButton bt_func_novo;
    private javax.swing.JButton bt_func_salvar;
    private javax.swing.JTextField c_dep_codigo;
    private javax.swing.JTextField c_dep_nome;
    private javax.swing.JTextField c_func_mat;
    private javax.swing.JTextField c_func_nome;
    private javax.swing.JComboBox<String> cb_func_dep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tb_dep;
    private javax.swing.JTable tb_func;
    // End of variables declaration//GEN-END:variables
}

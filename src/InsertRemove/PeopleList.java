package InsertRemove;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class PeopleList extends javax.swing.JFrame {

    ArrayList<Person> people = new ArrayList();
    DefaultListModel list = new DefaultListModel();

    public PeopleList() {
        initComponents();
        people.add(new Person("Bob", 25, "M"));
        people.add(new Person("Fran", 55, "F"));
        people.add(new Person("Mike", 15, "M"));
        people.add(new Person("Sue", 30, "F"));
        lstpeople.setModel(list);
        for (Person p : people) {
            list.addElement(p.getName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstpeople = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        optmale = new javax.swing.JRadioButton();
        optfemale = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuClear = new javax.swing.JMenuItem();
        mnuAdd = new javax.swing.JMenuItem();
        mnuDelete = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuAll = new javax.swing.JMenuItem();
        mnuFemale = new javax.swing.JMenuItem();
        mnuMale = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstpeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstpeopleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstpeople);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Age:");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(optmale);
        optmale.setText("Male");
        optmale.setActionCommand("M");
        optmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optmaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(optfemale);
        optfemale.setText("Female");
        optfemale.setActionCommand("F");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(optmale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(optfemale)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optmale)
                    .addComponent(optfemale))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 204, 51));
        jMenuBar1.setToolTipText("");

        jMenu.setText("File");

        mnuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/exit.png"))); // NOI18N
        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu.add(mnuExit);

        jMenuBar1.add(jMenu);

        jMenu2.setText("Edit");

        mnuClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/exit.png"))); // NOI18N
        mnuClear.setText("Clear");
        mnuClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuClear);

        mnuAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/insert.png"))); // NOI18N
        mnuAdd.setText("Add");
        mnuAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAddActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAdd);

        mnuDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/delete.png"))); // NOI18N
        mnuDelete.setText("Delete");
        mnuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDeleteActionPerformed(evt);
            }
        });
        jMenu2.add(mnuDelete);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Filter");

        mnuAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/all.png"))); // NOI18N
        mnuAll.setText("Show All");
        mnuAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAllActionPerformed(evt);
            }
        });
        jMenu3.add(mnuAll);

        mnuFemale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/female.png"))); // NOI18N
        mnuFemale.setText("Female");
        mnuFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFemaleActionPerformed(evt);
            }
        });
        jMenu3.add(mnuFemale);

        mnuMale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/male.png"))); // NOI18N
        mnuMale.setText("Male");
        mnuMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMaleActionPerformed(evt);
            }
        });
        jMenu3.add(mnuMale);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtname)
                            .addComponent(txtage, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optmaleActionPerformed

    }//GEN-LAST:event_optmaleActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDeleteActionPerformed
        String name = "" + lstpeople.getSelectedValue();
        int loc = search(people, new Person(name, 0, ""));
        list.removeElementAt(lstpeople.getSelectedIndex());
        people.remove(loc);
        clearForm();
    }//GEN-LAST:event_mnuDeleteActionPerformed

    private void mnuMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMaleActionPerformed
        // TODO add your handling code here:
        mnuAdd.setEnabled(false);
        mnuDelete.setEnabled(false);
        clearForm();
        list.clear();
        for (Person person : people) {
            if (person.getGender().equals("M")) {
                list.addElement(person.getName());
            }
        }
    }//GEN-LAST:event_mnuMaleActionPerformed

    private void lstpeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstpeopleMouseClicked
        // TODO add your handling code here:
        String name = "" + lstpeople.getSelectedValue();
        int loc = search(people, new Person(name, 0, ""));
        show(people.get(loc));

    }//GEN-LAST:event_lstpeopleMouseClicked

    private void mnuClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClearActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_mnuClearActionPerformed

    private void mnuAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAddActionPerformed
        // TODO add your handling code here:
        String gender = buttonGroup1.getSelection().getActionCommand();
        String nm;
        int age;
        
        nm = txtname.getText();
        age = Integer.parseInt(txtage.getText());

        Person p;
        
        p = new Person(nm, age, gender);
        
        int loc = search(people, p);

        if (loc == -1) {
            loc = findInsertPoint(people, p);
            people.add(loc,p);
            list.add(loc, p.getName());
            
        } else {
            JOptionPane.showMessageDialog(this, "Error\nMust enter unique name");
        }

    }//GEN-LAST:event_mnuAddActionPerformed

    private void mnuAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAllActionPerformed
        // TODO add your handling code here:
        mnuAdd.setEnabled(true);
        mnuDelete.setEnabled(true);
        clearForm();
        list.clear();
        for (Person person : people) {
            if (person.getGender().equals("M")){
                list.addElement(person.getName());
            }
            else if (person.getGender().equals("F")){
                list.addElement(person.getName());
            }
        }
    }//GEN-LAST:event_mnuAllActionPerformed

    private void mnuFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFemaleActionPerformed
        mnuAdd.setEnabled(false);
        mnuDelete.setEnabled(false);
        clearForm();
        list.clear();
        for (Person person : people) {
            if (person.getGender().equals("F")) {
                list.addElement(person.getName());
            }
        }
    }//GEN-LAST:event_mnuFemaleActionPerformed
    
    public void clearForm() {
        txtname.setText("");
        txtage.setText("");
        buttonGroup1.clearSelection();
        lstpeople.clearSelection();
    }

    public void show(Person p) {
        txtname.setText(p.getName());
        txtage.setText("" + p.getAge()); 
        if (p.getGender() == "M") {
            optmale.setSelected(true);
        } else {
            optfemale.setSelected(true);
        }
    }

    public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int tries = 0;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);
            tries++;
            if (result == 0) {
                System.out.println("it took " + tries + " tries to get here");
                return midpoint;

            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        System.out.println("It took " + tries + " tries to get here.");
        return -1;
    }

    public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midpoint = 0;
        int result = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;
            result = ((Comparable) a.get(midpoint)).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (result < 0) {
            midpoint++;
        }
        return midpoint;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleList().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstpeople;
    private javax.swing.JMenuItem mnuAdd;
    private javax.swing.JMenuItem mnuAll;
    private javax.swing.JMenuItem mnuClear;
    private javax.swing.JMenuItem mnuDelete;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuFemale;
    private javax.swing.JMenuItem mnuMale;
    private javax.swing.JRadioButton optfemale;
    private javax.swing.JRadioButton optmale;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}

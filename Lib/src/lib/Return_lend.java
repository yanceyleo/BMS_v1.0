/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Return_lend extends javax.swing.JPanel {

    /**
     * Creates new form Return_lend
     */
    public Return_lend() {
        setBounds(250, 150, 900, 562);//设定窗体位置
        initComponents();//初始化窗体框架
        Hyalinize H1 = new Hyalinize(jTable1, jScrollPane1);  //使表格透明化
        Hyalinize H2 = new Hyalinize(jTable2, jScrollPane2);  //使表格透明化
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jSeparator6 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "读者号", "图书号", "借书时间"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 440, 240));

        jButton1.setText("添加");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 220, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 160, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("查询");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        jTextField3.setText("请输入读者号或图书号...");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("请输入借书人的读者号：");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("请输入借书人要借的图书的图书号：");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "读者号", "图书号", "还书时间"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 440, 240));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("还书");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 150, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("查询");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, -1, -1));

        jTextField6.setText("请输入读者号或图书号...");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 300, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/title7.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setText("jLabel7");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 172, -1, 160));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 332, 430, 0));
        add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 80, 60));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 120, 180));
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con = null;//调用类AcessDB和其方法connection
        AcessDB adb = new AcessDB();//建立sql数据库连接
        con = adb.ADB();
        Statement st;
        try {
            st = con.createStatement();//建立数据库连接

            String sql02 = "SELECT LENDBOOK.rno FROM LENDBOOK,READER,BOOK WHERE MONTH(GETDATE())-MONTH(time)>1 AND LENDBOOK.rno=READER.rno AND LENDBOOK.bno=BOOK.bno AND LENDBOOK.bno NOT IN(SELECT bno FROM RETURNBOOK)";
            ResultSet rs02 = st.executeQuery(sql02);//查询

            int g = 0;
            while (rs02.next()) {
                if ((jTextField1.getText()).equals(rs02.getString("rno"))) {
                    g++;
                }
            }
            if (g == 0) {
                String sql01 = "SELECT * FROM BOOK WHERE bno LIKE '%" + jTextField2.getText() + "%'";
                ResultSet rs01 = st.executeQuery(sql01);//查询
                rs01.next();
                int i = rs01.getInt("bnum");
                if (i > 0) {
                    i--;
                    String[] s = new String[7];
                    for (int k = 0; k < 7; k++) {
                        s[k] = rs01.getString(k + 1);
                    }
                    int k = st.executeUpdate("DELETE FROM BOOK WHERE bno='" + jTextField2.getText() + "'");
                    int f = st.executeUpdate("INSERT INTO BOOK(bno,bname,author,bpc,ISBN,bnum,bshelf) VALUES('" + s[0] + "'"
                            + ",'" + s[1] + "','" + s[2] + "','" + s[3] + "'"
                            + ",'" + s[4] + "','" + i + "','" + s[6] + "')");
                }

                st = con.createStatement();//建立数据库连接
                int j = st.executeUpdate("INSERT INTO LENDBOOK(rno,bno,time) VALUES('" + jTextField1.getText() + "','" + jTextField2.getText() + "',CONVERT(varchar(30),GETDATE(),120))");
                if (j == 1) {
                    JOptionPane.showMessageDialog(this, "借书成功");
                }
                st = con.createStatement();//建立数据库连接
                String sql = "SELECT * FROM LENDBOOK ";
                ResultSet rs = st.executeQuery(sql);//查询
                DefaultTableModel TableModel = (DefaultTableModel) jTable1.getModel();
                TableModel.setRowCount(0);
                while (rs.next()) {
                    TableModel.addRow(new Object[]{rs.getString("rno"), rs.getString("bno"), rs.getString("time")});
                }
                st.close();//关闭驱动
            } else {
                JOptionPane.showMessageDialog(this, "该用户存在逾期未还情况，已被限制借书！");
            }

        } catch (SQLException ex) {
        } finally {
            try {
                con.close();//关闭连接
            } catch (SQLException ex) {
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection con = null;//调用类AcessDB和其方法connection
        AcessDB adb = new AcessDB();//建立sql数据库连接
        con = adb.ADB();
        Statement st;
        try {
            st = con.createStatement();//建立数据库连接
            String sql = "SELECT * FROM LENDBOOK WHERE rno LIKE '%" + jTextField3.getText() + "%' OR bno LIKE '%" + jTextField3.getText() + "%' ";
            ResultSet rs = st.executeQuery(sql);//查询
            DefaultTableModel TableModel = (DefaultTableModel) jTable1.getModel();
            TableModel.setRowCount(0);
            while (rs.next()) {
                TableModel.addRow(new Object[]{rs.getString("rno"), rs.getString("bno"), rs.getString("time")});
            }
            rs.close();//关闭查询
            st.close();//关闭驱动

        } catch (SQLException ex) {
        } finally {
            try {
                con.close();//关闭连接
            } catch (SQLException ex) {

            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Connection con = null;//调用类AcessDB和其方法connection
        AcessDB adb = new AcessDB();//建立sql数据库连接
        con = adb.ADB();
        Statement st;
        try {

            st = con.createStatement();//建立数据库连接
            st = con.createStatement();//建立数据库连接
            int a = jTable1.getSelectedRow();
            String s1 = "";
            String s2 = "";
            if (a < 0) {
                JOptionPane.showMessageDialog(this, "未选定行");
            } else {
                Object o1 = jTable1.getValueAt(a, 0);
                s1 = o1.toString();
                Object o2 = jTable1.getValueAt(a, 1);
                s2 = o2.toString();
            }
            String sql01 = "SELECT * FROM BOOK WHERE bno LIKE '%" + s2 + "%'";
            ResultSet rs01 = st.executeQuery(sql01);//查询
            rs01.next();
            int i = rs01.getInt("bnum");
            i++;
            String[] s = new String[7];
            for (int k = 0; k < 7; k++) {
                s[k] = rs01.getString(k + 1);
            }
            int k = st.executeUpdate("DELETE FROM BOOK WHERE bno='" + s2 + "'");
            int f = st.executeUpdate("INSERT INTO BOOK(bno,bname,author,bpc,ISBN,bnum,bshelf) VALUES('" + s[0] + "'"
                    + ",'" + s[1] + "','" + s[2] + "','" + s[3] + "'"
                    + ",'" + s[4] + "','" + i + "','" + s[6] + "')");
            st = con.createStatement();//建立数据库连接
            int h = st.executeUpdate("INSERT INTO RETURNBOOK(rno,bno,time) VALUES('" + s1 + "','" + s2 + "',CONVERT(nvarchar(30),GETDATE(),120))");
            if (h == 1) {
                JOptionPane.showMessageDialog(this, "还书成功");//弹出提示框
            }
            st = con.createStatement();//建立数据库连接
            String sql = "SELECT * FROM RETURNBOOK ";
            ResultSet rs = st.executeQuery(sql);//查询
            DefaultTableModel TableModel = (DefaultTableModel) jTable2.getModel();
            TableModel.setRowCount(0);
            while (rs.next()) {
                TableModel.addRow(new Object[]{rs.getString("rno"), rs.getString("bno"), rs.getString("time")});
            }
            st.close();//关闭驱动

        } catch (SQLException ex) {
        } finally {
            try {
                con.close();//关闭连接
            } catch (SQLException ex) {
            }
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Connection con = null;//调用类AcessDB和其方法connection
        AcessDB adb = new AcessDB();//建立sql数据库连接
        con = adb.ADB();
        Statement st;
        try {
            st = con.createStatement();//建立数据库连接
            String sql = "SELECT * FROM RETURNBOOK WHERE rno LIKE '%" + jTextField6.getText() + "%' OR bno LIKE '%" + jTextField6.getText() + "%' ";
            ResultSet rs = st.executeQuery(sql);//查询
            DefaultTableModel TableModel = (DefaultTableModel) jTable2.getModel();
            TableModel.setRowCount(0);
            while (rs.next()) {
                TableModel.addRow(new Object[]{rs.getString("rno"), rs.getString("bno"), rs.getString("time")});
            }
            rs.close();//关闭查询
            st.close();//关闭驱动

        } catch (SQLException ex) {
        } finally {
            try {
                con.close();//关闭连接
            } catch (SQLException ex) {

            }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_l_172479;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

/**
 *
 * @author Adam
 */
public class Tugas6_172479 extends javax.swing.JFrame {

    /**
     * Creates new form Tugas6_172479
     */
    public Tugas6_172479() {
        initComponents();
        GetData();
    }
public String jkk;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Nim = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        Jrs = new javax.swing.JTextField();
        ttl = new javax.swing.JTextField();
        klender = new com.toedter.calendar.JDateChooser();
        Umur = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        pria = new javax.swing.JRadioButton();
        prmpn = new javax.swing.JRadioButton();
        nope = new javax.swing.JTextField();
        tcari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Biodata = new javax.swing.JTable();
        bcari = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 120));

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Jurusan");

        jLabel4.setText("TTL");

        jLabel5.setText("Umur");

        jLabel6.setText("JKEL");

        jLabel7.setText("Alamat");

        jLabel8.setText("NO.HP");

        Nim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NimFocusGained(evt);
            }
        });

        nama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaFocusGained(evt);
            }
        });

        Jrs.setEnabled(false);

        klender.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                klenderPropertyChange(evt);
            }
        });

        Umur.setEnabled(false);

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        pria.setText("Pria");
        pria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priaActionPerformed(evt);
            }
        });

        prmpn.setText("Perempuan");
        prmpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prmpnActionPerformed(evt);
            }
        });

        nope.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nopeActionPerformed(evt);
            }
        });

        Biodata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Biodata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BiodataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Biodata);

        bcari.setText("Cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keluar.setText("Exit");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jrs, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(klender, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(Umur, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(prmpn))
                                    .addComponent(nope, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nim, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bcari)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(simpan)
                .addGap(18, 18, 18)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(Nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bcari))
                    .addComponent(tcari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Jrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(ttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(klender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Umur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pria)
                            .addComponent(prmpn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(nope, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(edit)
                    .addComponent(hapus)
                    .addComponent(keluar))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nopeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nopeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nopeActionPerformed

    private void NimFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NimFocusGained
        
    }//GEN-LAST:event_NimFocusGained

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        if(valid()){
            try {
               String sql = "INSERT INTO mhs_172479 VALUES(id, ?, ?, ?, ?, ?, ?, ?, ?)";
               PreparedStatement PS = koneksi.koneksiDB().prepareStatement(sql);
                
                SimpleDateFormat datee = new SimpleDateFormat("dd-MM-yyyy");
            String dat = datee.format(klender.getDate());
            DefaultTableModel model = (DefaultTableModel)Biodata.getModel();
                java.util.Date date = datee.parse(dat);

                if(pria.isSelected()){
                    jkk = "Laki-laki";
                } else if (prmpn.isSelected()){
                    jkk = "Perempuan";
                }           

               PS.setString(1, Nim.getText());
               PS.setString(2, nama.getText());
               PS.setString(3, Jrs.getText());
               PS.setString(4, ttl.getText());
               PS.setDate(5, new java.sql.Date(date.getTime()));
               PS.setString(6, alamat.getText());
               PS.setString(7, nope.getText());
               PS.setString(8, jkk);
               PS.executeUpdate();
               GetData();
               kosongkan();
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Data mahasiswa gagal disimpan :" + e.getMessage());
           }
        }
    
        /*SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
            String datee = date.format(klender.getDate());
            DefaultTableModel model = (DefaultTableModel)Biodata.getModel();
            model.addRow(new Object[]{Nim.getText(),nama.getText(),Jrs.getText(),Ttl.getText()+","+datee
            ,Umur.getText()+"  "+"Tahun",almat.getText(),jkk,tlpn.getText()
            });
    }//
*/
    }//GEN-LAST:event_simpanActionPerformed

    private void klenderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_klenderPropertyChange
          try{
        Date a = new Date();
   
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy");
    int sekarang = Integer.parseInt(fmt.format(a));
    int lahir = Integer.parseInt(fmt.format(klender.getDate()));
    int umur = sekarang - lahir;
    Umur.setText(String.valueOf((umur)));
   }catch (Exception e){
       Umur.setText("");
   }
    }//GEN-LAST:event_klenderPropertyChange

    private void priaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priaActionPerformed
      if(pria.isSelected()){
          jkk = "Pria";
          prmpn.setSelected(false);
           
       }

    }//GEN-LAST:event_priaActionPerformed

    private void prmpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prmpnActionPerformed
       if(prmpn.isSelected()){
          jkk = "Wanita";
          pria.setSelected(false);
           
    }            
    }//GEN-LAST:event_prmpnActionPerformed

    private void namaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaFocusGained
       try{
               if(Nim.getText().substring(2,3).matches("2")){
                   Jrs.setText("Teknik Informatika");
                   
               }else if (Nim.getText().substring(2,3).matches("1")){
                   Jrs.setText("Sistem Informasi");
                   
               }else if (Nim.getText().substring(2,3).matches("3")){
                   Jrs.setText("Manajemen");
                   
               }else{
                   Jrs.setText("Rekayasa Perangkat Lunak");
               }
           }catch (Exception e){
               Jrs.setText("");
               
           }
    }//GEN-LAST:event_namaFocusGained

    private void BiodataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BiodataMouseClicked
       try{
            DefaultTableModel model = (DefaultTableModel)Biodata.getModel();
            int row = Biodata.getSelectedRow();
            Nim.setText(Biodata.getModel().getValueAt(row,0).toString());
            nama.setText(Biodata.getModel().getValueAt(row,1).toString());
             Jrs.setText(Biodata.getModel().getValueAt(row,2).toString());
            ttl.setText(Biodata.getModel().getValueAt(row,3).toString());
            String sex = model.getValueAt(row, 7).toString();
                    if(sex.equals("Laki-Laki")){
                        pria.setSelected(true);
                    }else{
                         prmpn.setSelected(true);
                                 }
            alamat.setText(Biodata.getModel().getValueAt(row,5).toString());
              nope.setText(Biodata.getModel().getValueAt(row,6).toString());
           
            
            simpan.setEnabled(false);
           
            try{
                 
                Date bdata = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row,4));
                klender.setDate(bdata);
            }catch(ParseException e){
             
            }
       
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(),
                "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
      
    }//GEN-LAST:event_BiodataMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
       try {
              SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
             Date tanggal = new Date();
        tanggal = klender.getDate();
        String tlahir = dateFormat.format(tanggal);
        java.sql.Date dt;
        dt = java.sql.Date.valueOf(tlahir);
       if(pria.isSelected()){
                    jkk = "Laki-laki";
                } else if (prmpn.isSelected()){
                    jkk = "Perempuan";
                }           
               String sql = "Update mhs_172479 SET nama='"+nama.getText()+"',jurusan='"+Jrs.getText()+"',tmptlahir='"+ttl.getText()
       +"',tgllahir='"+tlahir+"',jk='"+jkk+"',alamat='"+alamat.getText()+"',tlp='"+nope.getText()
                       +"' WHERE nim='"+Nim.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        GetData();
        kosongkan();       
        simpan.setEnabled(true);
                           
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        try {
            String sql ="delete from mhs_172479 where nim='"+Nim.getText()+"'";
             java.sql.Connection conn=(Connection)koneksi.koneksiDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        GetData();
        kosongkan();
        simpan.setEnabled(true);
    }//GEN-LAST:event_hapusActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        DefaultTableModel mdl = new DefaultTableModel();
        mdl.addColumn("NIP");
        mdl.addColumn("Nama");
        mdl.addColumn("Jurusan");
        mdl.addColumn("Tempat");
        mdl.addColumn("Tanggal Lahir");
        mdl.addColumn("Alamat");
        mdl.addColumn("NO.HP");
        mdl.addColumn("JKEL");
       try {
            String cari = tcari.getText();
            String sql = "select * from mhs_172479 WHERE nim LIKE '"+cari+"%' or nama LIKE '"+cari+"%' ORDER BY id ASC";
            PreparedStatement PS = koneksi.koneksiDB().prepareStatement(sql);
            ResultSet RS = PS.executeQuery();
            int no=0;
            while(RS.next()){
            no++;    
            mdl.addRow(new Object[]{
                                      RS.getString("nim"),
                                      RS.getString("nama"),
                                      RS.getString("jurusan"),
                                      RS.getString("tmptlahir"),
                                      RS.getString("tgllahir"),
                                      RS.getString("alamat"),
                                      RS.getString("tlp"),
                                      RS.getString("jk"),});
            }
             Biodata.setModel(mdl);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }
       
    }//GEN-LAST:event_bcariActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
      dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private boolean valid(){
      if(Nim.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "NIM tidak boleh kosong");
          Nim.requestFocus(true);
          return false;
      } else if (nama.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong");
          nama.requestFocus(true);
          return false;
      } else if (ttl.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "TTL tidak boleh kosong");
          ttl.requestFocus(true);
          return false;
      } else if (Umur.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Umur tidak boleh kosong");
          Umur.requestFocus(true);
          return false;
      } else if (alamat.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong");
          alamat.requestFocus(true);
          return false;
      } else if (nope.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Nomor telepon tidak boleh kosong");
          nope.requestFocus(true);
          return false;
      } 
      return true;
     }
  private void kosongkan(){
        Nim.setText("");
        nama.setText("");
        Jrs.setText("");
        ttl.setText("");
        klender.setDate(null);
        Umur.setText("");
        alamat.setText("");
        nope.setText("");
        pria.setSelected(false);
        prmpn.setSelected(false);
        
        Nim.requestFocus(true);
    }
  public void GetData() {
         // membuat tampilan model tabel
        DefaultTableModel mdl = new DefaultTableModel();
        mdl.addColumn("NIP");
        mdl.addColumn("Nama");
        mdl.addColumn("Jurusan");
        mdl.addColumn("Tempat");
        mdl.addColumn("Tanggal Lahir");
        mdl.addColumn("Alamat");
        mdl.addColumn("NO.HP");
        mdl.addColumn("JKEL");
       
        

        
        //menampilkan data database kedalam tabel
        try {
            
            String sql = "select * from mhs_172479 ORDER BY id DESC";
            PreparedStatement PS = koneksi.koneksiDB().prepareStatement(sql);
            ResultSet RS = PS.executeQuery();
            while(RS.next()){
            mdl.addRow(new Object[]{
                                      RS.getString(2),
                                      RS.getString(3),
                                      RS.getString(4),
                                      RS.getString(5),
                                      RS.getString(6),
                                      RS.getString(7),
                                      RS.getString(8),
                                      RS.getString(9),});
            }
             Biodata.setModel(mdl);
        } catch (Exception e) {
        } }
  

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
            java.util.logging.Logger.getLogger(Tugas6_172479.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas6_172479.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas6_172479.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas6_172479.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas6_172479().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Biodata;
    private javax.swing.JTextField Jrs;
    private javax.swing.JTextField Nim;
    private javax.swing.JTextField Umur;
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton bcari;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton keluar;

    private javax.swing.JTextField nama;
    private javax.swing.JTextField nope;
    private javax.swing.JRadioButton pria;
    private javax.swing.JRadioButton prmpn;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField tcari;
    private javax.swing.JTextField ttl;
    // End of variables declaration//GEN-END:variables
}

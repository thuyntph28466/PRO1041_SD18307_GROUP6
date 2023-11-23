/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package duan_1.views;

import duan_1.entity.HoaDonChiTiet;
import duan_1.entity.KichThuoc;
import duan_1.entity.NhanVien;
import duan_1.entity.PhieuDoi;
import duan_1.entity.SanPhamChiTiet;
import duan_1.service.NhanVienService;
import duan_1.service.PhieuDoiService;
import duan_1.service.impl.NhanVienServiceImpl;
import duan_1.service.impl.PhieuDoiServiceImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI Laptop
 */
public class QuanLyPhieuDoi extends javax.swing.JFrame {

    private PhieuDoiService phieuDoiService = new PhieuDoiServiceImpl();
    private NhanVienService nhanVienService = new NhanVienServiceImpl();
    private DefaultComboBoxModel<String> defaultCBBNhanVien = new DefaultComboBoxModel<>();
    private ArrayList<NhanVien> listcbbNhanVien = nhanVienService.getAllNhanVien();
    /**
     * Creates new form QuanLyPhieuDoi
     */
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private PhieuDoiService service = new PhieuDoiServiceImpl();

    public QuanLyPhieuDoi() {
        initComponents();
        loadCboNhanVien();
        LoadTB();
        LoadPD();
    }

    private void loadCboNhanVien() {
        cboNV.setModel(defaultCBBNhanVien);
        for (int i = 0; i < listcbbNhanVien.size(); i++) {
            defaultCBBNhanVien.addElement(listcbbNhanVien.get(i).getTenNhanVien());
        }
    }

    public void LoadPD() {
        DefaultTableModel dtm = (DefaultTableModel) tblPhieuDoi.getModel();
        dtm.setRowCount(0);

        for (PhieuDoi ms : this.phieuDoiService.getAllPD()) {
            dtm.addRow(new Object[]{
                ms.getIdPhieuDoi(), ms.getMaPhieuDoi(), ms.getNhanVien().getTenNhanVien(), ms.getChiTietSanPham().getIdSanPhamChiTiet(), ms.getLyDoDoi(), ms.getNgayDoi(), ms.getSoLuong()});
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHDCT = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtIdpd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaPD = new javax.swing.JTextField();
        txtIdSp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLyDo = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cboNV = new javax.swing.JComboBox<>();
        txtSoLuong = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtNgayDoi = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCTSP = new javax.swing.JTable();
        txtIdHD = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPhieuDoi = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblHDCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Hóa Đơn Chi Tiết", "ID Sản Phẩm", "Mã Hóa Đơn", "Số Lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHDCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHDCTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHDCT);

        jLabel4.setText("ID Phiếu Đổi");

        txtIdpd.setEditable(false);

        jLabel5.setText("Mã Phiếu Đổi");

        txtIdSp.setEditable(false);

        jLabel7.setText("Id Sản Phẩm");

        jLabel8.setText("Số lượng đổi");

        jLabel9.setText("Lý do");

        txtLyDo.setColumns(20);
        txtLyDo.setRows(5);
        jScrollPane2.setViewportView(txtLyDo);

        btnAdd.setText("Tạo Phiếu Đổi");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel14.setText(" Nhân Viên");

        cboNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Xóa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Làm Mới");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setText("Ngay Doi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(7, 7, 7)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdSp, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdpd, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPD, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboNV, 0, 233, Short.MAX_VALUE)
                            .addComponent(txtSoLuong)
                            .addComponent(txtNgayDoi))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cboNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(txtMaPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtNgayDoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(jButton1))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        tblCTSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Sản Phẩm", "Kích Thước", "Màu Sắc", "Chất Liệu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCTSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCTSPMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblCTSP);

        txtIdHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdHDActionPerformed(evt);
            }
        });
        txtIdHD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdHDKeyReleased(evt);
            }
        });

        jLabel10.setText("Tìm Kiếm");

        tblPhieuDoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Phiếu đổi", "Mã Phiếu Đổi", "Nhân Viên", "ID Sản Phẩm", "Lý Do", "Ngay Doi", "So Luong"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhieuDoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuDoiMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblPhieuDoi);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Hóa Đơn Chi Tiết");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Phiếu Đổi");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Sản Phẩm Chi Tiết");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtIdHD, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel13))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
            public void LoadTB() {

        DefaultTableModel dtm = (DefaultTableModel) tblHDCT.getModel();
        dtm.setRowCount(0);

        for (HoaDonChiTiet ms : this.service.getAllHDCT()) {
            dtm.addRow(new Object[]{
                ms.getIdHoaDonChiTiet(), ms.getSanPhamChiTiet().getIdSanPhamChiTiet(), ms.getHoaDon().getMaHoaDon(), ms.getSoLuong()});
        }

    }

    public void LoadTB(List<HoaDonChiTiet> listHDCT) {

        DefaultTableModel dtm = (DefaultTableModel) tblHDCT.getModel();
        dtm.setRowCount(0);

        for (HoaDonChiTiet ms : listHDCT) {
            dtm.addRow(new Object[]{
                ms.getIdHoaDonChiTiet(), ms.getSanPhamChiTiet().getIdSanPhamChiTiet(), ms.getHoaDon().getMaHoaDon(), ms.getSoLuong()});
        }

    }
    private void tblHDCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDCTMouseClicked
        this.LoadTableSanPhamChiTiet();
    }//GEN-LAST:event_tblHDCTMouseClicked
    public void searchHDCT() {
        String ma = txtIdHD.getText();
        List<HoaDonChiTiet> listHDCT = this.service.searchHDCT(ma);
        LoadTB(listHDCT);
        if (ma.equals("")) {
            LoadTB();

        }

    }

    public void LoadTableSanPhamChiTiet() {
        int rowSP = tblHDCT.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) tblCTSP.getModel();
        dtm.setRowCount(0);
        ArrayList<SanPhamChiTiet> listCtsp = service.getAllCTSP(tblHDCT.getValueAt(rowSP, 1).toString());
        for (SanPhamChiTiet sp : listCtsp) {
            dtm.addRow(new Object[]{
                sp.getIdSanPhamChiTiet(), sp.getKichThuoc().getTenKichThuoc(), sp.getMauSac().getTenMauSac(), sp.getChatLieu().getTenChatLieu()
            });
        }
    }
    private void txtIdHDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdHDKeyReleased
        searchHDCT();
    }//GEN-LAST:event_txtIdHDKeyReleased

    private void txtIdHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdHDActionPerformed

    private void tblCTSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTSPMouseClicked
        int row = tblCTSP.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtIdSp.setText(tblCTSP.getValueAt(row, 0).toString());
    }//GEN-LAST:event_tblCTSPMouseClicked

    private void tblPhieuDoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuDoiMouseClicked
        int row = tblPhieuDoi.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtIdpd.setText(tblPhieuDoi.getValueAt(row, 0).toString());
        txtMaPD.setText(tblPhieuDoi.getValueAt(row, 1).toString());
        txtIdSp.setText(tblPhieuDoi.getValueAt(row, 3).toString());
        cboNV.setSelectedItem(tblPhieuDoi.getValueAt(row, 2).toString());
        txtLyDo.setText(tblPhieuDoi.getValueAt(row, 4).toString());
        txtNgayDoi.setText(tblPhieuDoi.getValueAt(row, 5).toString());
        txtSoLuong.setText(tblPhieuDoi.getValueAt(row, 6).toString());


    }//GEN-LAST:event_tblPhieuDoiMouseClicked
    private PhieuDoi getFormData() {

        try {

            String maPhieuDoi = txtMaPD.getText().trim();
            int idSP = Integer.parseInt(txtIdSp.getText().trim());

            NhanVien nhanVien = listcbbNhanVien.get(cboNV.getSelectedIndex());
            String lyDo = txtLyDo.getText().trim();
            int soLuong = Integer.parseInt(txtSoLuong.getText().trim());

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            Date ngayDoi = dateFormat.parse(txtNgayDoi.getText().trim());

            SanPhamChiTiet sp = new SanPhamChiTiet();
            sp.getIdSanPhamChiTiet();

            PhieuDoi pd = new PhieuDoi(idSP, maPhieuDoi, sp, nhanVien, lyDo, ngayDoi, soLuong);

            return pd;
        } catch (ParseException e) {
            e.printStackTrace();

            return null; // Or handle the error in a way that makes sense for your application
        }

    }

    public void clear() {
        txtIdSp.setText("");
        txtIdpd.setText("");
        txtLyDo.setText("");
        txtMaPD.setText("");
        txtSoLuong.setText("");
       
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        PhieuDoi pd = this.getFormData();
        int row = tblHDCT.getSelectedRow();
        String id = tblHDCT.getValueAt(row, 1).toString();
        pd.getChiTietSanPham().setIdSanPhamChiTiet(Integer.valueOf(id));
        if (pd == null) {
            return;
        }
        this.phieuDoiService.add(pd);
        this.LoadPD();
        this.clear();


    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PhieuDoi pd = this.getFormData();
        if (pd == null) {
            return;
        }
        int row = tblPhieuDoi.getSelectedRow();
        int id = Integer.parseInt(tblPhieuDoi.getValueAt(row, 0).toString());
        phieuDoiService.update(id, pd);
        this.LoadPD();
        this.clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = tblPhieuDoi.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this,
                    "Chọn dòng cần xóa");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this,
                "Xác nhận xóa?");

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }
        String idStr = this.tblPhieuDoi
                .getValueAt(row, 0).toString();
        int id = Integer.parseInt(idStr);
        phieuDoiService.deleete(id);
        LoadPD();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.clear();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyPhieuDoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhieuDoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhieuDoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhieuDoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyPhieuDoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> cboNV;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblCTSP;
    private javax.swing.JTable tblHDCT;
    private javax.swing.JTable tblPhieuDoi;
    private javax.swing.JTextField txtIdHD;
    private javax.swing.JTextField txtIdSp;
    private javax.swing.JTextField txtIdpd;
    private javax.swing.JTextArea txtLyDo;
    private javax.swing.JTextField txtMaPD;
    private javax.swing.JTextField txtNgayDoi;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables
}

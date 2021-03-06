/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.ui;

import com.polypro.helper.DialogHelper;
import com.polypro.helper.ShareHelper;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author hoang
 */
public class MainJF extends javax.swing.JFrame {

    /**
     * Creates new form MainJF
     */
    public MainJF() {
        initComponents();
        init();
    }

    void init() {
        System.out.println("Main");
        setLocationRelativeTo(null);
        setSize(1280, 760);
        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);

        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");

            @Override
            public void actionPerformed(ActionEvent e) {
                lblDongHo.setText(format.format(new Date()));
            }
        }).start();
//        this.openWelcome();
        this.openLogin();
    }

    void openLogin() {
        new LoginJD(this, true).setVisible(true);
    }

    void openWelcome() {
        new WellcomeJD(this, true).setVisible(true);
    }

    void logoff() {
        ShareHelper.logoff();
        this.openLogin();
    }

    void exit() {
        if (DialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")) {
            System.exit(0);
        }
    }

    void openThongKe(int index) {
        if (ShareHelper.authenticated()) {
            ThongKeJF s = new ThongKeJF();
            s.setVisible(true);
        } else {
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openNhanVien() {
        if (ShareHelper.authenticated()) {
            new NhanVienJF().setVisible(true);
        } else {
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openKhoaHoc() {
        if (ShareHelper.authenticated()) {
            new KhoaHocJF().setVisible(true);
        } else {
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openChuyenDe() {
        if (ShareHelper.authenticated()) {
            new ChuyenDeJF().setVisible(true);
        } else {
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openNguoiHoc() {
        if (ShareHelper.authenticated()) {
            new NguoiHocJF().setVisible(true);
        } else {
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openAbout() {
        new GioiThieuJD(this, true).setVisible(true);
    }

    void openWebsite() {
        try {
            Desktop.getDesktop().browse(new File("help/index.html").toURI());
        } catch (IOException ex) {
            DialogHelper.alert(this, "Không tìm thấy file hướng dẫn!");
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

        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnChuyenDe = new javax.swing.JButton();
        btnNguoiHoc = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnHuongDan = new javax.swing.JButton();
        lblNoiDung = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniQLNguoiHoc = new javax.swing.JMenuItem();
        mniQLChuyenDe = new javax.swing.JMenuItem();
        mniQLKhoaHoc = new javax.swing.JMenuItem();
        mniQLNhanVien = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniTKNguoiHoc = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniTKBangDiem = new javax.swing.JMenuItem();
        mniTKKhoaHoc = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniTKDoanhThu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jToolBar1.setRollover(true);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Exit.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuât");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Stop.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setMargin(new java.awt.Insets(2, 2, 2, 14));
        btnKetThuc.setMaximumSize(new java.awt.Dimension(93, 36));
        btnKetThuc.setName(""); // NOI18N
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetThuc);
        jToolBar1.add(jSeparator6);

        btnChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Lists.png"))); // NOI18N
        btnChuyenDe.setText("Chuyên đề");
        btnChuyenDe.setFocusable(false);
        btnChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenDeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnChuyenDe);

        btnNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Conference.png"))); // NOI18N
        btnNguoiHoc.setText("Người học");
        btnNguoiHoc.setFocusable(false);
        btnNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNguoiHoc);

        btnKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Certificate.png"))); // NOI18N
        btnKhoaHoc.setText("Khóa học");
        btnKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKhoaHoc);
        jToolBar1.add(jSeparator5);

        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Globe.png"))); // NOI18N
        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHuongDan);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        lblNoiDung.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/logo.png"))); // NOI18N
        getContentPane().add(lblNoiDung, java.awt.BorderLayout.CENTER);

        lblTrangThai.setText("Hệ quản lý đào tạo ");

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Alarm.png"))); // NOI18N
        lblDongHo.setText("HHHH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 1081, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDongHo, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        mnuHeThong.setText("Hệ thống");

        mniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Key.png"))); // NOI18N
        mniDangNhap.setText("Đăng nhập");
        mniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangNhapActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangNhap);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Exit.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuât");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);
        mnuHeThong.add(jSeparator1);

        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Refresh.png"))); // NOI18N
        mniDoiMatKhau.setText("Đổi mật khẩu");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMatKhau);
        mnuHeThong.add(jSeparator2);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Stop.png"))); // NOI18N
        mniKetThuc.setText("Kết thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniKetThuc);

        jMenuBar1.add(mnuHeThong);

        mnuQuanLy.setText("Quản lý");

        mniQLNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Conference.png"))); // NOI18N
        mniQLNguoiHoc.setText("Người học");
        mniQLNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLNguoiHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniQLNguoiHoc);

        mniQLChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Lists.png"))); // NOI18N
        mniQLChuyenDe.setText("Chuyên đề");
        mniQLChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLChuyenDeActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniQLChuyenDe);

        mniQLKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Certificate.png"))); // NOI18N
        mniQLKhoaHoc.setText("Khóa học");
        mniQLKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLKhoaHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniQLKhoaHoc);

        mniQLNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/User group.png"))); // NOI18N
        mniQLNhanVien.setText("Quản lý nhân viên");
        mniQLNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLNhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniQLNhanVien);

        jMenuBar1.add(mnuQuanLy);

        mnuThongKe.setText("Thống kê");

        mniTKNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Clien list.png"))); // NOI18N
        mniTKNguoiHoc.setText("Người học từng năm");
        mniTKNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTKNguoiHocActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniTKNguoiHoc);
        mnuThongKe.add(jSeparator3);

        mniTKBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Card file.png"))); // NOI18N
        mniTKBangDiem.setText("Bảng điểm khóa");
        mniTKBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTKBangDiemActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniTKBangDiem);

        mniTKKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Statistics.png"))); // NOI18N
        mniTKKhoaHoc.setText("Điểm từng khóa học");
        mniTKKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTKKhoaHocActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniTKKhoaHoc);
        mnuThongKe.add(jSeparator4);

        mniTKDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Dollar.png"))); // NOI18N
        mniTKDoanhThu.setText("Doanh thu từng chuyên đề");
        mniTKDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTKDoanhThuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniTKDoanhThu);

        jMenuBar1.add(mnuThongKe);

        jMenu4.setText("Trợ giúp");

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Globe.png"))); // NOI18N
        jMenuItem14.setText("Hướng dẫn sử dụng");
        jMenu4.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Home.png"))); // NOI18N
        jMenuItem15.setText("Giới thiệu sản phẩm");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangNhapActionPerformed
        // TODO add your handling code here:
        this.openLogin();
    }//GEN-LAST:event_mniDangNhapActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        // TODO add your handling code here:
        DialogHelper.alert(this, "Đăng xuất thành công!");
        this.openLogin();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_formWindowClosed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        DialogHelper.alert(this, "Đăng xuất thành công!");
        this.openLogin();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        this.openAbout();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void mniQLNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLNguoiHocActionPerformed
        // TODO add your handling code here:
        this.openNguoiHoc();
    }//GEN-LAST:event_mniQLNguoiHocActionPerformed

    private void mniQLChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLChuyenDeActionPerformed
        // TODO add your handling code here:
        this.openChuyenDe();
    }//GEN-LAST:event_mniQLChuyenDeActionPerformed

    private void mniQLKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLKhoaHocActionPerformed
        // TODO add your handling code here:
        this.openKhoaHoc();
    }//GEN-LAST:event_mniQLKhoaHocActionPerformed

    private void mniQLNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLNhanVienActionPerformed
        // TODO add your handling code here:
        this.openNhanVien();
    }//GEN-LAST:event_mniQLNhanVienActionPerformed

    private void mniTKNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTKNguoiHocActionPerformed
        // TODO add your handling code here:
        ThongKeJF.tabIndex = 0;
        this.openThongKe(WIDTH);
    }//GEN-LAST:event_mniTKNguoiHocActionPerformed

    private void btnChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenDeActionPerformed
        // TODO add your handling code here:
        this.openChuyenDe();
    }//GEN-LAST:event_btnChuyenDeActionPerformed

    private void btnNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiHocActionPerformed
        // TODO add your handling code here:
        this.openNguoiHoc();
    }//GEN-LAST:event_btnNguoiHocActionPerformed

    private void btnKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaHocActionPerformed
        // TODO add your handling code here:
        this.openKhoaHoc();
    }//GEN-LAST:event_btnKhoaHocActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void mniTKBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTKBangDiemActionPerformed
        // TODO add your handling code here:
        ThongKeJF.tabIndex = 1;
        this.openThongKe(WIDTH);
    }//GEN-LAST:event_mniTKBangDiemActionPerformed

    private void mniTKKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTKKhoaHocActionPerformed
        // TODO add your handling code here:
        ThongKeJF.tabIndex = 2;
        this.openThongKe(WIDTH);
    }//GEN-LAST:event_mniTKKhoaHocActionPerformed

    private void mniTKDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTKDoanhThuActionPerformed
        // TODO add your handling code here:
        ThongKeJF.tabIndex = 3;
        this.openThongKe(WIDTH);
    }//GEN-LAST:event_mniTKDoanhThuActionPerformed

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
            java.util.logging.Logger.getLogger(MainJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJF().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenDe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JButton btnNguoiHoc;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblNoiDung;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniQLChuyenDe;
    private javax.swing.JMenuItem mniQLKhoaHoc;
    private javax.swing.JMenuItem mniQLNguoiHoc;
    private javax.swing.JMenuItem mniQLNhanVien;
    private javax.swing.JMenuItem mniTKBangDiem;
    private javax.swing.JMenuItem mniTKDoanhThu;
    private javax.swing.JMenuItem mniTKKhoaHoc;
    private javax.swing.JMenuItem mniTKNguoiHoc;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    // End of variables declaration//GEN-END:variables

}

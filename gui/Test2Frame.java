/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.gui;

import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import yumxpress.dao.ProductDAO;
import yumxpress.pojo.ProductPojo;
import yumxpress.util.OwnerProfile;
import yumxpress.util.SpoonacularAPI;

/**
 *
 * @author Hp
 */
public class Test2Frame extends javax.swing.JFrame {

    /**
     * Creates new form Test2Frame
     */
   private List<ProductPojo> foodList;
   private int foodIndex=0;
   private ProductPojo product;
    public Test2Frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblOwnerProfile.setText(OwnerProfile.getOwnerName());
        clearAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblFoodImage = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();
        txtSearchFood = new javax.swing.JTextField();
        txtFoodPrice = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        btnSearchFood = new javax.swing.JButton();
        txtFoodName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblOwnerProfile = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBack.setIcon(new javax.swing.ImageIcon("D:\\Yum Express assets\\icons\\icons\\icons8-left-arrow-64 (1).png")); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        lblNext.setIcon(new javax.swing.ImageIcon("D:\\Yum Express assets\\icons\\icons\\icons8-right-arrow-64 (1).png")); // NOI18N
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
        });

        txtFoodPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoodPriceActionPerformed(evt);
            }
        });

        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnSearchFood.setText("search");
        btnSearchFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFoodActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 102, 255));
        jLabel4.setText("Search Food");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 102, 255));
        jLabel7.setText("Enter Price :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 102, 255));
        jLabel5.setText("Food Name");

        lblOwnerProfile.setText("Pratik Rawal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSearchFood, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnSearchFood))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOwnerProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblBack)
                                .addGap(93, 93, 93)
                                .addComponent(lblFoodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNext)))
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(btnAddItem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFoodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBack)
                    .addComponent(lblNext))
                .addGap(18, 18, 18)
                .addComponent(lblOwnerProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchFood, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchFood)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnAddItem)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFoodPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoodPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoodPriceActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        foodIndex--;
       if(foodIndex<0){
           foodIndex=foodList.size()-1;
       }
       showFoodDetailsByIndex(foodIndex);
        
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
        // TODO add your handling code here:
         foodIndex++;
       if(foodIndex>=foodList.size()){
           foodIndex=0;
       }
       showFoodDetailsByIndex(foodIndex);
    }//GEN-LAST:event_lblNextMouseClicked

    private void btnSearchFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFoodActionPerformed
        // TODO add your handling code here:
        String searchFood=txtSearchFood.getText().trim();
     if(searchFood.isEmpty()){
         JOptionPane.showMessageDialog(null, "Please type a food name");
         return;
     }
     try{
         searchFood=searchFood.replaceAll(" ", "-");
         foodList=SpoonacularAPI.getAllItemDetailsByName(searchFood);
         if(foodList.isEmpty()){
              JOptionPane.showMessageDialog(null, "No food details for "+searchFood+" found");
              return;
         }
         lblNext.setEnabled(true);
         lblBack.setEnabled(true);
         showFoodDetailsByIndex(foodIndex);
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, "Exception while using API");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_btnSearchFoodActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
         if(!validateInputs()){
                JOptionPane.showMessageDialog(null, "Please fill all the data");
                return;
            }
            try{
                double price=Double.parseDouble(txtFoodPrice.getText().trim());
                product.setCompanyId(OwnerProfile.getComapnyId());
                product.setProductName(txtFoodName.getText().trim());
                product.setProductPrice(price);
                boolean result=ProductDAO.addProduct(product);
                if(result==false){
                    JOptionPane.showMessageDialog(null, "Cannot add the product");
                    return;
                }
                 JOptionPane.showMessageDialog(null, "Product successfully added");
                 foodList.remove(foodIndex);
                 if(foodList.isEmpty()){
                     JOptionPane.showMessageDialog(null, "All varities of "+txtSearchFood.getText().trim()+" added");
                     clearAll();
                     return;
                 }
                 foodIndex=0;
                 showFoodDetailsByIndex(foodIndex);
                
            }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, "Exception in DB in test frame");
         ex.printStackTrace();
     }catch(NumberFormatException ex){
         JOptionPane.showMessageDialog(null, "Please input numeric value for price");
         ex.printStackTrace();
     }catch(IOException ex){
         JOptionPane.showMessageDialog(null, "Exception in DAO Image Processing in AddFoodFrame");
         ex.printStackTrace();
     }
    }//GEN-LAST:event_btnAddItemActionPerformed

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
            java.util.logging.Logger.getLogger(Test2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test2Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnSearchFood;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblFoodImage;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblOwnerProfile;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtFoodPrice;
    private javax.swing.JTextField txtSearchFood;
    // End of variables declaration//GEN-END:variables

     private void showFoodDetailsByIndex(int foodIndex) {
        product=foodList.get(foodIndex);
        String foodName=product.getProductName();
        if(foodName.length()>=50){
            foodName=foodName.substring(0,45)+"...";
        }
        txtFoodName.setText(foodName);
        Image img=product.getProductImage();
        img=img.getScaledInstance(lblFoodImage.getWidth(),lblFoodImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon=new ImageIcon(img);
        lblFoodImage.setIcon(icon);
    }
  private boolean validateInputs(){
      if(txtFoodName.getText().trim().isEmpty()||txtFoodPrice.getText().trim().isEmpty()||lblFoodImage.getIcon()==null){
          return false;
      }
      return true;
      
  }

    private void clearAll() {
        txtFoodName.setText("");
        txtFoodPrice.setText("");
        txtSearchFood.setText("");
        lblFoodImage.setIcon(null);
        lblNext.setEnabled(false);
        lblBack.setEnabled(false);
        txtSearchFood.requestFocus();
    }
}

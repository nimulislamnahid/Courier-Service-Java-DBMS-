
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class Staff extends javax.swing.JFrame {

    /**
     * Creates new form Stuff
     */
   Database ob = new Database();
    
    String off;
         String addr,day,month,year;
    
    public Staff() {
        initComponents();
    }
    
      public Staff(String office,String address) {
        initComponents();
        off=office;
        addr=address;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        service = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ttran = new javax.swing.JTextField();
        tphone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Check = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ptran = new javax.swing.JTextField();
        pphone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tdd = new javax.swing.JComboBox();
        tmm = new javax.swing.JComboBox();
        tyy = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        tuser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stuff");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setText("Service");

        service.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        service.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Give", "Take" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Trust Courier");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Take");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setText("Transection ID");

        ttran.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        tphone.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        tphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tphoneKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Phone");

        Check.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        Check.setText("Check");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Weith");

        weight.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        price.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Price");

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton2.setText("Submite");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel8.setText("Transection ID");

        ptran.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        pphone.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        pphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pphoneKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel9.setText("Phone");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Provide");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton3.setText("Submite");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setText("LogOut");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5.setText("List");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel11.setText("Date");

        tdd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tdd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        tmm.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tmm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        tyy.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tyy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2019", "2020" }));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("User");

        tuser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ptran, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pphone, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ttran, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tuser))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tphone, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Check, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tdd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tmm, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(191, 191, 191)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tyy, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tyy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tmm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ttran, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tuser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tphone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ptran, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pphone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int con=service.getSelectedIndex();
         String ctran=ttran.getText();
         String cuser=tuser.getText();
         String cphone=tphone.getText();
         String cwei=weight.getText()+"Kg";
         String cpri=price.getText()+"Taka";
         day=tdd.getSelectedItem().toString();
         month=tmm.getSelectedItem().toString();
         year=tyy.getSelectedItem().toString();
         
         System.out.print(off);
        int check;
        check=checkinput();
        
        if(check==1){
             String strFrom = "Select * from StoreDB where transe='"+ttran.getText()+"' and FUser='"+tuser.getText()+"' and fcity='"+off+"' and fphone='"+tphone.getText()+"'"; 
       
              ResultSet rs1 =null;
                rs1=ob.select(strFrom);
                      System.out.print(rs1);
                     System.out.print(strFrom);
             
                
                
            try {
                if (rs1.next()) {
                    
                      int record=rs1.getInt("ID");
                   System.out.print("3");
                   
                String    name=rs1.getString("fname");
                   System.out.print(record);
                    String    user=rs1.getString("fuser");
                     String   phone=rs1.getString("fphone");
                      
                     // String   road=rs1.getString("froad");
                    // String    lan=rs1.getString("flan");
                    // String   Hnum=rs1.getString("fhnum");
                    // String    from=rs1.getString("fcity");
                     
                     String    tname=rs1.getString("tname");
                   System.out.print(record);
                    
                     String   tophone=rs1.getString("tphone");
                      String   troad=rs1.getString("troad");
                     String    tlan=rs1.getString("tlan");
                     String   tHnum=rs1.getString("thnum");
                     String    to=rs1.getString("tcity");  
                     String    tran=rs1.getString("transe");
                    String    parcel=rs1.getString("toParcel");
                     String    deliverys="Unloaded";
                     
                    String    price=cpri;
                     String weight=cwei;
                     
                if(to.equals(off)){
                      
                 System.out.print("1no");
                  String delivery = "insert into Deli(FName,Fuser,fphone,fcity,tname,tphone,troad,thnum,tlan,tcity,transe,toParcel,day,month,year,weight,price,delivery) values('"+name+"','"+user+"','"+phone+"','"+off+"','"+tname+"','"+tophone+"','"+troad+"','"+tHnum+"','"+tlan+"','"+to+"','"+tran+"','"+parcel+"','"+day+"','"+month+"','"+year+"','"+weight+"','"+price+"','"+deliverys+"')";
                      ob.insert(delivery) ;
                  
                      System.out.print("2no");
                     
                      String sql1 = "insert into Receive(FName,Fuser,fphone,fcity,tname,tphone,troad,thnum,tlan,tcity,transe,toParcel,day,month,year,weight,price,delivery)   values('"+name+"','"+user+"','"+phone+"','"+off+"','"+tname+"','"+tophone+"','"+troad+"','"+tHnum+"','"+tlan+"','"+to+"','"+tran+"','"+parcel+"','"+day+"','"+month+"','"+year+"','"+weight+"','"+price+"','"+deliverys+"')";
                 ob.insert(sql1) ;   
                      
                    
                    String str = "delete from StoreDB where transe= '"+ttran.getText()+"' and FUser='"+tuser.getText()+"' and fcity='"+off+"' and fphone='"+tphone.getText()+"'"; 
                     ob.delete(str); 
                    JOptionPane.showMessageDialog(null,"You are Courier is Successfull wait few days \n"+"We reach Your Product as soon as possibel\n"+"Thank You","Success",JOptionPane.INFORMATION_MESSAGE);  
           
                }
                
                else{ 
                      String sql = "insert into Storeoffice(FName,Fuser,fphone,fcity,tname,tphone,troad,thnum,tlan,tcity,transe,toParcel,day,month,year,weight,price) values('"+name+"','"+user+"','"+phone+"','"+off+"','"+tname+"','"+tphone.getText()+"','"+troad+"','"+tHnum+"','"+tlan+"','"+to+"','"+tran+"','"+parcel+"','"+day+"','"+month+"','"+year+"','"+weight+"','"+price+"')";
                    ob.insert(sql) ;
                    System.out.print("no");
                    String str = "delete from StoreDB where transe= '"+ttran.getText()+"' and FUser='"+tuser.getText()+"' and fcity='"+off+"' and fphone='"+tphone.getText()+"'"; 
                     ob.delete(str);
                     System.out.print("Yes");
        //JOptionPane.showMessageDialog(null,"User Deleted","Success",JOptionPane.INFORMATION_MESSAGE);
                    
               JOptionPane.showMessageDialog(null,"You are Courier is Successfull wait few days \n"+"We reach Your Product as soon as possibel\n"+"Thank You","Success",JOptionPane.INFORMATION_MESSAGE);  
          
                 }   
                
                }
                
                else{
                      JOptionPane.showMessageDialog(null,"Not match err","Error",JOptionPane.ERROR_MESSAGE); 
                    
                }
                
            
            }
       
           catch (SQLException ex) {
            Logger.getLogger(CreateAcc.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
          else{
            
           JOptionPane.showMessageDialog(null,"Something is empty or worng Service","Error",JOptionPane.ERROR_MESSAGE);
            
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     System.out.print("\n 1");
      System.out.print("\n 2");   
        String rsphone=   pphone.getText();
     String transec=   ptran.getText();
     
     int s=service.getSelectedIndex();
         
     if(!pphone.getText().isEmpty() && ! ptran.getText().isEmpty() && s==0){
     try {
         String deliver= "select * from Receive where tphone='"+pphone.getText()+"' and transe='"+ptran.getText()+"'";
                 
     System.out.print(deliver);
     ResultSet rs11 =null;
    rs11=ob.select(deliver);
     System.out.print("\n 2");
         
      if (rs11.next()) {
          
           String delivered ="Delivery";
         System.out.print("\n 2no");
       String rece= "UPDATE Receive SET delivery='"+delivered+"' where transe='"+transec+"'";
       ob.update(rece);
         
           System.out.print("\n 3no");
       String deli= "UPDATE Deli SET delivery='"+delivered+"' where transe='"+transec+"' and tphone='"+rsphone+"'";
         ob.update(deli);
         
          JOptionPane.showMessageDialog(null,"You are Courier is Successfull Delivery\n"+"Thank You","Success",JOptionPane.INFORMATION_MESSAGE);  
       }
       
      
     
     else{
         JOptionPane.showMessageDialog(null,"Wrong Transection","Error",JOptionPane.ERROR_MESSAGE);  
     }
     }
       
       catch (SQLException ex) {
            Logger.getLogger(CreateAcc.class.getName()).log(Level.SEVERE, null, ex);
        } 
      
     }
     else{
         JOptionPane.showMessageDialog(null,"Somthing is empty","Error",JOptionPane.ERROR_MESSAGE);  
     }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        PercelList ob= new PercelList(off,addr);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        String tcity;
        int check;
        check=checks();
        
        if(check==1){
            
            String strFrom = "Select * from StoreDB where transe='"+ttran.getText()+"' and FUser='"+tuser.getText()+"' and fcity='"+off+"' and fphone='"+tphone.getText()+"'"; 
        
              ResultSet rs =null;
                rs=ob.select(strFrom);
                 System.out.print(rs);
                     System.out.print(strFrom);
                
            try {
                if (rs.next()) {
                    //tcity=rs.getString(strFrom)
                    
                    JOptionPane.showMessageDialog(null,"User or Phone or tran . already exits","Success",JOptionPane.INFORMATION_MESSAGE);  // jodi value alrready thakle tokon
                }
                
                else{
                    JOptionPane.showMessageDialog(null,"Not jj match","Error",JOptionPane.ERROR_MESSAGE);
                    
                }
            }
       
           catch (SQLException ex) {
            Logger.getLogger(CreateAcc.class.getName()).log(Level.SEVERE, null, ex);
        }     
                
       
                
                
                
                
                
                
        }
       
        else{
            
           JOptionPane.showMessageDialog(null,"Something is empty ","Error",JOptionPane.ERROR_MESSAGE);
            
            
        }
        
        
 
        
        
    }//GEN-LAST:event_CheckActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          LogIn ob1=new LogIn();
        ob1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tphoneKeyTyped
            char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
        
        boolean max = tphone.getText().length() > 10;
        if ( max ){
        evt.consume();
        } 
    }//GEN-LAST:event_tphoneKeyTyped

    private void pphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pphoneKeyTyped
            char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
        
        boolean max = pphone.getText().length() > 10;
        if ( max ){
        evt.consume();
        }
    }//GEN-LAST:event_pphoneKeyTyped
      
         int checks()  {
        int c=service.getSelectedIndex();
        if( !ttran.getText().isEmpty() && !tuser.getText().isEmpty() && ! tphone.getText().isEmpty()){
           
              return 1;
          }
        
        else{
              
              return 0;
          }
    }
    int checkinput(){
          
          int c=service.getSelectedIndex();
          
          if(!ttran.getText().isEmpty() && !tuser.getText().isEmpty() && ! tphone.getText().isEmpty() && !weight.getText().isEmpty() && ! price.getText().isEmpty() && c==1){
           
              return 1;
          }
          
          else if(!ptran.getText().isEmpty() && ! pphone.getText().isEmpty() && c==0){
          
          
          return 1;
      }
          
          else{
              
              return 0;
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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Check;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField pphone;
    private javax.swing.JTextField price;
    private javax.swing.JTextField ptran;
    private javax.swing.JComboBox service;
    private javax.swing.JComboBox tdd;
    private javax.swing.JComboBox tmm;
    private javax.swing.JTextField tphone;
    private javax.swing.JTextField ttran;
    private javax.swing.JTextField tuser;
    private javax.swing.JComboBox tyy;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}

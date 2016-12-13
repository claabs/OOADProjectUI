/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**

 @author charl
 */
public class UIMain extends javax.swing.JFrame
{

   /**
    Creates new form UIMain
    */
   public UIMain()
   {
      initComponents();
   }

   /**
    This method is called from within the constructor to initialize the form.
    WARNING: Do NOT modify this code. The content of this method is always
    regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      tabMain = new javax.swing.JTabbedPane();
      panelLogin = new javax.swing.JPanel();
      usernameLbl = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      logoImg = new javax.swing.JLabel();
      passwordLbl = new javax.swing.JLabel();
      usernameTxtFld = new javax.swing.JTextField();
      passwordTxtFld = new javax.swing.JTextField();
      createAcctButton = new javax.swing.JButton();
      loginButton = new javax.swing.JButton();
      panelHome = new javax.swing.JPanel();
      homeLogoImg = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      jScrollPane4 = new javax.swing.JScrollPane();
      jTextArea1 = new javax.swing.JTextArea();
      jButton4 = new javax.swing.JButton();
      jLabel7 = new javax.swing.JLabel();
      jScrollPane5 = new javax.swing.JScrollPane();
      jList4 = new javax.swing.JList<>();
      jScrollPane6 = new javax.swing.JScrollPane();
      jList5 = new javax.swing.JList<>();
      jLabel8 = new javax.swing.JLabel();
      jLabel9 = new javax.swing.JLabel();
      jLabel10 = new javax.swing.JLabel();
      panelBrowse = new javax.swing.JPanel();
      headerBrowseLbl = new javax.swing.JLabel();
      findingDoryImg = new javax.swing.JLabel();
      secretLifePetImg = new javax.swing.JLabel();
      starTrekImg = new javax.swing.JLabel();
      priceBrowseLbl1 = new javax.swing.JLabel();
      priceBrowseLbl2 = new javax.swing.JLabel();
      priceBrowseLbl3 = new javax.swing.JLabel();
      scrollBarBrowse = new javax.swing.JScrollBar();
      returnHomeBrowseButton = new javax.swing.JButton();
      panelAccount = new javax.swing.JPanel();
      guzmerAcctImg = new javax.swing.JLabel();
      changeImgButton = new javax.swing.JButton();
      usernameAcctLbl = new javax.swing.JLabel();
      passwordAcctLbl = new javax.swing.JLabel();
      accountIdLbl = new javax.swing.JLabel();
      nameAcctLbl = new javax.swing.JLabel();
      nameAcctLbl1 = new javax.swing.JLabel();
      usernameAcctLbl1 = new javax.swing.JLabel();
      passwordAcctLbl1 = new javax.swing.JLabel();
      accountIdLbl1 = new javax.swing.JLabel();
      changeUsernameAcctButton = new javax.swing.JButton();
      changeNameAcctButton1 = new javax.swing.JButton();
      changePasswordAcctButton = new javax.swing.JButton();
      returnHomeAcctButton = new javax.swing.JButton();
      headerAcctLbl = new javax.swing.JLabel();
      panelCart = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      jList1 = new javax.swing.JList<>();
      jScrollPane2 = new javax.swing.JScrollPane();
      jList2 = new javax.swing.JList<>();
      jScrollPane3 = new javax.swing.JScrollPane();
      jList3 = new javax.swing.JList<>();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      panelNotifications = new javax.swing.JPanel();
      jScrollPane7 = new javax.swing.JScrollPane();
      jList6 = new javax.swing.JList<>();
      jButton5 = new javax.swing.JButton();
      jButton6 = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Movie Rental System");
      setAlwaysOnTop(true);
      setBackground(new java.awt.Color(255, 255, 255));
      setMinimumSize(new java.awt.Dimension(640, 480));
      setName("frameMain"); // NOI18N

      tabMain.setBackground(new java.awt.Color(255, 255, 255));
      tabMain.setName("mainTab"); // NOI18N

      usernameLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      usernameLbl.setText("Username:");

      jLabel2.setToolTipText("");

      logoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoMedium.png"))); // NOI18N
      logoImg.setRequestFocusEnabled(false);

      passwordLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      passwordLbl.setText("Password:");

      createAcctButton.setText("Create Account");

      loginButton.setText("Login");
      loginButton.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            loginButtonActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
      panelLogin.setLayout(panelLoginLayout);
      panelLoginLayout.setHorizontalGroup(
         panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelLoginLayout.createSequentialGroup()
            .addGap(112, 112, 112)
            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(passwordLbl)
               .addComponent(usernameLbl)
               .addComponent(createAcctButton))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panelLoginLayout.createSequentialGroup()
                  .addComponent(logoImg)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jLabel2))
               .addGroup(panelLoginLayout.createSequentialGroup()
                  .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(loginButton)
                     .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usernameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGap(0, 146, Short.MAX_VALUE))))
      );
      panelLoginLayout.setVerticalGroup(
         panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelLoginLayout.createSequentialGroup()
            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panelLoginLayout.createSequentialGroup()
                  .addGap(100, 100, 100)
                  .addComponent(jLabel2)
                  .addGap(175, 175, 175))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(logoImg)
                  .addGap(61, 61, 61)))
            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(usernameLbl)
               .addComponent(usernameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(passwordLbl)
               .addComponent(passwordTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(32, 32, 32)
            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(createAcctButton)
               .addComponent(loginButton))
            .addContainerGap(45, Short.MAX_VALUE))
      );

      tabMain.addTab("Login", panelLogin);

      homeLogoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoSmall.png"))); // NOI18N

      jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      jLabel6.setText("Guzmer");

      jTextArea1.setColumns(5);
      jTextArea1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      jTextArea1.setRows(1);
      jTextArea1.setText("$8.55");
      jTextArea1.setEnabled(false);
      jScrollPane4.setViewportView(jTextArea1);

      jButton4.setText("Add funds");

      jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      jLabel7.setText("Account Balance:");

      jList4.setModel(new javax.swing.AbstractListModel<String>()
      {
         String[] strings = { "The Santa Clause", "Home Alone", "Home Alone 2", "Home Alone 3", "Elf" };
         public int getSize() { return strings.length; }
         public String getElementAt(int i) { return strings[i]; }
      });
      jScrollPane5.setViewportView(jList4);

      jList5.setModel(new javax.swing.AbstractListModel<String>()
      {
         String[] strings = { "2", "2", "2", "2", "57" };
         public int getSize() { return strings.length; }
         public String getElementAt(int i) { return strings[i]; }
      });
      jScrollPane6.setViewportView(jList5);

      jLabel8.setText("Title");

      jLabel9.setText("Days out");

      jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      jLabel10.setText("Items checked out:");

      javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
      panelHome.setLayout(panelHomeLayout);
      panelHomeLayout.setHorizontalGroup(
         panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelHomeLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panelHomeLayout.createSequentialGroup()
                  .addComponent(homeLogoImg)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(jLabel6)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                  .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(panelHomeLayout.createSequentialGroup()
                  .addComponent(jScrollPane5)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel9)
                     .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(panelHomeLayout.createSequentialGroup()
                  .addComponent(jLabel8)
                  .addGap(245, 245, 245))
               .addGroup(panelHomeLayout.createSequentialGroup()
                  .addComponent(jLabel10)
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );
      panelHomeLayout.setVerticalGroup(
         panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelHomeLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panelHomeLayout.createSequentialGroup()
                  .addComponent(jLabel7)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jButton4))
               .addComponent(jLabel6)
               .addComponent(homeLogoImg))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel10)
            .addGap(11, 11, 11)
            .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel8)
               .addComponent(jLabel9))
            .addGap(5, 5, 5)
            .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(130, Short.MAX_VALUE))
      );

      tabMain.addTab("Home ", new javax.swing.ImageIcon(getClass().getResource("/font-awesome_4-7-0_home_64_0_000000_none.png")), panelHome); // NOI18N

      headerBrowseLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      headerBrowseLbl.setText("Browse Movies");

      findingDoryImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findingDory.png"))); // NOI18N

      secretLifePetImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secretPets.png"))); // NOI18N

      starTrekImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/starTrek.png"))); // NOI18N

      priceBrowseLbl1.setText("$5.99");

      priceBrowseLbl2.setText("$5.99");

      priceBrowseLbl3.setText("$5.99");

      scrollBarBrowse.setBackground(new java.awt.Color(255, 204, 51));
      scrollBarBrowse.setForeground(new java.awt.Color(204, 255, 255));

      returnHomeBrowseButton.setText("Return Home");
      returnHomeBrowseButton.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            returnHomeBrowseButtonActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout panelBrowseLayout = new javax.swing.GroupLayout(panelBrowse);
      panelBrowse.setLayout(panelBrowseLayout);
      panelBrowseLayout.setHorizontalGroup(
         panelBrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelBrowseLayout.createSequentialGroup()
            .addGroup(panelBrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panelBrowseLayout.createSequentialGroup()
                  .addGap(19, 19, 19)
                  .addGroup(panelBrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(panelBrowseLayout.createSequentialGroup()
                        .addComponent(findingDoryImg)
                        .addGap(34, 34, 34)
                        .addComponent(secretLifePetImg)
                        .addGap(34, 34, 34)
                        .addComponent(starTrekImg))
                     .addComponent(headerBrowseLbl)))
               .addGroup(panelBrowseLayout.createSequentialGroup()
                  .addGap(74, 74, 74)
                  .addComponent(priceBrowseLbl1)
                  .addGap(156, 156, 156)
                  .addComponent(priceBrowseLbl2)
                  .addGap(158, 158, 158)
                  .addComponent(priceBrowseLbl3)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
            .addComponent(scrollBarBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(53, 53, 53))
         .addGroup(panelBrowseLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(returnHomeBrowseButton)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      panelBrowseLayout.setVerticalGroup(
         panelBrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelBrowseLayout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(panelBrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panelBrowseLayout.createSequentialGroup()
                  .addGroup(panelBrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(secretLifePetImg)
                     .addGroup(panelBrowseLayout.createSequentialGroup()
                        .addComponent(headerBrowseLbl)
                        .addGap(34, 34, 34)
                        .addComponent(findingDoryImg))
                     .addComponent(starTrekImg))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(panelBrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(priceBrowseLbl1)
                     .addComponent(priceBrowseLbl2)
                     .addComponent(priceBrowseLbl3))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                  .addComponent(returnHomeBrowseButton)
                  .addContainerGap())
               .addGroup(panelBrowseLayout.createSequentialGroup()
                  .addGap(58, 58, 58)
                  .addComponent(scrollBarBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
      );

      tabMain.addTab("Browse ", new javax.swing.ImageIcon(getClass().getResource("/font-awesome_4-7-0_list-ul_16_0_000000_none.png")), panelBrowse); // NOI18N

      guzmerAcctImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guzmer.png"))); // NOI18N

      changeImgButton.setText("Change Image");

      usernameAcctLbl.setText("Username:");

      passwordAcctLbl.setText("Password:");

      accountIdLbl.setText("Account ID:");

      nameAcctLbl.setText("Name:");

      nameAcctLbl1.setText("Guzmer");

      usernameAcctLbl1.setText("guzmer123");

      passwordAcctLbl1.setText("***********");

      accountIdLbl1.setText("957860");

      changeUsernameAcctButton.setText("Change Username");
      changeUsernameAcctButton.setToolTipText("");

      changeNameAcctButton1.setText("Change Name");

      changePasswordAcctButton.setText("Change Password");
      changePasswordAcctButton.setToolTipText("");

      returnHomeAcctButton.setText("Return Home");
      returnHomeAcctButton.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            returnHomeAcctButtonActionPerformed(evt);
         }
      });

      headerAcctLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      headerAcctLbl.setText("My Account");

      javax.swing.GroupLayout panelAccountLayout = new javax.swing.GroupLayout(panelAccount);
      panelAccount.setLayout(panelAccountLayout);
      panelAccountLayout.setHorizontalGroup(
         panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAccountLayout.createSequentialGroup()
            .addGroup(panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(panelAccountLayout.createSequentialGroup()
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(changeNameAcctButton1))
               .addGroup(panelAccountLayout.createSequentialGroup()
                  .addGap(19, 19, 19)
                  .addGroup(panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(guzmerAcctImg)
                     .addGroup(panelAccountLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(changeImgButton))
                     .addComponent(returnHomeAcctButton)
                     .addComponent(headerAcctLbl))
                  .addGap(18, 18, 18)
                  .addGroup(panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(nameAcctLbl)
                     .addComponent(usernameAcctLbl)
                     .addComponent(passwordAcctLbl)
                     .addComponent(accountIdLbl))
                  .addGap(26, 26, 26)
                  .addGroup(panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(usernameAcctLbl1)
                     .addComponent(accountIdLbl1)
                     .addComponent(passwordAcctLbl1)
                     .addComponent(nameAcctLbl1))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                  .addGroup(panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(changeUsernameAcctButton)
                     .addComponent(changePasswordAcctButton))))
            .addGap(92, 92, 92))
      );
      panelAccountLayout.setVerticalGroup(
         panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelAccountLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(headerAcctLbl)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
            .addGroup(panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panelAccountLayout.createSequentialGroup()
                  .addComponent(guzmerAcctImg)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(changeImgButton))
               .addGroup(panelAccountLayout.createSequentialGroup()
                  .addGap(14, 14, 14)
                  .addGroup(panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(nameAcctLbl)
                     .addComponent(nameAcctLbl1)
                     .addComponent(changeNameAcctButton1))
                  .addGap(23, 23, 23)
                  .addGroup(panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(usernameAcctLbl)
                     .addComponent(usernameAcctLbl1)
                     .addComponent(changeUsernameAcctButton))
                  .addGap(18, 18, 18)
                  .addGroup(panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(passwordAcctLbl)
                     .addComponent(passwordAcctLbl1)
                     .addComponent(changePasswordAcctButton))
                  .addGap(18, 18, 18)
                  .addGroup(panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(accountIdLbl)
                     .addComponent(accountIdLbl1))))
            .addGap(106, 106, 106)
            .addComponent(returnHomeAcctButton)
            .addGap(14, 14, 14))
      );

      tabMain.addTab("Account ", new javax.swing.ImageIcon(getClass().getResource("/material-icons_3-0-1_account-box_16_0_000000_none.png")), panelAccount); // NOI18N

      jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      jLabel1.setText("Cart");

      jList1.setModel(new javax.swing.AbstractListModel<String>()
      {
         String[] strings = { "Finding Dory", "Star Trek Beyond", "The Secret Life of Pets", "Guardians of the Galaxy", "Snowden" };
         public int getSize() { return strings.length; }
         public String getElementAt(int i) { return strings[i]; }
      });
      jScrollPane1.setViewportView(jList1);

      jList2.setModel(new javax.swing.AbstractListModel<String>()
      {
         String[] strings = { "$5.99", "$5.99", "$5.99", "$3.99", "$5.99" };
         public int getSize() { return strings.length; }
         public String getElementAt(int i) { return strings[i]; }
      });
      jScrollPane2.setViewportView(jList2);

      jList3.setModel(new javax.swing.AbstractListModel<String>()
      {
         String[] strings = { "1", "1", "1", "1", "1" };
         public int getSize() { return strings.length; }
         public String getElementAt(int i) { return strings[i]; }
      });
      jScrollPane3.setViewportView(jList3);

      jLabel3.setText("Title");

      jLabel4.setText("Price/day");

      jLabel5.setText("Quantity");

      jButton1.setText("Edit Quantity");

      jButton2.setText("Remove Item");

      jButton3.setText("Checkout");

      javax.swing.GroupLayout panelCartLayout = new javax.swing.GroupLayout(panelCart);
      panelCart.setLayout(panelCartLayout);
      panelCartLayout.setHorizontalGroup(
         panelCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelCartLayout.createSequentialGroup()
            .addGroup(panelCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panelCartLayout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jLabel1))
               .addGroup(panelCartLayout.createSequentialGroup()
                  .addGap(14, 14, 14)
                  .addGroup(panelCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(jButton3)
                     .addGroup(panelCartLayout.createSequentialGroup()
                        .addGroup(panelCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel3)
                           .addGroup(panelCartLayout.createSequentialGroup()
                              .addComponent(jButton1)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel5)
                           .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addContainerGap(14, Short.MAX_VALUE))
      );
      panelCartLayout.setVerticalGroup(
         panelCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelCartLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jLabel3)
               .addComponent(jLabel4)
               .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
               .addComponent(jScrollPane2)
               .addComponent(jScrollPane3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jButton1)
               .addComponent(jButton2)
               .addComponent(jButton3))
            .addGap(32, 32, 32))
      );

      tabMain.addTab("Cart", new javax.swing.ImageIcon(getClass().getResource("/font-awesome_4-7-0_shopping-cart_16_0_000000_none.png")), panelCart, ""); // NOI18N

      jList6.setModel(new javax.swing.AbstractListModel<String>()
      {
         String[] strings = { "ALERT: item ELF has been checked out for 57 days!", "DEAL: Get 25% off when you rent 5 or more items!" };
         public int getSize() { return strings.length; }
         public String getElementAt(int i) { return strings[i]; }
      });
      jScrollPane7.setViewportView(jList6);

      jButton5.setText("Clear Selected");

      jButton6.setText("Clear All");
      jButton6.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            jButton6ActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout panelNotificationsLayout = new javax.swing.GroupLayout(panelNotifications);
      panelNotifications.setLayout(panelNotificationsLayout);
      panelNotificationsLayout.setHorizontalGroup(
         panelNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelNotificationsLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panelNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
               .addGroup(panelNotificationsLayout.createSequentialGroup()
                  .addComponent(jButton5)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jButton6)
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );
      panelNotificationsLayout.setVerticalGroup(
         panelNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelNotificationsLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jButton5)
               .addComponent(jButton6))
            .addContainerGap(209, Short.MAX_VALUE))
      );

      tabMain.addTab("Notifications", new javax.swing.ImageIcon(getClass().getResource("/ionicons_2-0-1_android-notifications_16_0_000000_none.png")), panelNotifications); // NOI18N

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(tabMain)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(tabMain, javax.swing.GroupLayout.Alignment.TRAILING)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void loginButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loginButtonActionPerformed
   {//GEN-HEADEREND:event_loginButtonActionPerformed
      tabMain.setSelectedIndex(1);
   }//GEN-LAST:event_loginButtonActionPerformed

   private void returnHomeBrowseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_returnHomeBrowseButtonActionPerformed
   {//GEN-HEADEREND:event_returnHomeBrowseButtonActionPerformed
      tabMain.setSelectedIndex(1);
   }//GEN-LAST:event_returnHomeBrowseButtonActionPerformed

   private void returnHomeAcctButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_returnHomeAcctButtonActionPerformed
   {//GEN-HEADEREND:event_returnHomeAcctButtonActionPerformed
      tabMain.setSelectedIndex(1);
   }//GEN-LAST:event_returnHomeAcctButtonActionPerformed

   private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton6ActionPerformed
   {//GEN-HEADEREND:event_jButton6ActionPerformed
      jList6.removeAll();
      jList6.updateUI();
   }//GEN-LAST:event_jButton6ActionPerformed

   /**
    @param args the command line arguments
    */
   public static void main(String args[])
   {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try
      {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
         {
            if ("Nimbus".equals(info.getName()))
            {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      }
      catch (ClassNotFoundException ex)
      {
         java.util.logging.Logger.getLogger(UIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (InstantiationException ex)
      {
         java.util.logging.Logger.getLogger(UIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (IllegalAccessException ex)
      {
         java.util.logging.Logger.getLogger(UIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (javax.swing.UnsupportedLookAndFeelException ex)
      {
         java.util.logging.Logger.getLogger(UIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            new UIMain().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel accountIdLbl;
   private javax.swing.JLabel accountIdLbl1;
   private javax.swing.JButton changeImgButton;
   private javax.swing.JButton changeNameAcctButton1;
   private javax.swing.JButton changePasswordAcctButton;
   private javax.swing.JButton changeUsernameAcctButton;
   private javax.swing.JButton createAcctButton;
   private javax.swing.JLabel findingDoryImg;
   private javax.swing.JLabel guzmerAcctImg;
   private javax.swing.JLabel headerAcctLbl;
   private javax.swing.JLabel headerBrowseLbl;
   private javax.swing.JLabel homeLogoImg;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JButton jButton4;
   private javax.swing.JButton jButton5;
   private javax.swing.JButton jButton6;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JList<String> jList1;
   private javax.swing.JList<String> jList2;
   private javax.swing.JList<String> jList3;
   private javax.swing.JList<String> jList4;
   private javax.swing.JList<String> jList5;
   private javax.swing.JList<String> jList6;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JScrollPane jScrollPane4;
   private javax.swing.JScrollPane jScrollPane5;
   private javax.swing.JScrollPane jScrollPane6;
   private javax.swing.JScrollPane jScrollPane7;
   private javax.swing.JTextArea jTextArea1;
   private javax.swing.JButton loginButton;
   private javax.swing.JLabel logoImg;
   private javax.swing.JLabel nameAcctLbl;
   private javax.swing.JLabel nameAcctLbl1;
   private javax.swing.JPanel panelAccount;
   private javax.swing.JPanel panelBrowse;
   private javax.swing.JPanel panelCart;
   private javax.swing.JPanel panelHome;
   private javax.swing.JPanel panelLogin;
   private javax.swing.JPanel panelNotifications;
   private javax.swing.JLabel passwordAcctLbl;
   private javax.swing.JLabel passwordAcctLbl1;
   private javax.swing.JLabel passwordLbl;
   private javax.swing.JTextField passwordTxtFld;
   private javax.swing.JLabel priceBrowseLbl1;
   private javax.swing.JLabel priceBrowseLbl2;
   private javax.swing.JLabel priceBrowseLbl3;
   private javax.swing.JButton returnHomeAcctButton;
   private javax.swing.JButton returnHomeBrowseButton;
   private javax.swing.JScrollBar scrollBarBrowse;
   private javax.swing.JLabel secretLifePetImg;
   private javax.swing.JLabel starTrekImg;
   private javax.swing.JTabbedPane tabMain;
   private javax.swing.JLabel usernameAcctLbl;
   private javax.swing.JLabel usernameAcctLbl1;
   private javax.swing.JLabel usernameLbl;
   private javax.swing.JTextField usernameTxtFld;
   // End of variables declaration//GEN-END:variables
}

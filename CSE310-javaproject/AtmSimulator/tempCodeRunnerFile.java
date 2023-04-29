import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.*;


class CUSTOMER extends JFrame {

    ATM var;

    public CUSTOMER(ATM a) {
        var = a;
        this.user = new ArrayList<Customer_Data>();
        initComponents();
    }
    List<Customer_Data> user;

    boolean onlyContainsNumbers(String text) {
        try {
            Long.parseLong(text);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    // fast cash method 
    public void fastCash() { 
        int ab;
        String[] s10 = {"500", "1000", "2000", "5000", "10000", "15000", "20000", ""};
        s10[7] = (String) JOptionPane.showInputDialog(null, "Select Type...", "Account Type", JOptionPane.QUESTION_MESSAGE, null, s10, s10[0]);

        switch (s10[7]) {
            // if user select 500, we check if the user have enough balance to withdraw 500
            case "500":
                if (var.var1.startingBalance > 500 && var.var1.startingBalance > 0) { 
                    var.var1.startingBalance = var.var1.startingBalance - 500;
                    JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    if (ab == 0) {
                        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + "500" + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You do not have enough Amount\nCurrent Amount : " + var.var1.startingBalance, "Account information", JOptionPane.ERROR_MESSAGE);
                }
                break;
            // if user select 1000, we check if the user have enough balance to withdraw 1000
            case "1000":
                if (var.var1.startingBalance > 1000 && var.var1.startingBalance > 0) {
                    var.var1.startingBalance = var.var1.startingBalance - 1000;
                    JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    if (ab == 0) {
                        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + "1000" + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You do not have enough Amount\nCurrent Amount : " + var.var1.startingBalance, "Account information", JOptionPane.ERROR_MESSAGE);
                }
                break;
            // if user select 2000, we check if the user have enough balance to withdraw 2000, and so on
            case "2000":
                if (var.var1.startingBalance > 2000 && var.var1.startingBalance > 0) {
                    var.var1.startingBalance = var.var1.startingBalance - 2000;
                    JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    if (ab == 0) {
                        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + "2000" + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You do not have enough Amount\nCurrent Amount : " + var.var1.startingBalance, "Account information", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "5000":
                if (var.var1.startingBalance > 5000 && var.var1.startingBalance > 0) {
                    var.var1.startingBalance = var.var1.startingBalance - 5000;
                    JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    if (ab == 0) {
                        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + "5000" + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You do not have enough Amount\nCurrent Amount : " + var.var1.startingBalance, "Account information", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "10000":
                if (var.var1.startingBalance > 10000 && var.var1.startingBalance > 0) {
                    var.var1.startingBalance = var.var1.startingBalance - 10000;
                    JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    
                    if (ab == 0) {
                        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + "10000" + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You do not have enough Amount\nCurrent Amount : " + var.var1.startingBalance, "Account information", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "15000":
                if (var.var1.startingBalance > 15000 && var.var1.startingBalance > 0) {
                    var.var1.startingBalance = var.var1.startingBalance - 15000;
                    JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    
                    if (ab == 0) {
                        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + "15000" + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You do not have enough Amount\nCurrent Amount : " + var.var1.startingBalance, "Account information", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "20000":
                if (var.var1.startingBalance > 20000 && var.var1.startingBalance > 0) {
                    var.var1.startingBalance = var.var1.startingBalance - 20000;
                    JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    
                    if (ab == 0) {
                        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + "20000" + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You do not have enough Amount\nCurrent Amount : " + var.var1.startingBalance, "Account information", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
    }
   
    // this method is responsible for the transfer of money from one account to another
    public void cashTransfer() {
        user = var.user1;
        int account1 = 0;
        int amount = 0, account = 0;
        String s;
        do {
            s = JOptionPane.showInputDialog(null, "Enter amount you want to transfer ");
            if (onlyContainsNumbers(s)) {
                amount = Integer.parseInt(s);
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter digits only..", "Cash Transfer", JOptionPane.ERROR_MESSAGE);
            }
        } while (!onlyContainsNumbers(s));
        
        if (amount < var.var1.startingBalance) { // checks if the amount is less than the balance
            String s1;
            // this loop is responsible for checking if the account number is valid
            do {
                s1 = JOptionPane.showInputDialog(null, "Enter the account number to which you want to transfer: ");
                if (onlyContainsNumbers(s1)) {
                    account = Integer.parseInt(s1);
                } else {
                    JOptionPane.showMessageDialog(null, "Please Enter digits only..", "Cash Transfer", JOptionPane.ERROR_MESSAGE);
                }
            } while (!onlyContainsNumbers(s1));

            if (account != var.var1.accountNum) {
                boolean found = false;
                for (int i = 0; i < user.size(); i++) { 
                    Customer_Data var2 = user.get(i);
                    if (var2.accountNum == account) { // checks if the account number is valid
                        int ab = JOptionPane.showConfirmDialog(null, "You wish to transfer Rs  " + amount + " in account held by" + var2.name, "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (ab == 0) { // checks if the user wants to proceed with the transaction
                            String s2;
                            do {
                                s2 = JOptionPane.showInputDialog(null, "Please re-enter the account number to which you want to transfer: ");
                                if (onlyContainsNumbers(s1)) {
                                    account1 = Integer.parseInt(s2);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Please Enter digits only..", "Cash Transfer", JOptionPane.ERROR_MESSAGE);
                                }
                            } while (!onlyContainsNumbers(s2));
                            if (account == account1) { 
                                var2.startingBalance = var2.startingBalance + amount;
                                var.var1.startingBalance = var.var1.startingBalance - amount;
                                JOptionPane.showMessageDialog(null, "Transaction confirmed.\n", "Cash Transfer", JOptionPane.INFORMATION_MESSAGE);
                                int ab1 = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Cash Transfer", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                                if (ab1 == 0) {
                                    JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nAmount Transferred:  " + amount + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);

                                }
                            }
                        }
                        found = true;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(null, "Not Found", "Cash Transfer", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select other account instead of this account", "Cash Transfer", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "you do not have enough cash for transfer.\nYour current cash is " + var.var1.startingBalance, "Cash Transfer", JOptionPane.ERROR_MESSAGE);
        }
    }

    // this method is responsible for the withdraw of money from the account
    public void cashWithdrawal() {
        int amount = 0;
        String s = JOptionPane.showInputDialog(null, "Enter amount you want to Withdrawal ");
        if (onlyContainsNumbers(s)) { // checks if the amount is valid
            amount = Integer.parseInt(s);
         
        if (amount < 20000 && amount < var.var1.startingBalance) { // checks if the amount is less than the balance 
            var.var1.startingBalance = var.var1.startingBalance - amount;
            JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);
            int ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (ab == 0) {
                JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + amount + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
            }

        } else { 
            JOptionPane.showMessageDialog(null, "You cannot withdrawal amount more then 20000 ", "Account information", JOptionPane.ERROR_MESSAGE);
        }
    }else {
            JOptionPane.showMessageDialog(null, "Please Enter digits only..", "Cash Withdrawal", JOptionPane.ERROR_MESSAGE);
        }
    }

    // this method is responsible for the deposit of money in the account
    public void depositAmount() {
        int amount = 0;
        String s = JOptionPane.showInputDialog(null, "Enter the cash Amount you want to deposit ");

        if (onlyContainsNumbers(s)) { // checks if the amount is valid
            amount = Integer.parseInt(s);
        
        var.var1.startingBalance = var.var1.startingBalance + amount; // adds the amount to the balance
        JOptionPane.showMessageDialog(null, "Cash Deposited Successfully.", "Deposit Cash ", JOptionPane.PLAIN_MESSAGE);
        int ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (ab == 0) { // checks if the user wants to print the receipt
            JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nDeposited: " + amount + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
        }
    }else {
            JOptionPane.showMessageDialog(null, "Please Enter digits only..", "Cash Withdrawal", JOptionPane.ERROR_MESSAGE);
        }
    }

    // this method is responsible for the display of the account information
    public void getCash() {
        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
    }

    // this method is to create the UI of the customer panel
    void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));

        jButton1.setBackground(new java.awt.Color(204, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Deposit Cash");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 51, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Transfer Cash");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 51, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Withdrawal Cash");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 51, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Check Balance");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 51, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton5.setForeground(new java.awt.Color(255, 255, 255)); 
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 51, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Fast Cash");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Portal");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jButton1, GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        getCash();
    }

    void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        depositAmount();
    }

    void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        cashWithdrawal();
    }

    void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        cashTransfer();
    }

    void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        fastCash();
    }

    // initializes the customer panel
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    ButtonGroup buttonGroup1;
    JButton jButton1;
    JButton jButton2;
    JButton jButton3;
    JButton jButton4;
    JButton jButton5;
    JButton jButton6;
    JLabel jLabel1;
    JPanel jPanel1;
}

class Customer_Data {

    public int accountNum, startingBalance = 0, accountNum1;
    public String pincode = "", name = "", type = "", pincode1 = "", name1 = "", login = "", login1 = "",date;
    public Object status;
}

// this class is used to display and perform operation the customer panel
class ADMIN extends JFrame {

    ATM l;

    public ADMIN(ATM data) {
        this.user = new ArrayList<Customer_Data>();
        l = data;
        initComponents();
    }

    List<Customer_Data> user;

    // this method is used to update the existing account
    public void updateAccount() {

        String s00 = "", s0 = "";
        s0 = JOptionPane.showInputDialog("\tSelect Option for update Account\n1- Account Number\n2-Holder Name\n3-Account Type  ", s00);
        switch (s0) {
            case "1":
                updateAccountNo();
                break;
            case "2":
                updateAccountName();
                break;
            case "3":
                updateAccountType();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option ", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    // this method is used to update the account holder name
    public void updateAccountName() {
        String s1 = "", s2 = "";
        s1 = JOptionPane.showInputDialog("Enter Account Name u want to Update ", s2);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type", "Date"};
        Object[][] rows = new Object[1][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.name.equals(s1)) {

                rows[0] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
                int a = JOptionPane.showConfirmDialog(null, "You want to update this account  ", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (a == 0) {
                    rows[0] = new Object[]{var.accountNum, var.name, var.pincode,
                        var.login, var.startingBalance, var.status, var.type, var.date};
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
                    String[] s0 = {"Current", "Savings"};
                    String[] s01 = {"Active", "Deactive"};
                    String s = "";
                    String ab = "";
                    var.login1 = JOptionPane.showInputDialog("Enter User Login", ab);
                    if (var.login1.equals("")) {
                        var.login = var.login;

                    } else {
                        var.login = var.login1;
                    }
                    do {
                        var.name1 = JOptionPane.showInputDialog("Enter Name", s);
                        if (var.name1.equals("")) {
                            var.name = var.name;
                            break;
                        }
                        if (var.name1.matches("[a-zA-Z]+")) {
                            var.name = var.name1;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Enter invalid name ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (!var.name1.matches("[a-zA-Z]+"));
                    String s11 = "";

                    do {
                        var.pincode1 = JOptionPane.showInputDialog("Enter 5 digit PinCode", s11);
                        if (var.pincode1.matches("[0-9]{5}")) {
                            var.pincode = var.pincode1;
                            break;
                        }
                        if (var.pincode1.equals("")) {
                            var.pincode = var.pincode;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Please Enter 5 digit pincode ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                        }

                    } while (!var.pincode1.matches("[0-9]{5}"));
                    var.status = (String) JOptionPane.showInputDialog(null, "Select Status...", "Status", JOptionPane.QUESTION_MESSAGE, null, s01, s01[0]);
                    var.type = (String) JOptionPane.showInputDialog(null, "Select Type...", "Type", JOptionPane.QUESTION_MESSAGE, null, s0, s0[0]);
                    JOptionPane.showMessageDialog(null, "Account Successfully Updated... ", "Account Information", JOptionPane.PLAIN_MESSAGE);
                    String[] columnss = new String[]{"Account Number", "Name", "Pincode",
                        "User Login", "Balance", "Status", "Type", "Date"};
                    Object[][] rowss = new Object[1][columnss.length];
                    rowss[0] = new Object[]{var.accountNum, var.name, var.pincode,
                        var.login, var.startingBalance, var.status, var.type, var.date};
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rowss, columnss)), "Account information", JOptionPane.PLAIN_MESSAGE);
                    found = true;
                } else if (a == 1) {
                    JOptionPane.showMessageDialog(null, "Account Not updated", "Account information", JOptionPane.PLAIN_MESSAGE);
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
                    found = true;
                }
            }

        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Account not found");
        }
    }

    // this method is used to update the account type
    public void updateAccountType() {
        String[] s10 = {"Current", "Savings", ""};
        s10[2] = (String) JOptionPane.showInputDialog(null, "Select Type...", "Account Type", JOptionPane.QUESTION_MESSAGE, null, s10, s10[0]);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type", "Date"};
        Object[][] rows = new Object[1][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.type.equals(s10[2])) {

                rows[0] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
                int a = JOptionPane.showConfirmDialog(null, "You want to update this account  ", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (a == 0) {
                    rows[0] = new Object[]{var.accountNum, var.name, var.pincode,
                        var.login, var.startingBalance, var.status, var.type, var.date};
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
                    String[] s0 = {"Current", "Savings"};
                    String[] s01 = {"Active", "Deactive"};
                    String s = "";
                    String ab = "";
                    var.login1 = JOptionPane.showInputDialog("Enter User Login", ab);
                    if (var.login1.equals("")) {
                        var.login = var.login;

                    } else {
                        var.login = var.login1;
                    }
                    do {
                        var.name1 = JOptionPane.showInputDialog("Enter Name", s);
                        if (var.name1.equals("")) {
                            var.name = var.name;
                            break;
                        }
                        if (var.name1.matches("[a-zA-Z]+")) {
                            var.name = var.name1;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Enter invalid name ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (!var.name1.matches("[a-zA-Z]+"));
                    String s11 = "";

                    do {
                        var.pincode1 = JOptionPane.showInputDialog("Enter 5 digit PinCode", s11);
                        if (var.pincode1.matches("[0-9]{5}")) {
                            var.pincode = var.pincode1;
                            break;
                        }
                        if (var.pincode1.equals("")) {
                            var.pincode = var.pincode;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Please Enter 5 digit pincode ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                        }

                    } while (!var.pincode1.matches("[0-9]{5}"));
                    var.status = (String) JOptionPane.showInputDialog(null, "Select Status...", "Status", JOptionPane.QUESTION_MESSAGE, null, s01, s01[0]);
                    var.type = (String) JOptionPane.showInputDialog(null, "Select Type...", "Type", JOptionPane.QUESTION_MESSAGE, null, s0, s0[0]);
                    JOptionPane.showMessageDialog(null, "Account Successfully Updated... ", "Account Information", JOptionPane.PLAIN_MESSAGE);
                    String[] columnss = new String[]{"Account Number", "Name", "Pincode",
                        "User Login", "Balance", "Status", "Type", "Date"};
                    Object[][] rowss = new Object[1][columnss.length];
                    rowss[0] = new Object[]{var.accountNum, var.name, var.pincode,
                        var.login, var.startingBalance, var.status, var.type, var.date};
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rowss, columnss)), "Account information", JOptionPane.PLAIN_MESSAGE);
                    found = true;
                } else if (a == 1) {
                    JOptionPane.showMessageDialog(null, "Account Not updated", "Account information", JOptionPane.PLAIN_MESSAGE);
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
                    found = true;
                }
            }

        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Account not found");
        }
    }

    // this method is used to update the account status
    public void updateAccountNo() {
        String s1 = "", s2 = "";
        s1 = JOptionPane.showInputDialog("Enter Account Number u want to Update ", s2);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type", "Date"};
        Object[][] rows = new Object[1][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.accountNum == Integer.parseInt(s1)) {
                rows[0] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
                String[] s0 = {"Current", "Savings"};
                String[] s01 = {"Active", "Deactive"};
                String s = "";
                String ab = "";
                var.login1 = JOptionPane.showInputDialog("Enter User Login", ab);
                if (var.login1.equals("")) {
                    var.login = var.login;

                } else {
                    var.login = var.login1;
                }
                do {
                    var.name1 = JOptionPane.showInputDialog("Enter Name", s);
                    if (var.name1.equals("")) {
                        var.name = var.name;
                        break;
                    }
                    if (var.name1.matches("[a-zA-Z]+")) {
                        var.name = var.name1;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Enter invalid name ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                    }
                } while (!var.name1.matches("[a-zA-Z]+"));
                String s11 = "";

                do {
                    var.pincode1 = JOptionPane.showInputDialog("Enter 5 digit PinCode", s11);
                    if (var.pincode1.matches("[0-9]{5}")) {
                        var.pincode = var.pincode1;
                        break;
                    }
                    if (var.pincode1.equals("")) {
                        var.pincode = var.pincode;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Enter 5 digit pincode ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                    }

                } while (!var.pincode1.matches("[0-9]{5}"));
                var.status = (String) JOptionPane.showInputDialog(null, "Select Status...", "Status", JOptionPane.QUESTION_MESSAGE, null, s01, s01[0]);
                var.type = (String) JOptionPane.showInputDialog(null, "Select Type...", "Type", JOptionPane.QUESTION_MESSAGE, null, s0, s0[0]);
                JOptionPane.showMessageDialog(null, "Account Successfully Updated... ", "Account Information", JOptionPane.PLAIN_MESSAGE);
                String[] columnss = new String[]{"Account Number", "Name", "Pincode",
                    "User Login", "Balance", "Status", "Type", "Date"};
                Object[][] rowss = new Object[1][columnss.length];
                rowss[0] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rowss, columnss)), "Account information", JOptionPane.PLAIN_MESSAGE);
                found = true;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Account not found");
        }
    }

    // this method is used to delete the account
    public void deleteAccount() {
        String s1 = "", s2 = "";
        s1 = JOptionPane.showInputDialog("Enter Account Number u want to Delete ", s2);
        boolean found = false;
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.accountNum == Integer.parseInt(s1)) {
                int ab = JOptionPane.showConfirmDialog(null, "You wish to delete the account held by Mr " + var.name, "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (ab == 0) {
                    String a1 = "", a2 = "";
                    a1 = JOptionPane.showInputDialog("Please re-enter account number ", a2);
                    if (a1.equals(s1)) {
                        user.remove(i);
                        JOptionPane.showMessageDialog(null, "Account Deleted Successfully..", "Delete Account", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Account Number", "Error ", JOptionPane.ERROR_MESSAGE);

                    }
                } else if (ab == 1) {
                    JOptionPane.showMessageDialog(null, "Account not deleted ", "Account Information ", JOptionPane.INFORMATION_MESSAGE);

                }

                found = true;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Found");
        }
    }

    // this method is used to display the account information
    public void search1() {
        String s1 = "", s2 = "";
        s1 = JOptionPane.showInputDialog("Enter Account Holder name u want to find ", s2);
        boolean found = false;
        StringBuilder builder1 = new StringBuilder();
        builder1.append("Account No");
        builder1.append("\t");
        builder1.append("Name");
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.name.equals(s1)) {
                JOptionPane.showMessageDialog(null, builder1, "sad", JOptionPane.PLAIN_MESSAGE);
                found = true;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Found");
        }
    }

    // this method is used to display the account type and info
    public void searchAccountType() {
        String[] s10 = {"Current", "Savings", ""};
        s10[2] = (String) JOptionPane.showInputDialog(null, "Select Type...", "Account Type", JOptionPane.QUESTION_MESSAGE, null, s10, s10[0]);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type", "Date"};
        Object[][] rows = new Object[user.size()][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.type.equals(s10[2])) {
                rows[i] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                found = true;
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Found");
        }
    }

    // this method is used to display the amount of any account from admin panel
    public void searchAccountBalance() {
        String s111 = "",
                s112 = "";
        s111 = JOptionPane.showInputDialog("Enter Account Balance u want to find ", s112);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type", "Date"};
        Object[][] rows = new Object[user.size()][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.startingBalance == Integer.parseInt(s111)) {
                rows[i] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                found = true;
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)),
             "Account information", JOptionPane.PLAIN_MESSAGE);
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Found");
        }
    }

    // this method is used to display the account status from admin panel
    public void searchAccountName() {
        String s11 = "",
                s12 = "";

        s11 = JOptionPane.showInputDialog("Enter Account Holder`s name u want to find ", s12);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type", "Date"};
        Object[][] rows = new Object[user.size()][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.name.equals(s11)) {
                rows[i] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                found = true;

            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)),
             "Account information", JOptionPane.PLAIN_MESSAGE);
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Found");
        }
    }

    // this method is used to display the account number from admin panel
    public void searchAccountNo() {
        String s1 = "", s2 = "";
        s1 = JOptionPane.showInputDialog("Enter Account Number u want to find ", s2);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type", "Date"};
        Object[][] rows = new Object[1][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.accountNum == Integer.parseInt(s1)) {
                rows[0] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                found = true;
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)),
             "Account information", JOptionPane.PLAIN_MESSAGE);
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Found");
        }
    }

    boolean onlyContainsNumbers(String text) {
            Long.parseLong(text);
            return true;
    }


    public void reportAmount() { 
        String s111 = "", s112 = "", s1 = "", s2 = "";
        s111 = JOptionPane.showInputDialog("Enter Minimum Amount ", s112);
        s1 = JOptionPane.showInputDialog("Enter Maximum Amount ", s2);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type"};
        Object[][] rows = new Object[user.size()][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.startingBalance >= Integer.parseInt(s111) && var.startingBalance <= Integer.parseInt(s1)) {
                rows[i] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type};
                found = true;
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)),
             "Account information", JOptionPane.PLAIN_MESSAGE);
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Found");
        }
    }

    public void search() {
        String s00 = "", s0 = "";
        s0 = JOptionPane.showInputDialog("\tSelect for search Account\n1- Search through Account Number\n2-Search through Holder Name\n3- Search through Account Balance\n4-Search through Account Type  ", s00);
        switch (s0) {
            case "1":
                searchAccountNo();
                break;
            case "2":
                searchAccountName();
                break;
            case "3":
                searchAccountBalance();
                break;
            case "4":
                searchAccountType();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option ", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    // this method is used to create a new account in the bank
    public void createAccount() {
        Customer_Data a = new Customer_Data();
        if (a.accountNum == a.accountNum) { // this condition is used to check the account number is unique or not
            a.accountNum = user.size() + 1;
        }
        do { // this loop is used to check the name is valid or not
            String s = "";
            a.name = JOptionPane.showInputDialog("Enter Name", s);
            if (!a.name.matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(null, "Enter invalid name ", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
            if (a.name.matches("[a-zA-Z]+")) {
                a.name1 = a.name;
            }
        } while (!a.name.matches("[a-zA-Z]+"));
        do { // this loop is used to check the login detail is valid or not
            String ab = "";
            a.login = JOptionPane.showInputDialog("Enter User Login", ab);
            if (a.login.equals("")) {
                JOptionPane.showMessageDialog(null, "User Login can not be empty", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }         
            else {
                a.login = a.login;
            }
        } while (a.login.equals(""));
        String s1 = "";

        do { // this loop is used to check the pincode is valid or not
            a.pincode = JOptionPane.showInputDialog("Enter 5 digit PinCode", s1);
            if (a.pincode.matches("[0-9]{5}")) {
                a.pincode1 = a.pincode;
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter 5 digit pincode ", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
        } while (!a.pincode.matches("[0-9]{5}"));
        String s2 = "";
        do { // this loop is used to check the starting balance is valid or not

            s2 = JOptionPane.showInputDialog("Enter Starting Balance ");
            if (onlyContainsNumbers(s2)) {
                a.startingBalance = Integer.parseInt(s2);
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter digits only  ", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
        } while (!onlyContainsNumbers(s2)); 
        String[] s0 = {"Current", "Savings"};
        String[] s01 = {"Active", "Disable"};
        a.status = (String) JOptionPane.showInputDialog(null, "Select Status...", "Account Status", JOptionPane.QUESTION_MESSAGE, null, s01, s01[0]);
        a.type = (String) JOptionPane.showInputDialog(null, "Select Type...", "Account Type", JOptionPane.QUESTION_MESSAGE, null, s0, s0[0]);
        a.date = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
        user.add(a);
        l.user1 = this.user;
        JOptionPane.showMessageDialog(null, "Account Created successfully....");
    }
    
    // this method is used to view reports of the accounts from the admin panel
    public void viewReports() {
          String s00 = "", s0 = "";
        s0 = JOptionPane.showInputDialog("\tView Reports \n1-By Holder Name\n2-By Amount\n3-By Account Type  ", s00);
        switch (s0) {
            case "1":
                searchAccountName();
                break;
            case "2":
               reportAmount(); 
                break;
            case "3":
                searchAccountType();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option ", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
        
    }
    
    // this initializes the admin panel
    void initComponents() {

        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0X8946A6));

        jButton1.setBackground(new java.awt.Color(0X9A1663));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0X9A1663));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0X9A1663));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete Account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0X9A1663));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Search Account");
        jButton4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton4StateChanged(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0X9A1663));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("View Report");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0X9A1663));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Exit");
        jButton6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton6StateChanged(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        createAccount();
    }

    void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        deleteAccount();
    }

    void jButton4StateChanged(javax.swing.event.ChangeEvent evt) {
    }

    void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        search();
    }

    void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        updateAccount();
    }

    void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        viewReports();
    }

    void jButton6StateChanged(javax.swing.event.ChangeEvent evt) {
    }
    void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
         new ATM().setVisible(true);
    }

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
      
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            } 
    }

    JButton jButton1;
    JButton jButton2;
    JButton jButton3;
    JButton jButton4;
    JButton jButton5;
    JButton jButton6;
    JPanel jPanel1;

}

// this is the main class from where the program starts
class ATM extends JFrame {
    
    public ATM() {
        this.user1 = new ArrayList<Customer_Data>();
        initComponents();
    }
    Customer_Data var1=new Customer_Data();
    List<Customer_Data> user1;

    // this method is used to login a user
     public void login()
    {
        String s11 = "",s01="",
                s12 = "",s02="";
        
        s11 = JOptionPane.showInputDialog("Enter User Login ", s12);
        s01 = JOptionPane.showInputDialog("Enter Pincode  ", s02);
        boolean found = false;

        for (int i = 0; i < user1.size(); i++) {
            Customer_Data var = user1.get(i);
            if (var.login.equals(s11) && var.pincode.equals(s01)) {
                new CUSTOMER(this).setVisible(true);
                var1=var;
                found = true;
            }
        } 
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Found");
        }
    }
   
    // creates the UI if the main class
    void initComponents() {

        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        
        
    

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM");
        setName("ATM"); 
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(0XAF0171)); 

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("        WELCOME TO ATM");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CUSTOMER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ADMIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        /* 
        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
         */
        

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1,GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        new ADMIN(this).setVisible(true);
    }

    void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        login();
    }
   
   
    // RUN THE APPLICATION FROM HERE
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
       
        java.awt.EventQueue.invokeLater(() -> {
            new ATM().setVisible(true);
        });
    }

    JButton jButton1;
    JButton jButton2;
    JLabel jLabel2;
    JPanel jPanel1;
}

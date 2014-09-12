package Interfaces;
import Data.*;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Playa extends javax.swing.JFrame {

    public Playa() {
        initComponents();
        Reloj clock = new Reloj(0, 0, 550, 250);        
        pnlReloj.add(clock);
        clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clock.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        clock.setFont(new java.awt.Font("Arial", 1, 80));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        btnD1 = new javax.swing.JButton();
        btnD2 = new javax.swing.JButton();
        btnD3 = new javax.swing.JButton();
        btnD4 = new javax.swing.JButton();
        btnD5 = new javax.swing.JButton();
        btnE1 = new javax.swing.JButton();
        btnE2 = new javax.swing.JButton();
        btnE3 = new javax.swing.JButton();
        btnE4 = new javax.swing.JButton();
        btnE5 = new javax.swing.JButton();
        btnF1 = new javax.swing.JButton();
        btnF2 = new javax.swing.JButton();
        btnF3 = new javax.swing.JButton();
        btnF4 = new javax.swing.JButton();
        btnF5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngSal = new javax.swing.JButton();
        pnlReloj = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel1.setLayout(new java.awt.GridLayout(6, 6, 6, 6));

        btnA1.setBackground(java.awt.Color.green);
        btnA1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnA1.setText("A1");
        btnA1.setMaximumSize(new java.awt.Dimension(75, 75));
        btnA1.setMinimumSize(new java.awt.Dimension(75, 75));
        btnA1.setPreferredSize(new java.awt.Dimension(75, 75));
        btnA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnA1);

        btnA2.setBackground(java.awt.Color.green);
        btnA2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnA2.setText("A2");
        btnA2.setMaximumSize(new java.awt.Dimension(75, 75));
        btnA2.setMinimumSize(new java.awt.Dimension(75, 75));
        btnA2.setPreferredSize(new java.awt.Dimension(75, 75));
        btnA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnA2);

        btnA3.setBackground(java.awt.Color.green);
        btnA3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnA3.setText("A3");
        btnA3.setMaximumSize(new java.awt.Dimension(75, 75));
        btnA3.setMinimumSize(new java.awt.Dimension(75, 75));
        btnA3.setPreferredSize(new java.awt.Dimension(75, 75));
        btnA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnA3);

        btnA4.setBackground(java.awt.Color.green);
        btnA4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnA4.setText("A4");
        btnA4.setMaximumSize(new java.awt.Dimension(75, 75));
        btnA4.setMinimumSize(new java.awt.Dimension(75, 75));
        btnA4.setPreferredSize(new java.awt.Dimension(75, 75));
        btnA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnA4);

        btnA5.setBackground(java.awt.Color.green);
        btnA5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnA5.setText("A5");
        btnA5.setMaximumSize(new java.awt.Dimension(75, 75));
        btnA5.setMinimumSize(new java.awt.Dimension(75, 75));
        btnA5.setPreferredSize(new java.awt.Dimension(75, 75));
        btnA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnA5);

        btnB1.setBackground(java.awt.Color.green);
        btnB1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnB1.setText("B1");
        btnB1.setMaximumSize(new java.awt.Dimension(75, 75));
        btnB1.setMinimumSize(new java.awt.Dimension(75, 75));
        btnB1.setPreferredSize(new java.awt.Dimension(75, 75));
        btnB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnB1);

        btnB2.setBackground(java.awt.Color.green);
        btnB2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnB2.setText("B2");
        btnB2.setMaximumSize(new java.awt.Dimension(75, 75));
        btnB2.setMinimumSize(new java.awt.Dimension(75, 75));
        btnB2.setPreferredSize(new java.awt.Dimension(75, 75));
        btnB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnB2);

        btnB3.setBackground(java.awt.Color.green);
        btnB3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnB3.setText("B3");
        btnB3.setMaximumSize(new java.awt.Dimension(75, 75));
        btnB3.setMinimumSize(new java.awt.Dimension(75, 75));
        btnB3.setPreferredSize(new java.awt.Dimension(75, 75));
        btnB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnB3);

        btnB4.setBackground(java.awt.Color.green);
        btnB4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnB4.setText("B4");
        btnB4.setMaximumSize(new java.awt.Dimension(75, 75));
        btnB4.setMinimumSize(new java.awt.Dimension(75, 75));
        btnB4.setPreferredSize(new java.awt.Dimension(75, 75));
        btnB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnB4);

        btnB5.setBackground(java.awt.Color.green);
        btnB5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnB5.setText("B5");
        btnB5.setMaximumSize(new java.awt.Dimension(75, 75));
        btnB5.setMinimumSize(new java.awt.Dimension(75, 75));
        btnB5.setPreferredSize(new java.awt.Dimension(75, 75));
        btnB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnB5);

        btnC1.setBackground(java.awt.Color.green);
        btnC1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnC1.setText("C1");
        btnC1.setMaximumSize(new java.awt.Dimension(75, 75));
        btnC1.setMinimumSize(new java.awt.Dimension(75, 75));
        btnC1.setPreferredSize(new java.awt.Dimension(75, 75));
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC1);

        btnC2.setBackground(java.awt.Color.green);
        btnC2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnC2.setText("C2");
        btnC2.setMaximumSize(new java.awt.Dimension(75, 75));
        btnC2.setMinimumSize(new java.awt.Dimension(75, 75));
        btnC2.setPreferredSize(new java.awt.Dimension(75, 75));
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC2);

        btnC3.setBackground(java.awt.Color.green);
        btnC3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnC3.setText("C3");
        btnC3.setMaximumSize(new java.awt.Dimension(75, 75));
        btnC3.setMinimumSize(new java.awt.Dimension(75, 75));
        btnC3.setPreferredSize(new java.awt.Dimension(75, 75));
        btnC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC3);

        btnC4.setBackground(java.awt.Color.green);
        btnC4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnC4.setText("C4");
        btnC4.setMaximumSize(new java.awt.Dimension(75, 75));
        btnC4.setMinimumSize(new java.awt.Dimension(75, 75));
        btnC4.setPreferredSize(new java.awt.Dimension(75, 75));
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC4);

        btnC5.setBackground(java.awt.Color.green);
        btnC5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnC5.setText("C5");
        btnC5.setMaximumSize(new java.awt.Dimension(75, 75));
        btnC5.setMinimumSize(new java.awt.Dimension(75, 75));
        btnC5.setPreferredSize(new java.awt.Dimension(75, 75));
        btnC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC5);

        btnD1.setBackground(java.awt.Color.green);
        btnD1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnD1.setText("D1");
        btnD1.setMaximumSize(new java.awt.Dimension(75, 75));
        btnD1.setMinimumSize(new java.awt.Dimension(75, 75));
        btnD1.setPreferredSize(new java.awt.Dimension(75, 75));
        btnD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnD1);

        btnD2.setBackground(java.awt.Color.green);
        btnD2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnD2.setText("D2");
        btnD2.setMaximumSize(new java.awt.Dimension(75, 75));
        btnD2.setMinimumSize(new java.awt.Dimension(75, 75));
        btnD2.setPreferredSize(new java.awt.Dimension(75, 75));
        btnD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnD2);

        btnD3.setBackground(java.awt.Color.green);
        btnD3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnD3.setText("D3");
        btnD3.setMaximumSize(new java.awt.Dimension(75, 75));
        btnD3.setMinimumSize(new java.awt.Dimension(75, 75));
        btnD3.setPreferredSize(new java.awt.Dimension(75, 75));
        btnD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnD3);

        btnD4.setBackground(java.awt.Color.green);
        btnD4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnD4.setText("D4");
        btnD4.setMaximumSize(new java.awt.Dimension(75, 75));
        btnD4.setMinimumSize(new java.awt.Dimension(75, 75));
        btnD4.setPreferredSize(new java.awt.Dimension(75, 75));
        btnD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnD4);

        btnD5.setBackground(java.awt.Color.green);
        btnD5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnD5.setText("D5");
        btnD5.setMaximumSize(new java.awt.Dimension(75, 75));
        btnD5.setMinimumSize(new java.awt.Dimension(75, 75));
        btnD5.setPreferredSize(new java.awt.Dimension(75, 75));
        btnD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnD5);

        btnE1.setBackground(java.awt.Color.green);
        btnE1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnE1.setText("E1");
        btnE1.setMaximumSize(new java.awt.Dimension(75, 75));
        btnE1.setMinimumSize(new java.awt.Dimension(75, 75));
        btnE1.setPreferredSize(new java.awt.Dimension(75, 75));
        btnE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnE1);

        btnE2.setBackground(java.awt.Color.green);
        btnE2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnE2.setText("E2");
        btnE2.setMaximumSize(new java.awt.Dimension(75, 75));
        btnE2.setMinimumSize(new java.awt.Dimension(75, 75));
        btnE2.setPreferredSize(new java.awt.Dimension(75, 75));
        btnE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnE2);

        btnE3.setBackground(java.awt.Color.green);
        btnE3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnE3.setText("E3");
        btnE3.setMaximumSize(new java.awt.Dimension(75, 75));
        btnE3.setMinimumSize(new java.awt.Dimension(75, 75));
        btnE3.setPreferredSize(new java.awt.Dimension(75, 75));
        btnE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnE3);

        btnE4.setBackground(java.awt.Color.green);
        btnE4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnE4.setText("E4");
        btnE4.setMaximumSize(new java.awt.Dimension(75, 75));
        btnE4.setMinimumSize(new java.awt.Dimension(75, 75));
        btnE4.setPreferredSize(new java.awt.Dimension(75, 75));
        btnE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnE4);

        btnE5.setBackground(java.awt.Color.green);
        btnE5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnE5.setText("E5");
        btnE5.setMaximumSize(new java.awt.Dimension(75, 75));
        btnE5.setMinimumSize(new java.awt.Dimension(75, 75));
        btnE5.setPreferredSize(new java.awt.Dimension(75, 75));
        btnE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnE5);

        btnF1.setBackground(java.awt.Color.green);
        btnF1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnF1.setText("F1");
        btnF1.setMaximumSize(new java.awt.Dimension(75, 75));
        btnF1.setMinimumSize(new java.awt.Dimension(75, 75));
        btnF1.setPreferredSize(new java.awt.Dimension(75, 75));
        btnF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnF1);

        btnF2.setBackground(java.awt.Color.green);
        btnF2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnF2.setText("F2");
        btnF2.setMaximumSize(new java.awt.Dimension(75, 75));
        btnF2.setMinimumSize(new java.awt.Dimension(75, 75));
        btnF2.setPreferredSize(new java.awt.Dimension(75, 75));
        btnF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnF2);

        btnF3.setBackground(java.awt.Color.green);
        btnF3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnF3.setText("F3");
        btnF3.setMaximumSize(new java.awt.Dimension(75, 75));
        btnF3.setMinimumSize(new java.awt.Dimension(75, 75));
        btnF3.setPreferredSize(new java.awt.Dimension(75, 75));
        btnF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnF3);

        btnF4.setBackground(java.awt.Color.green);
        btnF4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnF4.setText("F4");
        btnF4.setMaximumSize(new java.awt.Dimension(75, 75));
        btnF4.setMinimumSize(new java.awt.Dimension(75, 75));
        btnF4.setPreferredSize(new java.awt.Dimension(75, 75));
        btnF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnF4);

        btnF5.setBackground(java.awt.Color.green);
        btnF5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnF5.setText("F5");
        btnF5.setMaximumSize(new java.awt.Dimension(75, 75));
        btnF5.setMinimumSize(new java.awt.Dimension(75, 75));
        btnF5.setPreferredSize(new java.awt.Dimension(75, 75));
        btnF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnF5);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLAYA X");

        btnIngSal.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnIngSal.setText("Ingreso/Salida");
        btnIngSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngSalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRelojLayout = new javax.swing.GroupLayout(pnlReloj);
        pnlReloj.setLayout(pnlRelojLayout);
        pnlRelojLayout.setHorizontalGroup(
            pnlRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );
        pnlRelojLayout.setVerticalGroup(
            pnlRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnIngSal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlReloj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlReloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIngSal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngSalActionPerformed
        IngSal is = new IngSal();
        is.setVisible(true);     
    }//GEN-LAST:event_btnIngSalActionPerformed
    Ocuped oc = new Ocuped();
    private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA1ActionPerformed
    if(IngSal.cls0[0] != null){
        oc.lblDNI.setText("" + IngSal.cls0[0].getDNI());
        oc.lblPat.setText("" + IngSal.cls0[0].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls0[0].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls0[0].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnA1ActionPerformed
    private void btnA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA2ActionPerformed
        if(IngSal.cls0[1] != null){
        oc.lblDNI.setText("" + IngSal.cls0[1].getDNI());
        oc.lblPat.setText("" + IngSal.cls0[1].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls0[1].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls0[1].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnA2ActionPerformed
    private void btnA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA3ActionPerformed
        if(IngSal.cls0[2] != null){
        oc.lblDNI.setText("" + IngSal.cls0[2].getDNI());
        oc.lblPat.setText("" + IngSal.cls0[2].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls0[2].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls0[3].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnA3ActionPerformed
    private void btnA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA4ActionPerformed
        if(IngSal.cls0[3] != null){
        oc.lblDNI.setText("" + IngSal.cls0[3].getDNI());
        oc.lblPat.setText("" + IngSal.cls0[3].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls0[3].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls0[3].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnA4ActionPerformed
    private void btnA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA5ActionPerformed
        if(IngSal.cls0[4] != null){
        oc.lblDNI.setText("" + IngSal.cls0[4].getDNI());
        oc.lblPat.setText("" + IngSal.cls0[4].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls0[4].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls0[4].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnA5ActionPerformed
    private void btnB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB1ActionPerformed
        if(IngSal.cls5[0] != null){
        oc.lblDNI.setText("" + IngSal.cls5[0].getDNI());
        oc.lblPat.setText("" + IngSal.cls5[0].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls5[0].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls5[0].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnB1ActionPerformed
    private void btnB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB2ActionPerformed
        if(IngSal.cls5[1] != null){
        oc.lblDNI.setText("" + IngSal.cls5[1].getDNI());
        oc.lblPat.setText("" + IngSal.cls5[1].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls5[1].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls5[1].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnB2ActionPerformed
    private void btnB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB3ActionPerformed
        if(IngSal.cls5[2] != null){
        oc.lblDNI.setText("" + IngSal.cls5[2].getDNI());
        oc.lblPat.setText("" + IngSal.cls5[2].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls5[2].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls5[2].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnB3ActionPerformed
    private void btnB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB4ActionPerformed
        if(IngSal.cls5[3] != null){
        oc.lblDNI.setText("" + IngSal.cls5[3].getDNI());
        oc.lblPat.setText("" + IngSal.cls5[3].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls5[3].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls5[3].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnB4ActionPerformed
    private void btnB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB5ActionPerformed
        if(IngSal.cls5[4] != null){
        oc.lblDNI.setText("" + IngSal.cls5[4].getDNI());
        oc.lblPat.setText("" + IngSal.cls5[4].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls5[4].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls5[4].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnB5ActionPerformed
    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        if(IngSal.cls10[0] != null){
        oc.lblDNI.setText("" + IngSal.cls10[0].getDNI());
        oc.lblPat.setText("" + IngSal.cls10[0].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls10[0].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls10[0].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnC1ActionPerformed
    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        if(IngSal.cls10[1] != null){
        oc.lblDNI.setText("" + IngSal.cls10[1].getDNI());
        oc.lblPat.setText("" + IngSal.cls10[1].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls10[1].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls10[1].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnC2ActionPerformed
    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        if(IngSal.cls10[2] != null){
        oc.lblDNI.setText("" + IngSal.cls10[2].getDNI());
        oc.lblPat.setText("" + IngSal.cls10[2].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls10[2].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls10[2].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnC3ActionPerformed
    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        if(IngSal.cls10[3] != null){
        oc.lblDNI.setText("" + IngSal.cls10[3].getDNI());
        oc.lblPat.setText("" + IngSal.cls10[3].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls10[3].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls10[3].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnC4ActionPerformed
    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC5ActionPerformed
        if(IngSal.cls10[4] != null){
        oc.lblDNI.setText("" + IngSal.cls10[4].getDNI());
        oc.lblPat.setText("" + IngSal.cls10[4].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls10[4].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls10[4].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnC5ActionPerformed
    private void btnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD1ActionPerformed
        if(IngSal.cls10[5] != null){
        oc.lblDNI.setText("" + IngSal.cls10[5].getDNI());
        oc.lblPat.setText("" + IngSal.cls10[5].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls10[5].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls10[5].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnD1ActionPerformed
    private void btnD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD2ActionPerformed
        if(IngSal.cls10[6] != null){
        oc.lblDNI.setText("" + IngSal.cls10[6].getDNI());
        oc.lblPat.setText("" + IngSal.cls10[6].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls10[6].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls10[6].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnD2ActionPerformed
    private void btnD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD3ActionPerformed
        if(IngSal.cls10[7] != null){
        oc.lblDNI.setText("" + IngSal.cls10[7].getDNI());
        oc.lblPat.setText("" + IngSal.cls10[7].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls10[7].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls10[7].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnD3ActionPerformed
    private void btnD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD4ActionPerformed
        if(IngSal.cls10[8] != null){
        oc.lblDNI.setText("" + IngSal.cls10[8].getDNI());
        oc.lblPat.setText("" + IngSal.cls10[8].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls10[8].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls10[8].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnD4ActionPerformed
    private void btnD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD5ActionPerformed
        if(IngSal.cls10[9] != null){
        oc.lblDNI.setText("" + IngSal.cls10[9].getDNI());
        oc.lblPat.setText("" + IngSal.cls10[9].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls10[9].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls10[9].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnD5ActionPerformed
    private void btnE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE1ActionPerformed
        if(IngSal.cls5[5] != null){
        oc.lblDNI.setText("" + IngSal.cls5[5].getDNI());
        oc.lblPat.setText("" + IngSal.cls5[5].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls5[5].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls5[5].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnE1ActionPerformed
    private void btnE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE2ActionPerformed
        if(IngSal.cls5[6] != null){
        oc.lblDNI.setText("" + IngSal.cls5[6].getDNI());
        oc.lblPat.setText("" + IngSal.cls5[6].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls5[6].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls5[6].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnE2ActionPerformed
    private void btnE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE3ActionPerformed
        if(IngSal.cls5[7] != null){
        oc.lblDNI.setText("" + IngSal.cls5[7].getDNI());
        oc.lblPat.setText("" + IngSal.cls5[7].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls5[7].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls5[7].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnE3ActionPerformed
    private void btnE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE4ActionPerformed
        if(IngSal.cls5[8] != null){
        oc.lblDNI.setText("" + IngSal.cls5[8].getDNI());
        oc.lblPat.setText("" + IngSal.cls5[8].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls5[8].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls5[8].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnE4ActionPerformed
    private void btnE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE5ActionPerformed
        if(IngSal.cls5[9] != null){
        oc.lblDNI.setText("" + IngSal.cls5[9].getDNI());
        oc.lblPat.setText("" + IngSal.cls5[9].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls5[9].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls5[9].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnE5ActionPerformed
    private void btnF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF1ActionPerformed
        if(IngSal.cls0[5] != null){
        oc.lblDNI.setText("" + IngSal.cls0[5].getDNI());
        oc.lblPat.setText("" + IngSal.cls0[5].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls0[5].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls0[5].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnF1ActionPerformed
    private void btnF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF2ActionPerformed
        if(IngSal.cls0[6] != null){
        oc.lblDNI.setText("" + IngSal.cls0[6].getDNI());
        oc.lblPat.setText("" + IngSal.cls0[6].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls0[6].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls0[6].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnF2ActionPerformed
    private void btnF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF3ActionPerformed
        if(IngSal.cls0[7] != null){
        oc.lblDNI.setText("" + IngSal.cls0[7].getDNI());
        oc.lblPat.setText("" + IngSal.cls0[7].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls0[7].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls0[7].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnF3ActionPerformed
    private void btnF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF4ActionPerformed
        if(IngSal.cls0[8] != null){
        oc.lblDNI.setText("" + IngSal.cls0[8].getDNI());
        oc.lblPat.setText("" + IngSal.cls0[8].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls0[8].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls0[8].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnF4ActionPerformed
    private void btnF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF5ActionPerformed
        if(IngSal.cls0[9] != null){
        oc.lblDNI.setText("" + IngSal.cls0[9].getDNI());
        oc.lblPat.setText("" + IngSal.cls0[9].getPatente());
        oc.lblVehiculo.setText("" + IngSal.cls0[9].getTipoV());
        oc.lblHora.setText(IngSal.lblHora.getText());
        oc.setVisible(true);
        switch (IngSal.cls0[9].getTipo()){    
            case 1:
                String path1 = "carOK.png";  
                URL url1 = this.getClass().getResource(path1);  
                ImageIcon icon1 = new ImageIcon(url1);  
                oc.lblVeh.setIcon(icon1);
                break;
            case 2:
                String path2 = "taxiOK.png";
                URL url2 = this.getClass().getResource(path2);  
                ImageIcon icon2 = new ImageIcon(url2);  
                oc.lblVeh.setIcon(icon2);
                break;
            case 3:
                String path3 = "vanOK.png";  
                URL url3 = this.getClass().getResource(path3);  
                ImageIcon icon3 = new ImageIcon(url3);  
                oc.lblVeh.setIcon(icon3);
                break;
            case 4:
                String path4 = "ambOK.png";  
                URL url4 = this.getClass().getResource(path4);  
                ImageIcon icon4 = new ImageIcon(url4);  
                oc.lblVeh.setIcon(icon4);
                break;
            case 5:
                String path5 = "polOK.png";  
                URL url5 = this.getClass().getResource(path5);  
                ImageIcon icon5 = new ImageIcon(url5);  
                oc.lblVeh.setIcon(icon5);
                break;
            case 6:
                String path6 = "craneOK.png";  
                URL url6 = this.getClass().getResource(path6);  
                ImageIcon icon6 = new ImageIcon(url6);  
                oc.lblVeh.setIcon(icon6);
                break;
            case 7:
                String path7 = "bomOK.png";  
                URL url7 = this.getClass().getResource(path7);  
                ImageIcon icon7 = new ImageIcon(url7);  
                oc.lblVeh.setIcon(icon7);
                break;
            default:
                oc.lblVeh.setIcon(null);
                break;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Lugar libre!");
    }
    }//GEN-LAST:event_btnF5ActionPerformed

    
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Playa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Playa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Playa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Playa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new Playa().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnA1;
    public static javax.swing.JButton btnA2;
    public static javax.swing.JButton btnA3;
    public static javax.swing.JButton btnA4;
    public static javax.swing.JButton btnA5;
    public static javax.swing.JButton btnB1;
    public static javax.swing.JButton btnB2;
    public static javax.swing.JButton btnB3;
    public static javax.swing.JButton btnB4;
    public static javax.swing.JButton btnB5;
    public static javax.swing.JButton btnC1;
    public static javax.swing.JButton btnC2;
    public static javax.swing.JButton btnC3;
    public static javax.swing.JButton btnC4;
    public static javax.swing.JButton btnC5;
    public static javax.swing.JButton btnD1;
    public static javax.swing.JButton btnD2;
    public static javax.swing.JButton btnD3;
    public static javax.swing.JButton btnD4;
    public static javax.swing.JButton btnD5;
    public static javax.swing.JButton btnE1;
    public static javax.swing.JButton btnE2;
    public static javax.swing.JButton btnE3;
    public static javax.swing.JButton btnE4;
    public static javax.swing.JButton btnE5;
    public static javax.swing.JButton btnF1;
    public static javax.swing.JButton btnF2;
    public static javax.swing.JButton btnF3;
    public static javax.swing.JButton btnF4;
    public static javax.swing.JButton btnF5;
    private javax.swing.JButton btnIngSal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pnlReloj;
    // End of variables declaration//GEN-END:variables
}

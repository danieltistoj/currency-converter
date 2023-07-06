/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.currencyconverter.Interface;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import com.currencyconverter.Class.ApiClient;
import com.currencyconverter.Class.Currency;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
/**
 *
 * @author Usuario
 */
public class MainInterface extends javax.swing.JFrame {

    private ArrayList<Currency>list;
    private Point initialClick;

    public MainInterface() {
        /**
         * 
         */
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Conversor de moneda y temperatura");
        setResizable(false);
        labelDolar.setIcon(new  ImageIcon("src/com/currencyconverter/img/icon-dolar2.png"));
        /**
         * se agrega un MouseListener para detectar el clic inicial en la ventana y 
         * un MouseMotionListener para realizar el arrastre de la ventana.
         */
         // Add a MouseListener to handle window dragging
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }
        });

        //Add a MouseMotionListener to move the window
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                // Get current cursor position
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                // Calculate the new position of the window
                int xMoved = thisX + (e.getX() - initialClick.x);
                int yMoved = thisY + (e.getY() - initialClick.y);

                // Move the window to the new position
                setLocation(xMoved, yMoved);
            }
        });
        /**
         * access the api, download the nomenclatures and change and upload the 
         * countries to the combobox
         */
        ApiClient apiClient = new ApiClient();
        System.out.println(" ");
        list = apiClient.callApi("GTQ");
        //sorts the list of countries in alphabetical order
        list.sort((Currency c1, Currency c2)->
                c1.getKey().compareTo(c2.getKey())
        );
        setComboboxElements();
        
      
    }
    /**
     * function that loads the countries to the combobox
     */
    private void setComboboxElements(){
        list.forEach((currency) -> {
            if (currency.getCountry() != null) {
                comboCurrency.addItem(currency.getCountry());
                //System.out.println(currency.getCountry());
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelLeft = new javax.swing.JPanel();
        buttonCurrency = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonTemperature = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelCenter = new javax.swing.JPanel();
        panel_currency = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        comboCurrency = new javax.swing.JComboBox<>();
        buttonGTQCurrency = new javax.swing.JButton();
        buttonCurrencyGTQ = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        labelDolar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panel_temperature = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelTop = new javax.swing.JPanel();
        buttonMinimize = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        buttonClose = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelMain.setLayout(new java.awt.BorderLayout());

        panelLeft.setBackground(new java.awt.Color(26, 47, 75));

        buttonCurrency.setBackground(new java.awt.Color(26, 47, 75));
        buttonCurrency.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCurrency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCurrencyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCurrencyTemperatureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCurrencyTemperatureMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(47, 136, 134));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversor  moneda");

        javax.swing.GroupLayout buttonCurrencyLayout = new javax.swing.GroupLayout(buttonCurrency);
        buttonCurrency.setLayout(buttonCurrencyLayout);
        buttonCurrencyLayout.setHorizontalGroup(
            buttonCurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buttonCurrencyLayout.setVerticalGroup(
            buttonCurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonCurrencyLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        buttonTemperature.setBackground(new java.awt.Color(26, 47, 75));
        buttonTemperature.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTemperature.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCurrencyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCurrencyTemperatureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCurrencyTemperatureMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(47, 136, 134));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Conversor  temperatura");

        javax.swing.GroupLayout buttonTemperatureLayout = new javax.swing.GroupLayout(buttonTemperature);
        buttonTemperature.setLayout(buttonTemperatureLayout);
        buttonTemperatureLayout.setHorizontalGroup(
            buttonTemperatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );
        buttonTemperatureLayout.setVerticalGroup(
            buttonTemperatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonTemperatureLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLeftLayout = new javax.swing.GroupLayout(panelLeft);
        panelLeft.setLayout(panelLeftLayout);
        panelLeftLayout.setHorizontalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLeftLayout.setVerticalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(buttonCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        panelMain.add(panelLeft, java.awt.BorderLayout.LINE_START);

        panelCenter.setLayout(new java.awt.CardLayout());

        panel_currency.setBackground(new java.awt.Color(40, 71, 92));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(132, 198, 155));
        jLabel3.setText("GTQ");

        jTextField1.setBackground(new java.awt.Color(40, 71, 92));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(132, 198, 155));
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(132, 198, 155));

        jTextField2.setBackground(new java.awt.Color(40, 71, 92));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(132, 198, 155));
        jTextField2.setBorder(null);
        jTextField2.setCaretColor(new java.awt.Color(132, 198, 155));

        comboCurrency.setBackground(new java.awt.Color(40, 71, 92));
        comboCurrency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboCurrency.setForeground(new java.awt.Color(132, 198, 155));
        comboCurrency.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(132, 198, 155), 2));

        buttonGTQCurrency.setBackground(new java.awt.Color(40, 71, 92));
        buttonGTQCurrency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonGTQCurrency.setForeground(new java.awt.Color(132, 198, 155));
        buttonGTQCurrency.setText("GTQ -> ?");
        buttonGTQCurrency.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(132, 198, 155), 2));
        buttonGTQCurrency.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGTQCurrency.setFocusPainted(false);
        buttonGTQCurrency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonGTQCurrencyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonGTQCurrencyMouseExited(evt);
            }
        });

        buttonCurrencyGTQ.setBackground(new java.awt.Color(40, 71, 92));
        buttonCurrencyGTQ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCurrencyGTQ.setForeground(new java.awt.Color(132, 198, 155));
        buttonCurrencyGTQ.setText("? -> GTQ");
        buttonCurrencyGTQ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(132, 198, 155), 2));
        buttonCurrencyGTQ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCurrencyGTQ.setFocusPainted(false);
        buttonCurrencyGTQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonGTQCurrencyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonGTQCurrencyMouseExited(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(132, 198, 155));
        jSeparator1.setForeground(new java.awt.Color(132, 198, 155));

        jSeparator2.setBackground(new java.awt.Color(132, 198, 155));
        jSeparator2.setForeground(new java.awt.Color(132, 198, 155));

        labelDolar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDolar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(47, 136, 134));
        jLabel5.setText("Conversor De Monedas");

        javax.swing.GroupLayout panel_currencyLayout = new javax.swing.GroupLayout(panel_currency);
        panel_currency.setLayout(panel_currencyLayout);
        panel_currencyLayout.setHorizontalGroup(
            panel_currencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_currencyLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(panel_currencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_currencyLayout.createSequentialGroup()
                        .addComponent(labelDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(panel_currencyLayout.createSequentialGroup()
                        .addGroup(panel_currencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addGroup(panel_currencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_currencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(buttonGTQCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panel_currencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCurrencyGTQ, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        panel_currencyLayout.setVerticalGroup(
            panel_currencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_currencyLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panel_currencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_currencyLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panel_currencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_currencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_currencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGTQCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCurrencyGTQ, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        panelCenter.add(panel_currency, "card2");

        panel_temperature.setBackground(new java.awt.Color(40, 71, 92));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Panel 2");

        javax.swing.GroupLayout panel_temperatureLayout = new javax.swing.GroupLayout(panel_temperature);
        panel_temperature.setLayout(panel_temperatureLayout);
        panel_temperatureLayout.setHorizontalGroup(
            panel_temperatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_temperatureLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
        panel_temperatureLayout.setVerticalGroup(
            panel_temperatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_temperatureLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        panelCenter.add(panel_temperature, "card3");

        panelMain.add(panelCenter, java.awt.BorderLayout.CENTER);

        panelTop.setBackground(new java.awt.Color(26, 47, 75));

        buttonMinimize.setBackground(new java.awt.Color(26, 47, 75));
        buttonMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMinimizeCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMinimizeCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMinimizeCloseMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(47, 136, 134));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("—");

        javax.swing.GroupLayout buttonMinimizeLayout = new javax.swing.GroupLayout(buttonMinimize);
        buttonMinimize.setLayout(buttonMinimizeLayout);
        buttonMinimizeLayout.setHorizontalGroup(
            buttonMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );
        buttonMinimizeLayout.setVerticalGroup(
            buttonMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        buttonClose.setBackground(new java.awt.Color(26, 47, 75));
        buttonClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMinimizeCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMinimizeCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMinimizeCloseMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(47, 136, 134));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");

        javax.swing.GroupLayout buttonCloseLayout = new javax.swing.GroupLayout(buttonClose);
        buttonClose.setLayout(buttonCloseLayout);
        buttonCloseLayout.setHorizontalGroup(
            buttonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );
        buttonCloseLayout.setVerticalGroup(
            buttonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelTopLayout = new javax.swing.GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopLayout.createSequentialGroup()
                .addContainerGap(778, Short.MAX_VALUE)
                .addComponent(buttonMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        panelTopLayout.setVerticalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMain.add(panelTop, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCurrencyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCurrencyMouseClicked
       if(evt.getSource() == buttonCurrency){
           panel_currency.setVisible(true);
           panel_temperature.setVisible(false);
       } 
       if(evt.getSource() == buttonTemperature){
           panel_currency.setVisible(false);
           panel_temperature.setVisible(true);
       }
    }//GEN-LAST:event_buttonCurrencyMouseClicked

    private void buttonCurrencyTemperatureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCurrencyTemperatureMouseEntered
        if (evt.getSource() == buttonCurrency) {
            buttonCurrency.setBackground(new Color(40, 71, 92));
        }
        if (evt.getSource() == buttonTemperature) {
            buttonTemperature.setBackground(new Color(40, 71, 92));
        }

    }//GEN-LAST:event_buttonCurrencyTemperatureMouseEntered

    private void buttonCurrencyTemperatureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCurrencyTemperatureMouseExited
        if (evt.getSource() == buttonCurrency) {
            buttonCurrency.setBackground(new Color(26, 47, 75));
        }
        if (evt.getSource() == buttonTemperature) {
            buttonTemperature.setBackground(new Color(26, 47, 75));
        }
    }//GEN-LAST:event_buttonCurrencyTemperatureMouseExited

    private void buttonGTQCurrencyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGTQCurrencyMouseEntered
        if (evt.getSource() == buttonGTQCurrency) {
            buttonGTQCurrency.setBackground(new Color(26,47,75));
        }
        if (evt.getSource() == buttonCurrencyGTQ) {
            buttonCurrencyGTQ.setBackground(new Color(26, 47, 75));
        }
    }//GEN-LAST:event_buttonGTQCurrencyMouseEntered

    private void buttonGTQCurrencyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGTQCurrencyMouseExited
        if (evt.getSource() == buttonGTQCurrency) {
            buttonGTQCurrency.setBackground(new Color(40,71,92));
        }
        if (evt.getSource() == buttonCurrencyGTQ) {
            buttonCurrencyGTQ.setBackground(new Color(40,71,92));
        }
    }//GEN-LAST:event_buttonGTQCurrencyMouseExited

    private void buttonMinimizeCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinimizeCloseMouseEntered
        if (evt.getSource() == buttonClose) {
            buttonClose.setBackground(new Color(40, 71, 92));
        }
        if (evt.getSource() == buttonMinimize) {
            buttonMinimize.setBackground(new Color(40, 71, 92));
        }

    }//GEN-LAST:event_buttonMinimizeCloseMouseEntered

    private void buttonMinimizeCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinimizeCloseMouseExited
        if (evt.getSource() == buttonClose) {
            buttonClose.setBackground(new Color(26, 47, 75));
        }
        if (evt.getSource() == buttonMinimize) {
            buttonMinimize.setBackground(new Color(26, 47, 75));
        }
    }//GEN-LAST:event_buttonMinimizeCloseMouseExited

    private void buttonMinimizeCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinimizeCloseMouseClicked
         if (evt.getSource() == buttonClose) {
            System.exit(0);
        }
        if (evt.getSource() == buttonMinimize) {
           this.setExtendedState(ICONIFIED);
        }
    }//GEN-LAST:event_buttonMinimizeCloseMouseClicked

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonClose;
    private javax.swing.JPanel buttonCurrency;
    private javax.swing.JButton buttonCurrencyGTQ;
    private javax.swing.JButton buttonGTQCurrency;
    private javax.swing.JPanel buttonMinimize;
    private javax.swing.JPanel buttonTemperature;
    private javax.swing.JComboBox<String> comboCurrency;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelDolar;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelTop;
    private javax.swing.JPanel panel_currency;
    private javax.swing.JPanel panel_temperature;
    // End of variables declaration//GEN-END:variables
}

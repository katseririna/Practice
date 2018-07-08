import java.awt.*;

public class NewJFrame extends javax.swing.JFrame { //JFrame-описывает окошко в винде
    static Maze maze;


    public NewJFrame() {
        initComponents();
        this.maze = new Maze(canvas1,10,10);
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() { //метод инициализации кнопок и полей

//JLabel- текст с иконкой
// JSpinner-Счетчик, позволяет выбрать значение из некоторого набора, который можно «прокручивать» в обе стороны
// JButton-кнопка
        canvas1 = new java.awt.Canvas();//создает объект меню
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//закрываем наше окно(нажимаем крестик)
//addWindowListener-реагирует на оконные(свернуть,открыть,закрыть окно...) события
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
//windowActivated -Данный метод у слушателя будет вызываться каждый раз, когда окно будет становиться активным
// (при нажатии на крестик не вызывается,тольк при переходе с одного окна на другое)
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
//windowOpened - Вызывается у слушателя как только окно открывается, точнее после того как окно открылось.
                formWindowOpened(evt);
            }
        });


        canvas1.addMouseListener(new java.awt.event.MouseAdapter() { //добавляем слушателя к компоненту при
            // помощи метода addMouseListener и прослушивать события.
//MouseListene - чтобы обработать события от мыши.
//Нужен нам для определения координат этого курсора в начале перемещения.
            public void mouseClicked(java.awt.event.MouseEvent evt) {
// mouseClicked - событие от щелчка кнопкой мыши(Если позиция курсора не меняется между зажатием и отпусканием кнопки,
// то mouseClicked срабатывает, если же зажали кнопку,
// сменили положение курсора — передвинули его куда-нибудь,
// но не убрали с компонента а затем отпустили, то mouseClicked не вызовется)
                canvas1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
//mouseReleased - кнопка мыши отпущена в момент, когда курсор находится над наблюдаемым объектом
                canvas1MouseReleased(evt);
            }
        });
        canvas1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            //MouseMotionListener - помогает отслеживать изменение координат курсора мыши при выполнении операции перемещения дискеты
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                canvas1MouseDragged(evt);//Операция переноса объектов: пользователь нажимает клавишу мыши,
                // перемещает курсор и затем отпускает клавишу мыши
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                canvas1MouseMoved(evt);//Перемещение курсора мыши
            }
        });


        jButton1.setLabel("Paint");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });


        jSpinner1.setValue(10);
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });


        jLabel1.setText("height");


        jLabel2.setText("width");


        jSpinner2.setValue(10);
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });


        jButton2.setLabel("Go");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });


        jButton3.setText("Clear");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });


        jSpinner3.setValue(100);
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            // Для этого чтобы получать извещения об изменении значения регулятора(при выборе ширины например)
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });


        jLabel3.setText("delay");


        jButton4.setLabel("rand");

        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setPreferredSize(new Dimension(100,100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()//разрыв от левого края
                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))//добавляем лабиринт
                        //.addGap(0)//разрыв между лабиринтом и кнопками
                        .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jButton1,100,100,100)
                                        .addComponent(jSpinner1,100,100,100)
                                )

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner3,100,100,100)
                                        .addComponent(jLabel3)
                                        .addComponent(jButton2,100,100,100)
                                )


                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner2,100,100,100)
                                        .addComponent(jLabel2)
                                        .addComponent(jButton3,100,100,100)
                                )
                                .addGap(116)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton4,100,100,100)))


        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                        .addGroup(layout.createSequentialGroup()

                                                .addContainerGap()
                                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(550, 550, 550)
                                                // .addComponent(jButton4)
                                                // .addGap(41, 41, 41)

                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton1)
                                                        .addComponent(jButton2)
                                                        .addComponent(jButton3))
                                                // .addGap(60)

                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jButton4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))

                                .addContainerGap(18, Short.MAX_VALUE)
                        )
        );


        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        maze.paint();
    }//GEN-LAST:event_jButton1MouseClicked


    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        maze.set_height((int) this.jSpinner1.getValue());
    }//GEN-LAST:event_jSpinner1StateChanged


    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        // TODO add your handling code here:
        maze.set_width((int) this.jSpinner2.getValue());
    }//GEN-LAST:event_jSpinner2StateChanged


    private void canvas1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseMoved
        // TODO add your handling code here:
        //maze.on_mouse_dragged(evt.getX(),evt.getY());//прорисовывает клетку с выделением на нашем лабиринте
    }//GEN-LAST:event_canvas1MouseMoved


    private void canvas1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseDragged
        //canv.draw_rect(evt.getX(),evt.getY());
    }//GEN-LAST:event_canvas1MouseDragged


    private void canvas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseClicked
        // TODO add your handling code here:
        //maze.on_mouse_clicked(evt.getX(),evt.getY());
    }//GEN-LAST:event_canvas1MouseClicked


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        maze.go_maze();
        this.jButton3.setEnabled(true);
        this.jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2MouseClicked


    private void canvas1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseReleased
        // TODO add your handling code here:
        maze.on_mouse_clicked(evt.getX(),evt.getY());
    }//GEN-LAST:event_canvas1MouseReleased


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jButton3ActionPerformed


    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        maze.clear();
        this.jButton2.setEnabled(true);
        this.jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3MouseClicked


    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        //maze.paint();
    }//GEN-LAST:event_formWindowActivated


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //maze.paint();
    }//GEN-LAST:event_formWindowOpened


    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        // TODO add your handling code here:
        maze.set_delay((int) this.jSpinner3.getValue());
    }//GEN-LAST:event_jSpinner3StateChanged


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        maze.bad_rand_generarion();
    }//GEN-LAST:event_jButton4MouseClicked


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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    // End of variables declaration//GEN-END:variables
}


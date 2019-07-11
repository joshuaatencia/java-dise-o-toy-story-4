package Vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import AppPackage.AnimationClass;

public class ToyStory extends javax.swing.JFrame {

    private int xMouse, yMouse;
    private AnimationClass ac;

    public ToyStory() {
        initComponents();
        personaje.setForeground(Color.WHITE);
        slider.setIcon(new ImageIcon(getClass().getResource("/img/slider.png")));
        slider1.setIcon(new ImageIcon(getClass().getResource("/img/sliderh.png")));

    }

    private void puntos(String rol, boolean lol) {
        if ("slider1".equals(rol) && lol) {
            slider.setIcon(new ImageIcon(getClass().getResource("/img/slider.png")));
        } else if ("slider1".equals(rol) && lol == false) {
            slider.setIcon(new ImageIcon(getClass().getResource("/img/sliderh.png")));
        } else if ("slider2".equals(rol) && lol == true) {
            slider1.setIcon(new ImageIcon(getClass().getResource("/img/slider.png")));
        } else if ("slider2".equals(rol) && lol == false) {
            slider1.setIcon(new ImageIcon(getClass().getResource("/img/sliderh.png")));
        }
    }

    private void animacion(boolean rol) {
        if (rol) {
            ac = new AnimationClass();

            ac.jLabelXRight(0, 970, 1, 2, buzz);
            ac.jLabelXRight(510, 970, 1, 2, informacion);
            ac.jLabelXRight(510, 970, 1, 2, titulo);
            ac.jLabelXRight(-420, 510, 1, 2, informacion1);
            ac.jLabelXRight(-260, 510, 1, 2, titulo1);
            ac.jLabelXRight(470, 1000, 1, 2, tag);
            ac.jLabelXRight(570, 1000, 1, 2, tag1);
            ac.jLabelXRight(670, 1000, 1, 2, tag2);
            ac.jLabelXRight(529, 1000, 1, 2, tagtes);
            ac.jLabelXRight(626, 1000, 1, 2, tagtes1);
            ac.jLabelXRight(717, 1000, 1, 2, tagtes2);
            ac.jLabelXRight(-160, 470, 1, 2, tagwody);
            ac.jLabelXRight(-160, 570, 1, 2, tagwody1);

            ac.jLabelXRight(-160, 524, 1, 2, tagteswody);
            ac.jLabelXRight(-160, 620, 1, 2, tagtestwody1);

            ac.jLabelXRight(-450, 0, 1, 2, wody);
        } else if (rol==false) {

            ac = new AnimationClass();
            ac.jLabelXLeft(0, -450, 1, 2, wody);
            ac.jLabelXLeft(970, 0, 1, 2, buzz);
            ac.jLabelXLeft(970, 510, 1, 2, informacion);
            ac.jLabelXLeft(970, 510, 1, 2, titulo);

            ac.jLabelXLeft(510, -420, 1, 2, informacion1);
            ac.jLabelXLeft(510, -260, 1, 2, titulo1);
            ac.jLabelXLeft(1000, 470, 1, 2, tag);
            ac.jLabelXLeft(1000, 570, 1, 2, tag1);
            ac.jLabelXLeft(1000, 670, 1, 2, tag2);
            ac.jLabelXLeft(1000, 529, 1, 1, tagtes);
            ac.jLabelXLeft(1000, 626, 1, 2, tagtes1);
            ac.jLabelXLeft(1000, 717, 1, 1, tagtes2);
            ac.jLabelXLeft(470, -160, 1, 2, tagwody);
            ac.jLabelXLeft(570, -160, 1, 2, tagwody1);

            ac.jLabelXLeft(524, -160, 1, 2, tagteswody);
            ac.jLabelXLeft(620, -160, 1, 2, tagtestwody1);
        }
    }

    private void flechas(String flecha, boolean lol) {
        if ("derecha".equals(flecha) && lol == true) {
            derecha.setIcon(new ImageIcon(getClass().getResource("/img/derechah.png")));
        } else if ("derechah".equals(flecha) && lol == false) {
            derecha.setIcon(new ImageIcon(getClass().getResource("/img/derecha.png")));
        } else if ("isquierda".equals(flecha) && lol == true) {
            isquierda.setIcon(new ImageIcon(getClass().getResource("/img/isquierdah.png")));
        } else if ("isquierdah".equals(flecha) && lol == false) {
            isquierda.setIcon(new ImageIcon(getClass().getResource("/img/isquierda.png")));
        }

    }

    private void letrasArriba(String letras, boolean lol) {
        if ("historia".equals(letras) && lol) {
            historia.setForeground(Color.white);
        } else if ("historiano".equals(letras) && lol == false) {
            historia.setForeground(new Color(204, 204, 204));
        }
        if ("personajes".equals(letras) && lol) {
            personaje.setForeground(Color.white);
        } else if ("personajesno".equals(letras) && lol == false) {
            personaje.setForeground(new Color(204, 204, 204));
        }
        if ("eventos".equals(letras) && lol) {
            evento.setForeground(Color.white);
        } else if ("eventosno".equals(letras) && lol == false) {
            evento.setForeground(new Color(204, 204, 204));
        }
        if ("comunidad".equals(letras) && lol) {
            comunidad.setForeground(Color.white);
        } else if ("comunidadno".equals(letras) && lol == false) {
            comunidad.setForeground(new Color(204, 204, 204));
        }
        if ("salir".equals(letras) && lol) {
            salir.setForeground(Color.white);
        } else if ("salirno".equals(letras) && lol == false) {
            salir.setForeground(new Color(204, 204, 204));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        derecha = new javax.swing.JLabel();
        isquierda = new javax.swing.JLabel();
        wody = new javax.swing.JLabel();
        buzz = new javax.swing.JLabel();
        flechatestowody1 = new javax.swing.JLabel();
        flechacontestowody1 = new javax.swing.JLabel();
        flechacontestowody = new javax.swing.JLabel();
        flechatestowody = new javax.swing.JLabel();
        flechatesto1 = new javax.swing.JLabel();
        flechacontesto1 = new javax.swing.JLabel();
        flechacontesto = new javax.swing.JLabel();
        flechatesto = new javax.swing.JLabel();
        tagtestwody1 = new javax.swing.JLabel();
        tagteswody = new javax.swing.JLabel();
        tagwody1 = new javax.swing.JLabel();
        tagwody = new javax.swing.JLabel();
        tagtes2 = new javax.swing.JLabel();
        tagtes1 = new javax.swing.JLabel();
        tagtes = new javax.swing.JLabel();
        tag2 = new javax.swing.JLabel();
        tag1 = new javax.swing.JLabel();
        tag = new javax.swing.JLabel();
        slider2 = new javax.swing.JLabel();
        slider1 = new javax.swing.JLabel();
        slider = new javax.swing.JLabel();
        informacion1 = new javax.swing.JLabel();
        informacion = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        comunidad = new javax.swing.JLabel();
        evento = new javax.swing.JLabel();
        personaje = new javax.swing.JLabel();
        historia = new javax.swing.JLabel();
        fondoPersonaje = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        derecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/derecha.png"))); // NOI18N
        derecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        derecha.setDisabledIcon(null);
        derecha.setFocusable(false);
        derecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                derechaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                derechaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                derechaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                derechaMousePressed(evt);
            }
        });
        jPanel1.add(derecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, -1, -1));

        isquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/isquierda.png"))); // NOI18N
        isquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        isquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isquierdaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                isquierdaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                isquierdaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                isquierdaMousePressed(evt);
            }
        });
        jPanel1.add(isquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        wody.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/woody.png"))); // NOI18N
        jPanel1.add(wody, new org.netbeans.lib.awtextra.AbsoluteConstraints(-450, 0, 440, 540));

        buzz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buzz.png"))); // NOI18N
        jPanel1.add(buzz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        flechatestowody1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flechatesto.png"))); // NOI18N
        jPanel1.add(flechatestowody1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 360, -1, -1));

        flechacontestowody1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        flechacontestowody1.setForeground(new java.awt.Color(255, 255, 255));
        flechacontestowody1.setText("DESCARGAR INFORMACION");
        jPanel1.add(flechacontestowody1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 363, -1, -1));

        flechacontestowody.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        flechacontestowody.setForeground(new java.awt.Color(255, 255, 255));
        flechacontestowody.setText("VER EL TRAILER");
        jPanel1.add(flechacontestowody, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 323, -1, -1));

        flechatestowody.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flechatesto.png"))); // NOI18N
        jPanel1.add(flechatestowody, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 319, -1, -1));

        flechatesto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flechatesto.png"))); // NOI18N
        jPanel1.add(flechatesto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        flechacontesto1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        flechacontesto1.setForeground(new java.awt.Color(255, 255, 255));
        flechacontesto1.setText("DESCARGAR INFORMACION");
        jPanel1.add(flechacontesto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 363, -1, -1));

        flechacontesto.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        flechacontesto.setForeground(new java.awt.Color(255, 255, 255));
        flechacontesto.setText("VER EL TRAILER");
        jPanel1.add(flechacontesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 323, -1, -1));

        flechatesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flechatesto.png"))); // NOI18N
        jPanel1.add(flechatesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 319, -1, -1));

        tagtestwody1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        tagtestwody1.setForeground(new java.awt.Color(204, 204, 204));
        tagtestwody1.setText("Woody");
        jPanel1.add(tagtestwody1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 266, -1, -1));

        tagteswody.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        tagteswody.setForeground(new java.awt.Color(204, 204, 204));
        tagteswody.setText("Toy 4");
        jPanel1.add(tagteswody, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 266, -1, -1));

        tagwody1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tag.png"))); // NOI18N
        jPanel1.add(tagwody1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 250, -1, -1));

        tagwody.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tag.png"))); // NOI18N
        jPanel1.add(tagwody, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 250, -1, -1));

        tagtes2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        tagtes2.setForeground(new java.awt.Color(204, 204, 204));
        tagtes2.setText("Juguete");
        jPanel1.add(tagtes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 266, -1, -1));

        tagtes1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        tagtes1.setForeground(new java.awt.Color(204, 204, 204));
        tagtes1.setText("Buzz");
        jPanel1.add(tagtes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 266, -1, -1));

        tagtes.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        tagtes.setForeground(new java.awt.Color(204, 204, 204));
        tagtes.setText("Toy");
        jPanel1.add(tagtes, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 266, -1, -1));

        tag2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tag.png"))); // NOI18N
        jPanel1.add(tag2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, -1, -1));

        tag1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tag.png"))); // NOI18N
        jPanel1.add(tag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        tag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tag.png"))); // NOI18N
        jPanel1.add(tag, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        slider2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/slider.png"))); // NOI18N
        jPanel1.add(slider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 24, -1, -1));

        slider1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/slider.png"))); // NOI18N
        jPanel1.add(slider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 500, -1, -1));

        slider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sliderh.png"))); // NOI18N
        jPanel1.add(slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 500, -1, -1));

        informacion1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        informacion1.setForeground(new java.awt.Color(255, 255, 255));
        informacion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        informacion1.setText("<html> <body> <p> \nEl Sheriff Wydow «Woody» Pride, también conocido como Comisario Woody o simplemente Woody, es un personaje ficticio y protagonista principal de la franquicia Toy Story de Pixar. Ejerce el rol de un vaquero de juguete y líder de los juguetes en las películas.\n </p> </body> </html>");
        informacion1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(informacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-420, 180, 410, 100));

        informacion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        informacion.setForeground(new java.awt.Color(255, 255, 255));
        informacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        informacion.setText("<html>\n<body>\n<p>\nBuzz Lightyear es un personaje ficticio de la franquicia Toy Story de Pixar. Ejerce el rol de un superhéroe espacial de juguete y el de una figura de acción. Junto con el Sheriff Woody, es uno de los dos personajes principales en las cuatro películas de Toy Story.\n</p>\n</body>\n</html>");
        informacion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 410, 100));

        titulo1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setText("Sheriff Woody");
        jPanel1.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 130, -1, -1));

        titulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("BUZZ LIGHTYEAR");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        salir.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(204, 204, 204));
        salir.setText("X");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        comunidad.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        comunidad.setForeground(new java.awt.Color(204, 204, 204));
        comunidad.setText("COMUNIDAD");
        comunidad.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        comunidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comunidadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comunidadMouseExited(evt);
            }
        });
        jPanel1.add(comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, -1));

        evento.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        evento.setForeground(new java.awt.Color(204, 204, 204));
        evento.setText("EVENTOS");
        evento.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        evento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eventoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eventoMouseExited(evt);
            }
        });
        jPanel1.add(evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        personaje.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        personaje.setForeground(new java.awt.Color(204, 204, 204));
        personaje.setText("PERSONAJES");
        personaje.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel1.add(personaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        historia.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        historia.setForeground(new java.awt.Color(204, 204, 204));
        historia.setText("HISTORIA");
        historia.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        historia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                historiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                historiaMouseExited(evt);
            }
        });
        jPanel1.add(historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        fondoPersonaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondopersonajes.png"))); // NOI18N
        jPanel1.add(fondoPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void derechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_derechaMouseExited
        flechas("derechah", false);
    }//GEN-LAST:event_derechaMouseExited

    private void isquierdaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isquierdaMouseEntered
        flechas("isquierda", true);
    }//GEN-LAST:event_isquierdaMouseEntered

    private void isquierdaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isquierdaMouseExited
        flechas("isquierdah", false);
    }//GEN-LAST:event_isquierdaMouseExited

    private void historiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historiaMouseEntered
        letrasArriba("historia", true);
    }//GEN-LAST:event_historiaMouseEntered

    private void historiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historiaMouseExited
        letrasArriba("historiano", false);
    }//GEN-LAST:event_historiaMouseExited

    private void eventoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventoMouseEntered
        letrasArriba("eventos", true);
    }//GEN-LAST:event_eventoMouseEntered

    private void eventoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventoMouseExited
        letrasArriba("eventosno", false);
    }//GEN-LAST:event_eventoMouseExited

    private void comunidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comunidadMouseEntered
        letrasArriba("comunidad", true);
    }//GEN-LAST:event_comunidadMouseEntered

    private void comunidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comunidadMouseExited
        letrasArriba("comunidadno", false);
    }//GEN-LAST:event_comunidadMouseExited

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        letrasArriba("salir", true);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        letrasArriba("salirno", false);
    }//GEN-LAST:event_salirMouseExited

    private void derechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_derechaMouseClicked
        puntos("slider2", true);
        puntos("slider1", false);
        derecha.setIcon(new ImageIcon(getClass().getResource("/img/derecha.png")));
        animacion(true);


    }//GEN-LAST:event_derechaMouseClicked

    private void derechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_derechaMouseEntered
        flechas("derecha", true);
    }//GEN-LAST:event_derechaMouseEntered

    private void derechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_derechaMousePressed
        flechas("derecha", true);
    }//GEN-LAST:event_derechaMousePressed

    private void isquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isquierdaMouseClicked
        puntos("slider2", false);
        puntos("slider1", true);
        isquierda.setIcon(new ImageIcon(getClass().getResource("/img/isquierda.png")));
        animacion(false);


    }//GEN-LAST:event_isquierdaMouseClicked

    private void isquierdaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isquierdaMousePressed
        flechas("isquierda", true);
    }//GEN-LAST:event_isquierdaMousePressed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();


    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
        this.setOpacity(0.8f);


    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        this.setOpacity(1.0f);
    }//GEN-LAST:event_formMouseReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ToyStory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToyStory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToyStory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToyStory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToyStory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buzz;
    private javax.swing.JLabel comunidad;
    private javax.swing.JLabel derecha;
    private javax.swing.JLabel evento;
    private javax.swing.JLabel flechacontesto;
    private javax.swing.JLabel flechacontesto1;
    private javax.swing.JLabel flechacontestowody;
    private javax.swing.JLabel flechacontestowody1;
    private javax.swing.JLabel flechatesto;
    private javax.swing.JLabel flechatesto1;
    private javax.swing.JLabel flechatestowody;
    private javax.swing.JLabel flechatestowody1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondoPersonaje;
    private javax.swing.JLabel historia;
    private javax.swing.JLabel informacion;
    private javax.swing.JLabel informacion1;
    private javax.swing.JLabel isquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel personaje;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel slider;
    private javax.swing.JLabel slider1;
    private javax.swing.JLabel slider2;
    private javax.swing.JLabel tag;
    private javax.swing.JLabel tag1;
    private javax.swing.JLabel tag2;
    private javax.swing.JLabel tagtes;
    private javax.swing.JLabel tagtes1;
    private javax.swing.JLabel tagtes2;
    private javax.swing.JLabel tagtestwody1;
    private javax.swing.JLabel tagteswody;
    private javax.swing.JLabel tagwody;
    private javax.swing.JLabel tagwody1;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel wody;
    // End of variables declaration//GEN-END:variables
}

package br.com.vsn.util;

import javax.swing.JDialog;
import javax.swing.JInternalFrame;


public class JanelaDialogo {
    public static JDialog dialogoEnd = new JDialog();
    public static JInternalFrame janelaEnd = new JInternalFrame();


    public void geraDialogo(final JInternalFrame janela){
        JDialog dialogo = new JDialog();
        janelaEnd = janela;
        dialogoEnd = dialogo;
        dialogo.add(janela);
        dialogo.setModal(true);
        dialogo.setTitle(janela.getTitle());
        dialogo.setContentPane(janela.getContentPane());
        dialogo.setBounds(janela.getBounds());
        dialogo.setResizable(false);
        dialogo.setVisible(true);
        dialogo.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogo.addWindowListener(new java.awt.event.WindowAdapter()  
            {  
                public void windowClosing(java.awt.event.WindowEvent evt) {  
                    dialogoEnd.dispose();  
                    janela.dispose();  
                }  
            });  
    }

}
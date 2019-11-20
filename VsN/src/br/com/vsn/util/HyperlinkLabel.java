/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vsn.util;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URL;
import javax.swing.JLabel;

/**
 *
 * @author Vitor
 */
class HyperlinkLabel extends JLabel {
  	  private URL url;
	  
	  private MouseListener linker = new MouseAdapter(){
	    public void mouseClicked(MouseEvent e){
	      HyperlinkLabel self = (HyperlinkLabel) e.getSource();
	      if(self.url == null) return;
	      try{
	    	  Runtime.getRuntime().exec("cmd.exe /C start " + self.url.toString());
	    	  System.out.println("fiz");
	    }catch(IOException e1){ e1.printStackTrace(); }
	    }
	    public void mouseEntered(MouseEvent e){
	      e.getComponent().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    }
	  };
	  
	  public HyperlinkLabel(String label){
	    super(label);
	    setForeground(Color.BLUE);
	    addMouseListener(linker);
	  }
	  
	  public HyperlinkLabel(String label, String tip){
	    this(label);
	    setToolTipText(tip);
	  }
	  
	  public HyperlinkLabel(String label, URL url){
	    this(label);
	    this.url = url;
	  }
	  
	  public HyperlinkLabel(String label, String tip, URL url){
	    this(label, url);
	    setToolTipText(tip);
	  }
	  
	  public void setURL(URL url){ this.url = url; }
	  
	  public URL getURL(){ return url; }
	}

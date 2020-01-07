package com.elis.tris;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class FrameTris extends Frame implements ActionListener,MouseListener
{
	private Frame f;
	private Button chiudi, reset;
	private Label benvenuto, risultato, turno, errore;
	int seme = 2, n, m, i = 0;
	char ch[] = new char[9];

	public FrameTris(String titolo)
	{
	/************SET FRAME************/
		f=new Frame();
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(600, 1000);
		f.setBackground(Color.white);
		f.setLocation(400, 20);
		f.setResizable(false);
		f.addMouseListener(this);
		for(i=0;i<9;i++)
			ch[i] = 'B';
		
	/************SET BUTTON************/	
		reset=new Button("NUOVA PARTITA"); 
		reset.setSize(150,30);
		reset.setLocation(150,940);
		reset.addActionListener(this);
		reset.setFont(new Font("Arial",Font.BOLD,16));
		reset.setBackground(Color.lightGray);
		reset.setForeground(Color.black);
		add(reset);
		
		chiudi=new Button("CHIUDI"); 
		chiudi.setSize(70,30);
		chiudi.setLocation(50,940);
		chiudi.addActionListener(this);
		chiudi.setFont(new Font("Arial",Font.BOLD,16));
		chiudi.setBackground(Color.lightGray);
		chiudi.setForeground(Color.black);
		add(chiudi);
		
	/************SET LABEL************/
		benvenuto=new Label("BENVENUTO NEL GIOCO DEL TRIS A 2 GIOCATORI");
		benvenuto.setSize(500, 30);
		benvenuto.setLocation(50, 50);
		benvenuto.setFont(new Font("Arial",Font.BOLD,20));
		benvenuto.setForeground(Color.blue);
		add(benvenuto);
		
		turno=new Label("");
		turno.setSize(200, 20);
		turno.setLocation(150, 100);
		turno.setFont(new Font("Arial",Font.ITALIC,15));
		add(turno);
		
		risultato=new Label("");
		risultato.setSize(400, 30);
		risultato.setLocation(100, 600);;
		risultato.setFont(new Font("Arial",Font.BOLD,20));
		risultato.setForeground(Color.red);
		add(risultato);
		
		errore=new Label("");
		errore.setSize(310, 20);
		errore.setLocation(100, 500);;
		errore.setFont(new Font("Arial",Font.ITALIC,15));
		errore.setForeground(Color.red);
		add(errore);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()== chiudi)
		{
			System.exit(0);
		}
		
		if (e.getSource()== reset)
		{
		
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
    /************SET BOARD************/
		Graphics g=f.getGraphics();
        g.drawLine(200,0,200,600);
        g.drawLine(400,0,400,600);
        g.drawLine(0,200,600,200);
        g.drawLine(0,400,600,400);
        seme--;
        int x=e.getX();
        int y=e.getY();
        
    /************SET X************/
        if(seme==1)
        {
            if(x<200&&y<200){m=0;n=0;ch[0]='R';}
            if((x>200&&x<400)&&(y<200)){m=200;n=0;ch[1]='R';}
            if((x>400&&x<600)&&(y<200)){m=400;n=0;ch[2]='R';}
            if(x<200&&(y>200&&y<400)){m=0;n=200;ch[3]='R';}
            if((x>200&&x<400)&&(y>200&&y<400)){m=200;n=200;ch[4]='R';}
            if((x>400&&x<600)&&(y>200&&y<400)){m=400;n=200;ch[5]='R';}
            if(x<200&&(y>400&&y<600)){m=0;n=400;ch[6]='R';}
            if((x>200&&x<400)&&(y>400&&y<600)){m=200;n=400;ch[7]='R';}
            if((x>400&&x<600)&&(y>400&&y<600)){m=400;n=400;ch[8]='R';}
            g.setColor(Color.red);
            g.drawLine(m,n,m+199,n+199);
            g.drawLine(m+199,n,m,n+199);
        }
        
    /************SET CERCHIO************/
        if(seme==0)
        {           
            if(x<200&&y<200){m=0;n=20;ch[0]='P';}
            if((x>200&&x<400)&&(y<200)){m=200;n=20;ch[1]='P';}
            if((x>400&&x<600)&&(y<200)){m=400;n=20;ch[2]='P';}
            if(x<200&&(y>200&&y<400)){m=0;n=200;ch[3]='P';}
            if((x>200&&x<400)&&(y>200&&y<400)){m=200;n=200;ch[4]='P';}
            if((x>400&&x<600)&&(y>200&&y<400)){m=400;n=200;ch[5]='P';}
            if(x<200&&(y>400&&y<600)){m=0;n=400;ch[6]='P';}
            if((x>200&&x<400)&&(y>400&&y<600)){m=200;n=400;ch[7]='P';}
            if((x>400&&x<600)&&(y>400&&y<600)){m=400;n=400;ch[8]='P';}
            g.setColor(Color.green);
            g.drawOval(m+10,n+10,169,169);
            seme=seme+2;
        }
        
    /************PAREGGIO************/
        for(i=0;i<9;i++)
        {
            if(ch[i]!='B')
            {
                if(i==8)
                /*risultato.setText("Pareggio");*/pareggio();
            }
            else
            break;
        }
        
    /************VITTORIA VERTICALI************/
        for(i=0;i<3;i++)
        {
            if(ch[i]!='B')
            {
                if((ch[i+3]==ch[i])&&(ch[i+6]==ch[i]))
                /*risultato.setText("Complimenti! Hai Vinto!");*/vinto();            }
        }
        
    /************VITTORIA ORIZZONTALI************/
        for(i=0;i<7;i++)
        {
            
            if(ch[i]!='B')
            {
                if((ch[i]==ch[i+1])&&(ch[i]==ch[i+2]))
                /*risultato.setText("Complimenti! Hai Vinto!");*/vinto();                i=i+2;
            }
            else
            i=i+2;
        }
        
        /************VITTORIA DIAGONALI************/
	        if(ch[4]!='B')     //for diagonali
	        {
	            if(((ch[0]==ch[4])&&(ch[4]==ch[8]))||((ch[2]==ch[4])&&(ch[4]==ch[6])))
	            	/*risultato.setText("Complimenti! Hai Vinto!");*/vinto();
	        }
	}
	
    /************NUOVO FRAME************/
	public Frame vinto()
    {
        Frame m=new Frame("RISULTATO");
        Label l=new Label("HAI VINTO");
        m.setLayout(null);
        m.add(l);
        l.setBounds(20,20,60,60);
        m.setVisible(true);
        m.setSize(100,100);
        return m;
    }
    
    public Frame pareggio()
    {
        Frame m=new Frame("RISULTATO");
        Label l1=new Label("PAREGGIO");
        m.setLayout(null);
        m.add(l1);
        l1.setBounds(20,20,60,60);
        m.setVisible(true);
        m.setSize(100,100);
        return m;    
    }
    
	@Override
	public void mousePressed(MouseEvent e) 
	{
		System.out.print("");  
    }

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		System.out.print("");		
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		System.out.print("");		
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		System.out.print("");		
	}
}

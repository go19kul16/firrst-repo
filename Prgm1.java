import java.awt.event.*;
import java.awt.*;
import  java.lang.Math;
import java.awt.Font;
class Calculator1 extends Frame implements ActionListener
    {
        Button bc,bper,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
        Label l1,l2;
        Calculator1()
        {
            setVisible(true);
            setTitle("Calculator");
            setLayout(null);
            setSize(380,400);
            //1st row
            bc=new Button("C");
            bper=new Button("%");
            b13=new Button("/");
            b14=new Button("^");
            bc.setBounds(30,130,80,50);
            bper.setBounds(110,130,80,50);
            b13.setBounds(190,130,80,50);
            b14.setBounds(270,130,80,50);
            add(bc);
            add(bper);
            add(b13);
            add(b14);
            //2nd row
            b7=new Button("7");
            b8=new Button("8");
            b9=new Button("9");
            b10=new Button("+");
            b7.setBounds(30,180,80,50);
            b8.setBounds(110,180,80,50);
            b9.setBounds(190,180,80,50);
            b10.setBounds(270,180,80,50);
            add(b7);
            add(b8);
            add(b9);
            add(b10);
            //3rd row
            b4=new Button("4");
            b5=new Button("5");
            b6=new Button("6");
            b11=new Button("-");
            b4.setBounds(30,230,80,50);
            b5.setBounds(110,230,80,50);
            b6.setBounds(190,230,80,50);
            b11.setBounds(270,230,80,50);
            add(b4);
            add(b5);
            add(b6);
            add(b11);
            //4th row
            b1=new Button("1");
            b2=new Button("2");
            b3=new Button("3");
            b12=new Button("*");
            b1.setBounds(30,280,80,50);
            b2.setBounds(110,280,80,50);
            b3.setBounds(190,280,80,50);
            b12.setBounds(270,280,80,50);
            add(b1);
            add(b2);
            add(b3);
            add(b12);
            //5th row
            b17=new Button("Del");
            b0=new Button("0");
            b15=new Button(".");
            b16=new Button("=");
            b17.setBounds(30,330,80,50);
            b0.setBounds(110,330,80,50);
            b15.setBounds(190,330,80,50);
            b16.setBounds(270,330,80,50);
            b16.setBackground(Color.lightGray);
            add(b17);
            add(b0);
            add(b15);
            add(b16);
    //label
            l1=new Label();
            l1.setBounds(30,10,160,200);
            add(l1);
            l1.setBackground(Color.lightGray);
            l2=new Label("Result");
            l2.setBounds(190,10,160,200);
            add(l2);
            l2.setBackground(Color.lightGray);
            bc.addActionListener(this);
            b0.addActionListener(this);
            b1.addActionListener(this);
            bper.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
            b8.addActionListener(this);
            b9.addActionListener(this);
            b10.addActionListener(this);
            b11.addActionListener(this);
            b12.addActionListener(this);
            b13.addActionListener(this);
            b14.addActionListener(this);
            b15.addActionListener(this);
            b16.addActionListener(this);
            b17.addActionListener(this);

            ////
            Font myFont = new Font("Courier", Font.PLAIN,30);
             b1.setFont(myFont); b2.setFont(myFont); b3.setFont(myFont);b4.setFont(myFont); b5.setFont(myFont);
            b10.setFont(myFont);b9.setFont(myFont);b8.setFont(myFont);b7.setFont(myFont);b6.setFont(myFont);
            b11.setFont(myFont);b12.setFont(myFont);b13.setFont(myFont);b14.setFont(myFont);b15.setFont(myFont);
            b16.setFont(myFont);b17.setFont(myFont);b0.setFont(myFont);bc.setFont(myFont);bper.setFont(myFont);
            l1.setFont(myFont);l2.setFont(myFont);
            
        }
        public void actionPerformed(ActionEvent ae)
            {    
                String s,con;
                int check;
                if(ae.getSource()==b0)
                {
                    s=l1.getText();
                    con=s+"0";
                    l1.setText(con);
                }
                if(ae.getSource()==b1)
                {
                    s=l1.getText();
                    con=s+"1";
                    l1.setText(con);
                }
                if(ae.getSource()==b2)
                {
                    s=l1.getText();
                    con=s+"2";
                    l1.setText(con);
                }
                if(ae.getSource()==b3)
                {
                    s=l1.getText();
                    con=s+"3";
                    l1.setText(con);
                }
                if(ae.getSource()==b4)
                {
                    s=l1.getText();
                    con=s+"4";
                    l1.setText(con);
                }
                if(ae.getSource()==b5)  
                {
                    s=l1.getText();
                    con=s+"5";
                    l1.setText(con);
                }
                if(ae.getSource()==b6)
                {
                    s=l1.getText();
                    con=s+"6";
                    l1.setText(con);
                }
                if(ae.getSource()==b7)
                {
                    s=l1.getText();
                    con=s+"7";
                    l1.setText(con);
                }
                if(ae.getSource()==b8)
                {
                    s=l1.getText();
                    con=s+"8";
                    l1.setText(con);
                }
                if(ae.getSource()==b9)
                {
                    s=l1.getText();
                    con=s+"9";
                    l1.setText(con);

                
                }
                if(ae.getSource()==b10)            //  456+987\0  
                {
                    s=l1.getText();
                    con=s+"+";
                    l1.setText(con);
                    //check=1;
                }
                if(ae.getSource()==b11)
                {
                    s=l1.getText();
                    con=s+"-";
                    l1.setText(con);
                }
                if(ae.getSource()==b12)
                {
                    s=l1.getText();
                    con=s+"*";
                    l1.setText(con);
                }
                if(ae.getSource()==b13)
                {
                    s=l1.getText();
                    con=s+"/";
                    l1.setText(con);
                }
                if(ae.getSource()==b14)
                {
                    s=l1.getText();
                    con=s+"^";
                    l1.setText(con);
                }
                if(ae.getSource()==b15)
                {
                    s=l1.getText();
                    con=s+".";
                    l1.setText(con);
                }
                if(ae.getSource()==b17)
                {
                    con=l1.getText();
                        con=con.substring(0, con.length()-1);
                    l1.setText(con);
                }
                if(ae.getSource()==bper)
                {
                    s=l1.getText();
                    con=s+"%";
                    l1.setText(con);
                }
                if(ae.getSource()==b16)
                {
                    //check=1;
                    String tem=l1.getText();
                    

                        if(tem.contains("+"))
                        {
                                    //String z="1+12+123+1234";
                                    int o=tem.length();
                                    String z1;
                                    int j=tem.lastIndexOf("+");
                                    double d1 = Double.parseDouble(tem.substring(j+1));
                                    double d2;
                                    System.out.println(d1);
                                    try{
                                    for(int i=0;i<o;i++)
                                    {
                                        int k=tem.indexOf("+");
                
                
                                         z1 = tem.substring(0,tem.indexOf("+"));        

                                        tem=tem.substring(k+1);
                                        //System.out.println(z1);
                                        d2= Double.parseDouble(z1);
                                        d1+=d2;
                                         String res=String.valueOf(d1); l2.setText(res);
                                                                                                                                                                
                                    
                }
                    }
                catch(Exception e){
                
                }    
                        }

                        if(tem.contains("-"))
                        {
                                    //String z="1+12+123+1234";
                                    int o=tem.length();
                                    String z1;
                                    int j=tem.lastIndexOf("-");
                                    double d1 = Double.parseDouble(tem.substring(j+1));
                                    double d2;
                                    System.out.println(d1);
                                    try{
                                    for(int i=0;i<o;i++)
                                    {
                                        int k=tem.indexOf("-");
                
                
                                         z1 = tem.substring(0,tem.indexOf("-"));        

                                        tem=tem.substring(k+1);
                                        //System.out.println(z1);
                                        d2= Double.parseDouble(z1);
                                        d1-=d2;
                                         String res=String.valueOf(d1); l2.setText(res);
                                                                                                                                                                
                                    
                }
                    }
                catch(Exception e){
                
                }    
                        }

                        if(tem.contains("*"))
                        {
                                    //String z="1+12+123+1234";
                                    int o=tem.length();
                                    String z1;
                                    int j=tem.lastIndexOf("*");
                                    double d1 = Double.parseDouble(tem.substring(j+1));
                                    double d2;
                                    System.out.println(d1);
                                    try{
                                    for(int i=0;i<o;i++)
                                    {
                                        int k=tem.indexOf("*");
                
                
                                         z1 = tem.substring(0,tem.indexOf("*"));        

                                        tem=tem.substring(k+1);
                                        //System.out.println(z1);
                                        d2= Double.parseDouble(z1);
                                        d1*=d2;
                                         String res=String.valueOf(d1); l2.setText(res);
                                                                                                                                                                
                                    
                }
                    }
                catch(Exception e){
                
                }    
                        }

                        if(tem.contains("/"))
                        {
                                    con=l1.getText();
                                    String z=con;
                                    int j=z.lastIndexOf("/");
                                    double d1 = Double.parseDouble(z.substring(j+1));
                                    double d2 = Double.parseDouble(z.substring(0,z.indexOf("/")));
                                    double d=d2/d1;    
                                    String res=String.valueOf(d);
                                    l2.setText(res);      
                        }
                        if(tem.contains("^"))
                        {
                                    con=l1.getText();
                                    String z=con;
                                    int j=z.lastIndexOf("^");
                                    double d1 = Double.parseDouble(z.substring(j+1));
                                    double d2 = Double.parseDouble(z.substring(0,z.indexOf("^")));
                                    double d=Math.pow(d2,d1);    
                                    String res=String.valueOf(d);
                                    l2.setText(res);      
                        }

                        if(tem.contains("%"))
                        {
                                    con=l1.getText();
                                    String z=con;
                                    int j=z.lastIndexOf("%");
                                    double d1 = Double.parseDouble(z.substring(j+1));
                                    double d2 = Double.parseDouble(z.substring(0,z.indexOf("%")));
                                    double d=(d2*d1)/100;    
                                    String res=String.valueOf(d);
                                    l2.setText(res);      
                        }


                        
                    
                }

                if(ae.getSource()==bc)
                {
                        l1.setText("");
                        l2.setText("");
            
                }
                
                
                
            }
        public static void main(String args[])
            {
                new Calculator1();
            }
    }

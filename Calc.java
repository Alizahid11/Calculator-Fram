import java.awt.event.*;
import java.awt.*;

class Calculator implements ActionListener{
	
	TextField screen;
	Panel p1, p2;
	Button bplus,bminus,btimes,bdivide,bequals,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	int firstno, secondno, ans;
	String sign, optsign;
	boolean equalsbool = false;

	public Calculator(){

			Frame f = new Frame("Calculations");
			p1 = new Panel();
			p2 = new Panel();
			p2.setLayout(new GridLayout(4,4));
			
			screen = new TextField(20);
			
			
			bplus = new Button("+");
			bminus = new Button("-");
			btimes = new Button("*");
			bdivide = new Button("/");
			b0 = new Button("0");
			b1 = new Button("1");
			b2 = new Button("2");
			b3 = new Button("3");
			b4 = new Button("4");
			b5 = new Button("5");
			b6 = new Button("6");
			b7 = new Button("7");
			b8 = new Button("8");
			b9 = new Button("9");
			bequals = new Button("=");

			 bplus.addActionListener(this);
			 bminus.addActionListener(this);
			 btimes.addActionListener(this);
			 bdivide.addActionListener(this);
			 bequals.addActionListener(this);
			 b0.addActionListener(this);
			 b1.addActionListener(this);
			 b2.addActionListener(this);
			 b3.addActionListener(this);
			 b4.addActionListener(this);
			 b5.addActionListener(this);
			 b6.addActionListener(this);
			 b7.addActionListener(this);
			 b8.addActionListener(this);
			 b9.addActionListener(this);

			p1.add(screen);
			p2.add(b0);
			p2.add(b1);
			p2.add(b2);
			p2.add(bplus);
			p2.add(b3);
			p2.add(b4);
			p2.add(b5);
			p2.add(bminus);
			p2.add(b6);
			p2.add(b7);
			p2.add(b8);
			p2.add(btimes);
			p2.add(b9);
			p2.add(bequals);
			p2.add(bdivide);



			f.add(p1,BorderLayout.NORTH);
			f.add(p2,BorderLayout.CENTER);

			
			
			f.setSize(400,400);
			f.setVisible(true);

	}


	public void actionPerformed(ActionEvent t){

			Button btn=(Button) t.getSource();

			//screen.setText(screen.getText()+btn.getLabel());

			
			
						
			
			sign=btn.getLabel();
			if(btn==bplus || btn==bminus ||btn==btimes ||btn==bdivide){
				firstno=Integer.parseInt(screen.getText());
				screen.setText("");
				if(btn==bplus) 
				{ 
					optsign = "+"; 
				}
				if(btn==bminus){
					optsign="-";
				}
				if(btn==btimes){
					optsign="*";
				}
				if(btn==bdivide){
					optsign="/";
				}
			} 
			else if(btn==bequals)
			{
				equalsbool = true;
				secondno=Integer.parseInt(screen.getText());
				if(optsign.equals("+")){
					ans=firstno+secondno;
				}
				if(optsign.equals("-")){
					ans=firstno-secondno;
				}
				if(optsign.equals("*")){
					ans=firstno*secondno;
				}
				if(optsign.equals("/")){
					ans=firstno/secondno;
				}

				screen.setText(Integer.toString(ans));
			}
			else{
				if(equalsbool == true){
					screen.setText(btn.getLabel()); //Add a new number, but clear the previous value
					equalsbool = false;
				}
				else{
					screen.setText(screen.getText()+btn.getLabel());
				}
			}


			// if(btn==bplus){
				//optsign = "+";
			// screen.setText("");


			// }
			// else if(btn==bminus){
			// 	screen.setText("");				
			// }
			// else if(btn==btimes){
			// 	screen.setText("");
			// }
			// else if(btn==bdivide){
			// 	screen.setText("");
			// }
			// // else if(btn==bequals){
			// // 	screen.setText("");
			// }
	}

				
		
}
			

	
		// 




class Calc{
	public static void main(String args[]){
		Calculator cal = new Calculator();
	}
}


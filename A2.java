/*
<applet code="A2" width=5000 height=2000>
<param name="img" value="XXX1.jpg" >
<param name="x" value="S.jpg" >
<param name="y" value="a.jpg" >
</applet>
*/
import java.util.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.lang.Thread;
import java.lang.*;
import java.awt.event.*;
public class A2 extends Applet implements ActionListener
{
AudioClip m;
AudioClip V;
AudioClip U;
AudioClip L;
String msg,msg1;
Image img,x,y;
Button R,G;

 int sum=0,a,b,c,d,rno,rno1,sum1=0;
public void init()
{
m=getAudioClip(getDocumentBase(),"sample.au");
V=getAudioClip(getDocumentBase(),"V.au");
U=getAudioClip(getDocumentBase(),"U.au");
L=getAudioClip(getDocumentBase(),"L.au");
Thread t=new Thread();
img=getImage(getDocumentBase(),getParameter("img"));
x=getImage(getDocumentBase(),getParameter("x"));
y=getImage(getDocumentBase(),getParameter("y"));
R=new Button("PLAYER 1");
G=new Button("PLAYER 2");
add(R);
add(G);
R.addActionListener(this);
G.addActionListener(this);
V.play();
}

public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();

String str1=ae.getActionCommand();

if(str.equals("PLAYER 1"))
{
Random r1=new Random();
rno=r1.nextInt(6);
rno=rno+1;
sum=sum+rno;
if(sum==1)
{
a=105;
b=280;
sum=38;
L.play();
}
else if(sum==2)
{
a=60;
b=412;
}
else if(sum==3)
{
a=105;
b=412;
}
else if(sum==4)
{
a=285;
b=362;
sum=14;
L.play();
}
else if(sum==5)
{
a=195;
b=412;
}
else if(sum==6)
{
a=240;
b=412;
}
else if(sum==7)
{
a=285;
b=412;
}

else if(sum==8)
{
a=330;
b=412;
}

else if(sum==9)
{
a=400;
b=280;
sum=31;
L.play();
}

else if(sum==10)
{
a=400;
b=412;
}

else if(sum==11)
{
a=400;
b=362;
}

else if(sum==12)
{
a=375;
b=362;
}
else if(sum==13)
{
a=330;
b=362;
}
else if(sum==14)
{
a=285;
b=362;
}
else if(sum==15)
{
a=240;
b=362;
}
else if(sum==16)
{
a=195;
b=362;
}
else if(sum==17)
{
a=285;
b=412;
sum=7;
U.play();
}
else if(sum==18)
{
a=105;
b=362;
}
else if(sum==19)
{
a=60;
b=362;
}
else if(sum==20)
{
a=15;
b=362;
}

else if(sum==21)
{
a=60;
b=240;
sum=42;
L.play();
}

else if(sum==22)
{
a=60;
b=320;
}


else if(sum==23)
{
a=105;
b=320;
}


else if(sum==24)
{
a=150;
b=320;
}

else if(sum==25)
{
a=195;
b=320;
}

else if(sum==26)
{
a=240;
b=320;
}

else if(sum==27)
{
a=285;
b=320;
}

else if(sum==28)
{
a=150;
b=60;
sum=84;
L.play();
}

else if(sum==29)
{
a=375;
b=320;
}

else if(sum==30)
{
a=400;
b=320;
}

else if(sum==31)
{
a=400;
b=280;
}
else if(sum==32)
{
a=375;
b=280;
}
else if(sum==33)
{
a=330;
b=280;
}
else if(sum==34)
{
a=285;
b=280;
}
else if(sum==35)
{
a=240;
b=280;
}
else if(sum==36)
{
a=195;
b=280;
}
else if(sum==37)
{
a=150;
b=280;
}

else if(sum==38)
{
a=105;
b=280;
}
else if(sum==39)
{
a=60;
b=280;
}
else if(sum==40)
{
a=15;
b=280;
}

else if(sum==41)
{
a=15;
b=240;
}
else if(sum==42)
{
a=60;
b=240;
}
else if(sum==43)
{
a=105;
b=240;
}
else if(sum==44)
{
a=150;
b=240;
}
else if(sum==45)
{
a=195;
b=240;
}
else if(sum==46)
{
a=240;
b=240;
}
else if(sum==47)
{
a=285;
b=240;
}
else if(sum==48)
{
a=330;
b=240;
}
else if(sum==49)
{
a=375;
b=240;
}
else if(sum==50)
{
a=400;
b=240;
}

else if(sum==51)
{
a=285;
b=150;
sum=67;
L.play();
}
else if(sum==52)
{
a=375;
b=195;
}
else if(sum==53)
{
a=330;
b=195;
}
else if(sum==54)
{
a=285;
b=280;
sum=34;
U.play();
}
else if(sum==55)
{
a=240;
b=195;
}
else if(sum==56)
{
a=195;
b=195;
}
else if(sum==57)
{
a=150;
b=195;
}
else if(sum==58)
{
a=105;
b=195;
}
else if(sum==59)
{
a=60;
b=195;
}
else if(sum==60)
{
a=15;
b=195;
}


else if(sum==61)
{
a=15;
b=150;
}
else if(sum==62)
{
a=60;
b=362;
sum=19;
U.play();
}
else if(sum==63)
{
a=105;
b=150;
}
else if(sum==64)
{
a=15;
b=195;
sum=60;
U.play();
}
else if(sum==65)
{
a=195;
b=150;
}
else if(sum==66)
{
a=240;
b=150;
}
else if(sum==67)
{
a=285;
b=150;
}
else if(sum==68)
{
a=330;
b=150;
}
else if(sum==69)
{
a=375;
b=150;
}
else if(sum==70)
{
a=400;
b=150;
}


else if(sum==71)
{
a=400;
b=15;
sum=91;
L.play();
}
else if(sum==72)
{
a=375;
b=110;
}
else if(sum==73)
{
a=330;
b=110;
}
else if(sum==74)
{
a=285;
b=110;
}
else if(sum==75)
{
a=240;
b=110;
}
else if(sum==76)
{
a=195;
b=110;
}
else if(sum==77)
{
a=150;
b=110;
}
else if(sum==78)
{
a=105;
b=110;
}
else if(sum==79)
{
a=60;
b=110;
}
else if(sum==80)
{
a=15;
b=15;
sum=100;
L.play();
}

else if(sum==81)
{
a=15;
b=60;
}
else if(sum==82)
{
a=60;
b=60;
}
else if(sum==83)
{
a=105;
b=60;
}
else if(sum==84)
{
a=150;
b=60;
sum=84;
}
else if(sum==85)
{
a=195;
b=60;
}
else if(sum==86)
{
a=240;
b=60;
}
else if(sum==87)
{
a=150;
b=320;
sum=24;
U.play();
}
else if(sum==88)
{
a=330;
b=60;
}
else if(sum==89)
{
a=375;
b=60;
}
else if(sum==90)
{
a=400;
b=60;
}

else if(sum==91)
{
a=400;
b=15;
}
else if(sum==92)
{
a=375;
b=15;
}
else if(sum==93)
{
a=330;
b=110;
sum=73;
U.play();
}
else if(sum==94)
{
a=285;
b=15;
}
else if(sum==95)
{
a=240;
b=110;
sum=75;
U.play();
}
else if(sum==96)
{
a=195;
b=15;
}
else if(sum==97)
{
a=150;
b=15;
}
else if(sum==98)
{
a=60;
b=110;
sum=79;
U.play();
}
else if(sum==99)
{
a=60;
b=15;
}
else if(sum==100)
{
a=15;
b=15;
}
if(sum>100)
sum=sum-rno;
repaint();
}
//SECOND PLAYER CODING
if(str1.equals("PLAYER 2"))
{
Random g1=new Random();
rno1=g1.nextInt(6);
rno1=rno1+1;
sum1=sum1+rno1;
if(sum1==1)
{
c=105;
d=280;
sum1=38;
L.play();
}
else if(sum1==2)
{
c=60;
d=412;
}
else if(sum1==3)
{
c=105;
d=412;
}
else if(sum1==4)
{
c=285;
d=362;
sum1=14;
L.play();
}
else if(sum1==5)
{
c=195;
d=412;
}
else if(sum1==6)
{
c=240;
d=412;
}
else if(sum1==7)
{
c=285;
d=412;
}

else if(sum1==8)
{
c=330;
d=412;
}

else if(sum1==9)
{
c=400;
d=280;
sum1=31;
L.play();
}

else if(sum1==10)
{
c=400;
d=412;
}

else if(sum1==11)
{
c=400;
d=362;
}

else if(sum1==12)
{
c=375;
d=362;
}
else if(sum1==13)
{
c=330;
d=362;
}
else if(sum1==14)
{
c=285;
d=362;
}
else if(sum1==15)
{
c=240;
d=362;
}
else if(sum1==16)
{
c=195;
d=362;
}
else if(sum1==17)
{
c=285;
d=412;
sum1=7;
U.play();
}
else if(sum1==18)
{
c=105;
d=362;
}
else if(sum1==19)
{
c=60;
d=362;
}
else if(sum1==20)
{
c=15;
d=362;
}

else if(sum1==21)
{
c=60;
d=240;
sum1=42;
L.play();
}

else if(sum1==22)
{
c=60;
d=320;
}


else if(sum1==23)
{
c=105;
d=320;
}


else if(sum1==24)
{
c=150;
d=320;
}

else if(sum1==25)
{
c=195;
d=320;
}

else if(sum1==26)
{
c=240;
d=320;
}

else if(sum1==27)
{
c=285;
d=320;
}

else if(sum1==28)
{
c=150;
d=60;
sum=84;
L.play();
}

else if(sum1==29)
{
c=375;
d=320;
}

else if(sum1==30)
{
c=400;
d=320;
}

else if(sum1==31)
{
c=400;
d=280;
}
else if(sum1==32)
{
c=375;
d=280;
}
else if(sum1==33)
{
c=330;
d=280;
}
else if(sum1==34)
{
c=285;
d=280;
}
else if(sum1==35)
{
c=240;
d=280;
}
else if(sum1==36)
{
c=195;
d=280;
}
else if(sum1==37)
{
c=150;
d=280;
}

else if(sum1==38)
{
c=105;
d=280;
}
else if(sum1==39)
{
c=60;
d=280;
}
else if(sum1==40)
{
c=15;
d=280;
}

else if(sum1==41)
{
c=15;
d=240;
}
else if(sum1==42)
{
c=60;
d=240;
}
else if(sum1==43)
{
c=105;
d=240;
}
else if(sum1==44)
{
c=150;
d=240;
}
else if(sum1==45)
{
c=195;
d=240;
}
else if(sum1==46)
{
c=240;
d=240;
}
else if(sum1==47)
{
c=285;
d=240;
}
else if(sum1==48)
{
c=330;
d=240;
}
else if(sum1==49)
{
c=375;
d=240;
}
else if(sum1==50)
{
c=400;
d=240;
}

else if(sum1==51)
{
c=285;
d=150;
sum1=67;
L.play();
}
else if(sum1==52)
{
c=375;
d=195;
}
else if(sum1==53)
{
c=330;
d=195;
}
else if(sum1==54)
{
c=285;
d=280;
sum1=34;
U.play();
}
else if(sum1==55)
{
c=240;
d=195;
}
else if(sum1==56)
{
c=195;
d=195;
}
else if(sum1==57)
{
c=150;
d=195;
}
else if(sum1==58)
{
c=105;
d=195;
}
else if(sum1==59)
{
c=60;
d=195;
}
else if(sum1==60)
{
c=15;
d=195;
}


else if(sum1==61)
{
c=15;
d=150;
}
else if(sum1==62)
{
c=60;
d=362;
sum1=19;
U.play();
}
else if(sum1==63)
{
c=105;
d=150;
}
else if(sum1==64)
{
c=15;
d=195;
sum1=60;
U.play();
}
else if(sum1==65)
{
c=195;
d=150;
}
else if(sum1==66)
{
c=240;
d=150;
}
else if(sum1==67)
{
c=285;
d=150;
}
else if(sum1==68)
{
c=330;
d=150;
}
else if(sum1==69)
{
c=375;
d=150;
}
else if(sum1==70)
{
c=400;
d=150;
}


else if(sum1==71)
{
c=400;
d=15;
sum1=91;
L.play();
}
else if(sum1==72)
{
c=375;
d=110;
}
else if(sum1==73)
{
c=330;
d=110;
}
else if(sum1==74)
{
c=285;
d=110;
}
else if(sum1==75)
{
c=240;
d=110;
}
else if(sum1==76)
{
c=195;
d=110;
}
else if(sum1==77)
{
c=150;
d=110;
}
else if(sum1==78)
{
c=105;
d=110;
}
else if(sum1==79)
{
c=60;
d=110;
}
else if(sum1==80)
{
c=15;
d=15;
sum1=100;
L.play();
}

else if(sum1==81)
{
c=15;
d=60;
}
else if(sum1==82)
{
c=60;
d=60;
}
else if(sum1==83)
{
c=105;
d=60;
}
else if(sum1==84)
{
c=150;
d=60;
sum1=84;
}
else if(sum1==85)
{
c=195;
d=60;
}
else if(sum1==86)
{
c=240;
d=60;
}
else if(sum1==87)
{
c=150;
d=320;
sum1=24;
U.play();
}
else if(sum1==88)
{
c=330;
d=60;
}
else if(sum1==89)
{
c=375;
d=60;
}
else if(sum1==90)
{
c=400;
d=60;
}

else if(sum1==91)
{
c=400;
d=15;
}
else if(sum1==92)
{
c=375;
d=15;
}
else if(sum1==93)
{
c=330;
d=110;
sum1=73;
U.play();
}
else if(sum1==94)
{
c=285;
d=15;
}
else if(sum1==95)
{
c=240;
d=110;
sum1=75;
U.play();
}
else if(sum1==96)
{
c=195;
d=15;
}
else if(sum1==97)
{
c=150;
d=15;
}
else if(sum1==98)
{
c=60;
d=110;
sum1=79;
U.play();
}
else if(sum1==99)
{
c=60;
d=15;
}
else if(sum1==100)
{
c=15;
d=15;
}
if(sum1>100)
sum1=sum1-rno1;
repaint();
}
if(sum==100)
{
msg="PLAYER 1 WINS";
m.play();
}
else if(sum1==100)
{
msg="PLAYER 2 WINS";
m.play();
}
}

public void paint(Graphics g)
{
String s=String.valueOf(rno);
String s1=String.valueOf(rno1);
g.drawString(s,635,100);
g.drawString(s1,735,100);
g.drawImage(img,0,0,this);    				// start=15,count=45;start=10,count=50;
g.drawImage(x,a,b,this);
g.drawImage(y,c,d,this);
g.drawString(msg,635,150);				//1168 LINES
}

}
public class refresher{
public static void main (String[]args){
    
//Intro
String fname = "Kamaso";
String sname = "Bits";
System.out.println( fname .concat(sname));

//Java conditions 
//If statements
if(16<20){
    System.out.println("True");}

// multiple variables
int q = 300;
int w = 3;
if(q>w){
System.out.println("q is greater than w" );
}

//if else statements
int a=20;
int b=21;
if (a>b){
System.out.println("True");
}
else{
System.out.println("False");
}

//else if statements

int p = 90;
if(p<20){
    System.out.println("False");
}
else if(p>99){
System.out.println("True");
}
else{ System.out.println("Programing For the future");
}

// Switch Statement

int day = 5;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}




}
}
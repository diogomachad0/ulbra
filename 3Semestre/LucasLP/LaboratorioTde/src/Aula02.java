public class Aula02 {
public static void main(String[] args) {
int x = 3;
if(x > 4)
x = 1;
x = 0;
switch(x) {
case 1: System.out.println(1);
case 0: System.out.println(0);
case 2: System.out.println(2);
break;
case 3: System.out.println(3);
default: System.out.println(4);
break;
}
}
}
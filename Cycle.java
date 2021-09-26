class Cycle{
String name;
String color;
void quality(){
System.out.println(color+" "+name+"  cycle has good quality...!");
}
void performance(){
System.out.println(color+" "+name+" cycle has best performance...!");
}
public static void main(String[] args){
Cycle cycle=new Cycle();
cycle.name="Hero";
cycle.color="Black";
cycle.quality();
cycle.performance();
}
}
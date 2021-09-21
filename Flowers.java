class Flowers{
String name;
String color;
int noOfpetals;
void bloom(){
System.out.println(color+" "+name+" is blooming...!");
}
void shedfragrance(){
System.out.println(color+" "+name+" is sheding fragrance...!");
}
public static void main(String[] args){
Flowers rose=new Flowers();
rose.name="Rose";
rose.color="Yellow";
rose.noOfpetals=16;
rose.bloom();
rose.shedfragrance();
}
}
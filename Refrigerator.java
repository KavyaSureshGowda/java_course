class Refrigerator{
String name;
String noOfstars;
void quality(){
System.out.println(name+" "+noOfstars+" has good quality...!");
}
void capacity(){
System.out.println(name+" "+noOfstars+" has high capacity...!");
}
public static void main(String[] args){
Refrigerator refrigerator =new Refrigerator();
refrigerator.name="LG";
refrigerator.noOfstars="5 star";
refrigerator.quality();
refrigerator.capacity();
}
}


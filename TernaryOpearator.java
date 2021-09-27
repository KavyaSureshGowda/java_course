class TernaryOpearator{
public static void main(String[] args){
int x=50;
int y=100;
int z=150;
int result=z>(x>y?x:y)?z:((x>y)?x:y);
System.out.println("largest of x , y and z is:"+result);
}
}
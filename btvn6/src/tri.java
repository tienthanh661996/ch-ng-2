
public class Triangle extends Shape{
    public  class  TriangLe(double a,double b, double c) {
        super (a,b,c);
        public double getArena(){
            double p=getPerimeter()/2;
            return Math.sqrt(p*(p-super.getA())*p-super.getB())*p-super.getC()));
            }

        @Override
        public String toString() {
            return "TriangLe"+"a="+super.getA()+"b="+super.getB()+"c="+super.getC();
        }

        public double getPerimeter() {
            return super.getA()+super.getB()super.getC();

        }
    }}
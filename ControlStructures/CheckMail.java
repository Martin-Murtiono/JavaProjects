public class CheckMail {
    public int dim1;
    public int dim2;
    public int dim3;
    public int lbs;

    public CheckMail(){
    }

    public CheckMail(int a, int b, int c, int weight){
        dim1 = a;
        dim2 = b;
        dim3 = c;
        lbs = weight;
    }
    public void findLength(){
        int a;
        if (dim2 > dim1) {
            a = dim1;
            dim1 = dim2;
            dim2 = a;
        }
        if(dim3 > dim1){
           a = dim1;
           dim1 = dim3;
           dim3 = a;
        }
            System.out.println("Length: " + dim1);
            System.out.println("Other 2 dimensions: " + dim2 + " " + dim3);
            System.out.println("Weight: " + lbs + " lbs");
    }
    public boolean calcCirc(){
        int circ = 2*(dim2+dim3);
        if ((dim1+circ)>100){
            return true;
        }
        return false;
    }
    public boolean calcWeight(){
        if(lbs>70){
            return true;
        }
        return false;
    }
    public void output(){
        if (calcCirc()&&calcWeight()){
            System.out.println("Box is too large and too heavy");
        } else if (calcCirc()){
            System.out.println("Box is too large");
        } else if (calcWeight()){
            System.out.println("Box is too heavy");
        } else if (!calcCirc()&&!calcWeight()){
            System.out.println("Box is acceptable");
        }
    }
}

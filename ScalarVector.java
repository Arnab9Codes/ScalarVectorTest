
package scalarvector;

/**
 *
 * @author Asus
 */
public class ScalarVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    public ScalarVector(){}// constructor
    //check if 2 scalar vectors are equal
    //function name: equal
    //input: 2 scalar vectors
    //return: True->2 scalars are equal, false if 
    //not equal
    public static boolean equal(int[]a, int[]b){
        // chceks if input is null
        if ((a==null)||(b==null)){
            throw new IllegalArgumentException("null vectors provided.");
        }
        //checks if lengths are equal?
        if(a.length != b.length){
            return false;
        }
        //checking individual elements
        for(int i=0; i<a.length; i++){
            if(a[i]!=b[i]){//
                return false;
            }
        }

        return true;
    }
    
    /**
     Scalar multiplication of 2 vectors
    */
    public static int scalarVectorMultiplication(int []a,int []b){
        //checks if values are null
        if ((a==null)){
            throw new IllegalArgumentException("null argument of a");
        }
        if (b==null){
            throw new IllegalArgumentException("null argument of b");
        }
        if ((a==null)||(b==null)){
            throw new IllegalArgumentException("numm arguments of a and b ");
        }
        //checks if lengths are equal
        if (a.length != b.length ){
            throw new IllegalArgumentException(
                    "different length of vectors,length of a: "+a.length+
                            "length of b: "+b.length+" "
            );
        }
        //Scalar multiplication
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum+a[i]*b[i];//sum+=a[i]*b[i]
        }
        
        return sum;
    }
    
    
}

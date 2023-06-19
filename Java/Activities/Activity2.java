package Activities;

public class Activity2 {
    public static void main(String args[]){
        int sampleInputArray[]={10, 77, 10, 54, -11, 10};
        int res=0;
        for (int i=0;i<sampleInputArray.length;i++) {
            if (sampleInputArray[i] == 10)
                res = res + 10;
        }
        if(res==30)
            System.out.println("sum of all the 10's in the array is exactly 30.");
        else
            System.out.println("sum of all the 10's in the array is not equal to 30.");

    }
}

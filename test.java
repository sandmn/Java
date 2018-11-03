public class ArrayUtils{
    //计算数组中的最大值
    public static int arrayMaxElement(int[] data){
        int mymax = data[0];
        for(int i = 0;i < data.length;i++){
            if(data[i] > mymax){
                mymax = data[i];
            }
        }
        return mymax;
    }
}

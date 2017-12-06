public class MinilabArrays
{
    private static int[] array1d;
    private static double[][] array2d;

public static double mean1d(int[] userArray1d) //Static Meathod for userArray1d
{
    array1d = userArray1d;
    double sum = 0;
    for (int i = 0; i < array1d.length; i++){
        sum += array1d[i];
    }
    return sum / array1d.length;
}
public static double sum2d(double[][] userArray2d) //Static Meathod for userArray2d
{
    array2d = userArray2d;
    double sum = 0;
    for (int r = 0; r < array2d.length; r++){
        for (int c = 0; c < array2d[r].length; c++){
            sum += array2d[r][c];

        }
    }
    return sum;
}
}

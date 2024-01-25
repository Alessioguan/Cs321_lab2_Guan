

public class Main {
    public static void main(String[] args) {
        displayName();
        int[] arr1D1 = {1,3,5,7,9};
        int[] arr1D2 = {1,3,5,7};
        int[][] arr2D1={{1,2},{3,2},{5,6},{7,8}};
        int[][] arr2D2={{1,2,3},{3,4,5}};
        int[][] Matrix1={{1,2},{4,1}};
        int[][] Matrix2={{2,2},{2,2}};
        displayArray(arr1D1);
        displayArray(arr1D2);
        Q3display2DArray(arr2D1);
        Q3display2DArray(arr2D2);
        System.out.println(check1DArrayEqual(arr1D1,arr1D2));
        System.out.println(check2DArrayEqual(arr2D1,arr2D2));
        System.out.println(sum1Darray(arr1D1));
        System.out.println(sum2Darray(arr2D1));
        display2DArray(multipy2Matrices(Matrix1,Matrix2));


    }


    ///Print your full name
    public static void displayName(){
        System.out.println("Q1 Print your full name :");
        System.out.println("Guan Wang");
    }

    ///Print a 1D array
    public static void displayArray(int[] array){
        System.out.println("Q2 Print a 1D array :");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    ///Print a 2D array
    public static void Q3display2DArray(int[][] array){
        System.out.println("Q3 Print a 2D array :");
        display2DArray(array);
    }

    public static void display2DArray(int[][] array){
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    ///Determine if two 1-dimensional arrays are equal (return boolean)
    public static boolean check1DArrayEqual(int[] array1, int[] array2){
        System.out.println("Q4 Determine if two 1-dimensional arrays are equal :");
        if(array1.length != array2.length)
        {
           return false;
        }
        else{
            for(int i=0; i<array1.length; i++)
            {
                if(array1[i] != array2[i])
                    return false;
            }
        }
        return true;
    }

    public static boolean check2DArrayEqual(int[][] array1, int[][] array2){
        System.out.println("Q5 Determine if two 2-dimensional arrays are equal :");
        if(array1.length != array2.length)
        {
           return false;
        }
        else{
            for(int i=0; i<array1.length; i++)
            {
                if(array1[i].length != array2[i].length){
                    return false;
                }
                else{
                    for(int j=0; j<array1[i].length; j++)
                    {
                        if(array1[i][j] != array2[i][j])
                            return false;
                    }
                }

            }
        }
        return true;
    }

    ///Q6 Sum of 1-dimensional array
    public static int sum1Darray(int[] array){
        System.out.println("Q6 Sum of 1-dimensional array is :");
        int sum = 0;///question : dynamic variable of java
        for(int i=0; i<array.length; i++)
        {
            sum = sum + array[i];
        }
        return sum;
    }

    ///Q7 Sum of 2-dimensional array
    public static int sum2Darray(int[][] array){
        System.out.println("Q7 Sum of 2-dimensional array is :");
        int sum = 0;///question : dynamic variable of java

        for(int i=0; i<array.length; i++)
            for(int j=0;j<array[i].length; j++)
            {
                sum = sum + array[i][j];
            }
        return sum;
    }

    ///Q8 Multiply two matrices
    public static int[][] multipy2Matrices(int[][] array1,int[][] array2) {
        System.out.println("Q8 first matrices are :");
        display2DArray(array1);
        System.out.println("Second matrices are :");
        display2DArray(array2);
        int[][] multipied2Darray = new int[array1.length][array2[1].length];

        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1[i].length; j++){
                for(int k=0; k<array2[j].length; k++){
                    multipied2Darray[i][k] += array1[i][j] * array2[j][k];
                }
            }
        }
        System.out.println("the multiplication of 2 matrices are :");

        return multipied2Darray;
    }


}
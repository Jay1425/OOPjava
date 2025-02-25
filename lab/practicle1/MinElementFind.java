import java.util.Random;

public class MinElementFind
{
    public static void main(String args[])
    {
         int A[][] = {
            {25,2,5,66},
            {8,6,41,2},
            {47,9,7,3},
            {54,99,1,65}
        };

        int[] min = MinElement(A, 4, 4);

        System.out.println("minimum element: "+min[0]+" with index i = "+min[1]+" and index j = "+min[2]);

    }

    public static int[] MinElement(int Arr[][], int row, int col)
    {
        int min=Arr[0][0];
        int ind[] = new int[2];


        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col;j++)
            {
                if(Arr[i][j]<min)
                {
                    min = Arr[i][j];
                    ind[0] = i;
                    ind[1] = j;
                }

            }
        }
        return new int[]{min, ind[0], ind[1]};
    }
}

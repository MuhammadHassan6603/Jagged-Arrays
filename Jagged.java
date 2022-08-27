class  Jagged
{
    public static void main(String[] args) {
        int Jag[][]=new int[3][];
        Jag[0]=new int[]{1,2,3,4,5};
        Jag[1]=new int[]{6};
        Jag[2]=new int[]{7,4,5,7,3,2,4,5,3,2};
        for(int i=0;i<Jag.length;i++)
        {
            for(int j=0;j<Jag[i].length;j++)
            {
                System.out.print(Jag[i][j] + " ");
            }
            System.out.println();
        }
    }
}
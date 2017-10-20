
/**
 *c'est une classe qui travaille sur les vecteurs
 * @author Hichem and Djamel
 */


public class VectorHelper
{

    /**
     * les trier du plus petit au plus grand
     * @param tab:notre vecteur
     */
     public void trier(int[] tab)
     {
         int l=tab.length,x;
         if (l>1)
         {
          for( int i=0; i<=l-2 ; i++ )
          {
              for ( int j=i+1 ; j<=l-1 ; j++ )
              {
                  if (tab[i]>tab[j])
                  {
                   x=tab[i];tab[i]=tab[j];tab[j]=x;
                  }
              }
          }
         }
     }

    /**
     * *pour calculer la sommes de 2 vecteurs
     * @param tab1 vedcteur numero 1
     * @param tab2 vecdteur numero 2
     * @return une autre vecteur qui contient la somme
     * @throws Exception  si les desu vecteurs sont de tailles differentes
     */
     public int[] somme(int[] tab1 , int[] tab2 ) throws Exception
     {    int[] tab3=null;
         if ( tab1.length != tab2.length )
             throw new Exception("erreur");
          else
         {    tab3= new int[tab1.length];
             for( int i=0; i<=tab1.length-1 ; i++ )
                 tab3[i]=tab1[i]+tab2[i];
         }

        return tab3 ;
     }

    /**
     * * inverser les element du vecteur
     * @param tab un vecteur
     */
     public void inverser( int[] tab )
     {   int x;
         int l=(tab.length)/2;
         for (int i=0 ; i<=l ; i++ )
         {
             x=tab[i];tab[i]=tab[tab.length-i-1];tab[tab.length-i-1]=x;
         }
     }

    /**
     * * trouver le max et le min dans le vecteur
     * @param tab un vecteur
     * @return un vecteur qui contien le maximaum et le minimaum
     */
     public int[] maxMin (int[] tab)
     {
         int[] tab2 = new int[2];
         if (tab==null)
         {
             tab2[0]=0;tab2[1]=0;
         }
         else
         {
          int[] tab3=new int[tab.length];
          for (int i=0; i<tab.length ;i++)
          tab3[i]=tab[i];
          trier(tab3);
          tab2[0]=tab3[0];
          tab2[1]=tab3[tab.length-1];
         }
      return tab2 ;
     }

    /**
     * multiplier les valeurs du vecteur par 2
     * @param tab vecteur
     */
     public void fonction(int[] tab)
     {
         if (tab!=null)
             for(int i = 0 ;i<tab.length ; i++)
             {
                 tab[i]=tab[i]*2;
             }


     }

    /**
     * afficher les valeurs du vecteur
     * @param tab vecteur
     */
     public void afficher(int[] tab)
     {
         for (int i = 0; i < tab.length ; i++)
         {
          System.out.print(tab[i]+" ");
         }
         System.out.println();

     }

public static void main ( String args[] )
    {
        VectorHelper vector = new VectorHelper();
        int[] tab= {5,6,2,4,8,3,10};
        vector.afficher(tab);

        vector.afficher(vector.maxMin(tab));

        vector.inverser(tab);
        vector.afficher(tab);

        vector.trier(tab);
        vector.afficher(tab);


    }


}

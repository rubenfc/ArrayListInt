import java.util.ArrayList;

/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    private int[] array;
    public ArrayListInt()
    { 
        array = new int[0];
    }
    
    public void add(int elemento)
    {
        int tamañoDelArray = array.length + 1;
        int[] arrayNuevo = new int[tamañoDelArray];
        int cont = 0; 
        while(cont < array.length)
        {
            arrayNuevo[cont] = array[cont];
            cont++;
        }
        arrayNuevo[array.length] = elemento;
        array = arrayNuevo;
    }
}

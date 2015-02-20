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
    
    public void add(int index, int elemento)
    {
        if(array.length  > index)
        {
            array[index] = elemento;
        }
        else
        {
            System.out.println("error, el indice intruducido, es mayor que el tamaño de la colección");
        }
    }
    
    public void clear()
    {
        int[] arrayACero = new int[0];
        array = arrayACero;
    }
    
    public boolean contains(int elemento)
    {
        boolean hayElemento = false;
        if(array.length  > elemento)
        {
            hayElemento = true;
        }
        return hayElemento;
    }
    
    public int get(int index)
    {
        int valor = 0;
        if(array.length  > index)
        {
            valor = array[index];
        }
        else
        {
            valor = -1;
        }
        return valor;
    }
}

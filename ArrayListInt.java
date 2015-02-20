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
        int[] arrayNuevo = new int[array.length +1];
        if(array.length  > index)
        { 
            int cont = 0;
            int indice = 0;
            while(cont < array.length)
            {
                if(cont == index)
                {
                    arrayNuevo[indice] = elemento;
                }
                else
                {
                    arrayNuevo[indice] = array[cont];
                }
                cont++;
                indice++;
            }
        }
        array = arrayNuevo;
    }
    
    public void set(int index, int elemento)
    {
        if(array.length  > index)
        {
            array[index] = elemento;
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
    
    public int indexOf(int elemento)
    {
        int cont = 0;
        int indice = -1;
        while(cont < array.length )
        {
            if(array[cont] == elemento)
            {
                indice = cont;
            }
            cont++;
        }
        return indice;
    }
    
    public boolean isEmpty()
    {
        boolean noElementos = false;
        if(array.length == 0)
        {
            noElementos = true;
        }
        return noElementos;
    }
    
    public int remove(int index)
    {
        int elemento  = -1;
        int cont = 0;
        int[] arrayNuevo =  new int[array.length + 1];
        if(array.length > index && index > 0)
        {
            while(cont < array.length)
            {
                if(index == cont)
                {
                    elemento = array[cont];
                }
                else
                {
                    arrayNuevo[cont] = array[cont];
                }
                cont++;
            }
        }
        return elemento;
    }
    
    public int size()
    {
        int tamaño = array.length;
        return tamaño;
    }
}

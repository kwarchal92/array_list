package array_list;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        ArrayList lista = new ArrayList(); //utworzenie obiektu klasy ArrayList

        lista.add(20); //dodawanie kolejnych elementów do listy o nazwie lista
        lista.add(45);
        lista.add(-68);
        lista.add(11);
        lista.add(-43);

        System.out.println("Elementy nie posortowane.");

        for (int i = 0; i < lista.size(); i++)
        {
            if (i < lista.size() - 1)
                System.out.println(lista.get(i) + ", ");
            else
                System.out.println(lista.get(i) + ". ");
        }

        System.out.println();
        Collections.sort(lista); //sortowanie listy

        System.out.println("Elementy posortowane.");

        for (int i = 0; i < lista.size(); i++)
        {
            if (i < lista.size() - 1)
                System.out.println(lista.get(i) + ", ");
            else
                System.out.println(lista.get(i) + ".");
        }

        System.out.println();
        lista.remove(1); //usunięto drugi elenent listy
        System.out.println("Usunięto drugi element listy i dodano nowy element do listy");

        lista.add(10); //dodano nowy element do listy
        System.out.println("Elementy nie posortowane po usunieciu z listy i dodaniu nowego elementu");

        for (int i = 0; i < lista.size(); i++)
        {
            if (i < lista.size() - 1)
                System.out.println(lista.get(i) + ", ");
            else
                System.out.println(lista.get(i) + ".");
        }

        Collections.sort(lista); //ponowne sortowanie listy

        
    }
}

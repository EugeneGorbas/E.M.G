package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Autor a1 = new Autor("Eugene","e@mail.ru", 'M');
        System.out.println(a1);
        System.out.println(a1.getName("Mike"));
        a1.setEmail("r@gmail.com");
        System.out.println(a1);
    }
}

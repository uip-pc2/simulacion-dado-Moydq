package com.company;

import java.util.ArrayList;

/**
 * Created by moydq on 25/04/2017.
 */
public class Dado {
    private ArrayList<Integer> listadelanzamientos = new ArrayList();

    public Dado() {
    }

    public int lanzar() {
        int num = (int)(Math.random() * 6.0D + 1.0D);
        this.setLanzamientos(num);
        System.out.println();
        System.out.println("lanzamiento... ");
        System.out.println("cayo el numero:  ");
        return num;
    }

    public void resultados() {
        for(int x = 0; x < this.listadelanzamientos.size(); ++x) {
            System.out.println("Lanzamiento #" + (x + 1) + " El Resultado fue: " + this.listadelanzamientos.get(x));
        }

    }

    public void setLanzamientos(int lanzamientos) {
        this.listadelanzamientos.add(Integer.valueOf(lanzamientos));
    }
}

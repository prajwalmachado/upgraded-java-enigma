package Problems_DSA;
import java.io.*;
import java.util.*;

/*
* Given an array A of N pairs of integers. The task is to sort the array on the basis of first element.
* */
class Pair{
    int x; int y;
    public Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
}

class custom_Compare {
    public static void sortPairs(Pair arr[],int N){
        Comparator<Pair> comp = new Comparator<Pair>() {

            public int compare(Pair a, Pair b) {

                return Integer.compare(a.x, b.x);

            }

        };
    }
}

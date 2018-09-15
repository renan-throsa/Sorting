package principal;

import simple_sorting.BubbleSort;
import simple_sorting.InsertionSort;
import simple_sorting.SelectionSort;
import advanced_sorting.MergeSort;

import java.util.Random;

public class Main {

    static int MAX = 10000;
    static int MIN = 1;
    static Random random = new Random();
    static BubbleSort Bubble;
    static SelectionSort Selection;
    static InsertionSort Insertion;
    static MergeSort Merge;


    public static void main(String[] args) {


        // TODO Auto-generated method stub

        //----------------------------------------------------------
        {
            Bubble = new BubbleSort(MAX);
            for (int i = 0; i < MAX; i++) {
                int randomNum = random.nextInt((MAX - MIN) + 1) + MIN;
                Bubble.inserte(randomNum);
            }
            long startTime = System.currentTimeMillis();
            Bubble.sort();
            long stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;
            System.out.println("Time taken for Bubble Sort: " + elapsedTime);

        }
        //----------------------------------------------------------
        {
            Selection = new SelectionSort(MAX);
            for (int i = 0; i < MAX; i++) {
                int randomNum = random.nextInt((MAX - MIN) + 1) + MIN;
                Selection.insert(randomNum);
            }
            long startTime = System.currentTimeMillis();
            Selection.sort();
            long stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;
            System.out.println("Time taken for Selection Sort: " + elapsedTime);
        }
        //----------------------------------------------------------
        {
            Insertion = new InsertionSort(MAX);
            /*
            for (int i = 0; i < MAX; i++) {
                int randomNum = random.nextInt((MAX - MIN) + 1) + MIN;
                Insertion_array.insert(randomNum);
            }
            */
            Insertion.insert(10);
            Insertion.insert(7);
            Insertion.insert(4);
            Insertion.insert(2);
            Insertion.insert(9);

            long startTime = System.currentTimeMillis();
            Insertion.sort();
            Insertion.display();
            long stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;
            System.out.println("Time taken for Insertion Sort: " + elapsedTime);
        }

        //----------------------------------------------------------
        {
            Merge = new MergeSort(MAX);
            for (int i = 0; i < MAX; i++) {
                int randomNum = random.nextInt((MAX - MIN) + 1) + MIN;
                Merge.inserte(randomNum);
            }
            long startTime = System.currentTimeMillis();
            Merge.sort();
            long stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;
            System.out.println("Time taken for Insertion Sort: " + elapsedTime);

        }

    }
}
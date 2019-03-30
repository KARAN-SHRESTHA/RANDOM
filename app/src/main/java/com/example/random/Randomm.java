package com.example.random;

import java.util.Random;

public class Randomm{

        public int RAN()
        {
            Random rand = new Random();

            // Obtain a number between [0 - 49].
            int n = rand.nextInt(101);

            // Add 1 to the result to get a number from the required range
            // (i.e., [1 - 50]).
            n += 1;

            return n;
        }


        public int RAN1()
        {
            Random rand = new Random();

            // Obtain a number between [0 - 49].
            int n = rand.nextInt(101);

            // Add 1 to the result to get a number from the required range
            // (i.e., [1 - 50]).
            n += 1;

            return n;
        }

}

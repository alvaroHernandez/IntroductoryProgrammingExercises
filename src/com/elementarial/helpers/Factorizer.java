package com.elementarial.helpers;

import java.util.LinkedList;

/**
 * Created by alvarohernandez on 5/23/17.
 */
public class Factorizer {

    public LinkedList<Integer> factors(int n){
        LinkedList<Integer> lowerFactors = new LinkedList<>();
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                if(i*i>n)
                    break;
                //As shown in the example, we just store the lower factors.
                lowerFactors.add(i);
            }
        }
        return lowerFactors;
    }
}

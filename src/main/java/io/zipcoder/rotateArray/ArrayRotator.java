package io.zipcoder.rotateArray;

import java.util.ArrayList;

public class ArrayRotator<E> extends ArrayList{



    public void rotateArray(int numOfPositions){
        for(int i = 0; i < numOfPositions; i++){
            this.add(this.get(0));
            this.remove(0);
        }
    }

    public static void main(String[] args){
        ArrayRotator<String> test = new ArrayRotator<String>();

        System.out.println("Original List: ");
        for(int i = 0; i < 10; i ++){
            System.out.print("[" + i + "], ");
            test.add(Integer.toString(i));
        }

        int num = (int)Math.round(Math.random() * 10);
        System.out.print("\n\nRotating by a random number (" + num + "): \n");
        test.rotateArray(num);

        for(int j = 0; j < test.size(); j++){
            System.out.print("[" + test.get(j) + "], ");
        }
    }
}

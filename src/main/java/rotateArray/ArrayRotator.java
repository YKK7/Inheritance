package rotateArray;

import java.util.ArrayList;
import java.util.Scanner;

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

        Scanner input = new Scanner(System.in);
        System.out.print("\n\nEnter number of positions to rotate: ");
        test.rotateArray(input.nextInt());

        for(int j = 0; j < test.size(); j++){
            System.out.print("[" + test.get(j) + "], ");
        }
    }
}

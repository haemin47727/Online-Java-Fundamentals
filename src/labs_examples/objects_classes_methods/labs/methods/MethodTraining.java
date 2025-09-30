package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {

    public static void main(String[] args) {
        int x = 5;
        int z = overload(5);
        System.out.println(z);
        Toy a = new Toy("Jim", 5);
        a.printName();

        int large = largest(4, 9, 9, 6);
        System.out.println("largest number is " + large);
        consonants("apple");
        int[] numb = {4, 6, 50, 157, 3};
        int[] result = numbers(numb);
        System.out.println(Arrays.toString(result));
        ArrayList<Integer> list = arrayList(450, 10, 5);
        System.out.println(list);
        int[] reversing = {2, 5, 10, 50};
        int[] eighth = reverse(reversing);
        System.out.println(Arrays.toString(eighth));
    }

    public static int[] reverse(int[] a) {
        int temp = 0;
        for (int i = 0; i <= (a.length - 1) / 2; i++) {

            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;

        }
        return a;
    }

    public static ArrayList<Integer> arrayList(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> z = new ArrayList<>();
        z.add(10);
        z.add(50);
        z.add(350);
        z.add(399);
        ArrayList<Integer> x = new ArrayList<>();
        for (int numb : z) {
            if (numb % divisor1 == 0 && numb % divisor2 == 0) {
                x.add(numb);
            }
        }
        return x;
    }

    public static int[] numbers(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int element : a) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        return new int[]{min, max};


    }

    public static void consonants(String word) {
        String vowels = "aeiouAEIOU";
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            // if the letters are not vowels print length of consonants
            char letter = word.charAt(i);
            System.out.println(letter);

            if (vowels.indexOf(letter) == -1) {
                counter++;
            }
        }

        System.out.println("counter is " + counter);


    }


    public static int overload(int a) {
        return (a * 5);
    }

    public static int overload(int a, int b) {
        return (a / b);
    }

    public static int largest(int a, int b, int c, int d) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        return max;


    }

}





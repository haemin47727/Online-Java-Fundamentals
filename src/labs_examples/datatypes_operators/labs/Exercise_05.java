package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a || b){
            boolean c = true;
            System.out.println(c);
            System.out.println("a or b is true");
        }
        // write your code below
        if (b && a) {
            System.out.println("a and b are both true");
        }
    }

}


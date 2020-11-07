package sec3_Operators;

public class lesson32_CompoundAssignmentOperators {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        // +=, -=, /=, *=
        x= x*y; //simple assignment
        x *= y; //compound assignment

        int c = 4;
        int d = (c=2); //c = 2, d = 2

    }
}

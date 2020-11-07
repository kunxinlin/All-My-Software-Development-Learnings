package sec4_BasicControlFlow;

public class lesson44_ForLoops {
    public static void main(String[] args) {
        int a = 1000;

        //infinite forloop
//        for(;;){
//            System.out.println(a++);
//        }

        //can have multiple assignments and conditionals
        for(int x=0, y = 1, z = 2; x<3 || y==1; x++, y--, z=y+4)
        {
            System.out.println(z);
        }

        for(int i = 0; i<10;){
            i=++i; //basically is i=i for some reason the ++ is useless in this case
            System.out.println(i); //infinite loop
        }
    }
}

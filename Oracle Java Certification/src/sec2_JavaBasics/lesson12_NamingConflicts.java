package sec2_JavaBasics; //cant import from default packages, so files in the src directory.

/* which ever one is first
//import java.util.Date;
//import java.sql.Date;
*/

/* use the one that is more specific, not the wildcard import
//import java.util.*;
//import java.sql.Date;
*/

// compile error, doesn't know which to use
/*
import java.util.*;
import java.sql.*;
 */

public class lesson12_NamingConflicts {

    public static void main(String[] args) {
        //Date date;

        //solution
        java.util.Date date;
        java.sql.Date date2;
    }
}

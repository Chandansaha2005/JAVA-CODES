public class Nested_loop {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {// OUTER LOOP

            for (int j = 1; j <= 3; j++) {// INNER LOOP

                System.out.println(i + " " + j);

            }

        }

    }

}

// WORKING :---

/*
 * /* WHEN I = 1:-
 * J=1
 * J=2
 * J=3
 * J=4(J LOOP END)
 * 
 * /* NEXT I = 2:-
 * J=1
 * J=2
 * J=3
 * J=4(J LOOP END)
 * 
 * /* NEXT I = 3:-
 * J=1
 * J=2
 * J=3
 * J=4(J LOOP END)
 * 
 * NEXT I =4 (I LOOP END)
 */

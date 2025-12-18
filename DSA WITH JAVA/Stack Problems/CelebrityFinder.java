import java.util.Stack;

public class CelebrityFinder {
    public static int celebrity(int mat[][]) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < mat.length; i++)
            st.push(i);
        while (st.size()>1) {
            int a = st.pop();
            int b = st.pop();
            boolean af =true,bf=true;
            if(mat[a][b]==1)af=false;
            else bf = false;
            if(mat[b][a]==1)bf=false;
            else af = false;
            if(af)st.push(a);
            if(bf)st.push(b);
        }
        if(st.isEmpty())return-1;
        int celeb=st.pop();
        for (int i = 0; i < mat.length; i++) {
            if(i==celeb)continue;
            if(mat[i][celeb]==0)return-1;
        }
        for (int i = 0; i < mat.length; i++) {
            if(i==celeb)continue;
            if(mat[celeb][i]==1)return-1;
        }
        return celeb;
    }

    public static void main(String[] args) {
        int[][] mat1 = {
                { 1, 1, 0 },
                { 0, 0, 0 },
                { 0, 1, 0 }

        };

        int[][] mat2 = {
                { 1, 1 },
                { 1, 1 }
        };

        System.out.println("Celebrity in mat1: " + celebrity(mat1));
        System.out.println("Celebrity in mat2: " + celebrity(mat2));
    }
}

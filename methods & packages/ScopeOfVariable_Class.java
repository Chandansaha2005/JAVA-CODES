public class ScopeOfVariable_Class {
    int a = 10;
    // int a==11;//In a same scope we can't have same named variable
    int b = 5;

    int add() {
        return a + b;//we can use the variables anywhere in the class , this is class level scope
    }

    int sub() {
        return a - b;
    }

    public static void main(String[] args) {
        
    }
}
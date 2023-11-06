package homework.equation;

import homework.equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        QuadraticEquation num1=new QuadraticEquation(2,7,3);

        num1.display();
        QuadraticEquation.split();
        double dis =num1.delta();
        System.out.println("Discriminant equation = "+dis);
        int v=num1.quantityRoots(dis);
        System.out.println("Number of possible roots of the equation = "+v);
    }
}

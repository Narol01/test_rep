package homework.cube;

import homework.cube.model.Cube;

public class CubeAppl {
    public static void main(String[] args) {
        Cube cub1=new Cube(18);
        Cube cub2=new Cube(4);
        Cube cub3=new Cube(3);

        cub1.display();
        System.out.println("Cube area= "+cub1.area());
        System.out.println("Cube perimeter= " +cub1.per());
        System.out.println("Volume of a cube= "+ cub1.v());
        Cube.split();
        cub2.display();
        System.out.println("Cube area= "+cub2.area());
        System.out.println("Cube perimeter= " +cub2.per());
        System.out.println("Volume of a cube= "+ cub2.v());
        Cube.split();
        cub3.display();
        System.out.println("Cube area= "+cub3.area());
        System.out.println("Cube perimeter= " +cub3.per());
        System.out.println("Volume of a cube= "+ cub3.v());

    }
}

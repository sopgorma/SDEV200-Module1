/*
 Sophia Gorman
 SDEV200 - Assignment 9.9
 3/28/2025
 */
public class NineUML {
    public static void main(String[] args) {
		//Creates three regular polygons with various sides
		RegularPolygon regularPolygon1 = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("\n________________________________________________");
		System.out.println("| Regular Polygon |  Perimeter  |  Area  |");
		System.out.println("__________________________________________________");
		System.out.printf( "|       Polygon #1       |%8.2f     |%6.2f  |\n", 
			regularPolygon1.getPerimeter(), regularPolygon1.getArea());
		System.out.printf( "|       Polygon #2       |%8.2f     |%6.2f  |\n", 
			regularPolygon2.getPerimeter(), regularPolygon2.getArea());
		System.out.printf( "|       Polygon #3       |%8.2f     |%6.2f  |\n", 
			regularPolygon3.getPerimeter(), regularPolygon3.getArea());
		System.out.println("___________________________________________________");
	}
}

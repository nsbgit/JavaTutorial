package example1;

// This program uses inheritance to extend Box.
public class Box {
	double width;
	double heigth;
	double depth;
	
	// Construct clone of a object
	Box(Box ob) {
		this.width = ob.width;
		this.heigth = ob.heigth;
		this.depth = ob.depth;
	}
	
	// Constructor used when all dimensions specified
	Box(double width, double heigth, double depth) {
		this.depth = depth;
		this.heigth = heigth;
		this.width = width;
	}
	
	// Constructor used when no dimensions specified
	Box() {
		this.width = -1;
		this.depth = -1;
		this.heigth = -1;
	}
	
	// Constructor used when cube is created
	Box(double len) {
		this.width = this.heigth = this.depth = len;
	}
	
	// Compute and return the result
	double volume() {
		return (this.width * this.heigth * this.depth);
	}
}

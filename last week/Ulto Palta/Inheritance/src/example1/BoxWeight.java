package example1;

// Here, | Box is extended to include weight
public class BoxWeight extends Box {
	double weight;
	
	// Constructor for BoxWeight
	BoxWeight(double width, double depth, double heigth, double weight) {
		this.width = width;
		this.heigth = heigth;
		this.depth = depth;
		this.weight = weight;
	}
}

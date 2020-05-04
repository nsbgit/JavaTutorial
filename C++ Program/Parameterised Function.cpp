/*
@ Give an example of C++ program to use parameterised function.
*/

#include<iostream>
using namespace std;

class Item {
	int number;
	float cost;
	public :
	void setData(int a, float b);
	void display(void);
};

void Item :: setData(int a,float b) {
	number = a;
	cost = b;
}

void Item :: display() {
	cout << "\nNumber \t:\t" << number;
	cout << "\nCost \t:\t" << cost << "\n\n";
}

int main() {
	Item obj;
	
	obj.setData(10, 10.25);
	obj.display();
	return 0;
}

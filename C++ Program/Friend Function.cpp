/*
@ How to access private data member using friend function
*/

#include<iostream>
using namespace std;

class Sample {
	int a, b;
	public :
	void set() {
		a = 10;
		b = 20;
	}
	friend float mean(Sample);
};

float mean(Sample re) {
	cout << "\nAverage of the numbers is : "<<(re.a + re.b)/2 << "\n\n";
}

int main() {
	Sample obj;
	obj.set();
	mean(obj);
	return 0;
}

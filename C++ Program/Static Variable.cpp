#include<iostream>
using namespace std;
class Test {
	int number;
	static int count;
	public :
	void setData(int a);
	void display(void);
};

int Test ::count;

void Test ::setData(int a) {
	number = a;
	count++;
}

void Test ::display() {
	cout << "\nNumber \t:\t" << number;
	cout << "\nCount \t:\t" << count << "\n\n";
}

int main() {
	Test ob1, ob2, ob3;
	ob1.setData(10);
	ob1.display();
	
	ob2.setData(20);
	ob2.display();
	
	ob3.setData(30);
	ob3.display();
	
	return 0;
}
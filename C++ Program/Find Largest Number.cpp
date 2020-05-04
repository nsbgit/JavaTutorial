/*
@ Write a C++ program to find the largest number of two given numbers
*/

#include<iostream>
using namespace std;

class Largest {
	int firstNumber;
	int secondNumber;
	
	public :
	void setData(void);
	int findLargest(void);
	void display(void);
};

void Largest :: setData() {
	cout << "\nEnter two numbers :\n";
	cin >> firstNumber >> secondNumber;
}

int Largest :: findLargest() {
	if(firstNumber > secondNumber) return firstNumber;
	else return secondNumber;
}

void Largest :: display() {
	cout << "\nThe largest number is :\t" << findLargest() << "\n";
}

int main() {
	Largest obj;
	
	obj.setData();
	obj.findLargest();
	obj.display();
	return 0;
}

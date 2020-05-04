#include<iostream>
using namespace std;

class Manager {
	char name[50];
	int iD;
	float salary;
	public :
	void setData(void);
	void display(void);
};

void Manager :: setData() {
	cout << "\nEnter name :\n";
	cin >> name;
	cout << "\nEnter your ID :\n";
	cin >> iD;
	cout << "\nEnter your salary :\n";
	cin >> salary;
}

void Manager :: display() {
	cout << "\n\nName \t:\t" << name;
	cout << "\nID \t:\t" << iD;
	cout << "\nSalary \t:\t" << salary << "\n";
}
const int arraySize = 3;
int main() {
	Manager obj[arraySize];
	int i;
	for(i=0; i<arraySize; i++) {
		obj[i].setData();
	}
	for(i=0; i<arraySize; i++) {
		obj[i].display();
	}
	return 0;
}
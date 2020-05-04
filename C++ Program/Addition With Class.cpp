#include<iostream>

using namespace std;

class Test
{
	int a,b,c;
	
	public:
	int getData(void);
	int display(void);
};

int Test :: getData()
{
	cout << "\nEnter the value of a :\n";
	cin >> a;
	
	cout << "\nEnter the value of b :\n";
	cin >> b;
}

int Test :: display()
{
	c = a + b;
	cout << "\nThe sum is : \n";
	cout << a << " + " << b << " = " << c << "\n\n";
}

int main()
{
	Test obj;
	
	obj.getData();
	obj.display();
	
	return 0;
}
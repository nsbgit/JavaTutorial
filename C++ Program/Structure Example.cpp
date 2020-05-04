#include<iostream>
using namespace std;
//to calculting avg using structure

// Structure starts here
struct student {
	int math;
	int physics;
	int biology;
	int total;
};
// Structure ends here

// Main program starts here
int main() {
	struct student s;
	int c;
	cout << "\nEnter marks for Maths :\n";
	cin >> s.math;
	cout << "\nEnter marks for Physics :\n";
	cin >> s.physics;
	cout << "\nEnter marks for Biology :\n";
	cin >> s.biology;
	s.total = s.math + s.physics + s.biology;
	cout << "The total is :\t" << s.total << "\n\n";
	return 0;
}
// Main progran ends here

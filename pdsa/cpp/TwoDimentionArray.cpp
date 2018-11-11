#include <iostream>
#include <stdio.h>
using namespace std;

int main() {

    int a1[2][3] = {{1, 2, 3}, {4, 5, 6}};
    int a2[2][3] = {1, 2, 3, 4, 5};
    int a3[2][3] = {{1, 2}, {4}};

    cout << "Array 1" << endl;

    for (int row = 0; row < 2; ++row) {
        for (int col = 0; col < 3; ++col) {
            cout << " - " << &a1[row][col] << ":" << a1[row][col];
        }
        cout << endl;
    }

    cout << "Array 2" << endl;

    for (int row = 0; row < 2; ++row) {
        for (int col = 0; col < 3; ++col) {
            cout << " - " << &a2[row][col] << ":" << a2[row][col];
        }
        cout << endl;
    }

    cout << "Array 3" << endl;

    for (int row = 0; row < 2; ++row) {
        for (int col = 0; col < 3; ++col) {
            cout << " - " << &a3[row][col] << ":" << a3[row][col];
        }
        cout << endl;
    }
}
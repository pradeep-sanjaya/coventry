#include <stdlib.h>
#include <stdio.h>

#define size 5

int st[size];
int top = -1;

void push(int);
int pop();
int peek();
void print();

int main(int args[]) {

    int op = 0, val = 0, ch = 0;

    do {
        system("clear");
        printf("Stack implementation with array");
        printf("\n=================================\n");
        printf("|1. Push\t\t\t|\n");
        printf("|2. Pop\t\t\t\t|\n");
        printf("|3. Peek\t\t\t|\n");
        printf("|4. Print\t\t\t|\n");
        printf("|5. Exit\t\t\t|\n");
        printf("=================================\n");
        scanf("%d", &op);

        switch (op) {
            case 1:
                printf("\nEnter value:");
                scanf("%d", &val);
                push(val);

                break;

            case 2:
                val = pop();
                if (val != -1) {
                    printf("Popped value: %d\n", val);
                }
                getchar();
                getchar();
                break;

            case 3:
                val = peek();
                if (val != -1) {
                    printf("Peek value: %d\n", val);
                }
                getchar();
                getchar();
                break;

            case 4:
                print();
                getchar();
                getchar();
                break;
        }

    } while (op != 5);
}

void push(int val) {
    if (top == size - 1) {
        printf("\nOverflow\n");
    } else {
        top = top + 1;
        st[top] = val;
    }
}

int pop() {
    int val = -1;

    if (top == -1) {
        printf("\nUnderflow\n");
    } else {
        val = st[top];
        top = top - 1;
    }

    return val;
}

int peek() {
    int val = -1;

    if (top == -1) {
        printf("\nUnderflow\n");
    } else {
        val = st[top];
    }

    return val;
}

void print() {
    printf("top: %d\n", top);

    for(int c = 0; c <= top ; c++) {
        printf("index: %d -> value: %d\n", c, st[c]);
    }
}
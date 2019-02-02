#include <stdlib.h>
#include <stdio.h>

class Node {
private:
    int data;
    Node *next;
public:
    Node(int data, Node *next) {
        this->data = data;
        this->next = next;
    }
};

class Stack {
private:
    Node *head;

public:

    Stack() {
        this->head = NULL;
    }

    push(int data) {
        if (this->head == NULL) {
            this->head = new Node(data, NULL);
        } else {
            this->head = new Node(data, head);
        }
    }

    pop();
    peek();
    print();
};

int main() {

    int op = 0, val = 0, ch = 0;
    Stack *stack = new Stack();

    do {
        system("clear");
        printf("Stack implementation with linked list");
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

                break;

            case 2:
                val = -1;
                if (val != -1) {
                    printf("Popped value: %d\n", val);
                }
                getchar();
                getchar();
                break;

            case 3:
                val = -1;
                if (val != -1) {
                    printf("Peek value: %d\n", val);
                }
                getchar();
                getchar();
                break;

            case 4:
                getchar();
                getchar();
                break;
        }

    } while (op != 5);
}
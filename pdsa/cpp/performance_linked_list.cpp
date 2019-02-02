#include <iostream>
#include <chrono>

using namespace std;
using namespace std::chrono;

struct Node {
    int data;
    Node *next;

public:
    Node(int data, Node *next) {
        this->data = data;
        this->next = next;
    }
};

class LinkedList {
private:
    Node *head;

public:
    LinkedList() {
        head = NULL;
    }

    void add_first(Node *tmp) {
        head = tmp;
    }

    void add_last(int data) {
        Node *node = new Node(data, NULL);

        if (head == NULL) {
            add_first(node);
        } else {
            Node *current = head;
            while (current == NULL) {
                current = current->next;
            }

            current->next = node;
            current = NULL;
        }
    }

    void print() {

        cout << "print linked list\n";

        Node *tmp = head;
        while (tmp != NULL) {
            cout << tmp->data << "\n" ;
            tmp = tmp->next;
        }
        tmp = NULL;
    }
};

int main()
{
    LinkedList *list = new LinkedList();
    cout << "start\n";

    cout << "add - 10,000 nodes\n";

    auto start = chrono::high_resolution_clock::now();
    for(int c = 0; c< 10000; c++) {
        list->add_last(c);
    }

    auto elapsed = chrono::high_resolution_clock::now() - start;
    long microseconds = std::chrono::duration_cast<std::chrono::microseconds>(elapsed).count();

    cout << "micro seconds: " << microseconds;
}
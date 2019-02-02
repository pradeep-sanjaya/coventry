<?php

/**
 * Coventry University
 * Bsc Hons in Computing
 * Batch 18.2
 * Pradeep Sanjaya
 * cobsccomp182p-030
 * Programming, Data Structures and Algorithms
 * Implement linked list methods
 */

class Node
{
    private $data;
    private $next;

    public function __construct($data, $next)
    {
        $this->data = $data;
        $this->next = $next;
    }

    public function getData()
    {
        return $this->data;
    }

    public function setData($data)
    {
        $this->data = $data;
    }

    public function getNext()
    {
        return $this->next;
    }

    public function setNext($next)
    {
        $this->next = $next;
    }
}

class LinkedList
{
    public $head;

    public function __construct()
    {
        $this->head = new Node(10, null);
        $one  = new Node(20, null);
        $this->head->setNext($one);
    }

    public function pop()
    {
    }

    public function addFirst($data)
    {
        $this->head = new Node($data, $this->head);
    }

    public function addLast($data)
    {
        $node = $this->head;
        while ($node->getNext() != null) {
            $node = $node->getNext();
        }
        $node->setNext(new Node($data, null));
    }

    public function addBefore($key, $data)
    {
        $node = $this->head;
        if ($node == null || $node->getData() == $key) {
            $this->addFirst($data);
        } else {
            while ($node != null) {
                if ($node->getNext()->getData() == $key) {
                    $node->setNext(new Node($data, $node->getNext()));
                    break;
                }

                $node = $node->getNext();
            }
        }

    }

    public function addAfter($key, $data)
    {
        $node = $this->head;
        while ($node->getData() != $key) {
            $node = $node->getNext();
        }
        $node->setNext(new Node($data, $node->getNext()));
    }

    public function deleteFirst()
    {
        $this->head = $this->head->getNext();
    }

    public function deleteLast()
    {
        $node = $this->head;
        if ($node->getNext() == null) {
            $this->head = null;
        } else {
            while ($node->getNext()->getNext() != null) {
                $node = $node->getNext();
            }
        }

        if ($node != null) {
            $node->setNext(null);
        }
    }

    public function delete($data)
    {
        $node = $this->head;
        while ($node->getNext()->getData() != $data) {
            $node = $node->getNext();
        }

        if ($node != null) {
            $node->setNext($node->getNext()->getNext());
        }
    }

    public function printNodes()
    {
        $node = $this->head;
        while ($node != null) {
            echo $node->getData() . "\n";
            $node = $node->getNext();
        }
    }
}

$linkedList = new LinkedList();
$linkedList->printNodes();

echo "\naddFirst - 0\n";
$linkedList->addFirst(0);
$linkedList->printNodes();

echo "\naddLast - 30\n";
$linkedList->addLast(30);
$linkedList->printNodes();

echo "\naddAfter - 40 after 10\n";
$linkedList->addAfter(10, 40);
$linkedList->printNodes();

echo "\naddBefore - 50 before 10\n";
$linkedList->addBefore(10, 50);
$linkedList->printNodes();

echo "\ndeleteFirst\n";
$linkedList->deleteFirst();
$linkedList->printNodes();

echo "\ndeleteLast\n";
$linkedList->deleteLast();
$linkedList->printNodes();

echo "\ndelete 10\n";
$linkedList->delete(10);
$linkedList->printNodes();
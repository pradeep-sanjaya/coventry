<?php
/**
 * Coventry University
 * Bsc Hons in Computing
 * Batch 18.2
 * Pradeep Sanjaya
 * cobsccomp182p-030
 * Programming, Data Structures and Algorithms
 * Take Home Assignment 3 - Stack
 * Implement Stack in another 2 Programming Languages other than java
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

class Stack
{
    public $head;
    private $isDebug;

    public function __construct()
    {
        $this->isDebug = false;
    }

    public function setDebug()
    {
        $this->isDebug = true;
    }

    public function push($data)
    {
        $this->head = new Node($data, $this->head);
    }

    public function pop()
    {
        if ($this->head == null) {
            throw new Exception("Stack is empty");
        }

        $value = $this->head->getData();
        $this->head = $this->head->getNext();

        return $value;
    }

    public function peek()
    {
        if ($this->head == null) {
            throw new Exception("Stack is empty");
        }

        return $this->head->getData();
    }

    public function empty()
    {
        $this->head = null;
    }

    public function printNodes()
    {
        if ($this->isDebug) {
            echo "\n--- stack values ---";

            $node = $this->head;
            while ($node != null) {
                echo "\n" . $node->getData();
                $node = $node->getNext();
            }

            echo "\n--------------------\n";
        }

    }
}

try {
    $stack = new Stack();
    $stack->setDebug(true);

    echo "\nStack methods - add, pop, peep, empty";

    echo "\nPush - 10, 20 , 30";
    $stack->push(10);
    $stack->push(20);
    $stack->push(30);

    $stack->printNodes();

    echo "\nPop value from stack";
    echo "\nreturned : " . $stack->pop();

    $stack->printNodes();

    echo "\nPeek value from stack";
    echo "\nreturned : " . $stack->peek();

    $stack->printNodes();

    echo "\nPop value from stack";
    echo "\nreturned : " . $stack->pop();

    $stack->printNodes();

    echo "\nCall stack empty";
    $stack->empty();

    $stack->printNodes();

} catch (Exception $e) {
    echo $e->getMessage();
}

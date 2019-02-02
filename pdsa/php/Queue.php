<?php
/**
 * Coventry University
 * Bsc Hons in Computing
 * Batch 18.2
 * Pradeep Sanjaya
 * cobsccomp182p-030
 * Programming, Data Structures and Algorithms
 * Take Home Assignment 4 - Queue
 * Implement Queue in another 2 programming Languages other than java
 */

class Node
{
    private $data;
    private $next;
    private $prev;

    public function __construct($data, $next, $prev)
    {
        $this->data = $data;
        $this->next = $next;
        $this->prev = $prev;
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

    /**
     * @return mixed
     */
    public function getPrev()
    {
        return $this->prev;
    }

    /**
     * @param mixed $prev
     */
    public function setPrev($prev): void
    {
        $this->prev = $prev;
    }

}

class Queue
{
    private $head;
    private $tail;

    private $isDebug;

    public function __construct()
    {
        $this->isDebug = false;
    }

    public function setDebug($value)
    {
        $this->isDebug = $value;
    }

    public function add($data)
    {
        if ($this->head == null) {
            $node = new Node($data, null, null);
            $this->head = $node;
            $this->tail = $node;
        } else {
            $node = new Node($data, $this->head, null);
            $this->head->setPrev($node);
            $this->head = $node;
        }

    }

    public function poll()
    {
        if ($this->tail == null) {
            throw new Exception("Queue is empty");
        } else {
            $data = $this->tail->getData();

            $node = $this->tail->getPrev();
            $node->setNext(null);
            $this->tail = $node;

            return $data;
        }
    }

    public function peek()
    {
        if ($this->tail == null) {
            throw new Exception("Queue is empty");
        }

        return $this->tail->getData();
    }

    public function remove()
    {
        $this->head = null;
        $this->tail = null;
    }

    public function printNodes()
    {
        if ($this->isDebug) {
            echo "\n--- queue values ---";

            $node = $this->tail;
            while ($node != null) {
                echo "\n" . $node->getData();
                $node = $node->getPrev();
            }

            echo "\n--------------------\n";
        }

    }
}

try {

    $queue = new Queue();
    $queue->setDebug(true);
    
    echo "\nQueue methods - add, poll, peek, remove";

    echo "\nAdd - 10, 20, 30";
    $queue->add(10);
    $queue->add(20);
    $queue->add(30);

    $queue->printNodes();

    echo "\nPoll value from queue";
    echo "\npoll value : " . $queue->poll();
    $queue->printNodes();

    echo "\nPeek value from queue";
    echo "\npeek value : " . $queue->peek();
    $queue->printNodes();

    echo "\nPoll value from queue";
    echo "\npoll value : " . $queue->poll();
    $queue->printNodes();

    echo "\nCall remove queue";
    $queue->remove();
    $queue->printNodes();

} catch (Exception $e) {
    echo $e->getMessage();
}

<?php
/**
 * Coventry University
 * Bsc Hons in Computing
 * Batch 18.2
 * Pradeep Sanjaya
 * cobsccomp182p-030
 * Programming, Data Structures and Algorithms
 * LinkedList iterate
 */

class Node
{
    public $data;
    public $next;

    public function __construct($data, $next)
    {
        $this->data = $data;
        $this->next = $next;
    }
}

function printNodes(Node $node)
{
    while ($node != null) {
        echo "$node->data\n";
        $node = $node->next;
    }
}


$head = new Node(10, null);
$one  = new Node(20, null);

$head->next = $one;

printNodes($head);


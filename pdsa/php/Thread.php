<?php

/**
 * Coventry University
 * Bsc Hons in Computing
 * Batch 18.2
 * Pradeep Sanjaya
 * cobsccomp182p-030
 * Programming, Data Structures and Algorithms
 * Threads
 * Requires PECL pthreads >= 2.0.0
 * https://github.com/krakjoe/pthreads
 */

class MyThread extends Thread {

    private $counter;

    public function __construct() {
        $this->counter = 0;
    }

    public function run() {
        parent::run();
        while (true) {
            echo $this->counter++;
        }
    }
}

$myThread = new MyThread();
$myThread->start();
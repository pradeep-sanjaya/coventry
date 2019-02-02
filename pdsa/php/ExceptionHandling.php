<?php
/**
 * Coventry University
 * Bsc Hons in Computing
 * Batch 18.2
 * Pradeep Sanjaya
 * cobsccomp182p-030
 * Programming, Data Structures and Algorithms
 * Exception handling
 */

try {
    $array = [1, 2, 3, 4, 5];
    echo $array[6];
    //$avg = 100 / 0;
} catch (Exception $e2) {
    echo $e2->getMessage();
}
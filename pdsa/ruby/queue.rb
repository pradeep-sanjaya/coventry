#!/usr/bin/env ruby

=begin
Coventry University
Bsc in Computing
Batch 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Take Home Assignment 4 - Queue
Implement Queue in another 2 programming Languages other than java
=end

class Node
    attr_accessor :value, :next, :prev

    def initialize(value, nxt = nil, prv = nil)
        @value = value
        @next = nxt
        @prev = prv
    end

    def next?
        !@next.nil?
    end

    def prev?
        !@prev.nil?
    end

    def to_s
        value
    end
end

class Queue
    attr_accessor :head, :tail

    def initialize
        @head = nil
        @tail = nil
    end

    def add(value)
        if @head.nil?
            node = Node.new(value, nil, nil)
            @head = node
            @tail = node
        else
            node = Node.new(value, nil, @tail)
            @tail.next = node
            @tail      = node
        end
    end

    def poll
        value = nil

        if @head != nil
            value = @head.value
            
            if @head.next?
                @head = @head.next
            else
                @head
            end
        end

        value
    end

    def peek
        @head.value
    end

    def remove
        @head = nil
    end

    def print

        puts "--- queue values ---"
        current = @head

        if current
            while current
                puts current.value
                current = current.next
            end
        else
            puts "queue is empty"
        end

        puts "--------------------\n\n"

    end
end

puts "Queue methods - add, poll, peek, remove\n\n"

puts "Create queue\n"

queue = Queue.new
queue.print

puts "Poll a value from queue"
puts "poll value: #{queue.poll()}\n\n"

puts "Add 10, 20, 30 to queue\n"

queue.add(10)
queue.add(20)
queue.add(30)
queue.print

puts "Poll a value from queue"

puts "poll value: #{queue.poll()}\n\n"
queue.print

puts "Peek a value from queue"
puts "peek value: #{queue.peek()}\n\n"

queue.print

puts "Call queue remove"
queue.remove()
queue.print
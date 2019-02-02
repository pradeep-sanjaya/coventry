#!/usr/bin/env ruby

=begin
Coventry University
Bsc in Computing
Batch 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Take Home Assignment 3 - Stack
Implement Stack in another 2 Programming Languages other than java
=end

class Node
    attr_accessor :data, :pointer

    def initialize(data, pointer = nil)
        @data = data
        @pointer = pointer
    end

    def next
        @pointer
    end

    def next?
        !@pointer.nil?
    end

    def to_s
        data
    end
end

class Stack
    def initialize
        @head = nil
    end

    def push(data)
        if @head.nil?
            @head = Node.new(data, nil)
        else
            @head = Node.new(data, @head)
        end

    end

    def pop

        value = nil

        if @head && !@head.nil?
            nil

            value = @head.data;

            if (@head.next?)
                @head = @head.next
            end
        end

        value
    end

    def peek
        @head.data
    end


    def empty
        @head = nil
    end

    def print

        puts "--- stack values ---"
        current = @head

        if current
            while current
                puts current.data
                current = current.pointer
            end
        else
            puts "stack is empty"
        end

        puts "--------------------\n\n"

    end
end

puts "Stack methods - push, pop, peek, empty\n\n"

puts "Create stack\n"

stack = Stack.new
stack.print

puts "Pop a value from stask"
puts "pop value: #{stack.pop()}\n\n"

puts "Push 10, 20, 30 to stack\n"

stack.push(10)
stack.push(20)
stack.push(30)
stack.print

puts "Pop a value from stack"

puts "pop value: #{stack.pop()}\n\n"
stack.print

puts "Peek a value from stack"
puts "peek value: #{stack.peek()}\n\n"

stack.print

puts "Call stack.empty"
stack.empty()
stack.print
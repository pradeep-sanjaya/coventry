#!/usr/bin/env ruby

=begin
Compiled with online compiler https://www.tutorialspoint.com/execute_ruby_online.php
    
Take Home Assignment 2- Link Lists

Implement Singly LinkList Methods in another Programming Language(s)

Student Name: Pradeep Sanjaya
Student Id : cobsccomp182p-030
Batch: 18.2
Permalink : http://tpcg.io/QxKauA
=end

class Node
    attr_reader :data, :pointer

    def initialize(data, pointer = nil)
        @data = data
        @pointer = pointer
    end

    def set_pointer(node)
        @pointer = node
    end

    def get_pointer
        @pointer
    end

    def next?
        !@pointer.nil?
    end
end

class SinglyLinkedList

    def initialize(data)
        @head = Node.new(data, nil)
    end

    def add_last(data)
        current_node = @head

        while current_node.next?
            current_node = current_node.get_pointer
        end

        new_node = Node.new(data, nil)

        current_node.set_pointer(new_node)
    end

    def add_first(data)
        @head = Node.new(data, @head)
    end

    def add_after(key, data)
        current_node = @head
        
        while current_node.data != key
            current_node = current_node.pointer
        end
        
        if current_node != nil
            current_node.set_pointer(Node.new(data, current_node.pointer))
        end
    end

    def add_before(key, data)
        current_node = @head
        previous_node = nil
        
        if current_node.data == key
            add_first(data)
        end
        
        while current_node.data != key
            previous_node = current_node
            current_node = current_node.get_pointer
        end
        
        if previous_node != nil
            previous_node.set_pointer(Node.new(data, previous_node.get_pointer))
        end
    end
    
    def delete(data)
        current_node = @head
        previous_node = nil
        
        if current_node.data == data
            current_node.set_pointer(nil)
        end
        
        while current_node.data != data
            previous_node = current_node
            current_node = current_node.get_pointer
        end
        
        if previous_node != nil
            previous_node.set_pointer(current_node.get_pointer)
        end
    end
    
    def display
        current_node = @head

        while current_node.next?
            p current_node.data
            current_node = current_node.pointer
        end

        p current_node.data
    end
end



first1 = SinglyLinkedList.new(1)
(2..5).each {|x| first1.add_last(x)}

puts "\n\nafter - add_last"
first1.display

puts "\n\nadd_first - 100"
first1.add_first(100)
first1.display

puts "\n\nadd_after - 100, 200"
first1.add_after(100, 200)
first1.display

puts "\n\nadd_before - 200, 300"
first1.add_before(200, 300)
first1.display

puts "\n\ndelete - 300"
first1.delete(300)
first1.display

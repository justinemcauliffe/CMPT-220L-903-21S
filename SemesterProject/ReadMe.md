# Semester Project

Hi my name is Justine McAuliffe and I created my Semester Project 
titled SemesterProject for Software Development I with Professor Kippins. 

To access my project go to my GitHub and then navigate
to the main page of my repository, 
justinemcauliffe/CMPT-220L-903-21S. 
Open them on your laptop in the texted editor of your choice. 

# Explaining Binary Search Tree

## Node Class:

In the node class I assigned a value to the node and then created right and left
children. 

#### Inserting elements - Recursive Function 

This code is making the nodes and children in the tree. The
first if statement is to make sure the value is not the root
node. Then the second if statement is asking if the value is 
less than or equal the value of the root node, it will branch it off to the left. 
The if else statement is asking if the value is less t the
value of the root node, then it will branch it off to the right.
Finally, the else is making sure the value is not a duplicate 
value.


# Searching the tree

#### Finding the elements:

Starting at the root, I used my find function to search the tree. If the value 
returns null, it will print "Not in Binary Search Tree." In else there is another
if statement saying if the value is less than the current value, it will be on the
left. The else if, is saying that if the value is greater than the current value,
it will be on the right. Finally, the else says if the value is equal to the current
value, it will print "In Binary Search Tree."

 #### Finding the height of the tree:
First the function uses an if statement to check if the tree 
is empty; it will return a 0 if so. Then in the else, it finds
the height of the left of the tree and the right of the tree.
Within the else there is an if statement that compares the 
heights of the right and left of the tree. If the left height 
is greater than the right height it will return the left height
plus 1. Conversely, the else basically means that the height of
the right is greater, so it will return the height of the right 
plus 1. We add 1 here to account for the root node. 

#### Finding the smallest element in the tree:
There is a while loop that checks the left of the tree. It 
keeps running until the loop cannot go left any longer, 
meaning the current value would not equal null. Then
it will return that value. 

#### Finding the largest element in the tree:
There is a while loop that checks the right of the tree. It
keeps running until the loop cannot go right any longer,
meaning the current value would not equal null. Then
it will return that value.

#### Finding the Nth largest element in the tree:

First we start out at the root. Then we initialize the count variable to zero. The
while loop is set to the current value not equal to null and then has an if 
statement saying if there are no right children. Within that there is another if 
statement saying if the count is equal to n then that is the nth largest node,
printing the current right node. Then the else looks at the left child with 
another while loop. If the left successor is null then it will print the right 
child. For the else if the count is equal to n then that is the nth largest node,
printing the current left node. 


# Manipulating the Tree

#### Deleting the elements:

First we check to see if the root is null it will return null. 
Then another if statement says if the int value you input is less than the root
it will delete that element. Then the else if says if the int value is greater
than the root, it will delete that element. In the else it is checking for any
disconnects so there is another if statement saying if there is no left child, 
it will return the right root. Then the else if says if there is no right child,
it will return the left root. The next two lines fix the disconnects if there 
are any.


#### Tree Reorganization:

For tree reorganization, there is a while loop that is searching for 
the minimum value in right child of the node. It reforms the tree making a new 
root to make sure it follows lesser values on left and greater on right.

# Tree Traversals

#### Listing elements in order:

This function starts with an if statement making sure the value does not 
return null. Then it is organized with the left children first, then the root,
then the right children.

#### Listing elements in pre order:

This function starts with an if statement making sure the value does not
return null. Then it is organized with the root first, then the left children,
then the right children.

#### Listing elements in post order:

This function starts with an if statement making sure the value does not
return null. Then it is organized with the left children, then the right children,
and finally ending with the root value.

# Advanced Searches

#### Depth First Search:

The traversals are the same as the depth, hence it is repeated. 

#### Breadth First Search:

First the function starts at looking at the height of the tree starting with the
root. Then there is an if statement for if the node is equal to null, return null.
Then there is another if statement saying if the level is zero then it will print
out the node's value. The else uses the BreathFirstSearchTraversal function to 
look at the left and right of the tree printing out the root, then the left and right
child from that and so on. 


# Main 

First I made my binary search tree by adding new and added the nodes with 
values of 6, 4, 8, 3, 5, 7 and 9. 

I then used the find function with the values 10 and 6 to
show that it will print "Not in Binary Search Tree" when I 
input the value 10, and it will print "In Binary Search Tree" 
when I input the value 6. 

Next, I have a print statement "This prints the root value"
and then found the root by calling the root's value
of binary search tree, which is 6.

Then, I have a print statement "This prints the height of the 
tree" and System.out.println(bt.Height(bt.root)) that makes 
sure the function for the height can start at the root.

To print out the smallest node, I have a print statement
that says "This prints the smallest element" followed by
System.out.println(bt.smallest(bt.root)) that also making
sure the function starts analyzing the tree at the root.

Next, I have a print statement "This prints the largest element"
and similarly followed by System.out.println(bt.largest(bt.root))
also making sure the function starts analyzing the tree at the root.

The print statement "This prints the nth largest element, 3"
states that I want to print the third largest element in the 
binary search tree. I put System.out.println(bt.Nth(bt.root,3).value) 
that calls the nth function according to n being equal to 3 by 
(bt.root,3). I had to .value it to get the third largest node's value.

For the in order traversal, I started with a print statement
saying "This prints in order traversal" and then
Binary_Search_Tree.InorderTraversal(bt.root) to ensure the
function starts at the root.

I did the same exact thing for the post and preorder traversals,
except when calling their respective functions.

For depth first search, I printed "This is repeated again for Depth
First Search", and depth and breadth are printing out the return from my functions.

Lastly, for deleting elements I chose to delete the node
with value 9, which is why I did a print statement stating
"This will delete an element, 9". Then
bt.root=Binary_Search_Tree.DeleteElements(bt.root, 9)
comparing the value to the root. 
The next line calls the in order traversal function
to show that the node with the value 9 was successfully
deleted. 


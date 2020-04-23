LinkedList is different than Array, acts as a chain of elements.

To go to the last element, for example, you might need to iterate using headElement.nextElement until you reach the last one that has a null nextElement.

To insert you need to iterate using nextElement, but no need to deal with indexes, only changing nextElement references.
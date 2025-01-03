Problem Statement:

Designing a Library Management System

Requirements:
- The library management system should allow librarians to manage books, members, and borrowing activities.
- The system should support adding, updating, and removing books from the library catalog.
- Each book should have details such as title, author, ISBN, publication year, and availability status.
- The system should allow members to borrow and return books.
- Each member should have details such as name, member ID, contact information, and borrowing history.
- The system should enforce borrowing rules, such as a maximum number of books that can be borrowed at a time and loan duration.
- The system should handle concurrent access to the library catalog and member records.
- The system should be extensible to accommodate future enhancements and new features.


Lessons learnt: 

1) Synchronized methods vs Concurrent datastructures tradeoffs.
2) How declaration and initialisation are different in maps in java --> always, initilise in constructors to avoid nullpointer exception
3) Basics of exception handling
4) Internals of HashMap in Java
5) Creating a separate file to place all the constants at one place

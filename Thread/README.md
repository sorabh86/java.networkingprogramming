# Thread

A thread is a single sequential flow of control within a program. All basic programs are written in a sequential programs, that starts, run a sequences of logic, and then terminate. a thread itself is not a program, it cannot run on its own but runs within a program. We are frequently confronted with situations in which an application is forced to wait for some condition i.e. a multimedia player has to wait for the drive to spin up, a network application has to wait for data to arrive or it cannot process client requests when reading from a database.
Java is a multi-threaded application that allows multiple threads execution at any particular time.

## Roles of threads in networking programming, 

An http server or web server, a brower or http client sends requests to an http server which then sends responses back to the client. Without multithreading there is open on signle connection that means it's not possible to connect another client at the same time to communicate with server.    
The basic idea behind multi threading is whenever server gets a connection request from client the server creates a separate independent thread for each client request, that means for each client there is a separate client thread in server, so the client can communicate independently

-----
SKYPE : ssorabh.ssharma    
email : ssorabh.ssharma@hotmail.com    
website : http://sorabh86.github.com    
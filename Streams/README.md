[< back](../README.md)
# I/O Streams

Input/Output in java is built on streams.    
A stream is communication channel that a program has with the outside world. Java I/O streams are flows of data you can either read from, or write to.    
Streams are typically connected to a data source, or data destination, like a file, devices, other programs, or a network connection.

There are two kinds of streams :
* InputStream : The InputStream is used to read data from a source, for ex, a program uses an input stream to read data from a source
* OutputStream : OutputStream is used for writing data to a destination.

#### RelationShips
* Object
    * InputStream
        * FileInputStream
        * ByteArrayInputStream
        * FilterInputStream
            * BufferedInputStream
            * DataInputStream : You can read Java Primitives from this stream
        * ObjectInputStream
    * OutputStream
        * FileOutputStream
        * ByteArrayOutputStream
        * FilterOutputStream
            * BufferedOutputStream
            * DataOutputStream : You can write Java Primitives form this stream
        * ObjectOutputStream

#### Java File Class
It just give you information about file, like whatever exists, it has couple of things like links, the path, the parent, etc. File class doesn't actually represent a file, it represents a path.

## CharacterStream
### InputStreamReader
Suppose you want to build a chat application for this type of application. 
We need a screen that is able to write characters to the network connection or its characters form the
network connection and even more.   
Let's say you want your application to support different languages, for example you want to send characters from
the chinese alphabet to build the application easier, you can use the input stream reader and off the stream writer.
The juggling was slim reader class is intended to represent stream thereby turning the byte based input stream into a 
character based reader and similarly there is a bridge from the byte streams to character streams.
It reads bytes and decodes them into characters using a specified charset.

#### What is a charset?
The term charset is short for character set a character a set is a fixed collection of symbols, for example the english alphbet can be a character set.
One of the simplest underlays character sets is F.T. and other characters it is Unicode.
Unicode can be used for almost all world wide languages including Latin European languages, Arabic and even Japanese and chinese.

### OutputStreamReader
Java OutputStreamReader class was intended to wrap an output stream and is useful when you need to write characters to file.





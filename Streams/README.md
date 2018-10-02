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

package com.flashcardapp.controller;

import java.sql.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainRunner {

	public static void main(String[] args) throws SQLException {
		createDatabase();
		createtables();
		populateUserData();
		populateCardData();
		
//		CardServices cs = new CardServices();
//		List<FlashCards> fc_list = (List<FlashCards>) cs.getAllFlashCard();
//		for(FlashCards fc: fc_list) 
//		{
//			System.out.println("stmt.executeUpdate(\"INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES(\'" + fc.getFront() + "\', \'" + fc.getBack() + " \', " + "CURRENT_TIMESTAMP(),\"+"  + fc.getFlashcarduser().getUser_id() + "+\");\");");
//		}
	}

	public static void populateCardData() throws SQLException
	{
		final String DB_URL = "jdbc:mariadb://localhost:3306/fastiatic";
		final String USER = "root";
		final String PASS = "Retirementby40!!!";
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
		Statement stmt = conn.createStatement();
		
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('API', 'Application Programming Interface. The specification of how a programmer writing an application accesses the behavior and state of classes and objects. ', CURRENT_TIMESTAMP(),"+2+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('applet', 'A component that typically executes in a Web browser, but can execute in a variety of other applications or devices that support the applet programming model. ', CURRENT_TIMESTAMP(),"+2+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('argument', 'A data item specified in a method call. An argument can be a literal value, a variable, or an expression. ', CURRENT_TIMESTAMP(),"+1+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('array', 'A collection of data items, all of the same type, in which each item's position is uniquely designated by an integer. ', CURRENT_TIMESTAMP(),"+9+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('ASCII', 'American Standard Code for Information Interchange. A standard assignment of 7-bit numeric codes to characters. See also                  Unicode . ', CURRENT_TIMESTAMP(),"+9+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('atomic', 'Refers to an operation that is never interrupted or left in an incomplete state under any circumstance. ', CURRENT_TIMESTAMP(),"+1+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('authentication', 'The process by which an entity proves to another entity that it is acting on behalf of a specific identity. ', CURRENT_TIMESTAMP(),"+6+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('authorization', 'See                 access control. ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('autoboxing', 'Automatic conversion between                  reference  and                  primitive  types. ', CURRENT_TIMESTAMP(),"+1+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('bean', 'A reusable software component that conforms to certain design and naming conventions. The conventions enable beans to be easily combined to create an application using tools that understand the conventions. ', CURRENT_TIMESTAMP(),"+6+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('binary operator', 'An operator that has two arguments. ', CURRENT_TIMESTAMP(),"+10+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('bit', 'The smallest unit of information in a computer, with a value of either 0 or 1. ', CURRENT_TIMESTAMP(),"+6+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('bitwise operator', 'An operator that manipulates the bits of one or more of its operands individually and in parallel. Examples include the binary logical operators (&, |, ^), the binary shift operators (<<, >>, >>>) and the unary one's complement operator (~). ', CURRENT_TIMESTAMP(),"+2+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('block', 'In the Java programming language, any code between matching braces. Example:                 { x = 1; }. ', CURRENT_TIMESTAMP(),"+10+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('boolean', 'Refers to an expression or variable that can have only a true or false value. The Java programming language provides the boolean type and the literal values true and false. ', CURRENT_TIMESTAMP(),"+9+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('break', 'A Java keyword used to resume program execution at the statement immediately following the current statement. If followed by a label, the program resumes execution at the labeled statement. ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('byte', 'A sequence of eight bits. Java provides a corresponding                 byte type. ', CURRENT_TIMESTAMP(),"+5+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('bytecode', 'Machine-independent code generated by the Java compiler and executed by the Java interpreter. ', CURRENT_TIMESTAMP(),"+8+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('case', 'A Java keyword that defines a group of statements to begin executing if a value specified matches the value defined by a preceding                 switch keyword. ', CURRENT_TIMESTAMP(),"+2+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('casting', ' ', CURRENT_TIMESTAMP(),"+7+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('catch', 'Explicit conversion from one data type to another. ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('char', 'A Java keyword used to declare a block of statements to be executed in the event that a Java exception, or run time error, occurs in a preceding                 try block. ', CURRENT_TIMESTAMP(),"+8+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('class', ' ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('class method', 'A Java keyword used to declare a variable of type character. ', CURRENT_TIMESTAMP(),"+6+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('class variable', ' ', CURRENT_TIMESTAMP(),"+6+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('classpath', 'In the Java programming language, a type that defines the implementation of a particular kind of object. A class definition defines instance and class variables and methods, as well as specifying the interfaces the class implements and the immediate superclass of the class. If the superclass is not explicitly specified, the superclass will implicitly be                 Object. ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('client', 'A method that is invoked without reference to a particular object. Class methods affect the class as a whole, not a particular instance of the class. Also called a                  static method . See also                  instance method . ', CURRENT_TIMESTAMP(),"+2+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('codebase', 'A data item associated with a particular class as a whole--not with particular instances of the class. Class variables are defined in class definitions. Also called a                  static field . See also                  instance variable . ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('comment', 'An environmental variable which tells the Java virtual machine                1  and Java technology-based applications where to find the class libraries, including user-defined class libraries. ', CURRENT_TIMESTAMP(),"+5+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('commit', 'In the client/server model of communications, the client is a process that remotely accesses resources of a compute server, such as compute power and large memory capacity. ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('compilation unit', 'Works together with the                 code attribute in the                 <APPLET> tag to give a complete specification of where to find the main applet class file: code specifies the name of the file, and codebase specifies the URL of the directory containing the file. ', CURRENT_TIMESTAMP(),"+2+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('compiler', 'In a program, explanatory text that is ignored by the compiler. In programs written in the Java programming language, comments are delimited using                 // or                 /*...               */. ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('compositing', 'The point in a transaction when all updates to any resources involved in the transaction are made permanent. ', CURRENT_TIMESTAMP(),"+1+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('constructor', 'The smallest unit of source code that can be compiled. In the current implementation of the Java platform, the compilation unit is a file. ', CURRENT_TIMESTAMP(),"+8+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('const', 'A program to translate source code into code to be executed by a computer. The Java compiler translates source code written in the Java programming language into bytecode for the Java virtual machine                1 . See also                  interpreter . ', CURRENT_TIMESTAMP(),"+1+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('continue', 'The process of superimposing one image on another to create a single image. ', CURRENT_TIMESTAMP(),"+10+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('conversational state', 'A pseudo-method that creates an object. In the Java programming language, constructors are instance methods with the same name as their class. Constructors are invoked using the                 new keyword. ', CURRENT_TIMESTAMP(),"+6+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('CORBA', 'A reserved Java keyword not used by current versions of the Java programming language. ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('core class', 'A Java keyword used to resume program execution at the end of the current loop. If followed by a label,                 continue resumes execution where the label occurs. ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('core packages', 'The field values of a session bean plus the transitive closure of the objects reachable from the bean's fields. The transitive closure of a bean is defined in terms of the serialization protocol for the Java programming language, that is, the fields that would be stored by serializing the bean instance. ', CURRENT_TIMESTAMP(),"+10+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('credentials', 'Common Object Request Broker Architecture. A language independent, distributed object model specified by the Object Management Group (OMG). ', CURRENT_TIMESTAMP(),"+9+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('critical section', 'A public class (or interface) that is a standard member of the Java Platform. The intent is that the core classes for the Java platform, at minimum, are available on all operating systems where the Java platform runs. A program written entirely in the Java programming language relies only on core classes, meaning it can run anywhere.                 . ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('declaration', 'The required set of APIs in a Java platform edition which must be supported in any and all compatible implementations. ', CURRENT_TIMESTAMP(),"+6+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('default', 'The information describing the security attributes of a principal. Credentials can be acquired only through authentication or delegation. ', CURRENT_TIMESTAMP(),"+2+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('definition', 'A segment of code in which a thread uses resources (such as certain instance variables) that can be used by other threads, but that must not be used by them at the same time. ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('delegation', 'A statement that establishes an identifier and associates attributes with it, without necessarily reserving its storage (for data) or providing the implementation (for methods). See also                 definition. ', CURRENT_TIMESTAMP(),"+10+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('deprecation', 'A Java keyword optionally used after all                 case conditions in a                 switch statement. If all                 case conditions are not matched by the value of the                 switch variable, the                 default keyword will be executed. ', CURRENT_TIMESTAMP(),"+6+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('derived from', 'A declaration that reserves storage (for data) or provides implementation (for methods). See also                 declaration. ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('distributed', 'An act whereby one principal authorizes another principal to use its identity or privileges with some restrictions. ', CURRENT_TIMESTAMP(),"+1+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('distributed application', 'Refers to a class, interface, constructor, method or field that is no longer recommended, and may cease to exist in a future version. ', CURRENT_TIMESTAMP(),"+8+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('do', 'Class X is \"derived from\" class Y if class X                 extends class Y. See also                  subclass ,                  superclass . ', CURRENT_TIMESTAMP(),"+5+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('DOM', 'Running in more than one address space. ', CURRENT_TIMESTAMP(),"+6+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('double', 'An application made up of distinct components running in separate runtime environments, usually on different platforms connected through a network. Typical distributed applications are two-tier (client/server), three-tier (client/middleware/server), and n-tier (client/multiple middleware/multiple servers). ', CURRENT_TIMESTAMP(),"+1+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('double precision', 'A Java keyword used to declare a loop that will iterate a block of statements. The loop's exit condition can be specified with the                 while keyword. ', CURRENT_TIMESTAMP(),"+2+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('DTD', ' ', CURRENT_TIMESTAMP(),"+7+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('else', 'Document Object Model. A tree of objects with interfaces for traversing the tree and writing an XML version of it, as defined by the W3C specification. ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('EmbeddedJava Technology', 'A Java keyword used to define a variable of type                 double. ', CURRENT_TIMESTAMP(),"+9+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('encapsulation', ' ', CURRENT_TIMESTAMP(),"+5+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('enum', 'In the Java programming language specification, describes a floating point number that holds 64 bits of data. See also                  single precision . ', CURRENT_TIMESTAMP(),"+5+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('enumerated type', 'Document Type Definition. A description of the structure and properties of a class of XML files. ', CURRENT_TIMESTAMP(),"+5+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('exception', 'A Java keyword used to execute a block of statements in the case that the test condition with the                 if keyword evaluates to false. ', CURRENT_TIMESTAMP(),"+7+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('exception handler', 'The availability of Java 2 Platform, Micro Edition technology under a restrictive license agreement that allows a licensee to leverage certain Java technologies to create and deploy a closed-box application that exposes no APIs. ', CURRENT_TIMESTAMP(),"+1+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('executable content', 'The localization of knowledge within a module. Because objects encapsulate data and implementation, the user of an object can view the object as a black box that provides services. Instance variables and methods can be added, deleted, or changed, but as long as the services provided by the object remain the same, code that uses the object can continue to use it without being rewritten. See also                  instance variable ,                  instance method. ', CURRENT_TIMESTAMP(),"+8+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('extends', 'A Java keyword used to declare an enumerated type. ', CURRENT_TIMESTAMP(),"+1+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('field', 'A type whose legal values consist of a fixed set of constants. ', CURRENT_TIMESTAMP(),"+10+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('final', 'An event during program execution that prevents the program from continuing normally; generally, an error. The Java programming language supports exceptions with the try, catch, and throw keywords. See also                 exception handler. ', CURRENT_TIMESTAMP(),"+1+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('finally', 'A block of code that reacts to a specific type of                 exception. If the exception is for an error that the program can recover from, the program can resume executing after the exception handler has executed. ', CURRENT_TIMESTAMP(),"+9+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('float', 'An application that runs from within an HTML file. See also                  applet . ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('for', 'Class X extends class Y to add functionality, either by adding fields or methods to class Y, or by overriding methods of class Y. An interface extends another interface by adding methods. Class X is said to be a subclass of class Y. See also                  derived from . ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('FTP', 'A data member of a class. Unless specified otherwise, a field is not static. ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('formal parameter list', 'A Java keyword. You define an entity once and cannot change it or derive from it later. More specifically: a final class cannot be subclassed, a final method cannot be overridden and a final variable cannot change from its initialized value. ', CURRENT_TIMESTAMP(),"+8+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('garbage collection', ' ', CURRENT_TIMESTAMP(),"+8+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('generic', 'A Java keyword that executes a block of statements regardless of whether a Java Exception, or run time error, occurred in a block defined previously by the                 try keyword. ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('goto', ' ', CURRENT_TIMESTAMP(),"+2+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('group', 'A Java keyword used to define a floating point number variable. ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('GUI', 'A Java keyword used to declare a loop that reiterates statements. The programmer can specify the statements to be executed, exit conditions, and initialization variables for the loop. ', CURRENT_TIMESTAMP(),"+10+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('hexadecimal', ' ', CURRENT_TIMESTAMP(),"+5+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('hierarchy', 'File Transfer Protocol. FTP, which is based on TCP/IP, enables the fetching and storing of files between hosts on the Internet. See also                  TCP/IP . ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('HTML', 'The parameters specified in the definition of a particular method. See also                  actual parameter list . ', CURRENT_TIMESTAMP(),"+9+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('HTTP', 'The automatic detection and freeing of memory that is no longer in use. The Java runtime system performs garbage collection so that programmers never explicitly free objects. ', CURRENT_TIMESTAMP(),"+5+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('HTTPS', 'A class, interface, or method that declares one or more type variables. These type variables are known as type parameters. A generic declaration defines a set of parameterized types, one for each possible invocation of the type parameter section. At runtime, all of these parameterized types share the same class, interface, or method. ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('IDL', 'This is a reserved Java keyword. However, it is not used by current versions of the Java programming language. ', CURRENT_TIMESTAMP(),"+2+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('identifier', ' ', CURRENT_TIMESTAMP(),"+10+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('IIOP', 'A collection of principals within a given security policy domain. ', CURRENT_TIMESTAMP(),"+7+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('if', 'Graphical User Interface. Refers to the techniques involved in using graphics, along with a keyboard and a mouse, to provide an easy-to-use interface to some program. ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('impersonation', 'The numbering system that uses 16 as its base. The marks 0-9 and a-f (or equivalently A-F) represent the digits 0 through 15. In programs written in the Java programming language, hexadecimal numbers must be preceded with 0x. See also                  octal . ', CURRENT_TIMESTAMP(),"+2+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('implements', 'A classification of relationships in which each item except the top one (known as the root) is a specialized form of the item above it. Each item can have one or more items below it in the hierarchy. In the Java class hierarchy, the root is the                 Object class. ', CURRENT_TIMESTAMP(),"+7+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('import', 'HyperText Markup Language. This is a file format, based on SGML, for hypertext documents on the Internet. It is very simple and allows for the embedding of images, sounds, video streams, form fields and simple text formatting. References to other objects are embedded using URLs. ', CURRENT_TIMESTAMP(),"+8+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('inheritance', 'HyperText Transfer Protocol. The Internet protocol, based on TCP/IP, used to fetch hypertext objects from remote hosts. See also                  TCP/IP . ', CURRENT_TIMESTAMP(),"+6+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('instance', 'HyperText Transfer Protocol layered over the SSL protocol. ', CURRENT_TIMESTAMP(),"+2+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('instance method', 'Interface Definition Language. APIs written in the Java programming language that provide standards-based interoperability and connectivity with CORBA (Common Object Request Broker Architecture). ', CURRENT_TIMESTAMP(),"+9+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('instance variable', 'The name of an item in a program written in the Java programming language. ', CURRENT_TIMESTAMP(),"+9+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('instanceof', 'Internet Inter-ORB Protocol. A protocol used for communication between CORBA object request brokers. ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('int', 'A Java keyword used to conduct a conditional test and execute a block of statements if the test evaluates to true. ', CURRENT_TIMESTAMP(),"+8+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('interface', ' ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Internet', 'An act whereby one entity assumes the identity and privileges of another entity without restrictions and without any indication visible to the recipients of the impersonator's calls that delegation has taken place. Impersonation is a case of simple delegation. ', CURRENT_TIMESTAMP(),"+9+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('IP', 'A Java keyword included in the class declaration to specify any interfaces that are implemented by the current class. ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('interpreter', 'A Java keyword used at the beginning of a source file that can specify classes or entire packages to be referred to later without including their package names in the reference. ', CURRENT_TIMESTAMP(),"+7+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('JAIN', 'The concept of classes automatically containing the variables and methods defined in their                  supertypes . See also                  superclass ,                  subclass . ', CURRENT_TIMESTAMP(),"+6+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('JAR', 'An object of a particular class. In programs written in the Java programming language, an instance of a class is created using the                 new operator followed by the class name. ', CURRENT_TIMESTAMP(),"+2+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java', 'Any method that is invoked with respect to an instance of a class. Also called simply a                  method . See also                  class method . ', CURRENT_TIMESTAMP(),"+10+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java 2 Platform', 'Any item of data that is associated with a particular object. Each instance of a class has its own copy of the instance variables defined in the class. Also called a                  field . See also                  class variable . ', CURRENT_TIMESTAMP(),"+1+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java 2 Platform, Enterprise Edition (J2EE platform)', 'A two-argument Java keyword that tests whether the runtime type of its first argument is assignment compatible with its second argument. ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java 2 Platform, Micro Edition (J2ME platform)', 'A Java keyword used to define a variable of type                 integer. ', CURRENT_TIMESTAMP(),"+5+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java 2 Platform, Standard Edition (J2SE platform)', 'A Java keyword used to define a collection of method definitions and constant values. It can later be implemented by classes that define this interface with the \"implements\" keyword. ', CURRENT_TIMESTAMP(),"+5+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java 2 SDK, Standard Edition', 'An enormous network consisting of literally millions of hosts from many organizations and countries around the world. It is physically put together from many smaller networks and data travels by a common set of protocols. ', CURRENT_TIMESTAMP(),"+10+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java APIs for Integrated Networks (JAIN)', 'Internet Protocol. The basic protocol of the Internet. It enables the unreliable delivery of individual packets from one host to another. It makes no guarantees about whether or not the packet will be delivered, how long it will take, or if multiple packets will arrive in the order they were sent. Protocols built on top of this add the notions of connection and reliability. See also                  TCP/IP . ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java Card API', 'A module that alternately decodes and executes every statement in some body of code. The Java interpreter decodes and executes bytecode for the Java virtual machine                1 . See also                  compiler ,                  runtime system . ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java Compatibility Kit (JCK)', 'See:                 Java APIs for Integrated Networks (JAIN) ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java Database Connectivity (JDBC)', 'JAR (Java Archive) is a platform-independent file format that aggregates many files into one. Multiple applets written in the Java programming language, and their requisite components (.class files, images, sounds and other resource files) can be bundled in a JAR file and subsequently downloaded to a browser in a single HTTP transaction. It also supports file compression and digital signatures. ', CURRENT_TIMESTAMP(),"+8+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java Development Kit (JDK)', 'Sun's trademark for a set of technologies for creating and safely running software programs in both stand-alone and networked environments. ', CURRENT_TIMESTAMP(),"+6+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java Foundation Classes (JFC)', 'The second generation of the Java platform. (The first generation was the JDK.) Also see \"Java Platform\" and \"Java Platform Editions\". ', CURRENT_TIMESTAMP(),"+7+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java IDL', 'See                 Java 2 Platform, Enterprise Edition, under Java Platform Editions. ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java Interface Definition Language (IDL)', 'See                 Java 2 Platform, Micro Edition, under Java Platform Editions. ', CURRENT_TIMESTAMP(),"+6+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java Media APIs', 'See                 Java 2 Platform, Standard Edition, under Java Platform Editions. ', CURRENT_TIMESTAMP(),"+10+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java Media Framework', 'The Software Development Kit (SDK) is development environment for building applications, applets, and components using the Java programming language. This SDK provides a reference implementation of the J2SE platform. ', CURRENT_TIMESTAMP(),"+1+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java Naming and Directory Interface (JNDI)', 'enables the rapid development of Next Generation telecom products and services on the Java platform. ', CURRENT_TIMESTAMP(),"+7+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java Native Interface', 'An ISO 7816-4 compliant application environment focused on smart cards. ', CURRENT_TIMESTAMP(),"+5+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java Platform', 'A test suite, a set of tools, and other requirements used to certify a Java platform implementation conformant both to the applicable Java platform specifications and to Java Software reference implementations. ', CURRENT_TIMESTAMP(),"+8+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java Platform Editions', 'An industry standard for database-independent connectivity between the Java platform and a wide range of databases. The JDBC provides a call-level API for SQL-based database access. ', CURRENT_TIMESTAMP(),"+7+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java Remote Method Invocation (RMI)', 'A software development environment for writing applets and applications in the Java programming language. Technically, the JDK is the correct name for all versions of the Java platform from 1.0 to 1.1.x. ', CURRENT_TIMESTAMP(),"+8+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java Runtime Environment (JRE)', 'An extension that adds graphical user interface class libraries to the Abstract Windowing Toolkit (AWT). ', CURRENT_TIMESTAMP(),"+9+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('Java virtual machine                  1', 'See                 Java Interface Definition Language ', CURRENT_TIMESTAMP(),"+4+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('JavaBeans', 'A set of Java APIs that provide CORBA (Common Object Request Broker Architecture) interoperability and connectivity capabilities for the J2EE platform. These capabilities enable J2EE applications to invoke operations on remote network services using the OMG IDL and IIOP. ', CURRENT_TIMESTAMP(),"+5+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('JavaCheck', 'A set of APIs that support the integration of audio and video clips, 2D fonts, graphics, and images as well as 3D models and telephony. ', CURRENT_TIMESTAMP(),"+7+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('JavaSafe', 'The core framework supports clocks for synchronizing between different media (e.g., audio and video output). The standard extension framework allows users to do full audio and video streaming. ', CURRENT_TIMESTAMP(),"+8+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('JavaScript', 'A set of APIs that assists with the interfacing to multiple naming and directory services. ', CURRENT_TIMESTAMP(),"+9+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('JavaSpaces', 'A standard programming interface for writing Java native methods and embedding the JVM into native applications. The primary goal is binary compatibility of native method libraries across all JVM implementations on a given platform. ', CURRENT_TIMESTAMP(),"+3+");");
		stmt.executeUpdate("INSERT INTO FlashCards(front, back, timestamp, User_id) VALUES('JDBC', 'Consists of class libraries, a Java virtual machine (JVM) and class loader (which comprise the runtime environment) and a compiler, debugger and other tools (which comprise the development kit).                     In addition, the runtime platform is subject to a set of compatibility requirements to ensure consistent and compatible implementations. Implementations that meet the compatibility requirements may qualify for Sun's targeted compatibility brands.                     Java 2 is the current generation of the Java Platform. ', CURRENT_TIMESTAMP(),"+10+");");

		stmt.close();
		conn.close();
	
	}
	
	
	public static void populateUserData() throws SQLException
	{
		final String DB_URL = "jdbc:mariadb://localhost:3306/fastiatic";
		final String USER = "root";
		final String PASS = "Retirementby40!!!";
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
		Statement stmt = conn.createStatement();

		stmt.executeUpdate("insert into flashcarduser (email, cname, password) values ('hluckham0@google.ru', 'Hazel Luckham', 'X1uZcoIh0dj');"); 
		stmt.executeUpdate("insert into flashcarduser (email, cname, password) values ('sbowden1@yellowbook.com', 'Sonnnie Bowden', 'SJc4aWSU');");  
		stmt.executeUpdate("insert into flashcarduser (email, cname, password) values (\'qllorens2@howstuffworks.com\', \'Quillan Llorens\', 'W6rJuxd');"); 
		stmt.executeUpdate("insert into flashcarduser (email, cname, password) values ('cstartin3@flickr.com', 'Clem Startin', 'XYHzJ1S');"); 
		stmt.executeUpdate("insert into flashcarduser (email, cname, password) values ('tattwool4@biglobe.ne.jp', 'Thornie Attwool', 'Hjt0SoVmuBz');"); 
		stmt.executeUpdate("insert into flashcarduser (email, cname, password) values ('hguerre5@deviantart.com', 'Harcourt Guerre', 'OzcxzD1PGs');"); 
		stmt.executeUpdate("insert into flashcarduser (email, cname, password) values ('htaffley6@columbia.edu', 'Holmes Taffley', 'xowtOQ');"); 
		stmt.executeUpdate("insert into flashcarduser (email, cname, password) values ('aiannitti7@is.gd', 'Alexandra Iannitti', 'TWP4hf5j');");
		stmt.executeUpdate("insert into flashcarduser (email, cname, password) values ('ljiroudek8@sitemeter.com', 'Laryssa Jiroudek', 'bXRoLUP');"); 
		stmt.executeUpdate("insert into flashcarduser (email, cname, password) values ('cjaulme9@bing.com', 'Cahra Jaulme', 'FnVklVgC6r6');"); 
		stmt.executeUpdate("insert into flashcarduser (email, cname, password) values ('abc', 'Karma Tsering', 'abc');");
		
		stmt.close();
		conn.close();
	}
	
	public static void createtables() 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FlashCardWebApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.close();
		entityManagerFactory.close();
	}

	public static void createDatabase() 
	{
		// JDBC driver name and database URL

		final String DB_URL = "jdbc:mariadb://localhost:3306/";

		// Database credentials
		final String USER = "root";
		final String PASS = "Retirementby40!!!";

		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating database...");
			stmt = conn.createStatement();

			String sql = "CREATE DATABASE fastiatic";
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}
}
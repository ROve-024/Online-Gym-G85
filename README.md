# Demo

![demo](README.assets/demo.gif)

# Compile and Run

Method 1 and method 3 data can be shared, while method 2 data is independent (in jar).

### Method 1: Run by terminal

Open the terminal, enter the directory where the README file is located, and enter the following commands in sequence.

```cmd
javac -encoding UTF-8 @source.txt
cd src
java gui.login.Login
```

It needs to wait to compile the code.

### Method 2: Run by terminal through jar file

Open the terminal, enter the directory where the README file is located, and enter the following commands in sequence.

```cmd
cd src
java –jar Group85.jar
```

### Method 3: Run by .bat (Windows)

At the address where the README file is located, create a new .txt file and write the following content:

```bat
cd %CD%
start cmd /k "javac -encoding UTF-8 @source.txt & cd src & java gui.login.Login"
```

Change the file suffix from ".txt" to ".bat". Then double-click the .bat file and wait for the compilation to be completed before running the program.

**Alternatively**, you can also double-click the `start up.bat ` provided by us to compile the code and start the program automatically.

It needs to wait to compile the code.

# Account to Login

**Administrator account**

* Account
  * admin
* Password
  * 123456as

**Member account**

* Account
  * li01123
* Password
  * lilili01

Coach account

* Account
  * coach001
* Password
  * 123456as

For more account passwords, open the xml file in the following path to view:

```txt
project
|    README.md
|    ...
|________src
		 |    Run.java
		 |    ...
		 |________resources
		 		  |    ...
		 		  |________xmls
		 		  		   |	Admin.xml
		 		  		   | 	Client.xml
		 		  		   |	Coach.xml
```


# OpenFile
Open file using command prompt

Instructions : Setup and Run
1.	Download and Install JAVA
    a.	https://www.java.com/en/download/help/windows_manual_download.xml
    
2.	Create environment variables 
    a.	https://www.java.com/en/download/help/path.xml
    b.	Set system variables 
          i.	JAVA_HOME = C:\Program Files\Java\jdk
          ii.	JRE_HOME =  %JRE_HOME%\jre
          iii.	Path = XXXXXXXXXXX;%JAVA_HOME%\bin;%JRE_HOME%;
          
3.	Verify Installation 
    a.	Open command prompt and try to run following command
        i.	C:/> java -version
        
4.	Copy OpenFile.jar from “Execute” folder into the current directory. 

5.	Run following command to Open a File.
    a.	java -jar OpenFile.jar <FilePath>
    b.	For e.g.
        i.	C:\Test>java -jar OpenFile.jar C:\\Users\\vaibhav\\Desktop\\abc.xlsx
            1.	Current Directory : C:\Test
            2.	Copy and Paste “OpenFile.jar” inside “C:\Test” Folder
            3.	File to open : complete file path  

JYI : Source Code - OpenFile/src/com/rahuls/OpenFile.java

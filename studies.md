## Self Studies

- [Download & Install JDK](https://www.oracle.com/java/technologies/downloads) Select according to the Operating Systems you are using, such as Windows, MacOS or Linux.
- [What is Java and why use it?](https://www.w3schools.com/java/java_intro.asp)
- [Main Method & Print](https://www.w3schools.com/java/java_syntax.asp)
- [Writing Comments](https://www.w3schools.com/java/java_comments.asp)
- [Variables](https://www.w3schools.com/java/java_variables.asp)
- [Data Types](https://www.w3schools.com/java/java_data_types.asp)

## Installation Recommendation

The link provided [Download & Install JDK](https://www.oracle.com/java/technologies/downloads) will install only the specific Java version. This usually works alright. In a professional environment while working on multiple java projects, different versions may be required. Hence, it is recommended to install java via [sdkman](sdkman.io) or [sdkman for windows](https://medium.com/@gayanper/sdkman-on-windows-661976238042).

### Windows Subsystem for Linux (WSL)

WSL stands for Windows Subsytem for Linux which allows Windows 10/11 users to install a Linux distribution (e.g. Ubuntu, OpenSUSE, Debian, etc). This enables the use of Linux tools such as Bash shell, completely integrated with Windows tools such as Windows File Explorer, Visual Studio Code, Edge and Chrome browsers. 

WSL2 is the latest version of WSL that ships with Windows 10 version 2005 and higher (Build 19041 and above) or Windows 11

- Install WSL2 (including Bash shell) on Windows 10/11 [(link)](https://docs.microsoft.com/en-us/windows/wsl/install) 
- To access your Linux drive from Windows (e.g. File Explorer), use `\\wsl$\Ubuntu\home`
- Windows Terminal [(link)](https://docs.microsoft.com/en-us/windows/terminal/)

At this point of this writing, JDK 17 is the latest LTS. You may download and install the latest LTS (long term support).

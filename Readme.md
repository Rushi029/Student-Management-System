# 📚 Student Management System (Java File Handling)

A simple **console-based Student Management System** built in Java that demonstrates **CRUD operations** (Create, Read, Update, Delete) using **File Handling** instead of a database.  
All student records are stored in a text file (`studentsRecords.txt`) in the format:

---

## 🚀 Features
- **Add Student** → Save new student records into the file.
- **View Students** → Display all student records in a formatted way.
- **Update Student** → Modify existing student details using a temporary rewrite logic.
- **Delete Student** → Remove student records by ID.
- **Exit** → Safely terminate the program.

---

## 🛠️ Technologies Used
- **Java** (Core concepts: OOP, File Handling, Exception Handling)
- **BufferedReader / BufferedWriter** for efficient file I/O
- **Scanner** for console input
- **Menu-driven console application**

---

## 📂 Project Structure
   StudentManagementSystem/ │ ├── StudentManagementSystem.java   # Main class (menu + file handling) ├── AddStudent.java                 # Logic for adding student ├── ViewStudents.java               # Logic for viewing students ├── UpdateStudent.java              # Logic for updating student ├── DeleteStudent.java              # Logic for deleting student └── students.txt                    # Data file (auto-created if not present)

---

## 📊 Sample Stored Records
Here’s the current content of `studentsRecords.txt` (for testing):

When viewed in the program, it will display like:

---

## ⚙️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/student-management-system.git

2. - Navigate into the project folder:
  ```bash
   cd student-management-system
 
3. - Compile the Java files:
   ```bash
   javac *.java

4. - Run the program:
   ```bash
   java StudentManagementSystem

## 📖 Learning Outcomes
- Understand Java File Handling concepts.
- Implement CRUD operations without a database.
- Apply real-world logic for file-based data management.
- Build menu-driven console applications.


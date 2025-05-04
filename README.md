# 1.3.3: CSV People Manager

A Java console application to manage a list of people using CSV files.  
Each person has a **name**, **surname**, and **DNI**.  
The user can add new people, sort them by various fields, and save/load data from a CSV file.

---

## 📦 Project Structure

- `Main.java` – Main entry point with the menu loop.
- `Person.java` – Represents a person object.
- `PersonCreator.java` – Handles user input to create `Person` instances.
- `PeopleManagement.java` – Manages the list of people.
- `PeopleSorter.java` – Provides sorting methods (by name, surname, DNI).
- `Menu.java` – Displays and validates menu options.
- `CsvHandler.java` – Reads from and writes to the `people.csv` file.

---

## 📋 Features

- Add a new person
- Display people sorted by:
  - Name (A-Z / Z-A)
  - Surname (A-Z / Z-A)
  - DNI (ascending / descending)
- Automatically loads people from `people.csv` on startup
- Saves all people to `people.csv` on exit

---

## 🧪 How to run

Copy this repository: https://github.com/ToniR90/1.3-Java-Collections-Nivell3.git

 

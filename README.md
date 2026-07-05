# **Full-Stack Task Management Application**

Μια Full-Stack εφαρμογή διαχείρισης εργασιών που συνδέει δυναμικα το Front-end με το Back-end σε Java μέσω του Spring Boot και μια βάση δεδομένων MySQL μέσω του XAMPP.

## **Δομή του Project**

|  **Front-end** | HTML, CSS, JavaScript  |  Η διεπαφή χρήστη για την εισαγωγή, εμφάνιση και διαγραφή εργασιών.|
| :--- | :--- | :--- |
| **Back-end** | Java, Spring Boot | Δημιουργεί ένα REST API το οποίο δέχεται τα αιτήματα, τα εκτελεί και επικοινωνεί με τη βάση δεδομένων. |
| **Database** | MySQL, XAMPP | Μόνιμη αποθήκευση των εργασιών σε πίνακα με πεδία `id`, `title`, και `status`. |

---

## **XAMPP & Βάσης Δεδομένων**

Για τη αποθήκευση των δεδομένων χρησιμοποιήθηκε το περιβάλλον **XAMPP**:

1. Εκκίνηση των **Apache** και **MySQL** μέσω από το XAMPP.
2. Μετάβαση στο περιβάλλον διαχείρισης **phpMyAdmin** μέσω του browser (`http://localhost/phpmyadmin`).
3. Δημιουργία μιας νέας βάσης δεδομένων `todo_db`.
4. Σύνδεση του Spring Boot με τη βάση, προσθέτοντας τις ρυθμίσεις διασύνδεσης στο αρχείο `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```
---

## **Πώς Συνεργάζονται όλα μεταξύ τους**

### **1. Εμφάνιση Εργασιών (GET Request)**

* Ο χρήστης πατάει το κουμπί `Εμφάνιση`.
* Η JavaScript εκτελεί την εντολή `fetch()` στέλνοντας αίτημα GET στο `/api/all-tasks` του Spring Boot.
* Ο Server παίρνει τα δεδομένα από τη MySQL και τα επιστρέφει με τη μορφή JSON.
* Η JavaScript επεξεργάζεται το JSON με ένα loop (`.forEach`), δημιουργεί δυναμικά μια λίστα `<li>` και τα εμφανίζει στην οθόνη μέσω της `list.appendChild()`.

### **2. Αποθήκευση Νέας Εργασίας (POST Request)**

* Ο χρήστης πληκτρολογεί μια νέα εργασία και πατάει `Αποθήκευση`.
* Η JavaScript, χρησιμοποιώντας την ιδιότητα `.value`, δημιουργεί ένα αντικείμενο και το μετατρέπει σε κείμενο με την `JSON.stringify()`.
* Στέλνεται ένα Fetch POST request στο `/api/create-task`.
* Το Spring Boot λαμβάνει το JSON, το μετατρέπει σε Entity και το αποθηκεύει στη βάση δεδομένων.
* Μόλις ολοκληρωθεί, η JavaScript καθαρίζει το πεδίο με το κείμενο που δόθηκε από τον χρήστη και ανανεώνει αυτόματα τη λίστα στην οθόνη.

### **3. Διαγραφή Εργασίας (DELETE Request)**

* Σε κάθε εργασία εμφανίζεται ένα κουμπί `Διαγραφή`, το οποίο γνωρίζει το μοναδικό `task.id` για κάθε task από τη βάση δεδομένων.
* Μόλις πατηθεί, εκτελείται ένα Fetch DELETE request στο URL `/api/delete-task/{id}`.
* Η MySQL διαγράφει το task με αυτό το ID, και και όταν ο χρήστης πατήσει το κουμπί `Εμφάνιση`, το Front-end καλεί την `getTaskFromServer()` για να ενημερωθεί η λίστα που εμφανίζεται στον χρήστη.

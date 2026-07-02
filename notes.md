# 🗺️ Οδηγός Εντολών: HTML & JavaScript (Full-Stack Bridge)

| Τεχνολογία | Εντολή / Ιδιότητα | Τι κάνει (Σχόλιο) | Παράδειγμα Εφαρμογής στον Κώδικά σου |
| :--- | :--- | :--- | :--- |
| **HTML** | `<input id="..." type="text">` | Δημιουργεί ένα κουτάκι κειμένου για να γράφει ο χρήστης. | `<input id="input-title" type="text">` |
| **HTML** | `<button onclick="...">` | Δημιουργεί ένα κουμπί που εκτελεί μια function όταν πατηθεί. | `<button onclick="saveTaskFromScreen()">` |
| **HTML** | `<ul id="..."></ul>` | Δημιουργεί μια άδεια λίστα (Unordered List) για να βάλουμε κουκκίδες. | `<ul id="my-list"></ul>` |
| **HTML** | `<label for="...">` | Ετικέτα κειμένου συνδεδεμένη με ένα input (για προσβασιμότητα). | `<label for="input-title">Γράψε Task</label>` |
| **JS (DOM)** | `document.getElementById("id")` | Ψάχνει και "πιάνει" ένα HTML στοιχείο από την οθόνη μέσω του ID του. | `let list = document.getElementById("my-list");` |
| **JS (DOM)** | `.value` | Παίρνει (ή αλλάζει) το κείμενο που πληκτρολόγησε ο χρήστης σε ένα input. | `let title = document.getElementById("input-title").value;` |
| **JS (DOM)** | `.innerHTML = ""` | Καθαρίζει τελείως ό,τι υπάρχει μέσα σε ένα HTML στοιχείο (π.χ. σβήνει τη λίστα). | `list.innerHTML = "";` |
| **JS (DOM)** | `document.createElement("li")` | Δημιουργεί ένα ολοκαίνουριο HTML στοιχείο στη μνήμη (π.χ. μια νέα κουκκίδα). | `let item = document.createElement("li");` |
| **JS (DOM)** | `.textContent` | Βάζει ή αλλάζει το απλό κείμενο μέσα σε ένα στοιχείο (π.χ. μέσα στο `<li>`). | `item.textContent = task.title;` |
| **JS (DOM)** | `.appendChild(στοιχείο)` | Καρφώνει/κολλάει ένα στοιχείο μέσα σε ένα άλλο (π.χ. το κουμπί μέσα στο `<li>`). | `item.appendChild(deleteBtn);` |
| **JS (Fetch)**| `fetch("URL")` | Στέλνει ένα "αίτημα" (request) στο Spring Boot (από προεπιλογή κάνει GET). | `fetch("http://localhost:8080/api/all-tasks")` |
| **JS (Fetch)**| `method: "POST"` | Ρύθμιση στο fetch για να πούμε στον server ότι θέλουμε να **δημιουργήσουμε** δεδομένα. | `{ method: "POST", body: ... }` |
| **JS (Fetch)**| `method: "DELETE"` | Ρύθμιση στο fetch για να πούμε στον server ότι θέλουμε να **διαγράψουμε** δεδομένα. | `{ method: "DELETE" }` |
| **JS (Fetch)**| `JSON.stringify(αντικείμενο)`| Μετατρέπει ένα αντικείμενο JavaScript σε κείμενο JSON για να το καταλάβει η Java. | `body: JSON.stringify(myNewTask)` |
| **JS (Fetch)**| `.then(resp => resp.json())` | Παίρνει την απάντηση του server και τη μετατρέπει από JSON κείμενο σε αντικείμενο JS. | `.then(response => response.json())` |
| **JS (Array)**| `.forEach(task => { ... })` | Παίρνει μια λίστα από tasks και εκτελεί τον κώδικα μέσα στα άγκιστρα για το καθένα ξεχωριστά. | `data.forEach(task => { ... });` |
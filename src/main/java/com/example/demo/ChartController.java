package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ChartController {

    // Ένα έτοιμο παράδειγμα που δείχνει στατιστικά για πωλήσεις πίτσας
    @GetMapping("/api/chart/pizza")
    public Map<String, Integer> getPizzaStats() {
        // Δημιουργούμε ένα Map όπου το Κλειδί είναι String (όνομα πίτσας) και η Τιμή είναι Integer (ποσότητα)
        Map<String, Integer> stats = new HashMap<>();

        stats.put("Margherita", 15); // Το .put() βάζει δεδομένα μέσα στο Map
        stats.put("Pepperoni", 22);
        stats.put("Vegetarian", 8);

        return stats;
    }

    // === ΔΙΚΟ ΣΟΥ CHALLENGE ===
    // Θέλουμε να φτιάξεις μια μέθοδο για το δικό μας project (Task Manager).
    // 1. Βάλε @GetMapping με διεύθυνση "/api/chart/tasks"
    // 2. Ονόμασε τη μέθοδο getTaskStats() με επιστροφή Map<String, Integer>
    // 3. Μέσα, βάλε 3 κατηγορίες: "Completed", "InProgress" και "Todo" με δικά σου νούμερα.
    // 4. Κάνε return το map σου.
    @RestController
    public class TaskManager {
        @GetMapping("/api/chart/tasks")
            public Map<String, Integer> getTaskStats(){
            Map<String, Integer> stats = new HashMap<>();

            stats.put("Completed",0);
            stats.put("InProgress",0);
            stats.put("Todo",2);

            return stats;
        }
    }




}
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    @Autowired // Συνδέουμε το Repository με το Service μας
    private TaskRepository taskRepository;

    // Μέθοδος 1: Επιστρέφει όλα τα tasks από τη MySQL
    public List<Task> getAllTasks() {
        // === CHALLENGE 1 ===
        // Κάλεσε τη μέθοδο του repository που φέρνει ΟΛΑ τα δεδομένα (ψάξε στις έτοιμες μεθόδους που σου έγραψα παραπάνω!)
        return taskRepository.findAll();
    }

    // Μέθοδος 2: Προσθέτει ένα νέο task στη MySQL
    public void addTask(Task newTask) {
        // === CHALLENGE 2 ===
        // Κάλεσε τη μέθοδο του repository που ΑΠΟΘΗΚΕΥΕΙ/ΣΩΖΕΙ το αντικείμενο στη βάση
        taskRepository.save(newTask);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id); // Διαγράφει την εγγραφή από τη MySQL με βάση το ID
    }
}
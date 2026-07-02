package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ChartController {


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
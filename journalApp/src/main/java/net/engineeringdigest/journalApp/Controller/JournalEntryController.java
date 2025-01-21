package net.engineeringdigest.journalApp.Controller;

import net.engineeringdigest.journalApp.Controller.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
     private Map<Long,JournalEntry> journalEntries = new HashMap<>();


@GetMapping("/abc") // if we cant give any method specific then
public List<JournalEntry> getAll(){ //localhost:8080/journal GET
    return new ArrayList<>(journalEntries.values());

       }

     @PostMapping
     public boolean createEntry(@RequestBody JournalEntry myEntry){  //localhost:8080/journal  POST
         journalEntries.put(myEntry.getId(),myEntry);
         return true;
       }
       @GetMapping("id/{myId}")
       public JournalEntry getJournalEntryByid(@PathVariable long myId){
          return journalEntries.get(myId);
       }

 



//     @GetMapping("/sss")
//    public List<JournalEntry>gedall(){
//    return new ArrayList<>(journalEntries.values());
//     }

}

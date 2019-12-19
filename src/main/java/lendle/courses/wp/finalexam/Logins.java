/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.finalexam;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lendle
 */
public class Logins {
    private static Map<String, UserData> db=new HashMap<>();
    
    static{
        UserData user1=new UserData("user1", "password1");
        UserData user2=new UserData("user2", "password2");
        UserData user3=new UserData("user3", "password3");
        
        user1.getNotes().add(new Note(new NoteHeader("note1", "今天天氣很好", "2019-12-28"), "今天天氣很好，要出發去打獵"));
        user1.getNotes().add(new Note(new NoteHeader("note2", "早安", "2019-12-29"), "今天要跑操場"));
        user2.getNotes().add(new Note(new NoteHeader("note3", "拍畢業照", "2019-12-19"), "不要忘記拍畢業照"));
        user3.getNotes().add(new Note(new NoteHeader("note4", "很好吃", "2020-01-01"), "這間麪店很好吃"));
        user3.getNotes().add(new Note(new NoteHeader("note5", "吃太飽", "2020-01-02"), "結果吃太飽"));
        
        db.put("user1", user1);
        db.put("user2", user2);
        db.put("user3", user3);
    }
    
    public static UserData getUserData(String id){
        return db.get(id);
    }
}

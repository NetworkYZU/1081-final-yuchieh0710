/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.finalexam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lendle
 */
public class UserData {
    private String id=null;
    private String password=null;
    private List<Note> notes=new ArrayList<>();

    public UserData(String id, String password) {
        this.id=id;
        this.password=password;
    }

    
    public List<Note> getNotes(){
        return notes;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void setAttribute(String user, UserData user0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setAttribute(String password, String password0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

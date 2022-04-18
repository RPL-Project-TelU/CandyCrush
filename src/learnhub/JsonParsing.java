/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnhub;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class JsonParsing {
    public void Info(){
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.json"));
            ListAkun listAkun = gson.fromJson(br, ListAkun.class);

            if (listAkun != null) {
                int i =1;
                for (Akun akun : listAkun.getAkun()) {
                    
                    System.out.println("Akun Ke-"+i);
                    System.out.println("Username : "+akun.getUsername());
                    System.out.println("Password : "+akun.getPassword());
                    System.out.println();
                    i++;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonParsing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void cek(String u){
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.json"));
            ListAkun listAkun = gson.fromJson(br, ListAkun.class);

            if (listAkun != null) {
                for (Akun akun : listAkun.getAkun()) {
                    if(u.equals(akun.getUsername())){
                        System.out.println("Ketemu");
                        break;
                    }else{
                        System.out.println("Ngga Ketemu");
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonParsing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean cekName(String u) throws Exception{
        Gson gson = new Gson();
            BufferedReader br = new BufferedReader(new FileReader("data.json"));
            ListAkun listAkun = gson.fromJson(br, ListAkun.class);
            boolean hasil = false;
            if (listAkun != null) {
                for (Akun akun : listAkun.getAkun()) {
                    if(u.equals(akun.getUsername())){
                        hasil = true;
                        return true;
                    }else{
                        hasil = false;
                    }
                return hasil;
                }
            }
            return hasil;
    }
}

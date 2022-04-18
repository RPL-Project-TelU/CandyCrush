/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnhub;

/**
 *
 * @author User
 */
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListAkun {

@SerializedName("akun")
private List<Akun> akun = null;

public List<Akun> getAkun() {
return akun;
}

public void setAkun(List<Akun> akun) {
this.akun = akun;
}

}

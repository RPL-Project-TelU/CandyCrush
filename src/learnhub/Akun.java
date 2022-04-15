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
class Akun<U, P>
{
    private U username; 
    private P password;
  
    // constructor
    Akun(U username, P password)
    {
        this.username = username;
        this.password = password;
    }

    public U getUsername() {
        return username;
    }

    public void setUsername(U username) {
        this.username = username;
    }

    public P getPassword() {
        return password;
    }

    public void setPassword(P password) {
        this.password = password;
    }
    
}

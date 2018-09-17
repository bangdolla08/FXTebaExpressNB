package fxtebaexpressnb.DatabaseManajement.TableEntity;


import java.util.ArrayList;

public class TableUserManager{

    private int Id;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Username;
    private String Password;
    private String Alamat;
    private String PhoneNumber;
    private int CabangId;
    
    
    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getUsername() {
        return Username;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public int getCabangId() {
        return CabangId;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setCabangId(int CabangId) {
        this.CabangId = CabangId;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }
}

package handout_file_pracktick;

public class Cast {
    private String fullname;
    private String role;

    public Cast(String fullname, String role) {
        this.fullname = fullname;
        this.role = role;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

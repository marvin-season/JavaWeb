package pd.domain;

import java.io.Serializable;
import java.util.List;

public class Player implements Serializable {
    private Integer id = null;
    private Integer age = null;
    private String name = null;
    private String tel = null;
    private String gender = null;

    private List<GameAccount> gameAccounts;
    private List<Roler> rolers;

    public List<Roler> getRolers() {
        return rolers;
    }

    public void setRolers(List<Roler> rolers) {
        this.rolers = rolers;
    }

    public List<GameAccount> getGameAccounts() {
        return gameAccounts;
    }

    public void setGameAccounts(List<GameAccount> gameAccounts) {
        this.gameAccounts = gameAccounts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

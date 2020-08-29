package pd.domain;

import java.io.Serializable;

public class GameAccount implements Serializable {
    private Integer id = null;
    private Integer pid = null;
    private String name = null;
    private String password = null;
    private String rank = null;//段位
    private Integer score = null;//巅峰积分

    private Player player = null;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "GameAccount{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", rank='" + rank + '\'' +
                ", score=" + score +
                '}';
    }
}

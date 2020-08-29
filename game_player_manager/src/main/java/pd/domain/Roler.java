package pd.domain;

import java.io.Serializable;

public class Roler implements Serializable {
    private Integer id = null;
    private String location = null;
    private String fun = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFun() {
        return fun;
    }

    public void setFun(String fun) {
        this.fun = fun;
    }

    @Override
    public String toString() {
        return "roler{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", fun='" + fun + '\'' +
                '}';
    }
}

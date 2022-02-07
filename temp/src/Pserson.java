import java.util.List;

public class Pserson {

    private  String name;
    private  String creatorId;





    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Pserson(String name) {
        this.name = name;
    }

    public Pserson() {
    }
}

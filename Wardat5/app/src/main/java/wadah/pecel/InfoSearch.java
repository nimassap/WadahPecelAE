package wadah.pecel;

import java.io.Serializable;

//tidak perlu diubah

public class InfoSearch implements Serializable {

    private String desc;
    private int image;

    public InfoSearch(String desc, int image) {
        this.desc = desc;
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

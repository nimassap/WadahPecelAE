package wadah.pecel;

public class TentangKami {

    private  String judul, desc;
    private boolean expandable;




    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public TentangKami(String judul, String desc) {
        this.judul = judul;
        this.desc = desc;
        this.expandable = false;

    }




    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "TentangKami{" +
                "judul='" + judul + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

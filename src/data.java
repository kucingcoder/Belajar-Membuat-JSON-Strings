import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;

public class data {
    private  int id;
    private String nama;

    public data(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static JSONArray printjson(ArrayList<data> input){
        JSONArray jsonArray = new JSONArray();

        for (data daftar_data:input) {
            JSONObject datasementara = new JSONObject();

            datasementara.put("Nama", daftar_data.getNama());
            datasementara.put("ID", daftar_data.getId());

            jsonArray.put(datasementara);
        }
        return jsonArray;
    }
}

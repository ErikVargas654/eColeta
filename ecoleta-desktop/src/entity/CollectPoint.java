package entity;

public class CollectPoint {
    public int id;
    public String nome;
    public String email;
    public String cidade;
    public String type;
    private final Double latitude;
    private final Double longitute;

    public CollectPoint(int id, String nome, String email, String cidade, String type, Double latitude, Double longitute) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
        this.type = type;
        this.latitude = latitude;
        this.longitute = longitute;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public String getCidade() {
        return cidade;
    }

    public String getType() {
        return type;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitute() {
        return longitute;
    }

    public double getLongitude() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}

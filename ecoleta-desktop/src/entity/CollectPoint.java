package entity;

import Enum.Type_of_waste;
import java.util.UUID;

public class CollectPoint {
    public UUID id;
    public String nome;
    public String email;
    public String cidade;
    public Type_of_waste type;
    private final Double latitude;
    private final Double longitute;

    public CollectPoint(UUID id, String nome, String email, String cidade, Type_of_waste type, Double latitude, Double longitute) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
        this.type = type;
        this.latitude = latitude;
        this.longitute = longitute;
    }
    
    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(UUID id) {
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

    public void setType(Type_of_waste type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public String getCidade() {
        return cidade;
    }

    public Type_of_waste getType() {
        return type;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitute() {
        return longitute;
    }


    
}

package com.example.administrador.aplicacaoteste.model.entities;

import com.example.administrador.aplicacaoteste.model.persistences.MemoryClientRepository;

import java.util.List;

/**
 * Created by Administrador on 20/07/2015.
 */
public class Client {
    private String name;
    private String phone;
    private String endereco;
    private double peso;

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (Double.compare(client.peso, peso) != 0) return false;
        if (idade != client.idade) return false;
        if (age != client.age) return false;
        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        if (phone != null ? !phone.equals(client.phone) : client.phone != null) return false;
        return !(endereco != null ? !endereco.equals(client.endereco) : client.endereco != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (endereco != null ? endereco.hashCode() : 0);
        temp = Double.doubleToLongBits(peso);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + idade;
        result = 31 * result + age;
        return result;
    }

    public void setPhone(String phone) {
        this.phone = phone;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private int idade;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void save() {
        MemoryClientRepository.getIntance().save(this);
    }

    @Override
    public String toString() {
        return "Client{" +
                "Nome: '" + name + '\'' +
                ", Telefone: '" + phone + '\'' +
                ", Endereço: '" + endereco + '\'' +
                ", Peso: " + peso +
                ", Idade: " + idade +
                ", Age = " + age +
                '}';
    }

    public static List<Client> getAll() {
        return MemoryClientRepository.getIntance().getAll();
    }
}

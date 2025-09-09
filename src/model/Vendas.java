/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author TADS
 */
public class Vendas {
    private int id;
    private Cliente cliente;
    private String data_venda;
    private double total_venda;
    private String obs;

    // Construtor default
    public Vendas() {
    }
    
    // Construtor com argumentos - atributos
    public Vendas(int id, Cliente cliente, String data_venda, double total_venda, String obs) {
        this.id = id;
        this.cliente = cliente;
        this.data_venda = data_venda;
        this.total_venda = total_venda;
        this.obs = obs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public double getTotal_venda() {
        return total_venda;
    }

    public void setTotal_venda(double total_venda) {
        this.total_venda = total_venda;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
}





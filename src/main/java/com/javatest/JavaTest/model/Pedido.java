package com.javatest.JavaTest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_PEDIDO")
public class Pedido {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private double peso;
	private String cepOrigem;
	private String cepDestino;
	private String nomeDestinatario;
	private double valorTotalFrete;
	private String dataPrevitaEntrega;
	private String dataCosulta;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getCepOrigem() {
		return cepOrigem;
	}
	public void setCepOrigem(String cepOrigem) {
		this.cepOrigem = cepOrigem;
	}
	public String getCepDestino() {
		return cepDestino;
	}
	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}
	public String getNomeDestinatario() {
		return nomeDestinatario;
	}
	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}
	public double getValorTotalFrete() {
		return valorTotalFrete;
	}
	public void setValorTotalFrete(double valorTotalFrete) {
		this.valorTotalFrete = valorTotalFrete;
	}
	public String getDataPrevitaEntrega() {
		return dataPrevitaEntrega;
	}
	public void setDataPrevitaEntrega(String dataPrevitaEntrega) {
		this.dataPrevitaEntrega = dataPrevitaEntrega;
	}
	public String getDataCosulta() {
		return dataCosulta;
	}
	public void setDataCosulta(String dataCosulta) {
		this.dataCosulta = dataCosulta;
	}
	
}

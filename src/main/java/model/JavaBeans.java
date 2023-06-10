package model;

public class JavaBeans {
private String idDF;
private String nome;
private Integer quant;
private String tomb;
private String text;
private Double valor;

public JavaBeans() {
	super();
	
}

public JavaBeans(String idDF, String nome, Integer quant, String tomb, String text, Double valor) {
	super();
	this.idDF = idDF;
	this.nome = nome;
	this.quant = quant;
	this.tomb = tomb;
	this.text = text;
	this.valor = valor;
}

public String getIdDF() {
	return idDF;
}
public void setIdDF(String idDF) {
	this.idDF = idDF;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Integer getQuant() {
	return quant;
}
public void setQuant(Integer quant) {
	this.quant = quant;
}
public String getTomb() {
	return tomb;
}
public void setTomb(String tomb) {
	this.tomb = tomb;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public Double getValor() {
	return valor;
}
public void setValor(Double valor) {
	this.valor = valor;
}
}

package objetosproyecto;

public class ENSERCASA {
    
    private String marca, color;
    double altura, peso, precio;

    //Constructor
    public ENSERCASA() {
    }
    public ENSERCASA(String marca, String color, double precio, double altura, double peso) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.altura = altura;
        this.peso = peso;
    }
    
    //Getters y Setters
    public String getMarca() {
        return marca;
    }
    public String getColor() {
        return color;
    }
    public double getPrecio() {
        return precio;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //Metodos
    public void verDatos(){
        System.out.println("Marca: "+marca);
        System.out.println("Color: "+color);
        System.out.println("Precio: "+precio+"€");
        System.out.println("Altura: "+altura+"m");
        System.out.println("Peso: "+peso+"kg");
        System.out.println("Precio final con ajuste energético: " + precioFinal() + " €");
    }
    public double precioFinal() {
        return precio;
    }
}

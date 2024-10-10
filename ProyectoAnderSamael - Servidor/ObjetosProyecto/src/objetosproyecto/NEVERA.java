package objetosproyecto;

public class NEVERA extends ENSERCASA{
    
    private String consumoEnergetico;

    //Constructores
    public NEVERA() {
    }
    public NEVERA(String consumoEnergetico, String marca, String color, double precio, double altura, double peso) {
        super(marca, color, precio, altura, peso);
        this.consumoEnergetico = consumoEnergetico;
    }
    
    //Getter y Setter
    public String  getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    
    //Metodos
    @Override
    public void verDatos(){
        super.verDatos();
        System.out.println("Consumo energetico: "+consumoEnergetico);
    }
    @Override
    public double precioFinal(){
        double precioFinal = this.precio;
        
        switch (consumoEnergetico){
            case "A":
                precioFinal += 100;
                break;
            case "B":
                precioFinal += 80;
                break;
            case "C":
                precioFinal += 60;
                break;
            case "D":
                precioFinal += 50;
                break;
            case "E":
                precioFinal += 30;
                break;
            case "F":
                precioFinal += 10;
                break;
            default:
                System.out.println("Consumo energético no reconocido.");
                break;
                
        }
            return precioFinal;
    }
    
}


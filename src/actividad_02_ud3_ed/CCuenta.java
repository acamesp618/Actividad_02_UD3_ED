/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * Clase que presenta una cuenta bancaria básica con operaciones
 * de consulta de saldo, ingreso y retiro de dinero.
 * 
 * @author Adrian Campos
 */
public class CCuenta {


  /** Nombre del titular de la cuenta*/   
  protected String nombre;
  /** Numero de cuenta */
    private String cuenta;
    /** Saldo actual de la cuenta */
    private double saldo;
    /** Tipo de interés aplicable */
    private double tipoInterés;

  
    public CCuenta ()
    {
    }
   /**
    * Constructor con parámetros para crear una nueva cuenta.
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue
    * @param sal
    * @param tipo 
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * Establece el nombre del titular de la cuenta
   * 
   * @param nom 
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    /**
     * Devuelve el nombre del titular
     * 
     * @return Nombre del titular
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     * Devuelve el saldo actual de la cuenta
     * 
     * @return Saldo disponible 
     */
     public double estado ()
    {
        return saldo;
    }

    /**
     * Realiza un ingreso de dinero en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
    * Realiza una retirada de dinero de la cuenta.
    * 
    * @param cantidad Cantidad a retirar
    * @throws Exception Si la cantidad es negativa o el saldo es insuficicente
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     * Devuelve el numero de la cuenta
     * @return Numero de cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * Establece el numero de cuenta
   * @param cuenta Numero de cuenta
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * Establece el tipo de interes
  * @return Nuevo tipo de interes
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}

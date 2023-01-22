/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen.TemplateMethod;


/**
 * Clase que representa un pedido del almacén.
 * Hereda de la clase Conjunto Productos
 * @author maria
 */
public class Pedido extends ConjuntoProductos{
    
    //Atributios de la clase
    private int idPedido ;
    private boolean completado ;
    
    /**
     * Constructor de la clase Pedido
     * @param idPedido -> id del pedido.
     * @param idProducto -> id del pproductoi que contiene el pedido.
     * @param cantidad -> cantidad del producto.
     * @param idPersona -> id de la persona que realiza el pedido.
     * @param completado -> indica con true que el pedido está completado y con false que no lo está
     * @param fecha -> fecha en que se ha realizado el pedido.
     */
    
    public Pedido(int idPedido,int idProducto, int cantidad, int idPersona, boolean completado, String fecha) {
        super(idProducto, cantidad, idPersona, fecha);
        this.idPedido = idPedido ;
        this.completado = completado ;
    }

    /**
     * Método get del id del pedido
     * @return idPedido -> id del pedido.
     */
    
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * Método set del id del pedido
     * @param idPedido -> id del pedido.
     */
    
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * Método para comprobar si el pedido está completado.
     * @return completado -> true si el pedido está completado, false en caso contrario.
     */
    
    public boolean isCompletado() {
        return completado;
    }

    /**
     * Método para establecer si el pedido ha sido completado.
     * @param completado -> true si el pedido está completado, false en caso contrario.
     */
    
    
    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
    
    
    
}

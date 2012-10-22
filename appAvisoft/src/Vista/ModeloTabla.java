package Vista;

import Modelo.Insumo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author zirex
 */
public class ModeloTabla extends AbstractTableModel{
    private ArrayList<ItemCompra> registros= new ArrayList<ItemCompra>();
    private String [] columnNames= {"Id", "Nombre Ins.", "Cantidad", "Precio Unt.", "Total"};
    public boolean rowAdd = false;
    
    public ArrayList<ItemCompra> getRegistros(){
        return registros;
    }

    @Override
    public int getRowCount() {
        return registros.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
     @Override
    public String getColumnName(int columnIndex) {
        // Devuelve el nombre de cada columna. Este texto aparecerá en la
        // cabecera de la tabla.
        switch (columnIndex)
        {
            case 0:
                return "Id";
            case 1:
                return "Nombre Ins.";
            case 2:
                return "Cantidad";
            case 3:
                return "Precio Unt.";
            case 4:
                return "Total";
            default:
                return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        // Devuelve la clase que hay en cada columna.
        switch (columnIndex)
        {
            case 0:
                // La columna cero contiene el id del item, que es
                // un Integer
                return Integer.class;
            case 1:
                // La columna uno contiene el nombre del item, que es
                // un String
                return String.class;
            case 2:
                // La columna dos contine la cantidad del item, que es un
                // Integer (no vale int, debe ser una clase)
                return Integer.class;
            case 3:
                //La columna tres contiene el precio unitario del item que es un
                // Float (no vale float, debe ser una clase)
                return Float.class;
            case 4:
                //La columna cuatro contiene el total del item que es un
                // Float (no vale float, debe ser una clase)
                return Float.class;
            default:
                // Devuelve una clase Object por defecto.
                return Object.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ItemCompra item= registros.get(rowIndex);
        switch(columnIndex){
            case 0:
                return new Integer(item.getId());
            case 1:
                return item.getNombre();
            case 2:
                return new Integer(item.getCantidad());
            case 3:
                return new Float(item.getPrecioUnt());
            case 4:
                return new Float(item.getTotal());
            default:
                return null;
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        ItemCompra item= registros.get(rowIndex);
        if (aValue == null) {
            this.setValueAt(0, rowIndex, columnIndex);
            return;
        }
        String value = aValue.toString();
        switch(columnIndex){
            case 0:
                item.getId();
                break;
            case 1:
                item.setNombre(aValue.toString());
                item.setId(this.getCodigoInsumo(item.getNombre()));
                break;
            case 2:
                int nuevaCantidad= Integer.valueOf(value);
                item.setCantidad(nuevaCantidad);
                item.setTotal(item.getPrecioUnt()*nuevaCantidad);
                break;
            case 3:
                float nuevoPrecio= Float.valueOf(value);
                item.setPrecioUnt(nuevoPrecio);
                item.setTotal(item.getCantidad()*nuevoPrecio);
                break;
            case 4:
                item.getTotal();
                break;
            default:
                break;
        }
        generarFila(rowIndex);
        // Disparamos el Evento TableDataChanged (La tabla ha cambiado)
        fireTableDataChanged(); 
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Permite que la celda sea editable
        switch(columnIndex){
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return false;
            default:
                return false;
        }
    }
    
    private int getCodigoInsumo(String nombre){
        int codigo= 0;
        for (String [] insumo : Insumo.getInsumos()) {
                if(insumo[1].equals(nombre)){
                    codigo= Integer.valueOf(insumo[0].toString());
                }
        }
        return codigo;
    }
    
    private void generarFila (int rowIndex) {
        int fila= rowIndex+1;
        if(fila==registros.size()){
            ItemCompra item= registros.get(rowIndex);
            if(item.getNombre() != null && item.getTotal() != 0){
                this.anhadeItem(new ItemCompra(0, null, 0, 0, 0));
                this.rowAdd = true;
            }
        }
    }
    
    public void anhadeItem(ItemCompra item){
        registros.add(item);
        fireTableDataChanged();
    }
    
    public void borraItem(int fila){
        // Se borra la fila 
        registros.remove(fila);
        fireTableDataChanged();
    }
    
}
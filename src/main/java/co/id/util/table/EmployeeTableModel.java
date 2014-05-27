package co.id.util.table;

import co.id.model.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author tombisnis@yahoo.com
 */
public class EmployeeTableModel extends AbstractTableModel{
    public List<Employee> list = new ArrayList<Employee>();

    public Employee getList(int i) {
        return list.get(i);
    }

    public void setList(List<Employee> list) {
        this.list = list;
        fireTableDataChanged();
    }
 
    public void save(Employee e){
        list.add(e);
        fireTableDataChanged();
    }
    
    public void update(int i,Employee e){
        list.set(i, e);
        fireTableDataChanged();
    }
    
    public void delete(int i){
        list.remove(i);
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
           case 0 : return list.get(rowIndex).getId();
           case 1 : return list.get(rowIndex).getName();
           default: return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
           case 0 : return "Id";
           case 1 : return "Name";
           default: return null;
       }
    }
}
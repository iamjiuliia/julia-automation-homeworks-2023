public class Table {
    String tableType;
    int tableWidth;
    int tableLength;
    String tableMaterial;
    public Table(String tableType , int tableWidth ,  int tableLength , String tableMaterial ){
        this.tableType = tableType;
        this.tableWidth = tableWidth;
        this.tableLength = tableLength;
        this.tableMaterial = tableMaterial;
    }

    public int getTableLength() {
        return tableLength;
    }

    public int getTableWidth() {
        return tableWidth;
    }

    public String getTableMaterial() {
        return tableMaterial;
    }

    public String getTableType() {
        return tableType;
    }
}